public class Animal {
    private String nombre;
    private int edad;
    private Zoo zoo;

    public Animal(String nuevoNombre, int nuevaEdad, Zoo zoo ) {
        nombre = nuevoNombre;
        edad = nuevaEdad;
        zoo = zoo;
    }
    
    public String getNombre (){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Zoo getzoo() {
        return zoo;
    }
}
