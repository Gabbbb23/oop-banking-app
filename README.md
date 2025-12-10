# OOP BANKO SENTRAL

**Overview**
- Simple Java Swing banking app (educational project).

**Prerequisites**
- Java 17 JDK installed and on your `PATH`.
- Apache Maven installed.
- A desktop environment (this is a Swing GUI — not for headless servers).

**Run using Maven (recommended)**
From the project root (where pom.xml is):
```fish
cd '/home/komamahol/Important files/College Files/College Junior Year/Coding Projects (maybe)/old java project/oop-banking-app'
# Run the main class using Maven (exec plugin will add dependencies and resources)
mvn -Dexec.mainClass=bsrtu.bankingapp.BankingApp exec:java
```

**Build then run manually**
```fish
# Build the project
mvn package

# (optional) copy dependencies into target/dependency
mvn dependency:copy-dependencies

# Run with the compiled classes and dependencies on the classpath
java -cp target/classes:target/dependency/* bsrtu.bankingapp.BankingApp
```

**Create a single runnable (fat) JAR (optional)**
You can add the Maven Shade plugin to pom.xml to produce an executable jar that bundles dependencies. After adding the plugin, run:
```fish
mvn package
java -jar target/BankingApp-1.0-SNAPSHOT-shaded.jar
```

**Install on common Linux distros**
- Debian/Ubuntu:
```fish
sudo apt update
sudo apt install -y maven openjdk-17-jdk
```
- Fedora:
```fish
sudo dnf install -y maven java-17-openjdk
```

**Notes**
- The project requires Java 17 (see pom.xml).
- `src/main/resources` contains `userLoggedIn.csv` and `users.csv` which are loaded at runtime; Maven packages these resources automatically.
- The app is a Swing GUI — run it on a desktop (X/Wayland). Running on a headless server will fail with GUI errors.
- If you get errors about missing classes at runtime, use the Maven commands above to ensure dependencies are on the classpath or create a fat jar.
