package paquete;
/*
 * Class creado para Fruta
 */
public class Carro {
    double weight;
    double height; 
    double width; 
    double long_1;
    int doorNumber;
    String model;

/*
* Metodo contructor para la class Carro 
*/
public Carro()
    {
        this.weight = 1000;
        this.height = 1.90;
        this.width = 4;
        this.long_1 = 2;
        this.doorNumber = 5;
        this.model = "Yamaha";

    }   
/*
 * getters and setters 
 */
    public double getweight(){

        return this.weight;

    }
/*
 * Instancia del metodo Carro para manejo del carro 
 */
    public void manejarCarro(){
        this.model = "Random";
        System.out.println("Va manejando el carro modelo " + this.model);
    }

}
