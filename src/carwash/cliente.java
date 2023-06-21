package carwash;


public class cliente {
     private int id;
    private String NombreDeCliente;
    private double CompraDeCliente;

    public cliente(){
        
    }
    public cliente(int id, String NombreDeCliente, double CompraDeCliente) {
        this.id = id;
        this.NombreDeCliente = NombreDeCliente;
        this.CompraDeCliente = CompraDeCliente;
    }

    public double getCompraDeCliente() {
        return CompraDeCliente;
    }

    public void setCompraDeCliente(double CompraDeCliente) {
        this.CompraDeCliente = CompraDeCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDeCliente() {
        return NombreDeCliente;
    }

    public void setNombreDeCliente(String NombreDeCliente) {
        this.NombreDeCliente = NombreDeCliente;
    }
   
}
