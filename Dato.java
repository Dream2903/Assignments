import java.util.Date;

public class Dato {
    public static void main(String[] args) {

        //Object
        Date dato = new Date();

        //Calculates the time
        for (long i = 1000 ; i <= 1000000 ; i*= 10) {
            dato.setTime(i);                            //Must be a long type

            System.out.println(dato.toString());
        }
    }
}

