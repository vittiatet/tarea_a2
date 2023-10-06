
package sales_app;

// clase indice de la parte
public class IndiceParte {
    
    // Atributos
    private int _parteId; // id de la parte
    private int _posicion; // posición del índice

    // Constructor
    public IndiceParte(int _parteId, int _posicion) {
        this._parteId = _parteId;
        this._posicion = _posicion;
    }
    

    // getters y setters para id de la parte
    public int getParteId() {
        return _parteId;
    }

    public void setParteId(int _parteId) {
        this._parteId = _parteId;
    }

    // getters y setters para la posicion
    public int getPosicion() {
        return _posicion;
    }

    public void setPosicion(int _posicion) {
        this._posicion = _posicion;
    }
    
    
    
    
}







