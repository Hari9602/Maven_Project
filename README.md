
# 🧮 Simple Calculator

This is a command-line calculator application built using Java and Maven. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. 


## 🌟 Features
- Perform basic arithmetic operations: addition, subtraction, multiplication, and division.
- User-friendly command-line interface.
- Continuous operation until the user decides to exit.

## ⚙️ Prerequisites
Before you begin, ensure you have the following installed on your machine:
- **Java JDK 17 or higher**: You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or use an open-source version like OpenJDK.
- **Maven**: Download and install Maven from the [Apache Maven website](https://maven.apache.org/download.cgi).

## 📥 Installation
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/simple-calculator.git
   ```
2. Navigate into the project directory:
   ```bash
   cd simple-calculator
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## 🚀 Usage
To run the Simple Calculator application, use the following command:

```bash
java -cp target/simple-calculator-1.0-SNAPSHOT.jar com.example.App
```

### Example Interaction
```
Welcome to the Simple Calculator!
Enter first number (or type 'exit' to quit): 10
Enter second number: 5
Choose an operation (+, -, *, /): +
The result of 10.00 + 5.00 = 15.00

Enter first number (or type 'exit' to quit): exit
Thank you for using the calculator!
```


## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



