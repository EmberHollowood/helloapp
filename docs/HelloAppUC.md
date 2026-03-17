# Hello App Use Cases

This document tracks the Hello App use case roadmap and implementation notes.

## Use Case Roadmap

- UC1: Print a basic greeting in the console.
- UC2: Accept one name via command-line input and greet that user.
- UC3: Support optional argument handling with a default greeting path.
- UC4: Handle multiple command-line names in one execution.
- UC5: Read a single name from standard input.
- UC6: Read and process multiple names from standard input.
- UC7: Store entered names in memory and list them on request.
- UC8: Add removal support for stored names.
- UC9: Extract input-processing logic into dedicated methods.
- UC10: Move name-management responsibilities into a separate class.
- UC11: Persist names to storage and reload them across runs.
- UC12: Render greeting text in banner-style output for enhanced display.

---

## UC1: Display "Hello World"

### Description
UC1 introduces the first executable version of Hello App. The application prints a fixed greeting, `Hello World`, to the console. This validates that the Java/Maven project is correctly configured and runnable.

### Disadvantages of Previous Use Case (if any)
Not applicable. UC1 is the first use case, so no previous behavior exists.

### Preconditions
- Java JDK is installed and available.
- Maven is installed and available.
- Project contains a valid `pom.xml`.
- Source file exists at `src/main/java/com/helloapp/HelloApp.java`.

### Main Flow
1. User runs the application.
2. JVM executes the `main` method in `HelloApp`.
3. Application prints `Hello World` to standard output.
4. Program exits successfully.

### Post Conditions
- Greeting is shown in console output.
- Build and run pipeline is validated for future use cases.

### Hints
- Keep UC1 minimal; no input handling is needed.
- Use `System.out.println` for a simple console message.
- Verify with Maven before moving to UC2.

### Code Snippet Example
```java
package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Run Commands
```bash
mvn clean install
java -cp target/classes com.helloapp.HelloApp
```

### Concepts Learned
- Java class and `main` method entry point
- Console output using `System.out.println`
- Maven lifecycle basics (`clean`, `install`)
- Project structure under `src/main/java`
