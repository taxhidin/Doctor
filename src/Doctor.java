import java.util.ArrayList;

public class Doctor {

    public double output_minutes;

    public Doctor(int input_number_of_doctor, int output_number_of_doctors, int input_queue, int output_queue, double input_minutes) {

        output_minutes = (input_number_of_doctor * input_minutes * output_queue) / (output_number_of_doctors * input_queue);

        System.out.println("The patient’s waiting time is = " + output_minutes);


    }


}
