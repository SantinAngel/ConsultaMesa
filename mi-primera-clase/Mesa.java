public class Mesa {
    
    //Fabricante de la mesa;
    private String fabricante;
    // Numero de patas;
    private int numeroPatas;
    // En inventario
    private boolean disponible;

    public Mesa(String marca ,int numeroDePatas) {
        fabricante = marca;
        numeroPatas = numeroDePatas;
        disponible = true;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
     public int getNumeroPatas(){
        return numeroPatas;
    }
    
     public boolean getDisponible(){
        return disponible;
    }
    
       public void cambiarfabricante(String fabricador){
        fabricante = fabricador;    
    }
    
    public void incrementarnumeroPatas(int patas){
        numeroPatas = numeroPatas + patas;
    }
    
    public void cambiardisponibilidad(){
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