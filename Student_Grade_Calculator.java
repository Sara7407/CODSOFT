//CODSOFT task 2: Student Grade Calculator

import java.util.Scanner;
public class Student_Grade_Calculator{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println(".....Student Grade Calculator.....");
        System.out.print("Enter the number of your subjects: ");
        //nos = number of subjects
        int nos = sc.nextInt();
        int total = 0;
        for(int i = 0; i<nos;i++){
            System.out.print("Enter marks obtained in " +i+": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double avg_pcntg = (double)total/nos;
        char Grade;
        if(avg_pcntg>=95){
            Grade = 'O';
        }

        else if(avg_pcntg>=85){
            Grade = 'A';
        }

        else if(avg_pcntg>=75){
            Grade = 'B';
        }

        else if(avg_pcntg>=65){
            Grade = 'C';
        }

        else if(avg_pcntg>=55){
            Grade = 'D';
        }

        else if(avg_pcntg>=35){
            Grade = 'E';
        }

        else {
            Grade = 'F';
        }

        System.out.println("Total marks: "+total);
        System.out.println("Average Percentage is: " + avg_pcntg +"%");
        System.out.print("Grade : " + Grade);
    }
}
