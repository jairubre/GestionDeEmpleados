package GestionDeEmpleados;

public class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double tarifa;

    public EmpleadoPorHoras(String nombre, String apellido, String dni, double salario, int horas, double tarifa) {
        super(nombre, apellido, dni, salario);
        this.horas = horas;
        this.tarifa = tarifa;
    }


    public double calcularSalario(){
        return salario+(horas*tarifa);

    }

    


}
