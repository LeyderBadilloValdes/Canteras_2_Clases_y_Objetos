package paquete;
import java.sql.Date;
import java.util.Scanner;
/*
 * Clase creado para Personas
 */
public class Personas {
    Scanner sc = new Scanner(System.in);
    String name, lastName1, lastName2;
    Date dateBirth;
    float height;
/*
* Metodo construtor
*/
    public Personas(){
        this.name = "Jose";
    }
/*
 * getters and setters 
 */
    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){ 
        System.out.println("Ingrese nombre: ");
        this.name = sc.next(); 
        System.out.println(this.name);
        return this.name; 
    }

}
