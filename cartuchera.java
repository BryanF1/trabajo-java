package clase1;
public class cartuchera {
    String cierre;
    String separadores;
    String material;
    String marca;

    cartuchera(String ci,String sep,String ma,String mar)
   { 
    establecerCierre(ci);
    establecerSeparadores(sep);
    establecerMateriall(ma);
    establecerMarca(mar);
   }
   public void establecerCierre(String ci)
   {
    cierre = ci;

   }
   public String obtenerCierre()
    {
        return cierre;
    }

    public void establecerSeparadores(String sep)
    {
     separadores = sep;
 
    }
    public String obtenerSeparadores()
     {
         return separadores;
     }

     public void establecerMateriall(String ma)
   {
    material = ma;

   }
   public String obtenerMateriall()
    {
        return material;
    }

    public void establecerMarca(String mar)
   {
    marca = mar;

   }
   public String obtenerMTapa()
    {
        return marca;
    }


    void guarda()
    {
        System.out.println("ayuda a guardar tus lapiceros");
    }

    public static void main(String [] args){
        cartuchera cartuchera1 = new cartuchera("de metal","3 separadores","de tela","collegue");
        
       // cartuchera1.cierre = "de metal ";
        //cartuchera1.separadores = "3 separadores";
        //cartuchera1.material = " de tela";
        //cartuchera1.marca = "collegue";

        System.out.println("su cierre es "+cartuchera1.cierre);
        System.out.println("la cartuchere tiene : "+cartuchera1.separadores);
        System.out.println("El material es  "+cartuchera1.material);
        System.out.println("su marca es de  "+cartuchera1.marca);
        cartuchera1.guarda();
    }  
}
