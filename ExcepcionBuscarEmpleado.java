package GestionDeEmpleados;

class ExcepcionBuscarEmpleado  extends Exception{

    public ExcepcionBuscarEmpleado(String message) {
        super(message);
    }

    public String toString(){
        return getMessage();
    } 
    
}