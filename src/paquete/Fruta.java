package paquete;

import java.util.ArrayList;
/*
 * Class creado para Fruta
 */
public class Fruta {
    String name;
    ArrayList<String> colors;
    float averageWeight; //Peso promedio
/*
* Metodo construtor
*/
    public Fruta(){
            colors.add("Azul");
            colors.add("Rojo");
            colors.add("Amarillo");
            colors.add("Naranja");
    }
/*
 * getters and setters 
 */
    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
}
