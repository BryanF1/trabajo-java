package clase1;
public class docente {
    String nombre;
    String sexo;
    int edad;
    String labor;

    docente(String bre,String sex,int edd,String lab)
   { 
    establecerNombre(bre);
    establecerSexo(sex);
    establecerEdad(edd);
    establecerLabor(lab);
   }
   public void establecerNombre(String bre)
   {
    nombre = bre;

   }
   public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerSexo(String sex)
    {
     sexo = sex;
 
    }
    public String obtenerSexo()
     {
         return sexo;
     }

     public void establecerEdad(int edd)
   {
    edad = edd;

   }
   public int obtenerEdad()
    {
        return edad;
    }

    public void establecerLabor(String lab)
   {
    labor = lab;

   }
   public String obtenerLabor()
    {
        return labor;
    }


    void ensenia()
    {
        System.out.println("el docente ensenia programacion");
    }



    public static void main(String [] args){
        docente docente1 = new docente("Fredy Clayderman Vigilio Arratea","Masculino",30,"Educa a sus alumnos");
        
        //docente1.nombre = "Fredy Clayderman Vigilio Arratea";
        //docente1.sexo = "Masculino";
        //docente1.edad = 30;
        //docente1.labor = "Educa a sus alumnos";

        System.out.println("El nombre del docente es: "+docente1.nombre);
        System.out.println("El sexo del docente es: "+docente1.sexo);
        System.out.println("La edad del docente es: "+docente1.edad);
        System.out.println("La labor del docente es: "+docente1.labor);
        docente1.ensenia();
    }
}
