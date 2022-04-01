package adoptarperro;

import adoptarperro.entidades.Perro;
import adoptarperro.entidades.Persona;
import adoptarperro.servicios.ServicioAdoptar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdoptarPerro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioAdoptar sa = new ServicioAdoptar();

        List<Persona> personas = new ArrayList();
        List<Perro> perros = new ArrayList();

        System.out.println("Se cargarán 2 personas en el sistema: ");
        for (int i = 0; i < 2; i++) {
            personas.add(sa.crearPersona());
        }
        System.out.println("-----------");
        System.out.println("Se cargarán 2 perros en el sistema: ");
        for (int i = 0; i < 2; i++) {
            perros.add(sa.crearPerro());
        }

        System.out.println("");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perros) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();

            int ctrol = 0;

            for (int i = 0; i < perros.size(); i++) {
                if (adoptable.equalsIgnoreCase(perros.get(i).getNombre())) {
                    aux.setPerro(perros.get(i));
                    ctrol++;
                    perros.remove(i);
                }
            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptado a un perro: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());

            }
        }
    }
}
