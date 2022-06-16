
package paquete6;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
     public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCre, double costoCre){
        super(n, ap, iden, e);
        numeroCreditos = numCre;
        costoCredito = costoCre;
    }
    
    public EstudiantePresencial(String n, String ap, String iden, int e){
        super(n, ap, iden, e);
      
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Credito: %.2f\n"
                + "Número de Creditos: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                obtenerApellidoEstudiante(), // apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }
}
