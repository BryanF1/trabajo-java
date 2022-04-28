package clase1;
public class equipoF {
    String nombre;
    int añoF ;
    String contrato;
    int codigo;

    equipoF(String nomb,int añ,String cont,int c)
    { 
     establecerNombre(nomb);
     establecerAño(añ);
     establecerContrato(cont);
     establecerCodigo(c);
    }

    public void establecerNombre(String nomb)
    {
     nombre = nomb;
 
    }
    public String obtenerNombre()
     {
         return nombre;
     }
 
 
     public void establecerAño(int añ)
    {
     añoF= añ;
 
    }
    public int obtenerAño()
     {
         return añoF;
     }
 
     public void establecerContrato(String cont)
    {
     contrato = cont;
 
    }
    public String obtenerCodigoI()
     {
         return contrato;
     }
 
     public void establecerCodigo(int c)
    {
     codigo = c;
 
    }
    public int obtenerCodigo()
     {
         return codigo;
     }


    void jugar()
    {
        System.out.println("Ganar partidos");
    }


    public static void main(String [] args){
        equipoF equipoF1 = new equipoF("Sporting Cristal",1955,"contrato con 11 jugadores",35426457);
        //equipoF1.nombre = "Sporting Cristal";
        //equipoF1.añoF = 1955;
        //equipoF1.contrato = "contrato con 11 jugadores";
        //equipoF1.codigo = 35426457;

        System.out.println("El nombre del equipo es: "+equipoF1.nombre);
        System.out.println("El año de fundación del equipo fue en el año: "+equipoF1.añoF);
        System.out.println("la cantidad de jugadores que deben firmar el contrato, es minimo de "+equipoF1.contrato);
        System.out.println("El codigo  es: "+equipoF1.codigo);
        equipoF1.jugar();
    }
}
