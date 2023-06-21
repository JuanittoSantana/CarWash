

package carwash;


public class TiposDeLavado {
     
    private String NombreDeLavado;
    private double PrecioDeLavado;
    private int NumeroDeVenta;
    
    public TiposDeLavado(){
        
    }

    public TiposDeLavado(String NombreDeLavado, double PrecioDeLavado, int NumeroDeVenta) {
        this.NombreDeLavado = NombreDeLavado;
        this.PrecioDeLavado = PrecioDeLavado;
        this.NumeroDeVenta = NumeroDeVenta;
    }

    public String getNombreDeLavado() {
        return NombreDeLavado;
    }

    public void setNombreDeLavado(String NombreDeLavado) {
        this.NombreDeLavado = NombreDeLavado;
    }

    public double getPrecioDeLavado() {
        return PrecioDeLavado;
    }

    public void setPrecioDeLavado(double PrecioDeLavado) {
        this.PrecioDeLavado = PrecioDeLavado;
    }

    public int getNumeroDeVenta() {
        return NumeroDeVenta;
    }

    public void setNumeroDeVenta(int NumeroDeVenta) {
        this.NumeroDeVenta = NumeroDeVenta;
    }
    
   
    
}
