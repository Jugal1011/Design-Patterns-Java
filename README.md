# ☕ Java Design Patterns Repository

Welcome to the **Design-Patterns-Java** repository! This project provides structured, real-world implementations of classic **Object-Oriented Design Patterns** in Java.

All design patterns in this repository are executed from a single entry point: **`src/main/java/com/design_patterns/Main.java`**. The runner code for each pattern is organized into commented-out code blocks in `Main.java`, allowing developers to easily uncomment and execute specific patterns.

---

## 🛠️ Repository Architecture & Tech Stack

- **Language:** Java 17+
- **Build Tool:** Apache Maven (`pom.xml`)
- **Base Package:** `com.design_patterns`
- **Main Entry Point:** `src/main/java/com/design_patterns/Main.java`

---

## 📁 Directory Structure

```
src/main/java/com/design_patterns/
├── Main.java                        # 🚀 Central Runner (Toggle pattern execution)
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
```

---

## 🚀 How to Run Code via `Main.java`

`Main.java` contains individual driver blocks for each design pattern. Simply uncomment the block for the pattern you want to run, compile, and execute!

### 1️⃣ Open `Main.java`
Navigate to `src/main/java/com/design_patterns/Main.java`.

### 2️⃣ Uncomment the Pattern Code Block
Uncomment the section corresponding to the design pattern you wish to execute.


### 3️⃣ Build & Execute via Maven
Run the project using Maven from your terminal:

```bash
# Clean and compile the codebase
mvn clean compile

# Execute the Main class
mvn exec:java -Dexec.mainClass="com.design_patterns.Main"
```

---

## 📚 Pattern Summaries & Code Snippets for `Main.java`

---

### 1. 🔌 Adapter Pattern
* **Folder:** `src/main/java/com/design_patterns/adapter_pattern/`
* **Pattern Type:** Structural
* **Overview:** Adapts third-party payment gateways (`PayPalGateway`, `RazorPayGateway`) to conform to a common `PaymentService` interface.
* **Snippet for `Main.java`:**
  ```java
  PaymentService paypalAdapter = new PayPalPaymentAdapter(new PayPalGateway());
  paypalAdapter.processPayment(250.00);

  PaymentService razorPayAdapter = new RazorPayPaymentAdapter(new RazorPayGateway());
  razorPayAdapter.processPayment(500.00);
  ```

---

### 2. 🏗️ Builder Pattern
* **Folder:** `src/main/java/com/design_patterns/builder_pattern/`
* **Pattern Type:** Creational
* **Overview:** Constructs complex `User` objects fluently without requiring large, multi-parameter constructors.
* **Snippet for `Main.java`:**
  ```java
  User user = new UserBuilder()
      .setFirstName("Alice")
      .setLastName("Smith")
      .setEmail("alice@example.com")
      .setAge(28)
      .build();
  System.out.println("User created: " + user.getFirstName());
  ```

---

### 3. 🔗 Chain of Responsibility Pattern
* **Folder:** `src/main/java/com/design_patterns/chain_of_responsibility/`
* **Pattern Type:** Behavioral
* **Overview:** Passes customer service tickets through a sequential handler chain (`Chatbot -> Executive -> TechTeam`) until resolved.
* **Snippet for `Main.java`:**
  ```java
  RequestHandler chatbot = new ChatbotHandler();
  RequestHandler executive = new CustomerExecutiveHandler();
  RequestHandler techTeam = new TechnicalTeamHandler();

  chatbot.setNextHandler(executive);
  executive.setNextHandler(techTeam);

  chatbot.handleRequest(new Issue("Password reset", Severity.LOW));
  chatbot.handleRequest(new Issue("System outage", Severity.CRITICAL));
  ```

---

### 4. ☕ Decorator Pattern
* **Folder:** `src/main/java/com/design_patterns/decorater_pattern/`
* **Pattern Type:** Structural
* **Overview:** Dynamically stacks beverage toppings onto a base `SimpleCoffee` instance at runtime.
* **Snippet for `Main.java`:**
  ```java
  Coffee coffee = new SimpleCoffee();
  coffee = new MilkDecorator(coffee);
  coffee = new SugarDecorator(coffee);
  coffee = new WhippedCreamDecorator(coffee);

  System.out.println("Order: " + coffee.getDescription());
  System.out.println("Total: $" + coffee.getCost());
  ```

---

### 5. 🏭 Factory Pattern (Simple & Abstract)
* **Folder:** `src/main/java/com/design_patterns/factory_pattern/`
* **Pattern Type:** Creational
* **Overview:** Encapsulates object creation logic, decoupling client calls from concrete class instantiations.
* **Snippet for `Main.java`:**
  ```java
  PaymentFactory factory = new PaymentFactory();
  PaymentMethod payment = factory.getPaymentMethod("CREDIT_CARD");
  payment.pay(120.00);
  ```

---

### 6. 🔔 Observer Pattern
* **Folder:** `src/main/java/com/design_patterns/observer_pattern/`
* **Pattern Type:** Behavioral
* **Overview:** Subscribes observer objects to a `Subject` so they receive automatic notifications upon state changes.
* **Snippet for `Main.java`:**
  ```java
  Subject publisher = new ConcreteSubject();
  Observer subscriber1 = new UserObserver("User1");
  publisher.attach(subscriber1);
  publisher.setState("New Article Published!");
  ```

---

### 7. 🐑 Prototype Pattern
* **Folder:** `src/main/java/com/design_patterns/prototype_pattern/`
* **Pattern Type:** Creational
* **Overview:** Clones pre-configured `GameBotCharacters` instances quickly without running full constructor routines.
* **Snippet for `Main.java`:**
  ```java
  GameBotCharacters botTemplate = new GameBotCharacters("WarriorBot", 100, 50);
  GameBotCharacters clonedBot = botTemplate.clone();
  ```

---

### 8. 🛡️ Proxy Pattern
* **Folder:** `src/main/java/com/design_patterns/prototype_pattern/`
* **Pattern Type:** Structural
* **Overview:** Intercepts method calls to manage access control (`protection_proxy`), deferred instantiation (`virtual_proxy`), or network endpoints (`remote_proxy`).
* **Snippet for `Main.java`:**
  ```java
  // Protection Proxy Demo
  DatabaseAccess proxy = new ProtectionProxy("ADMIN");
  proxy.executeQuery("DELETE FROM users");
  ```

---

### 9. 🔒 Singleton Pattern
* **Folder:** `src/main/java/com/design_patterns/singleton_pattern/`
* **Pattern Type:** Creational
* **Overview:** Guarantees that only one instance of a class exists across the application runtime.
* **Snippet for `Main.java`:**
  ```java
  DoubleCheckedSingleton singleton = DoubleCheckedSingleton.getInstance();
  ```

---

### 10. 🎯 Strategy Pattern
* **Folder:** `src/main/java/com/design_patterns/strategy_pattern/`
* **Pattern Type:** Behavioral
* **Overview:** Swaps algorithms dynamically at runtime for notifications, encryption, and compression.
* **Snippet for `Main.java`:**
  ```java
  CompressionContext compression = new CompressionContext();
  compression.setStrategy(new ZIPCompression());
  compression.compress("data.txt");

  compression.setStrategy(new GZIPCompression());
  compression.compress("data.txt");
  ```

---

## 💡 Core Benefits

- **⚡ Centralized Execution:** Test any pattern instantly by toggling code blocks in `Main.java` [5].
- **🔌 Loose Coupling:** High dependency inversion using interfaces.
- **🧱 Reusable & Scalable:** Clean adherence to OOP principles.

---
*Maintained by [Jugal1011](https://github.com/Jugal1011).*
