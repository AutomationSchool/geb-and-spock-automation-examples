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

environments {
    test {
		//For the username, do not use the email but the twitter handle without the @ sign in the front.
        username = "mycooltesttwitterhandle"
        password = "dummytestpassword"
    }

    prod {
		//For the username, do not use the email but the twitter handle without the @ sign in the front.
        username = "dummyprodtwitterhandle"
        password = "dummyprodpassword"
    }
}