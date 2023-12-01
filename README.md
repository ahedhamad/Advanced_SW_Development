# Student Management System

This application manages students using various controllers, models, and services.

## Controllers:

### StudentController
- **report(StudentList studentList):** Generates a report on the student list.
- **equals(Object student):** Compares if the provided student object is equal.
- **getAge(StudentList studentList, int studentId):** Fetches the age of a student.
- **print(StudentList studentList, int studentId):** Prints student information.
- **addStudent(StudentList studentList, Student student):** Adds a student to the list.
- **retrieveStudent(StudentList studentList):** Retrieves the list of students.
- **removeStudent(StudentList studentList, Student student, int id):** Removes a student from the list.

## Models:

### EngineeringStudent
- Extends the Student class and contains a lab attribute.

### MasterStudent
- Extends the Student class and includes research and supervisor attributes.

### Hospital
- Represents a Hospital with id, name, and number attributes.

### StudentList
- Extends the Student class and includes functionality for managing a list of students.
- **findById(int id):** Finds a student by their ID.
- **addStudent(Student student):** Adds a student to the list.
- **removeStudent(Student student, int id):** Removes a student from the list.

### MedicalStudent
- Extends the Student class and contains a Hospital object and research attribute.

## Services:

### StudentService
- Implements StudentInterface methods.
- Manages operations related to students such as adding, retrieving, and removing.
- Tracks the count of operations.
- Additional methods for getting age and printing student information.

## Interfaces:

### StudentInterface
- Specifies methods for adding, retrieving, and removing students.

## Main Application (Main class):

- Creates student instances and initializes a StudentList.
- Interacts with the StudentController based on user input to perform various operations such as adding, removing, retrieving students, and generating reports.
- Displays a menu for user interaction and handles the respective operations.

The application allows user interaction for managing students, tracking operations, and retrieving student information.
