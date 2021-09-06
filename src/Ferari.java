import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ferari {
    public static Scanner input = new Scanner(System.in);

    public static final int Input_Number_of_Doctor = 1;
    public static ArrayList<String> Output_Number_of_Doctors = new ArrayList<String>();
    public static String doctor_name;

    public static final int Input_Queue = 1;
    public static int Output_Queue;

    public static double Input_minutes;

    private static int counter = 1;


    public static void main(String[] args) {


        System.out.printf("Enter name of Doctor or write \"stop\" to quit  %d# ", counter);
        doctor_name = input.next();
        while (!Objects.equals(doctor_name, "stop")) {
            Output_Number_of_Doctors.add(doctor_name);
            ++counter;
            System.out.printf("Enter name of Doctor or write \"stop\" to quit  %d# ", counter);
            doctor_name = input.next();

            input.nextLine();
        }
        if(Output_Number_of_Doctors.size() == 1) {
            System.out.println("\nIn Hospital is working only " + Output_Number_of_Doctors.size() + " Doctor");
            for (String s : Output_Number_of_Doctors){

                System.out.println("In Hospital it is working only Doctor: "+ s);

            }
        }

        else {
            System.out.println("\nWe have " + Output_Number_of_Doctors.size() + " Doctors\n");
            System.out.println("\nIn Hospital are working all these Doctors: ");
            for (String h : Output_Number_of_Doctors){

                //System.out.println(h);
                System.out.println(Arrays.asList(h));

            }
        }

        System.out.println("How many patients are in queue positions:  ");
        Output_Queue = input.nextInt();


        System.out.println("What is the average consultation time " +
                "( assume that for all Doctors are same" +
                "consultation time ): ");
        Input_minutes = input.nextDouble();


        Doctor doctor = new Doctor(Input_Number_of_Doctor, Output_Number_of_Doctors.size(), Input_Queue, Output_Queue, Input_minutes);

        input.close();
    }


}


