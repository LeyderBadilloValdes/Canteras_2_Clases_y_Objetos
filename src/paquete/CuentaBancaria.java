package paquete;
/*
 * Class creado para CuentaBancaria
 */
public class CuentaBancaria {
    int accountNumber;
    boolean activated; 
/*
* Metodo construtor
*/
    public CuentaBancaria(){
        this.activated = false;
        this.accountNumber = 1234567890;
    }
/*
 * getters and setters 
 */
    public void setActived(boolean actived){
        this.activated = actived;
    }

    public boolean getActived(){
        return this.activated;
    }
}
