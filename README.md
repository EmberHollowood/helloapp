# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

## Summary

Hello App begins with a simple console greeting and incrementally evolves into a modular, persistent, and extensible Java application. The use cases progress through command-line input, standard input handling, collection management, refactoring, persistence, and banner-style output.

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

## Build and Run

```bash
mvn clean install
java -cp target/classes com.helloapp.HelloApp
```

## Documentation

Detailed use case documentation is available in `docs/HelloAppUC.md`.
