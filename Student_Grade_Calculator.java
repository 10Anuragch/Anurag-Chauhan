import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        int subjects, i;
        float sum = 0, avgPer;

        // Input marks obtained (out of hundread) in each subjects

        System.out.println("Enter the number of subjects: ");
        Scanner sc = new Scanner(System.in);
        subjects = sc.nextInt();
        System.out.println("Enter the marks of " + subjects + " subjects: ");
        for (i = 0; i < subjects; i++) {
            sum += sc.nextInt();
        }

        // Display total marks

        System.out.println("Total marks= " + sum);

        avgPer = (sum / (subjects * 100)) * 100;

        // Display Average Percentage

        System.out.println("Average Percentage = " + avgPer);

        // Print Grade

        if (avgPer > 90 && avgPer <= 100)
         {
            System.out.println("Grade is A");
        } 
        else if (avgPer > 80 && avgPer <= 90) 
        {
            System.out.println("Grade is B");
        }
         else if (avgPer > 70 && avgPer <= 80) 
         {
            System.out.println("Grade is C");
        }
         else if (avgPer > 60 && avgPer <= 70) 
         {
            System.out.println("Grade is D");
        }
         else {
            System.out.println("Grade is E");
        }
    }
}
