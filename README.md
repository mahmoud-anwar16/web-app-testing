# Web App Testing Project

This project demonstrates automated testing of a web application using Selenium WebDriver and TestNG.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running Tests](#running-tests)
- [Parallel Execution](#parallel-execution)
- [Download Selenium Grid](#download-selenium-grid)

## Project Structure

- **src/main/java/com/qpros**: Contains the main Java source code.
    - **BasePage.java**: Base page class with common methods.
    - **BillingDetails.java**: Page class for billing details.
    - **HomePage.java**: Page class for the home page.
    - **ShoppingCart.java**: Page class for the shopping cart.
    - **BaseTest.java**: Base test class with setup and teardown methods.
    - **BookTest.java**: Test class containing test cases.
- **testng.xml**: TestNG configuration file for test execution.
- **pom.xml**: Maven Project Object Model file specifying dependencies.
- **README.md**: Project documentation.

## Prerequisites

- Java Development Kit (JDK) installed
- Maven installed
- Selenium WebDriver dependencies
- TestNG framework

## Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:

   ```bash
   cd web-app-testing

  ```
3. Install dependencies using Maven:

   ```bash
   mvn clean install
  ```

## Running Tests

Execute the tests using the following command:

   ```bash
   mvn test
  ```

## Parallel Execution

Tests can be run in parallel by configuring the testng.xml file. Adjust the parallel and thread-count attributes
according to your requirements.

## Download Selenium Grid

To use Selenium Grid for parallel test execution, follow these steps to download and set it up:

1. Visit the Selenium Downloads page: Selenium Downloads.

2. Scroll down to the Selenium Grid section.

3. Download the latest version of Selenium Grid by clicking on the download link associated with the desired version.

4. Extract the downloaded ZIP file to a location of your choice on your local machine.

5. Navigate to the extracted directory and find the selenium-server-standalone.jar file.

6. You can now use this JAR file to start Selenium Grid.