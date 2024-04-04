//Emily Joana Betaza Perez 204 A

public class Persona1 {
	
// Atributos de la clase Persona1
    protected int edad; // Edad de la persona
    protected String nombre; // Nombre de la persona
    
    // Constructor vacío por defecto
    public Persona1() {
        super(); // Llama al constructor de la clase padre (Object)
    }
    
    // Constructor con parámetros para inicializar la edad y el nombre
    public Persona1(int edad, String nombre){
        this.edad = edad; // Asigna la edad proporcionada al atributo edad de la instancia actual
        this.nombre = nombre; // Asigna el nombre proporcionado al atributo nombre de la instancia actual
    }
    
    // Método getter para obtener la edad de la persona
    public int getedad(){
        return edad; // Retorna el valor del atributo edad
    }
    
    // Método setter para asignar una nueva edad a la persona
    public void setedad(int edad){
        this.edad = edad; // Actualiza el valor del atributo edad con el valor proporcionado
    }
    
    // Método getter para obtener el nombre de la persona
    public String getnombre(){
        return nombre; // Retorna el valor del atributo nombre
    }
    
    // Método setter para asignar un nuevo nombre a la persona
    public void setnombre(String nombre){
        this.nombre = nombre; // Actualiza el valor del atributo nombre con el valor proporcionado
    }
}