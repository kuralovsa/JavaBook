import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Homework4 {
    public static void main(String[] args) throws IOException{
        double radius=5, Diameter ,Area ;
        int k;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        System.out.println("Select a shape..\n 1 - Radius\n 2 - Diameter\n 3 - Area\n 4 - Exit program");
        k = Integer.parseInt(reader.readLine());

        switch (k) {
            case 1: System.out.println("Radius of circle: "+radius);
                break;
            case 2: Diameter=radius*2;
                System.out.println("Diameter of circle: "+Diameter);
                break;
            case 3: Area=3.14*radius*radius;
                System.out.println("Area of circle: "+Area);
                break;
            default:
                System.out.println("Use command 1,2,3,4 ");
        }

    }
}}