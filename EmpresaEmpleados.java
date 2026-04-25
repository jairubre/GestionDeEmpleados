package GestionDeEmpleados;

import java.util.ArrayList;
import java.util.List;

public class EmpresaEmpleados {
    private List<Empleado>listaEmpleados;
    private String nombre;

    public EmpresaEmpleados( String nombre) {
        this.nombre = nombre;
        listaEmpleados= new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado e1) {
       listaEmpleados.add(e1);
        
    }

    public void eliminarEmpleado(String dni) throws ExcepcionBuscarEmpleado{
        boolean encontrado=false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDni().equals(dni)) {
                listaEmpleados.remove(empleado);
                encontrado=true;
                break;
            }
        }
        if (encontrado==false) {
            throw new ExcepcionBuscarEmpleado("No ha sido encontrado");
        }
    }

    public String getNombre() {
        return nombre;
    }

 @Override
public String toString() {
    return "\n--- DATOS DE LA EMPRESA ---" +
           "\nNombre: " + getNombre() +
           "\nLista de empleados:\n" + listaEmpleados +
           "\n---------------------------\n";
}
    

    

    



}
