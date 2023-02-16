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
}