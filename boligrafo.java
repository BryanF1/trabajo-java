package clase1;
public class boligrafo {
    String punta;
    String grosor;
    String material;
    String Mtapa;

    boligrafo(String pun,String gros,String mate,String mt)
   { 
    establecerPunta(pun);
    establecerGrosor(gros);
    establecerMaterial(mate);
    establecerMTapa(mt);
   }
   public void establecerPunta(String pun)
   {
    punta = pun;

   }
   public String obtenerPunta()
    {
        return punta;
    }

    public void establecerGrosor(String gros)
    {
     grosor = gros;
 
    }
    public String obtenerGrosor()
     {
         return grosor;
     }

     public void establecerMaterial(String mate)
   {
    material = mate;

   }
   public String obtenerMaterial()
    {
        return material;
    }

    public void establecerMTapa(String mt)
   {
    Mtapa = mt;

   }
   public String obtenerMTapa()
    {
        return Mtapa;
    }

    void Pinta()
    {
        System.out.println("ayuda a escribir en una hoja");
    }


    public static void main(String [] args){
        boligrafo boligrafo1 = new boligrafo("metal","grueso","material simple","tapa de metal");
        
        boligrafo1.punta = "metal ";
        boligrafo1.grosor = "grueso";
        boligrafo1.material = "material simple";
        boligrafo1.Mtapa = "tapa de metal";

        System.out.println("la punta esta hecho de: "+boligrafo1.punta);
        System.out.println("La punta es: "+boligrafo1.grosor);
        System.out.println("el lapicero es de "+boligrafo1.material);
        System.out.println("tiene una tapa: "+boligrafo1.Mtapa);
        boligrafo1.Pinta();
    } 
}
