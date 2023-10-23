package New_class_book.FileReadingAndWriting;

import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
public class Grading_System_With_File_Handling {
    static String grade(double value){
        if (value >= 90)
            return "A+";
        else if (83 <= value && value < 90)
            return "A";
        else if (80 <= value && value < 83 )
            return "A-";
        else if(75 <=  value && value < 80)
            return "B+";
        else if (65 <= value && value < 70)
            return "B-";
        else if (60 <= value && value < 65)
            return "C+";
        else if (55 <= value && value < 60)
            return "C";
        else if (50 <= value && value < 55)
            return "C-";
        else if (45 <= value && value < 50)
            return "D";
        else if (value < 45)
            return "F";
        else return "Invalid";
    }

    static double gradePoint(String grade){
        switch (grade){
            case "A+" -> {
                return 4;
            }case "A" -> {
                return 4;
            }case "A-" -> {
                return 3.75;
            }case "B+" -> {
                return 3.5;
            }case "B" -> {
                return 3;
            }case "B-" -> {
                return 2.75;
            }case "C+" -> {
                return 2.5;
            }case "C" -> {
                return 2;
            }case "C-" -> {
                return 1.75;
            }case "D" -> {
                return 1;
            }case "F" -> {
                return 0;
            }default -> {
                return -1;
            }
        }
    }
    public static void main(String[] args) throws IOException{
//        System.out.print("Enter File name : ");
        Scanner in = new Scanner(System.in);
//        String fileName = in.nextLine();
        FileWriter createFile = new FileWriter("fileName.txt",true);
        PrintWriter outputfile = new PrintWriter(createFile);
        System.out.print("Enter number of your courses:");
        int maxCourse = in.nextInt();
        System.out.print("Enter number of Students: ");
        int maxStudent = in.nextInt();
        in.nextLine();
        String studentName ;
        String courseName ;
        double gradeValue;
        String gradeAlph;
        double courseECTS;
        double totalPoint;
        double totalECTS = 0;
        HashMap<String, Double> couseData = new HashMap<>();
        for (int count = 1 ; count <= maxCourse; count++ ){
            System.out.printf( "Enter Name of course %d :", count);
            courseName = in.nextLine();
            System.out.printf("\nEnter ECTS of %s : ", courseName);
            courseECTS = in.nextDouble();
            in.nextLine();
            totalECTS += courseECTS;
            couseData.put(courseName, courseECTS);
        }

        for (int count = 1; count <= maxStudent; count++){
            System.out.printf("Enter name of Student %d :", count);
            studentName = in.nextLine();
            outputfile.printf(" %d. %s\n", count, studentName);
            totalPoint = 0;
            for (String name : couseData.keySet()){
                System.out.printf("\nEnter grade of %s : ", name);
                gradeValue = in.nextDouble();
                in.nextLine();
                gradeAlph = grade(gradeValue);
                totalPoint += gradePoint(gradeAlph) * couseData.get(name);
                outputfile.printf("""

                        \t\t course name: %-20s  Grade: %-5.2f   Grade In Alphabet: %-5s
                        
                        """, name, gradeValue, gradeAlph);
            }
            outputfile.printf("""
                    \t\t GPA :%.2f    Total grade point : %.2f \t total ECTS: %.2f
                    
                    """, totalPoint / totalECTS, totalPoint, totalECTS);
        }
        outputfile.close();
    }
}
