package clase1;
public class direccion {
    String ciudad;
    int numeroVivienda ;
    String calle;
    int codigoP ;

    direccion(String ci,int viv,String call,int cop)
    { 
     establecerCiudad(ci);
     establecerNumeroV(viv);
     establecerCalle(call);
     establecerCodigoP(cop);
    }

    public void establecerCiudad(String ci)
    {
     ciudad = ci;
 
    }
    public String obtenerCiudad()
     {
         return ciudad;
     }
 
 
     public void establecerNumeroV(int viv)
    {
     numeroVivienda = viv;
 
    }
    public int obtenerNumeroV()
     {
         return numeroVivienda;
     }
 
     public void establecerCalle(String call)
    {
     calle = call;
 
    }
    public String obtenerCalle()
     {
         return calle;
     }
 
     public void establecerCodigoP(int cop)
    {
     codigoP = cop;
 
    }
    public int obtenerDocentes()
     {
         return codigoP;
     }


    void ubicarse()
    {
        System.out.println("ayuda a guiarte cuando buscas una residencia");
    }




    public static void main(String [] args){
        direccion direccion1 = new direccion("Huanuco",250,"Jr Pedro Barroso",10000);
        
        //direccion1.ciudad = "Huánuco";
        //direccion1.numeroVivienda = 250;
        //direccion1.calle = "Jr Pedro Barroso";
        //direccion1.codigoP = 10000;

        System.out.println("la ciudad es: "+direccion1.ciudad);
        System.out.println("El numero de vivienda es: "+direccion1.numeroVivienda);
        System.out.println("La calle es: "+direccion1.calle);
        System.out.println("El codigo Postal es: "+direccion1.codigoP);
        direccion1.ubicarse();
    }
}
