public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Ines");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(24);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(152654925);
        System.out.println("Mi teléfono es " + persona.getTelefono());
        System.out.print("Gracias por tanto, perdon por tan poco");
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}