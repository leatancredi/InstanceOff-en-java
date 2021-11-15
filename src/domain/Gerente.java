package domain;

public class Gerente extends Empleado {
    private String departamento;
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    @Override // le indica al ide que el metodo va a ser reescrito
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " , departeamento: " + this.departamento;
//cuando sobreescribimos podemos usar super y obtener 
//los atributos de la clase padre

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
