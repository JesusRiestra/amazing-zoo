public class Zoo {
    private String ciudad;
    private boolean tieneAcuario;

    public Zoo(String nuevaCiudad, boolean tieneAcuario) {
        ciudad = nuevaCiudad;
        this.tieneAcuario = tieneAcuario;
    }

    public void setCiudad (String nuevaCiudad) {
        ciudad = nuevaCiudad;
    }

    public String getCiudad (){
        return ciudad;
    }

    public void setacuario(boolean acuarioNuevo) {
        tieneAcuario = acuarioNuevo;
    }

    public boolean getTieneAcuario (){
        return tieneAcuario;
    }

    public void imprimirDetalles() {
        System.out.println("Esta es la ciudad donde se encuentra el zoo" + ciudad + ".") ;
        System.out.println("¿El zoo dispone de acuario? " + tieneAcuario + ".");
    }
}