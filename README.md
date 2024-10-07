# Guide to Run the Application on Linux

### Prerequisites
- **Java Development Kit (JDK) 21 or higher**
- **Git** (optional, if you need to clone the project)
- **Gradle** (optional, as the project includes the Gradle Wrapper)

---

## Steps to Run the Application

### 1. Clone the Repository
If you have access to the source code on GitHub, clone the repository:

```bash
git clone https://github.com/devops-360-online/event-management.git
cd event-management
```

Note: If you already have the source code on your machine, simply navigate to the project directory.

---

### 2. Verify Java Version
Ensure that Java 21 or higher is installed:

```bash
java -version
```

The output should indicate that you're running Java 21 or a later version.

---

### 3. Build the Project

#### Using the Gradle Wrapper (Recommended)
The project includes a Gradle Wrapper (gradlew), so you don't need to install Gradle separately.

Make sure the `gradlew` script is executable:

```bash
chmod +x gradlew
```

Build the project:

```bash
./gradlew build
```

#### Using Installed Gradle (Optional)
If you have Gradle installed on your machine, you can also use:

```bash
gradle build
```

---

### 4. Run the Application

#### With the Gradle Wrapper
```bash
./gradlew bootRun
```

#### With Installed Gradle
```bash
gradle bootRun
```

---

### 5. Verify the Application is Running
Open your web browser and navigate to:

```bash
http://localhost:8080/events
```

You should see a list of events in JSON format, for example:

```json
[
  {
    "id": 1,
    "name": "DevOps Conference",
    "date": "2024-11-10"
  },
  {
    "id": 2,
    "name": "Spring Boot Workshop",
    "date": "2024-12-05"
  }
]
```

If you see this output, the application is running correctly.

---

## Summary of Commands
```bash
# Clone the project (if needed)
git clone https://github.com/your-username/event-management.git
cd event-management

# Make the Gradle Wrapper executable
chmod +x gradlew

# Build the project using the Gradle Wrapper
./gradlew build

# Run the application
./gradlew bootRun
```

---

### Notes

- **Default Port**: The application listens on port 8080. If this port is already in use, you can change the port by modifying the `src/main/resources/application.properties` file:

```properties
server.port=8081
```

- **Permissions**: If you encounter permission issues with the `gradlew` script, ensure it is executable:

```bash
chmod +x gradlew
```

---

### Troubleshooting

- **Java Not Found or Wrong Version**: Ensure that `JAVA_HOME` points to the correct Java version. You can set `JAVA_HOME` like this:

```bash
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
```

Make sure that the Java version is 21 or higher.

- **Gradle Not Found**: If you're using the Gradle Wrapper, ensure that the `gradlew` file exists at the root of the project and is executable.

- **Missing Dependencies**: If the build fails, check your internet connection, as Gradle needs to download dependencies during the first build.

---

## Conclusion
You now have all the information needed to run the application on Linux. If you have any questions or issues, feel free to ask for help.
