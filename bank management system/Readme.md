
## The Bank Management System is a Java project that utilizes Java Swing and AWT for the user interface and MySQL for the underlying database. This project provides a comprehensive solution for managing bank accounts, performing transactions, and generating reports within a banking environment.


# **Features**

The Bank Management System offers the following features:

- Account Management: Create and login user can transaction and deposit viewing account details for customers.
- Transaction Handling: Perform deposits, withdrawals,  pin change, and balance enquiry between accounts.
- Statement Generation: Generate account statements for customers with transaction history.
- Reports: Generate reports such as account balances, transaction summaries details.

# **Prerequisites**

Before running this project, make sure you have the following installed:

- Java Development Kit (JDK) (version 8 or higher)
- MySQL (version 5.7 or higher)
- MySQL Connector/J (JDBC driver for MySQL)
- Apache Ant (for building the project)

# **Installation**

To install and run the Bank Management System project, follow these steps:

1. Clone or download the project repository to your local machine.

2. Import the project into your preferred Java IDE.

3. Set up the MySQL database:
- Create a new database in your MySQL server.
- Import the provided SQL script located in the **database** directory to create the necessary tables and initial data.

4. Configure the database connection:
- Open the **src/com/bank/util/DBConnection.java** file.
- Update the database URL, username, and password with your MySQL server configuration.

5. Ensure the MySQL Connector/J library is added to your project's build path.

6. Build the project using Apache Ant:
- Open a terminal or command prompt and navigate to the project's root directory.
- Run the command: **ant** to build the project.

7. Run the project:
- Open a terminal or command prompt and navigate to the project's root directory.
- Run the command: **ant run** to launch the Bank Management System.

# **Login Page**
![Alternate Text](/bank%20management%20system/Login.png)

# **SignupOne**
![Alternate Text](/bank%20management%20system/SignupOne.png)

# **SignupTwo**
![Alternate Text](/bank%20management%20system/SignupTwo.png)

# **SignupThree**
![Alternate Text](/bank%20management%20system/SignupThree.png)

# **Transactions**
![Alternate Text](/bank%20management%20system/Transactions.png)

# **Usage**

- Launch the Bank Management System application.
- Use the provided interface to navigate through the available options, such as creating accounts, performing transactions, managing loans, and generating reports.
- Follow the prompts and provide the required information to execute the desired actions.
- Review the outputs and follow any additional instructions presented by the system.

# **Directory Structure**

The project directory structure is as follows:

- **src/:** Contains the source code for the Bank Management System.
- **database/:** Contains the SQL script to create the necessary database tables and initial data.
- **lib/:** Contains external libraries, such as the MySQL Connector/J driver.
- **build/:** Contains the compiled class files and resources.
- **dist/:**  Contains the distribution files (JAR file).
- **README.md:**  The project's README file.

# **Contributing**

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

# **License**
This project is licensed under the **[MIT License](https://opensource.org/license/mit/ "Optional Title")**.
