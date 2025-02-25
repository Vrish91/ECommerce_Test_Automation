# 🛒 E-Commerce Website Test Automation

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-Framework-922D41?style=for-the-badge&logo=testng&logoColor=white)
![REST Assured](https://img.shields.io/badge/REST%20Assured-API%20Testing-0099cc?style=for-the-badge&logo=restassured&logoColor=white)
![ExtentReports](https://img.shields.io/badge/ExtentReports-Reporting-ff69b4?style=for-the-badge)

---

## 📌 Project Overview
This is an **E-Commerce Website Test Automation** project designed to **test UI and API functionalities** of an online shopping platform using **Selenium WebDriver, TestNG, and REST Assured**. It includes:

- ✅ **UI Test Cases:** Automates login, product search, cart checkout, and order placement.
- ✅ **API Test Cases:** Tests order management endpoints using REST Assured.
- ✅ **Extent Reports:** Generates detailed execution reports.
- ✅ **Maven & TestNG Integration:** Efficient test execution and reporting.

---

## 🚀 Setup & Installation

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Vrish91/ECommerce_Test_Automation.git
cd ECommerce_Test_Automation
```

### 2️⃣ Install Dependencies
- Ensure **Java 8 or later** is installed.
- Install **Maven** and add it to the system path.
- Run the following command:
```sh
mvn clean install
```

### 3️⃣ Run Tests
#### 🖥️ Run All Tests Using TestNG
```sh
mvn test
```
#### 🛍️ Run UI Tests Only
```sh
mvn test -Dgroups=UI
```
#### 🔗 Run API Tests Only
```sh
mvn test -Dgroups=API
```

---

## 🛠️ Project Structure
```
ECommerce_Test_Automation/
│-- src/test/java/tests/ui         # UI Test Cases
│-- src/test/java/tests/api        # API Test Cases
│-- src/main/java/pages            # Page Object Model (POM) for UI Tests
│-- src/main/java/utils            # Utility Classes (Config Reader, WebDriverManager, API Base Test)
│-- testng.xml                      # Test Suite Execution File
│-- pom.xml                         # Maven Dependencies
```

---

## 📊 Extent Reports
- **Path:** `target/extent-reports/ExtentReport.html`
- Provides **detailed test execution results** with **screenshots** for failures.

To view reports:
1. After running tests, open `target/extent-reports/ExtentReport.html` in a browser.
2. Check logs, pass/fail statuses, and execution time.

---

## 🔥 Technologies & Tools Used
| **Technology**   | **Purpose**            |
|-----------------|----------------------|
| **Java**        | Programming Language |
| **Selenium**    | UI Automation        |
| **TestNG**      | Test Execution       |
| **REST Assured**| API Testing          |
| **Maven**       | Dependency Manager   |
| **Extent Reports** | Test Reporting  |

---

## 🤝 Contributing
Feel free to contribute by opening issues or submitting pull requests.

---

## 📝 License
This project is licensed under the **MIT License**.

---

## 📞 Contact
For any inquiries, feel free to reach out at vrishank1991@gmail.com or https://www.linkedin.com/in/vrishank.

🚀 **Happy Testing!** 🎯

