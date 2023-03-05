public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("David");
        persona.setEdad(19);
        persona.setTelefono(312534316);
        System.out.println("mi nombre es " + persona.getNombre() + " tengo " + persona.getEdad() + " años y mi numero es " + persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}