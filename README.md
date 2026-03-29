# 🚀 Banking System - DevOps Lab Project

## 📌 Project Overview

This project is a **Banking System Application** developed using Java. It demonstrates core banking functionalities along with DevOps practices such as version control, CI/CD, unit testing, and containerized deployment.

---

## 🛠️ Technologies Used

* Java
* Maven
* Git & GitHub
* Jenkins (CI/CD)
* Docker (Containerization)
* JUnit (Unit Testing)

---

## ⚙️ Features

* Create Account
* Deposit Money
* Withdraw Money
* Transaction Handling
* Savings Account Interest
* Checking Account Overdraft

---

## 🔀 Branching Strategy

* `main` → Stable code
* `dev` → Development branch
* `feature/*` → Feature-specific development

---

## 🔖 Versioning

Version control is managed using Git tags:

```
v1.0 → Initial stable release
```

---

## 🔄 CI/CD Pipeline

* Code pushed to GitHub
* Jenkins pulls latest code
* Maven builds the project (`mvn clean package`)
* Build status is monitored in Jenkins

---

## 🧪 Unit Testing

JUnit is used to test:

* Deposit functionality
* Withdraw functionality
* Insufficient balance handling
* Customer operations
* Interest calculation

---

## 🐳 Docker Deployment

### Step 1: Build Project

```
mvn clean package
```

### Step 2: Create Docker Image

```
docker build -t banking-system .
```

### Step 3: Run Container

```
docker run -d -p 8080:8080 banking-system
```

---

## 🔄 Rollout Strategy

* Stop old container
* Run updated container
* Ensures minimal downtime

---

## 📊 Monitoring

* `docker logs` → Check application logs
* `docker stats` → Monitor CPU & memory usage

---

## 📁 Project Structure

```
bank/
 ├── Account.java
 ├── Customer.java
 ├── Transaction.java
 ├── Deposit.java
 ├── Withdraw.java
 ├── SavingsAccount.java
 ├── CheckingAccount.java
```

---

## 🎯 Conclusion

This project demonstrates how a banking application can be developed, tested, version-controlled, and deployed using modern DevOps tools like Git, Jenkins, Maven, and Docker.

---

## 👨‍💻 Author

**Siddhesh Sawant**
