package test;

import domain. *;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 5000);
//        determinarTipo(empleado);
        Gerente gerente = new Gerente("karla" , 10000, "Contabilidad");
        determinarTipo(gerente);
    }
    
    // aplicando el concepto de polimorfismo
    // instanceof : podemos determinar el tipo por tiempo de ejecucion
    public static void determinarTipo(Empleado empleado){
       // instanceof para preguntar; estamos preguntadno si la variable 
       //empleado esta apuntando a un espacio de memoria de la variable gerente-
        if( empleado instanceof  Gerente){
            System.out.println(" es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente " + gerente.getDepartamento());
//            ((Gerente) empleado).getDepartamento(); // convertir en el tipo
      }else if(empleado instanceof Empleado){
            System.out.println("es de tipo empleado");
      }else if( empleado instanceof Object){
            System.out.println("es de tipo object");
      }
    }
    
}
