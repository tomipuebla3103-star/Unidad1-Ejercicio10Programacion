public class ProyectoSoftware {
    private String nombreProyecto;
    private String clienteEmpresa;
    private int faseActual;

    public ProyectoSoftware(String nombreProyecto, String clienteEmpresa) {
        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;
        this.faseActual = 1;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getClienteEmpresa() {
        return clienteEmpresa;
    }

    public void setClienteEmpresa(String clienteEmpresa) {
        this.clienteEmpresa = clienteEmpresa;
    }

    public int getFaseActual() {
        return faseActual;
    }

    public void avanzarFase() {
        if (faseActual < 3) {
            faseActual++;
        }
    }

    public String obtenerEstado() {
        if (faseActual == 1) {
            return "Análisis";
        } else if (faseActual == 2) {
            return "Desarrollo";
        } else {
            return "Despliegue";
        }
    }
}
