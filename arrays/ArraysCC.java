import java.util.*;

public class ArraysCC{

    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {87,98,70};
        update(marks);

        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();


        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // marks[0] = marks[0] + 50;

        // System.out.println("Phy marks : " + marks[0]);
        // System.out.println("Chem marks : " + marks[1]);
        // System.out.println("math marks : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("PErcentage is : " + percentage);

        
        

        
    }
}