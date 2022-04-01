package adoptarperro.servicios;

import adoptarperro.entidades.Perro;
import adoptarperro.entidades.Persona;
import java.util.Scanner;


public class ServicioAdoptar {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        a.setApellido(leer.next());
        System.out.println("Ingrese edad de la persona");
        a.setEdad(leer.nextInt());
        System.out.println("Ingrese el Dni de la persona");
        a.setDocumento(leer.nextInt());
        
        return a;
    }
    
    
    public Perro crearPerro(){
        Perro p = new Perro();
        System.out.println("Ingrese el nombre del perro");
        p.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro");
        p.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        p.setTamaño(leer.next());
        
        return p;
    }
    
}
