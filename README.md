# 👨‍👩‍👧‍👦 FamilyMapper

**FamilyMapper** is a Spring Boot web application that helps users manage and visualize their family members and their locations on an interactive map.

---

## 🚀 Features

- 🗺️ Display relatives on map (Leaflet or Google Maps)
- ➕ Add, update, and delete family member details
- 🔍 Filter and search family members
- 💾 Store data in MySQL / H2
- 🔐 RESTful API built using Spring Boot
- 🧩 Responsive frontend using Bootstrap

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Backend | Java 17+, Spring Boot 3.x |
| Database | MySQL / H2 |
| Frontend | HTML, CSS, Bootstrap, Leaflet.js |
| Tools | Maven, IntelliJ IDEA, Postman |

---

## ⚙️ Setup Guide

### 1️⃣ Clone Repository
git clone https://github.com/atharvaborale/familymapper.git
cd familymapper

src/
 ├── main/
 │   ├── java/com/example/familymapper/
 │   │   ├── controller/     # REST Controllers
 │   │   ├── service/        # Business Logic
 │   │   ├── repository/     # Data Access Layer
 │   │   └── model/          # Entity Classes
 │   └── resources/
 │       ├── static/         # HTML, CSS, JS
 │       └── application.properties
 └── test/
     └── java/
         └── com/example/familymapper/
