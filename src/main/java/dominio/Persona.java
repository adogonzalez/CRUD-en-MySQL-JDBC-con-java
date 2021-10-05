
package dominio;


public class Persona {
    private int idPersona;
    private String nombre;
    private String apelllido;  
    private String gmail;       
    private String telefono;

    public Persona() {
    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
        
    }
//con esta clase podremos manipular los registro de base de datos, tenemos sobrecarga de constructoes
//para poder solo ver los estados de la tabla o llamar po el ID o por el nombre
    public Persona(String nombre, String apelllido, String gmail, String telefono) {
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.gmail = gmail;
        this.telefono = telefono;
    }

    public Persona(int idPersona, String nombre, String apelllido, String gmail, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.gmail = gmail;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apelllido=" + apelllido + ", gmail=" + gmail + ", telefono=" + telefono + '}';
    }
    
    
    
}
