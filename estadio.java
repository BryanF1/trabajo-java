package clase1;
public class estadio {
    String nombre;
    String ciudad;
    int construccion;
    int codigo;

    estadio(String nom,String ciuda,int constru,int codi)
    { 
     establecerNombre(nom);
     establecerCiudad(ciuda);
     establecerConstruccion(constru);
     establecerCodigo(codi);
    }
 
    public void establecerNombre(String nom)
    {
     nombre = nom;
 
    }
    public String obtenerNombre()
     {
         return nombre;
     }
 
     public void establecerCiudad(String ciuda)
    {
     ciudad = ciuda;
 
    }
    public String obtenerCiudad()
     {
         return ciudad;
     }
 
     public void establecerCodigo(int codi)
     {
      codigo = codi;
  
     }
     public int obtenerCodigo()
      {
          return codigo;
      }

      public void establecerConstruccion(int constru)
     {
      construccion = constru;
  
     }
     public int obtenerConstruccion()
      {
          return construccion;
      }
 
    void recibe()
    {
        System.out.println("recibe a la audiencia futbolera");
    }



    public static void main(String [] args){
        estadio estadio1 = new estadio("Estadio nacional del Peru","Lima",1952,8736564);
        
        estadio1.nombre = "Estadio nacional de Perú";
        estadio1.ciudad = "lima";
        estadio1.construccion = 1952;
        estadio1.codigo = 8736564;

        System.out.println("El nombre del estadio es: "+estadio1.nombre);
        System.out.println("La ciudad deonde se ubica es: "+estadio1.ciudad);
        System.out.println("la fecha de construccion fue el año: "+estadio1.construccion);
        System.out.println("El codigo del estadio es: "+estadio1.codigo);
        estadio1.recibe();
    } 
}
