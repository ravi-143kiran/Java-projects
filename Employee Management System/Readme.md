### The Employee Management System is a Java project that utilizes Java Swing and AWT for the user interface and MySQL for the underlying database. The project allows for efficient management of employee records, including their personal information, salary details, and employment history.


# **Features**
The Employee Management System provides the following features:

- Employee Information: Add, update, and delete employee records, including personal details such as name, address, and contact information.
- View Employee: Name, salary, Address details, including  Employee details, and deductions.
- Search and Filter: Search for employees by name, position, or department, and apply filters to view specific subsets of employee records.
- Update Employee: Update the Address, Phone, Education, Salary, Designation details
- Reports: Generate reports such as employee lists, salary statements, and department-wise employee counts.

# **Prerequisites**
Before running this project, ensure you have the following installed:

- Java Development Kit (JDK) (version 8 or higher)
- MySQL (version 5.7 or higher)
- MySQL Connector/J (JDBC driver for MySQL)
- Apache Ant (for building the project)

# **Installation**

Follow these steps to install and run the Employee Management System project:

1. Clone or download the project repository to your local machine.

2. Import the project into your preferred Java IDE.

3. Set up the MySQL database:
- Create a new database in your MySQL server.
- Import the provided SQL script located in the database directory to create the necessary tables and initial data.

4. Configure the database connection:
- Open the **src/com/ems/util/DBConnection.java** file.
- Update the database URL, username, and password with your MySQL server configuration.

5. Ensure the MySQL Connector/J library is added to your project's build path.

6. Build the project using Apache Ant:
- Open a terminal or command prompt and navigate to the project's root directory.
- Run the command: **ant** to build the project.

7.  Run the project:
- Open a terminal or command prompt and navigate to the project's root directory.
- Run the command: **ant run** to launch the Employee Management System.

8. By Using the **Net beans** we can execute the code.
# **Login Page**

![Alternate Text](/Employee%20Management%20System/Login.png "Login Page")

# **Home Page**
![Alternate Text](/Employee%20Management%20System/Home.png "Home Page")

# **Usage**

- Launch the Employee Management System application.
- Use the provided interface to navigate through the available options, such as adding employees, managing salaries, viewing employment history, and generating reports.
- Follow the prompts and provide the required information to execute the desired actions.
- Review the outputs and follow any additional instructions presented by the system.

# **Directory Structure**

The project directory structure is as follows:

- **src/:** Contains the source code for the Employee Management System.
- **database/:** Contains the SQL script to create the necessary database tables and initial data.
- **lib/:** Contains external libraries, such as the MySQL Connector/J driver.
- **build/:**  Contains the compiled class files and resources.
- **dist/:** Contains the distribution files (JAR file).
- **README.md:** The project's README file.

# **Contributing**

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

# **License**

This project is licensed under the **MIT License**.
