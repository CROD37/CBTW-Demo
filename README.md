# 🚀 Serenity BDD Automation Framework – API & Functional Testing

This project is a **test automation framework** built with **Java, Serenity BDD, Cucumber, RestAssured, and Selenium**
.  
It covers both **API automation** and **functional UI testing**, following **BDD principles**, **Scrum mindset**, and **
ISTQB best practices**.

The framework is designed as a **demo project for technical interviews**, showcasing:

- API and UI automation in a single Serenity project
- Positive and negative scenarios
- Business-readable BDD features
- Clean architecture using Page Objects and Step Definitions
- Cross-browser execution (local & BrowserStack)
- Automated test reports published via **GitHub Pages**

---

## 🧪 Technologies & Tools

- **Java 17**
- **Maven**
- **Serenity BDD**
- **Cucumber (BDD)**
- **Selenium WebDriver**
- **RestAssured**
- **BrowserStack**
- **GitHub Actions (CI/CD)**
- **GitHub Pages (Reporting)**

---

## 📌 Systems Under Test

### 🔹 API

**Swagger Petstore API**

- Base URL: https://petstore.swagger.io/v2
- Public API used to demonstrate REST API automation.

### 🔹 UI (Functional Testing)

- Web applications tested through **cross-browser functional scenarios**
- Executed locally or remotely using **BrowserStack**

---

## 📂 Project Structure

```
src
└── test
├── java
│ └── starter
│ ├── stepdefinitions
│ │ ├── ApiTestingStepDefinitions.java
│ │ └── FunctionalStepDefinitions.java
│ ├── pages
│ │ └── LoginPage.java
│ └── petstore
│   └── Pet.java
│ └── steps
│   └── LoginSteps.java
└── resources
├── features
│ ├── apiTesting.feature
│ └── functionalTesting.feature
└── serenity.conf
```

## ▶️ How to Execute the Tests

Run all tests using Maven:

```bash
mvn clean verify
```

## 📊 Test Reports (GitHub Pages)

All Serenity reports are automatically published using **GitHub Pages** and can be accessed online.

### 🔹 Full Serenity Reports

- [browserstack_Mac_Monterey Results](https://crod37.github.io/CBTW-Demo/chrome/run-on-browserstack_Mac_Monterey)
- [browserstack_Windows11 Results](https://crod37.github.io/CBTW-Demo/chrome/run_on_browserstack_Windows11)
- [local Results](https://crod37.github.io/CBTW-Demo/chrome/local)

### 🔹 Serenity Summary Reports

High-level execution summaries are available here:

- [browserstack_Mac_Monterey Summary](https://crod37.github.io/CBTW-Demo/chrome/run-on-browserstack_Mac_Monterey/serenity-summary.html)
- [browserstack_Windows11 Summary](https://crod37.github.io/CBTW-Demo/chrome/run_on_browserstack_Windows11serenity-summary.html)
- [local Summary](https://crod37.github.io/CBTW-Demo/chrome/localserenity-summary.html)
