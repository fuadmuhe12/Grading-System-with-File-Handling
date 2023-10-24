# Grading System with File Handling

Welcome to the Grading System with File Handling! This Java program was developed during the summer break to assist in the grading process, 

## Overview

This project serves as a comprehensive grading system with file handling capabilities. It's designed to streamline the grading process for students in various courses, calculate GPAs, and provide an organized output in a file named "fileName.txt."

## Features

- **Grading System:**
  - Categorizes grades based on numerical values.
  - Conversion methods map between numerical grades and grade points.

- **File Handling:**
  - Stores and retrieves data using file handling techniques.
  - Utilizes `FileWriter` and `PrintWriter` to create and append data to the "fileName.txt" file.

- **User Input:**
  - Allows users to specify the number of courses and students.
  - For each course, provide the course name and its ECTS value.
  - For each student, enter their name and grades for each course.

- **GPA Calculation:**
  - Automatically calculates the GPA for each student based on the entered grades and ECTS values.
  - Results, including GPA, total grade points, and total ECTS, are written to the output file.

## How to Use

1. **Run the Program:**
   - Execute the program to initiate the grading process.

2. **Enter Course and Student Details:**
   - Input the number of courses and students as prompted.
   - For each course, provide the course name and ECTS value.
   - For each student, enter their name and grades for each course.

3. **GPA Calculation:**
   - The program will automatically calculate the GPA for each student based on the entered data.

4. **View Results in Output File:**
   - The results, including student details, grades, GPA, total grade points, and total ECTS, are stored in the "fileName.txt" file.

## Example:

```plaintext
1. John Doe

        Course name: Math               Grade: 85.00   Grade In Alphabet: A
        Course name: Science            Grade: 78.00   Grade In Alphabet: B+
        Course name: English            Grade: 92.00   Grade In Alphabet: A+

        GPA: 3.83    Total grade point: 11.83    Total ECTS: 15.00
