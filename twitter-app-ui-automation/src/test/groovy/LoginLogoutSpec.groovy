/*
 * Copyright (c) 2018. https://automationschool.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import geb.spock.GebReportingSpec
import pages.LoginPage
import pages.base.TwitterPage
import pages.common.HomePage
import pages.common.LandingPage
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class LoginLogoutSpec extends GebReportingSpec {
    @Shared cfg
    @Shared username
    @Shared password

    def setupSpec() {
        cfg = ConfigReader.getConfiguration()
        TwitterPage.config = cfg;
        username = cfg.loginFlowConfig.username
        password = cfg.loginFlowConfig.password
    }

    def cleanupSpec() {
    }

    def setup() {
        baseUrl = cfg.urlWithForwardSlash
    }

    def "Login with valid username and password"() {
        given: "You are on twitter homepage"
        to HomePage
        report("Twitter Home Page")
        HomePage homePage = at HomePage

        when: "You click on Login button"
        homePage.clickOnLogin()

        then: "Check you are on login page"
        LoginPage loginPage = at LoginPage;
        report("Twitter Login Page")

        when: "Enter valid Login & Password"
        loginPage.enterLoginPassword(username, password)
        report("Twitter Login Page with username and password")
        loginPage.clickOnLoginButton()

        then: "Check you are on landing page"
        at LandingPage
        report("Twitter Landing Page for username - " + username)
    }

    def "Logout"() {
        given: "You are on landing page"
        LandingPage landingPage = at LandingPage

        when: "You click on logout"
        landingPage.clickOnLogout()

        then: "Check you are back on the Home Page"
        at HomePage
        report("Back to Home Page after logout")
    }
}