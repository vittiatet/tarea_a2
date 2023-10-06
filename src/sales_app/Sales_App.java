
package sales_app;
//vas a caer chumacero
import java.util.Scanner;

    /*
    ASIGNATURA: ALGORITMICA 2
    DOCENTE: JORGE LUIS CHAVEZ SOTO
    ALUMNO: LUIS FERNANDO MAYLLE COLACA
    FECHA: 06-10-23
    */
public class Sales_App {

    public static void main(String[] args) {
        // TODO code application logic here
        
                ColeccionEnvio coleccionEnvio = new ColeccionEnvio(100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Mostrar la información del proveedor");
            System.out.println("2. Crear y mostrar un formulario del proveedor");
            System.out.println("3. Mostrar las partes");
            System.out.println("4. Mostrar los datos del envío");
            System.out.println("5. Agregar un envío");P
            System.out.println("6. Eliminar un envío");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la opción que desea realizar: ");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();

            // Realizar la acción correspondiente
            switch (opcion) {
                case 1:
                    // Mostrar información del proveedor
                    System.out.println("Información del proveedor:");
                    Proveedor proveedor = new Proveedor(1, "Proveedor ABC");
                    System.out.println("ID del proveedor: " + proveedor.getProveedorId());
                    System.out.println("Nombre del proveedor: " + proveedor.getNombreProveedor());
                    break;
                case 2:
                    // Crear y mostrar un formulario del proveedor
                    System.out.println("Creando y mostrando formulario del proveedor...");
                    ProveedorFormulario formularioProveedor = new ProveedorFormulario();
                    formularioProveedor.mostrarFormulario();
                    break;
                case 3:
                    // Mostrar las partes
                    System.out.println("Listado de Partes:");
                    coleccionEnvio.mostrarPartes();
                    break;
                case 4:
                    // Mostrar datos del envío
                    System.out.println("Listado de Envíos:");
                    coleccionEnvio.mostrarEnvios();
                    break;
                case 5:
                    // Agregar un envío
                    System.out.println("Agregando un nuevo envío...");
                    Envio nuevoEnvio = new Envio(); // Debes implementar la creación de un nuevo envío
                    coleccionEnvio.agregarEnvio(nuevoEnvio);
                    break;
                case 6:
                    // Eliminar un envío
                    System.out.print("Ingrese el número de envío que desea eliminar: ");
                    int numeroEnvioEliminar = scanner.nextInt();
                    coleccionEnvio.eliminarEnvio(numeroEnvioEliminar);
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                    break;
            }
        }
        
        
    }
    
    
    
    
    
}






