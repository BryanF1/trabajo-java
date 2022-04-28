package clase1;
public class colegio {
    String nombre;
    int Alumnos ;
    String codigoI;
    int docentes;

    colegio(String nomb,int alu,String co,int doc)
    { 
     establecerNombre(nomb);
     establecerAlumnos(alu);
     establecerCodigoI(co);
     establecerDocentes(doc);
    }

    public void establecerNombre(String nomb)
    {
     nombre = nomb;
 
    }
    public String obtenerNombre()
     {
         return nombre;
     }
 
 
     public void establecerAlumnos(int alu)
    {
     Alumnos = alu;
 
    }
    public int obtenerAlumnos()
     {
         return Alumnos;
     }
 
     public void establecerCodigoI(String co)
    {
     codigoI = co;
 
    }
    public String obtenerCodigoI()
     {
         return codigoI;
     }
 
     public void establecerDocentes(int doc)
    {
     docentes = doc;
 
    }
    public int obtenerDocentes()
     {
         return docentes;
     }


    void educacion()
    {
        System.out.println("brinda un ambiente donde se puede educar a los alumnos");
    }

    public static void main(String [] args){
        colegio colegio1 = new colegio("San Pedro",4000,"32004",133);
        
        //colegio1.nombre = "San Pedro";
        //colegio1.Alumnos = 4000;
        //colegio1.codigoI = "32004";
        //colegio1.docentes = 133;

        System.out.println("El nombre de colegio es: "+colegio1.nombre);
        System.out.println("la cantidad de alumnos es de: "+colegio1.Alumnos);
        System.out.println("El codigo del colegio es: "+colegio1.codigoI);
        System.out.println("La cantidad de docentes es de: "+colegio1.docentes);
        colegio1.educacion();
    }
}
