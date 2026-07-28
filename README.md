### Folder-by-Folder Code & Pattern Summary

#### 1. Adapter Pattern (`com.design_patterns.adapter_pattern`)
* **Description:** Bridges incompatible interfaces so third-party classes can work with existing client code.
* **Code Example:** The repository integrates third-party SDKs (`PayPalGateway`, `RazorPayGateway`) into a unified `PaymentService` interface using `PayPalPaymentAdapter` and `RazorPayPaymentAdapter`, allowing `PaymentClient` to execute payments uniformly.

#### 2. Builder Pattern (`com.design_patterns.builder_pattern`)
* **Description:** Constructs complex objects step-by-step using a fluent interface, avoiding telescoping constructors.
* **Code Example:** `User` instances with multiple optional parameters are fluently built via `UserBuilder` and consumed by `UserService` and `EmailService`.

#### 3. Chain of Responsibility (`com.design_patterns.chain_of_responsibility`)
* **Description:** Decouples request senders from receivers by passing requests along a sequential chain of handlers.
* **Code Example:** Support `Issue` objects are evaluated and escalated sequentially through `ChatbotHandler` $\rightarrow$ `CustomerExecutiveHandler` $\rightarrow$ `TechnicalTeamHandler`.

#### 4. Decorator Pattern (`com.design_patterns.decorater_pattern`)
* **Category:** Structural
* **Description:** Dynamically adds new behaviors or responsibilities to an object at runtime without subclassing.
* **Code Example:** A base `SimpleCoffee` object is wrapped with ingredient decorators (`MilkDecorator`, `SugarDecorator`, `WhippedCreamDecorator`) to dynamically compute cost and description.

#### 5. Factory Pattern (`com.design_patterns.factory_pattern`)
* **Description:** Encapsulates object instantiation logic, allowing the program to choose concrete classes dynamically.
* **Code Example:** Structured into two sub-folders: `simple_factory_pattern` (conditional object creation) and `abstract_factory_pattern` (factories producing related families of objects).

#### 6. Observer Pattern (`com.design_patterns.observer_pattern`)
* **Description:** Implements a publish-subscribe subscription mechanism to notify multiple objects whenever a state change occurs.
* **Code Example:** A `Subject` maintains a list of `Observer` subscribers and broadcasts event state updates across all registered listeners.

#### 7. Prototype Pattern (`com.design_patterns.prototype_pattern`)
* **Description:** Creates new objects by copying/cloning existing prototype instances rather than creating them from scratch.
* **Code Example:** Implements a custom `Cloneable` interface in `GameBotCharacters` to duplicate game bots efficiently.

#### 8. Proxy Pattern (`com.design_patterns.proxy_pattern`)
* **Description:** Serves as a surrogate or placeholder to control access, lazy loading, or remote calls to an underlying object.
* **Code Example:** Divided into three functional implementations:
  * `protection_proxy`: Enforces role-based access control.
  * `remote_proxy`: Simulates network communication boundaries.
  * `virtual_proxy`: Delays heavy object instantiation until needed (lazy loading).

#### 9. Singleton Pattern (`com.design_patterns.singleton_pattern`)
* **Description:** Ensures a class has only one global instance throughout the application lifecycle.
* **Code Example:** Demonstrates four evolutionary approaches across sub-folders: `basic`, `lazy_initialization`, `thread_safety`, and `double_checked_lock_mechanism` (using `volatile` and synchronized blocks).

#### 10. Strategy Pattern (`com.design_patterns.strategy_pattern`)
* **Description:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.
* **Code Example:** Demonstrates dynamic strategy switching for three domain models:
  * **Notifications:** `EmailNotification`, `SmsNotification`, `PushNotification`.
  * **Encryption:** `AESEncryption`, `RSAEncryption`.
  * **Compression:** `ZIPCompression`, `GZIPCompression`.
