# Git repo: geb-and-spock-automation-examples 
+ Groovy-based Geb and Spock automation examples. 
+ Please run automation tests responsibly. You may use the code provided in this repository only to learn Geb and Spock.
+ Latest Geb Manual is your best source for documentation : __[Latest Geb Manual](http://www.gebish.org/manual/current/)__
+ Licensed under __[the Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)__

## Running the examples

### Twitter login and logout example:

__Note__: All paths relative to directory: twitter-app-ui-automation

+ Update the src\test\resources\LoginFlowConfig.groovy file with the username / password. 
+ For the username, do not use the email but the twitter handle without the @ sign in the front. E.g. mycooltwitterhandle

+ Go to the twitter-app-ui-automation directory and run the automated spec from the command line:
  - cd twitter-app-ui-automation
  - gradlew chromeTest -Denv=test

+ The above runs the twitter automated tests in Chrome. Using the configuration i.e., url, username, password etc supplied under the "test" environment.

## Changing environments
+ You can change the environment (env) to use for e.g. to "prod" env, by changing the command-line to use __-Denv=prod__ 

## Changing to a different browser
+ To run the tests with a different browser replace the __chromeTest__ above with the following choices:

  - Firefox :
    * gradlew firefoxTest -Denv=test
  - Chrome Headless :
    * gradlew chromeHeadlessTest -Denv=test
