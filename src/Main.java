//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ProyectoSoftware proyecto =
            new ProyectoSoftware("Sistema de Ventas", "Empresa ABC");

    System.out.println("Fase actual: " + proyecto.obtenerEstado());

    proyecto.avanzarFase();
    System.out.println("Fase actual: " + proyecto.obtenerEstado());

    proyecto.avanzarFase();
    System.out.println("Fase actual: " + proyecto.obtenerEstado());
}
