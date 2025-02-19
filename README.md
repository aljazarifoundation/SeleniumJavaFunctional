# Selenium Test Automation with Allure Report

## Prerequisites
- Install **Java 17** (Ensure `JAVA_HOME` is set correctly)
- Install **Maven** (Check installation with `mvn -version`)
- Install **Allure CLI** (Check installation with `allure --version`)
- Install **Google Chrome** & **Chromedriver**

## Project Structure
```
SeleniumJavaProject/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── utils/
│   │   │   │   ├── ScreenshotUtil.java
│   │   │   │   ├── AllureEnvironmentUtil.java
│   │   │   ├── Main.java
│   ├── resources/
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/
│   │   │   │   ├── hiselenium.java
│   │   │   │   ├── SauceDemoTest.java
│   ├── resources/
│-- pom.xml
│-- testng.xml
│-- README.md
```

## Step-by-Step Guide

### 1. Clone the Repository
```sh
git clone https://github.com/your-repo/SeleniumJavaProject.git
cd SeleniumJavaProject
```

### 2. Configure Environment Variables
Set `JAVA_HOME`, `MAVEN_HOME`, and add `Allure` to your system `PATH`.

### 3. Install Dependencies
```sh
mvn clean install
```

### 4. Run the Tests
```sh
mvn test
```

### 5. Generate Allure Report
```sh
allure serve target/allure-results
```

## Running the Main Class
A simple Java example is included in `Main.java`.
```sh
mvn exec:java -Dexec.mainClass="Main"
```

## Notes
- Modify `ScreenshotUtil.java` to match your WebDriver setup.
- Ensure `testng.xml` is correctly configured for your test suite.
- Screenshots are saved in `target/screenshots/` and attached in Allure reports.

For troubleshooting, check the `logs/` folder for errors.

## Video

# SeleniumJavaFunctional
