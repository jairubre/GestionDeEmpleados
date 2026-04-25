package GestionDeEmpleados;

public class MainGestionDeEmpleados {
    public static void main(String[] args) {
        EmpleadoFijo f1 = new EmpleadoFijo("Jaime", "Ruiz", "123", 1000);
        EmpleadoPorHoras h1 = new EmpleadoPorHoras("Noe", "Soltero", "321", 1000, 10, 2);

        System.out.println(f1.toString());
        System.out.println(h1.toString());

        EmpresaEmpleados em1 = new EmpresaEmpleados("Cartones");

        em1.agregarEmpleado(h1);
        em1.agregarEmpleado(f1);
        

        System.out.println(em1.toString());
        

        try {
            em1.eliminarEmpleado("345");
            System.out.println(em1.toString());
        } catch (ExcepcionBuscarEmpleado e) {
            System.out.println(e);
        }



       
    }
}
