import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.ie.InternetExplorerOptions

waiting {
    timeout = 5 //default
    retryInterval = 0.5

    //"named" timeout configurations
    slow { timeout = 10 }
    slower { timeout = 20 }
}

baseNavigatorWaiting = true
atCheckWaiting = true
reportOnTestFailureOnly = false
reportsDir = "target/execution-reports"

driver = { new ChromeDriver() }

environments {

    ff {
        driver = { new FirefoxDriver() }
    }

    chrome {
        driver = { new ChromeDriver() }
    }

    ie {
        driver = {

            def options = new InternetExplorerOptions()

            def ieDriver = new InternetExplorerDriver(options)

            ieDriver
        }
    }
}
