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

package pages

import pages.base.TwitterPage

class LoginPage extends TwitterPage {

    static url = "login"

    private static final FORM_TITLE = "Log in to Twitter".toUpperCase()

    static content = {
        loginFormContainer() {$('.signin-wrapper')}
        loginFormTitle() {loginFormContainer.find('h1').first()}
        loginForm()  { loginFormContainer.find('form.js-signin') }
        usernameField()  { loginForm.find('.js-username-field') }
        passwordField()  { loginForm.find('.js-password-field') }
        loginButton() {loginForm.find('.submit')}
    }

    static at = {
        loginFormTitle.text().toUpperCase().contains(FORM_TITLE)
        browser.getCurrentUrl().toLowerCase().startsWith(config.urlWithoutForwardSlash + "/login")
        loginButton.isDisplayed()
    }

    def enterLoginPassword(login, password){
        usernameField.value(login)
        passwordField.value(password)
    }

    def clickOnLoginButton(){
        loginButton.click()
    }
}