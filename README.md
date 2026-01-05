# 🚀 Serenity BDD API Automation – Swagger Petstore

This project is an **API automation framework** built with **Java, Serenity BDD, Cucumber, and RestAssured**.  
It validates the behavior of the **Swagger Petstore API**, following **BDD principles**, **ISTQB best practices**, and **clean test design**.

The framework is designed as a **demo project for technical interviews** and showcases:
- Positive and negative API scenarios
- Business-readable BDD features
- Maintainable and scalable automation architecture
- Automated test reports published using **GitHub Pages**

---

## 🧪 Technologies & Tools

- **Java 17**
- **Maven**
- **Serenity BDD**
- **Cucumber (BDD)**
- **RestAssured**
- **GitHub Pages (Reporting)**

---

## 📌 API Under Test

**Swagger Petstore API**

- Base URL: https://petstore.swagger.io/v2


This public API allows CRUD operations for pets and is widely used for API automation demonstrations.

---

## 📂 Project Structure
```
src
└── test
├── java
│   └── starter
│       ├── stepdefinitions
│       │   └── ApiTestingStepDefinitions.java
│       └── petstore
│           └── Pet.java
└── resources
│   └── features
│       └──apiTesting.feature
```

## ▶️ How to Execute the Tests

Run all API tests using Maven:

```bash
mvn clean verify
```
## 📊 Test Reports (GitHub Pages)

All Serenity reports are automatically published using **GitHub Pages** and can be accessed online.

### 🔹 Full Serenity Reports

- [Chrome Results](https://crod37.github.io/CBTW-Demo/chrome/)
- [Edge Results](https://crod37.github.io/CBTW-Demo/edge/)
- [Firefox Results](https://crod37.github.io/CBTW-Demo/firefox/)
- [Safari Results](https://crod37.github.io/CBTW-Demo/safari/)

### 🔹 Serenity Summary Reports

High-level execution summaries are available here:

- [Chrome Summary](https://crod37.github.io/CBTW-Demo/chrome/serenity-summary.html)
- [Edge Summary](https://crod37.github.io/CBTW-Demo/edge/serenity-summary.html)
- [Firefox Summary](https://crod37.github.io/CBTW-Demo/firefox/serenity-summary.html)
- [Safari Summary](https://crod37.github.io/CBTW-Demo/safari/serenity-summary.html)
