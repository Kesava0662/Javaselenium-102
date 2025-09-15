
# Upload Report

An Application to upload Reports, and files to Custom Script

Application uploads the most latest generated report.



## Requirements

Use java 1.8 or higher



## Command to Upload Report

java -jar algoQAUtil.jar -dashboard

follow the prompts on screen to upload generated reports

(Please Provide BatchName)


## Command to Upload Code File to Custom Script

java -jar algoQAUtil.jar -upload

follow the prompts on screen


## WebDriver Path Configuration

    In the configuration file, you will find the following tag:

    <EnableWebdriverPath>False</EnableWebdriverPath>

    1.If this tag is set to False, the framework will use WebDriverManager to automatically download and manage the required browser drivers (no manual setup needed).
    2.If this tag is set to True, the framework will instead use the driver executables placed in the project under: 
     \src\test\resources
        When True, users must:
        1.Check their local browser version (e.g., Chrome, Firefox).
        2.Download the matching WebDriver executable (chromedriver.exe, geckodriver.exe, etc.) from the official site.
        3.Place the downloaded .exe file inside the \src\test\resources directory.
        4.Keep this file updated whenever the browser version on the local system changes.