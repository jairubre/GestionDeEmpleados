package GestionDeEmpleados;

public class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, String apellido, String dni, double salario) {
        super(nombre, apellido, dni, salario);
        this.salarioMensual = super.salario;
    }


    public double calcularSalario(){
        return salarioMensual;
        
    }

    

}
