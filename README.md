# ☕ Java Design Patterns Repository

Welcome to the **Design-Patterns-Java** repository! This project provides structured, real-world implementations of classic **Object-Oriented Design Patterns** in Java.

All design patterns in this repository are executed from Main.java file in each pattern folder: **`src/main/java/com/design_patterns/<pattern_folder_name>/Main.java`**.

---

## 🛠️ Repository Architecture & Tech Stack

- **Language:** Java 17+
- **Build Tool:** Apache Maven (`pom.xml`)
- **Base Package:** `com.design_patterns.<pattern_folder_name>`
- **Main Entry Point:** `src/main/java/com/design_patterns/<pattern_folder_name>/Main.java`

---

## 📁 Directory Structure

```
src/main/java/com/design_patterns/
├── 🔌 adapter_pattern/              # Structural: Payment Gateway Integration
├── 🏗️ builder_pattern/              # Creational: Fluent User Profile Construction
├── 🔗 chain_of_responsibility/      # Behavioral: Multi-Tier Support Ticket Escalation
├── ☕ decorater_pattern/            # Structural: Dynamic Coffee Toppings Customization
├── 🏭 factory_pattern/              # Creational: Simple & Abstract Object Instantiation
│   ├── abstract_factory_pattern/
│   └── simple_factory_pattern/
├── 🔔 observer_pattern/             # Behavioral: Event Listener & Subscriber System
├── 🐑 prototype_pattern/            # Creational: Game Character Object Cloning
├── 🛡️ proxy_pattern/                # Structural: Protection, Virtual & Remote Proxies
│   ├── protection_proxy/
│   ├── remote_proxy/
│   └── virtual_proxy/
├── 🔒 singleton_pattern/            # Creational: Single Instance Implementation Strategies
│   ├── basic/
│   ├── double_checked_lock_mechanism/
│   ├── lazy_initialization/
│   └── thread_safety/
└── 🎯 strategy_pattern/             # Behavioral: Dynamic Strategy Execution
    ├── Compression Strategy (ZIP / GZIP)
    ├── Encryption Strategy (AES / RSA)
    └── Notification Strategy (Email / SMS / Push)
```

---

## 🚀 How to Run Code via `Main.java`
Each design pattern folder contains `Main.java` file for each design pattern.

### 1️⃣ Open `Main.java`
Navigate to `src/main/java/com/design_patterns/<pattern_folder_name>/Main.java`.

### 3️⃣ Build & Execute via Maven
Run the project using Maven from your terminal:

```bash
# Clean and compile the codebase
mvn clean compile

# Execute the Main class
mvn exec:java -Dexec.mainClass="com.design_patterns.<pattern_folder_name>.Main"
```

---

## 📚 Pattern Summaries & Code Snippets for `Main.java`

---

### 1. 🔌 Adapter Pattern
* **Folder:** `src/main/java/com/design_patterns/adapter_pattern/`
* **Pattern Type:** Structural
* **Overview:** Adapts third-party payment gateways (`PayPalGateway`, `RazorPayGateway`) to conform to a common `PaymentService` interface.

---

### 2. 🏗️ Builder Pattern
* **Folder:** `src/main/java/com/design_patterns/builder_pattern/`
* **Pattern Type:** Creational
* **Overview:** Constructs complex `User` objects fluently without requiring large, multi-parameter constructors.

---

### 3. 🔗 Chain of Responsibility Pattern
* **Folder:** `src/main/java/com/design_patterns/chain_of_responsibility/`
* **Pattern Type:** Behavioral
* **Overview:** Passes customer service tickets through a sequential handler chain (`Chatbot -> Executive -> TechTeam`) until resolved.

---

### 4. ☕ Decorator Pattern
* **Folder:** `src/main/java/com/design_patterns/decorater_pattern/`
* **Pattern Type:** Structural
* **Overview:** Dynamically stacks beverage toppings onto a base `SimpleCoffee` instance at runtime.

---

### 5. 🏭 Factory Pattern (Simple & Abstract)
* **Folder:** `src/main/java/com/design_patterns/factory_pattern/`
* **Pattern Type:** Creational
* **Overview:** Encapsulates object creation logic, decoupling client calls from concrete class instantiations.

---

### 6. 🔔 Observer Pattern
* **Folder:** `src/main/java/com/design_patterns/observer_pattern/`
* **Pattern Type:** Behavioral
* **Overview:** Subscribes observer objects to a `Subject` so they receive automatic notifications upon state changes.

---

### 7. 🐑 Prototype Pattern
* **Folder:** `src/main/java/com/design_patterns/prototype_pattern/`
* **Pattern Type:** Creational
* **Overview:** Clones pre-configured `GameBotCharacters` instances quickly without running full constructor routines.

---

### 8. 🛡️ Proxy Pattern
* **Folder:** `src/main/java/com/design_patterns/prototype_pattern/`
* **Pattern Type:** Structural
* **Overview:** Intercepts method calls to manage access control (`protection_proxy`), deferred instantiation (`virtual_proxy`), or network endpoints (`remote_proxy`).

---

### 9. 🔒 Singleton Pattern
* **Folder:** `src/main/java/com/design_patterns/singleton_pattern/`
* **Pattern Type:** Creational
* **Overview:** Guarantees that only one instance of a class exists across the application runtime.

---

### 10. 🎯 Strategy Pattern
* **Folder:** `src/main/java/com/design_patterns/strategy_pattern/`
* **Pattern Type:** Behavioral
* **Overview:** Swaps algorithms dynamically at runtime for notifications, encryption, and compression.

---

## 💡 Core Benefits

- **⚡ Centralized Execution:** Test any pattern instantly by running `Main.java` file in each design pattern folder.
- **🔌 Loose Coupling:** High dependency inversion using interfaces.
- **🧱 Reusable & Scalable:** Clean adherence to OOP principles.

---
*Maintained by [Jugal1011](https://github.com/Jugal1011).*