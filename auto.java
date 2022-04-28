package clase1;
public class auto {
    String tipo;
    String modelo;
    int potencia;
    String matricula;

    auto(String tip,String mod,int pot,String mat)
   { 
    establecerTipo(tip);
    establecerModelo(mod);
    establecerPotencia(pot);
    establecerMatricula(mat);
   }
   public void establecerTipo(String tip)
   {
    tipo = tip;

   }
   public String obtenerTipo()
    {
        return tipo;
    }

    public void establecerModelo(String mod)
    {
     modelo = mod;
 
    }
    public String obtenerModelo()
     {
         return modelo;
     }

     public void establecerPotencia(int pot)
   {
    potencia = pot;

   }
   public int obtenerPotencia()
    {
        return potencia;
    }

    public void establecerMatricula(String mat)
   {
    matricula = mat;

   }
   public String obtenerMatricula()
    {
        return matricula;
    }

    void transporta()
    {
        System.out.println("el auto transporta personas u objetos");
    }


    public static void main(String [] args){
        auto auto1 = new auto("vehiculo de 4 ruedas","tico",41,"x73-253");
        
        //auto1.tipo = "vehiculo de 4 ruedas";
        //auto1.modelo = "tico";
        //auto1.potencia = 41;
        //auto1.matricula = "X73-253";

        System.out.println("El Tipo del auto es: "+auto1.tipo);
        System.out.println("El modelo del auto es: "+auto1.modelo);
        System.out.println("La potencia del auto es "+auto1.potencia);
        System.out.println("la matricula del tico es: "+auto1.matricula);
        auto1.transporta();
    }
}
