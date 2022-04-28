package clase1;
public class accidente {
    public String lugar;
   public int hora ;
   public String fecha;
   public int codigo;

   accidente(String lug,int hor,String fech,int cod)
   { 
    establecerLugar(lug);
    establecerHora(hor);
    establecerFecha(fech);
    establecerCodigo(cod);
   }

   public void establecerLugar(String lug)
   {
    lugar = lug;

   }
   public String obtenerLugar()
    {
        return lugar;
    }


    public void establecerHora(int hor)
   {
    hora = hor;

   }
   public int obtenerHora()
    {
        return hora;
    }

    public void establecerFecha(String fech)
   {
    fecha = fech;

   }
   public String obtenerFecha()
    {
        return fecha;
    }

    public void establecerCodigo(int cod)
   {
    codigo = cod;

   }
   public int obtenerCodigo()
    {
        return codigo;
    }

    void muerte()
    {
        System.out.println("causa la muerte de las personas");
    }




    public static void main(String [] args){
        accidente accidente1 = new accidente("puente San sebastian",18,"20/12/2020",98763451);
        
       // accidente1.lugar = "puente San Sebastian";
        //accidente1.hora = 18;
       // accidente1.fecha = "20/12/2020";
        //accidente1.codigo = 98763451;

        System.out.println("El lugar del accidente fue: "+accidente1.lugar);
        System.out.println("la hora del accidente: "+accidente1.hora);
        System.out.println("La fecha del accidente fue: "+accidente1.fecha);
        System.out.println("El codigo del accidente es: "+accidente1.codigo);
        accidente1.muerte();
    }
}
