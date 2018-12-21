// Una clase que representa un registro de informaci�n
package lecturaArchivosClase; // se empaqueta para reutilizarla

public class RegistroCuenta { //Creamos la clase RegistroCuenta y sus atributos

    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

    // Creamos un constructor sin argumentos llama a otro constructor con valores predeterminados
    public RegistroCuenta() {
        this(0, "", "", 0.0); // llama al constructor con cuatro argumentos
    } // fin del constructor de RegistroCuenta sin argumentos

    // Creacion de contructor que recibe parametros de la clase
    public RegistroCuenta(int cta, String nombre, String apellido, double sal) {
        establecerCuenta(cta);
        establecerPrimerNombre(nombre);
        establecerApellidoPaterno(apellido);
        establecerSaldo(sal);
    } // fin del constructor de RegistroCuenta con cuatro argumentos

    // establece el numero de cuenta 
    public void establecerCuenta(int cta) {
        cuenta = cta;
    } // fin del metodo establecerCuenta

    // obtiene el n�mero de cuenta 
    public int obtenerCuenta() {
        return cuenta;
    } // fin del metodo obtenerCuenta

    // establece el primer nombre 
    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    } // fin del metodo establecerPrimerNombre

    // obtiene el primer nombre 
    public String obtenerPrimerNombre() {
        return primerNombre;
    } // fin del metodo obtenerPrimerNombre

    // establece el apellido paterno  
    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    } // fin del metodo establecerApellidoPaterno

    // obtiene el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    } // fin del metodo obtenerApellidoPaterno

    // establece el saldo  
    public void establecerSaldo(double sal) {
        saldo = sal;
    } // fin del metodo establecerSaldo

    // obtiene el saldo   
    public double obtenerSaldo() {
        return saldo;
    } // fin del metodo obtenerSaldo
} // fin de la clase RegistroCuenta
