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

    public void setedad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void setzoo(Zoo nuevoZoo) {
        zoo = nuevoZoo;
    }

    public void setnombre (String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void imprimirDetalles() {
        System.out.println("El animal se llama " + nombre + ".");
        System.out.println("El animal tiene " + edad + " aÃ±o/s .");
        System.out.println("Esta es la ciudad donde se encuentra el zoo: " + zoo.getCiudad()+"." );
        System.out.println("¿El zoo dispone de acuario?: " + zoo.getTieneAcuario()+".");
    }
}
