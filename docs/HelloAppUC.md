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
The app displays `Hello World` on the console when executed. This is the most basic use case to demonstrate a simple Java application that outputs text to the console.

### Disadvantages of Previous Use Case (if any)
Not applicable. UC1 is the first use case, so no previous behavior exists.

### Preconditions
- App is launched.

### Main Flow
1. User runs the application.
2. App executes the `main` method.
3. App prints `Hello World` to the console.
4. App terminates.

### Post Conditions
- Message is displayed to user.

### Hints
- Create a public class named `HelloApp`.
- Define a `main()` method with String array parameter.
- Use `System.out.println()` to print to console.
- The program executes and terminates immediately.

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
mvn compile
mvn exec:java
mvn exec:java -Dexec.mainClass="com.helloapp.HelloApp"
```

### Example Output

Input: Run the program  
Output: `Hello World`

```text
Hello World
```

### Concepts Learned
- **Class Declaration**
    - Defines a blueprint for objects. In this case, `HelloApp` is the class that contains the `main` method.
    - Every Java application must have at least one `public` class containing `public static void main(String[] args)` as the entry point.
    - The public class name must match the file name (`HelloApp.java`).
    - Java class naming convention is PascalCase.

- **Main Method**
    - The main method is the entry point for execution: `public static void main(String[] args)`.

- **Public Access Modifier**
    - `public` allows the JVM to access and invoke `main` when the program starts.

- **Static Keyword**
    - `static` means the method belongs to the class, so the JVM can call it without creating an object first.

- **Void Return Type**
    - `void` indicates the method does not return a value to the JVM.

- **String Array Parameter**
    - `String[] args` stores command-line arguments. UC1 does not use them yet, but they are part of the standard signature.

- **System.out.println()**
    - Standard way to print output to the console.
    - `System` is a class in `java.lang`.
    - `out` is the standard output stream.
    - `println` prints the message followed by a newline.

- **Program Execution Flow**
    - The JVM locates the `main` method, executes statements in sequence, prints `Hello World`, and then exits.
