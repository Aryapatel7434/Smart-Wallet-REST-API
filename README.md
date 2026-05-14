# 🚀 Smart Wallet REST API

A backend-based Smart Wallet REST API system built using **Spring Boot**, **MySQL**, and **RESTful architecture**.

This project is part of my long-term journey to build a **Decentralized Smart Payment & Transaction System** while deeply understanding real-world backend engineering.

---

# 🔥 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST APIs
* Postman

---

# 🧠 Features Implemented

## ✅ User Registration API

* Register users using REST API
* Store user details in MySQL
* Auto-generate wallet for every user

## ✅ Wallet Retrieval API

* Fetch wallet details using user email
* Return JSON response

## ✅ Layered Backend Architecture

Implemented industry-style architecture:

```text
Controller → Service → Repository → Database
```

---

# 🌐 REST APIs

## Register User

```http
POST /api/users/register
```

### JSON Body

```json
{
  "name": "Ary",
  "email": "ary101@gmail.com",
  "password": "1234"
}
```

---

## Get Wallet

```http
GET /api/wallet/{email}
```

Example:

```http
GET /api/wallet/ary101@gmail.com
```

---

# 🧠 Concepts Learned

* REST API architecture
* HTTP request/response lifecycle
* JSON serialization/deserialization
* Spring Boot application flow
* JPA & Hibernate basics
* MySQL integration
* Postman API testing
* Layered backend architecture

---

# 🚀 Future Scope

This project will evolve into:

* JWT Authentication
* Transaction APIs
* Blockchain Integration
* Docker Deployment
* Redis Caching
* Kafka Event Streaming
* AI-based Fraud Detection
* Microservices Architecture

---

# 📌 Current Status

✅ Day 2 Completed — Smart Wallet REST API Working Successfully

# 💳 Smart Wallet REST API

A real-world FinTech backend system built using Spring Boot, REST APIs, JPA/Hibernate, and MySQL.

---

# 🚀 Features

✅ User Registration  
✅ Wallet Creation  
✅ Money Transfer System  
✅ Transaction History API  
✅ MySQL Database Integration  
✅ Spring Data JPA & Hibernate  
✅ RESTful APIs using Spring Boot  

---

# 🧠 Backend Architecture

Controller  
↓  
Service  
↓  
Repository  
↓  
MySQL Database  

---

# 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API
- Maven
- Postman

---

# 📌 APIs

## Register User

POST
/api/users/register

### Request Body

```json
{
  "name": "Ary",
  "email": "ary101@gmail.com",
  "password": "1234"
}
```

---

## Send Money

POST
/api/transactions/send

### Request Body

```json
{
  "senderEmail": "ary101@gmail.com",
  "receiverEmail": "ary11@gmail.com",
  "amount": 100
}
```

---

## Transaction History

GET

/api/transactions/history/{email}

Example:

/api/transactions/history/ary101@gmail.com

---

# 🧠 Learning Outcomes

- Layered Backend Architecture
- ORM using Hibernate
- JPA Repository Internals
- REST API Development
- Business Logic Implementation
- FinTech Transaction Flow
- Database Relationships

---

# 🚀 Future Improvements

- JWT Authentication
- AI-based Fraud Detection
- Blockchain Integration
- Redis Caching
- Docker Deployment
- Kafka Event Streaming

---

# 👨‍💻 Developer

Arya Patel

Competitive Programmer | Java Backend Developer | DSA Enthusiast

GitHub:
https://github.com/Aryapatel7434
