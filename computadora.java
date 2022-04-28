package clase1;
public class computadora {
    String teclado;
    String mouse;
    String monitor;

    computadora(String te,String mo,String mon)
    { 
     establecerTeclado(te);
     establecerMouse(mo);
     establecerMonitor(mon);
    }
    public void establecerTeclado(String te)
    {
     teclado = te;
 
    }
    public String obtenerTeclado()
     {
         return teclado;
     }
 
     public void establecerMouse(String mo)
     {
      mouse = mo;
  
     }
     public String obtenerMouse()
      {
          return mouse;
      }
 
      public void establecerMonitor(String mon)
    {
     monitor = mon;
 
    }
    public String obtenerMonitor()
     {
         return monitor;
     }
 
     

    
    void calculo()
    {
        System.out.println("realiza opraciones logicos");
    }

    public static void main(String [] args){
        computadora computadora1 = new computadora("microsoft","microsoft","microsoft");
        
        //computadora1.teclado= "microsoft";
        //computadora1.mouse = "microfot";
        //computadora1.monitor = "microsoft";
        

        System.out.println("La marca del teclado es: "+computadora1.teclado);
        System.out.println("La marca del mouse es: "+computadora1.mouse);
        System.out.println("La marca del monitor es"+computadora1.monitor);
        computadora1.calculo();

    }
}
