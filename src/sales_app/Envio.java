
package sales_app;

// clase envio
public class Envio {
    private Parte parte;
    private Proveedor proveedor;
    private int cantidad;

    public Envio(Parte parte, Proveedor proveedor, int cantidad) {
        this.parte = parte;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarEnvio() {
        System.out.println("Información de Envío:");
        System.out.println("Parte:");
        parte.mostrarParte();
        System.out.println("Proveedor:");
        proveedor.mostrarProveedor();
        System.out.println("Cantidad: " + cantidad);
    }
}





