public class Mesa {
    
    //Fabricante de la mesa;
    private String fabricante;
    // Numero de patas;
    private int numeroPatas;
    // En inventario
    private boolean disponible;

    public Mesa(String marca ,int numeroDePatas,boolean disponibilidad) {
        fabricante = marca;
        numeroPatas = numeroDePatas;
        disponible = disponibilidad;
    }
    
    public String getfabricante(){
        return fabricante;
    }
    
     public int getnumeroPatas(){
        return numeroPatas;
    }
    
     public boolean getdisponible(){
        return disponible;
    }
    
       public void cambiarFabricante(String fabricador){
        fabricante = fabricador;    
    }
    
    public void incrementarNumeroPatas(int patas){
        numeroPatas = numeroPatas + patas;
    }
    
    public void Disponibilidad(){
        if (disponible == true){
            System.out.println("Disponible");
        }
        else {
            System.out.println("No disponible");
        } 
    }
    
    public void imprimirConsulta(){
        System.out.println("Fabricante:" + fabricante +"|Numero de patas:" + numeroPatas +"|Disponible:" + disponible);
     }

    public String estadoMesa(){
        return "Fabricante:" + fabricante +"|Numero de patas:" + numeroPatas +"|Disponible:" + disponible;
        }
    }