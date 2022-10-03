public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Juan";
        cliente.edad = 31;
        cliente.telefono = 156256362;
        cliente.credito = 180.50;
        System.out.println("Me llamo "+ cliente.nombre +" Tengo " +  cliente.edad + " años y mi telefono es " + cliente.telefono + " Mi credito es de " + cliente.credito);

        trabajador.nombre = "Joaquin";
        trabajador.edad = 26;
        trabajador.telefono = 125364482;
        trabajador.salario = 235.58;
        System.out.println(" Me llamo " + trabajador.nombre + " Tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono + " Mi salario es de " +  trabajador.salario);
    }

}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    double credito;
}
class Trabajador extends Persona {
    double salario;
}