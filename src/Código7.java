//Importar Scanner y HashMAp - HashMap a String String - System in - Correccion de String linea 23 - linea 25 in por out - linea 26 double por line- H en while

import java.util.HashMap;
import java.util.Scanner;

public class Código7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");

        String c = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine();

            if (!c.equals("salir")) {
                if (capitales.containsKey(c)) {
                    System.out.println("La capital de " + c);
                    System.out.println(" es " + capitales.get(c));
                } else {
                    System.out.print("No conozco la respuesta");
                    System.out.print("¿cuál es la capital de " + c + "?: ");
                    String nuevaCapital = s.nextLine();
                    capitales.put(c, nuevaCapital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!c.equals("salir"));

        s.close();
    }
}