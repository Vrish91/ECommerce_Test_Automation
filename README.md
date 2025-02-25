E-Commerce Website Test Automation

📌 Project Overview

This project is an automated testing framework for an E-Commerce website. It covers both UI Testing (Selenium WebDriver + TestNG) and API Testing (REST Assured). The tests validate critical user flows such as login, adding items to the cart, checkout, and order validation.

⚙️ Tech Stack

Programming Language: Java

UI Automation: Selenium WebDriver, TestNG

API Automation: REST Assured, Postman

Reporting: Extent Reports

Test Management & Defect Tracking: JIRA

Version Control: Git, GitHub

🚀 Setup & Installation

1. Clone the Repository:  git clone https://github.com/Vrish91/ECommerce_Test_Automation.git
                          cd ECommerce_Test_Automation

3. Install Dependencies:

Ensure you have Java 8 or later installed.

Install Maven and add it to the system path.

Use the following command to install dependencies: mvn clean install


🛠️ Project Structure

ECommerce_Test_Automation/

│-- src/test/java/tests/ui         # UI Test Cases

│-- src/test/java/tests/api        # API Test Cases

│-- src/main/java/pages            # Page Object Model (POM) for UI Tests

│-- src/main/java/utils            # Utility Classes (Config Reader, WebDriverManager, API Base Test)

│-- testng.xml                      # Test Suite Execution File

│-- pom.xml                         # Maven Dependencies

🏃 Running the Tests

Running UI Tests (Selenium + TestNG)

mvn test -Dtest=UITestSuite

OR

mvn test -DsuiteXmlFile=testng.xml

Running API Tests (REST Assured)

mvn test -Dtest=APITestSuite

📊 Test Reports

Extent Reports are generated in the reports/ directory after execution.

Open reports/ExtentReport.html in a browser to view detailed test execution results.

📎 GitHub Repository

GitHub Repo: E-Commerce Test Automation

🎯 Contributors: Vrish91📩 Contact: For any queries, reach out via GitHub Issues.

