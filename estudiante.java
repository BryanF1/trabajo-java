package clase1;
public class estudiante {

    String nombre;
    String sexo;
    int edad;

    estudiante(String nom,String s,int e)
    { 
     establecerNombre(nom);
     establecerSexo(s);
     establecerEdad(e);
    }
 
    public void establecerNombre(String nom)
    {
     nombre = nom;
 
    }
    public String obtenerNombre()
     {
         return nombre;
     }
 
     public void establecerSexo(String s)
    {
     sexo = s;
 
    }
    public String obtenerApellido()
     {
         return sexo;
     }
 
     public void establecerEdad(int e)
     {
      edad = e;
  
     }
     public int obtenerTelefono()
      {
          return edad;
      }



    void aprender()
    {
        System.out.println("el estudiante aprende");
    }



    public static void main(String [] args){
        estudiante estudiante1 = new estudiante("Bryan Fisher Rojas Chavez","Masculino",18);
        
        estudiante1.nombre = "Bryan Fisher Rojas Chavez";
        estudiante1.sexo = "Masculino";
        estudiante1.edad = 18;

        System.out.println("El nombre del alumno es: "+estudiante1.nombre);
        System.out.println("El sexo del estudiante es: "+estudiante1.sexo);
        System.out.println("La edad del alumno es: "+estudiante1.edad);
        estudiante1.aprender();
    }
}