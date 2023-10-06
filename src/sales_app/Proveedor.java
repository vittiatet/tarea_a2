
package sales_app;

// clase proveedor
import javax.swing.*;
import java.awt.*;

public class Proveedor {
    private int _proveedorId;
    private String _nombreProveedor;

    public Proveedor(int proveedorId, String nombreProveedor) {
        this._proveedorId = proveedorId;
        this._nombreProveedor = nombreProveedor;
    }

    public int getProveedorId() {
        return _proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this._proveedorId = proveedorId;
    }

    public String getNombreProveedor() {
        return _nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this._nombreProveedor = nombreProveedor;
    }

    // Método para mostrar la información del proveedor
    public void mostrarProveedor() {
        System.out.println("Proveedor ID: " + _proveedorId);
        System.out.println("Nombre: " + _nombreProveedor);
    }

    // Método para crear y mostrar un formulario de proveedor
    public void crearFormulario() {
        JFrame formulario = new JFrame("Formulario de Proveedor");
        formulario.setSize(200, 30);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        formulario.add(panel);

        JLabel label = new JLabel("Proveedor ID:");
        JTextField textField = new JTextField(10);

        panel.add(label);
        panel.add(textField);

        formulario.setVisible(true);
    }
}



