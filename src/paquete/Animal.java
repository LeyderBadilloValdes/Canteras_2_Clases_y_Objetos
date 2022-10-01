package paquete;
/*
 * Creacion de la clase Animal
 */
public class Animal {
    private String race;
    private String name;
    private int age;
/*
 * Definicion de la instacia metodo Animal
 */
    public Animal(String newName)
    {
        this.name = newName; //Se le da un nombre al animal
    }

/*
 * getters and setters 
 */
    public int getAge()
    {
        return this.age;
    }


    public void setAge(int newAge)
    {
        this.age = newAge;
    }


    public String getName()
    {
        return this.name;
    }

    public String getRace()
    {
        return this.race;
    }
}
