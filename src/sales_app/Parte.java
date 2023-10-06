
package sales_app;

// clase parte
public class Parte {
    //atributos
    private int _parteId;
    private String _nombreParte;

    //constructor
    public Parte(int parteId, String nombreParte) {
        this._parteId = parteId;
        this._nombreParte = nombreParte;
    }

    //getters y setters para id de la parte
    public int getParteId() {
        return _parteId;
    }

    public void setParteId(int parteId) {
        this._parteId = parteId;
    }

    //getters y setters para el nombre de la parte
    public String getNombreParte() {
        return _nombreParte;
    }

    public void setNombreParte(String nombreParte) {
        this._nombreParte = nombreParte;
    }

    //metodo para mostrar la parte
    public void mostrarParte() {
        System.out.println("Parte ID: " + _parteId);
        System.out.println("Nombre: " + _nombreParte);
    }
}





