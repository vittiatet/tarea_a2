
package sales_app;

//clase colecion envio
public class ColeccionEnvio {
    private Envio[] envios;
    private int indice;

    public ColeccionEnvio(int tamano) {
        envios = new Envio[tamano];
        indice = 0;
    }

    public Envio[] getEnvios() {
        return envios;
    }

    public boolean agregarEnvio(Envio envio) {
        if (indice < envios.length) {
            envios[indice] = envio;
            indice++;
            return true;
        }
        return false;
    }

    public boolean eliminarEnvio(int indice) {
        if (indice >= 0 && indice < this.indice) {
            for (int i = indice; i < this.indice - 1; i++) {
                envios[i] = envios[i + 1];
            }
            envios[this.indice - 1] = null;
            this.indice--;
            return true;
        }
        return false;
    }

    public void mostrarEnvios() {
        System.out.println("Lista de Envíos:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Envío " + (i + 1) + ":");
            envios[i].mostrarEnvio();
            System.out.println("-----------------------------");
        }
    }
}





