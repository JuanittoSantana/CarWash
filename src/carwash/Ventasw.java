
package carwash;
import java.util.Scanner;

public class Ventasw {
     Scanner teclado = new Scanner(System.in);
     private cliente[]_cliente;
     private TiposDeLavado[]_TiposDeLavado;
     private int posicion;
     private int h;
     private int RegistroDeVenta;
     private int Venta;
     private int ReporteDeVenta;
     private double EstadisticaDeVenta;
     private int ModificarPrecios;

    public Ventasw(int ModificarPrecios) {
        this.ModificarPrecios = ModificarPrecios;
    }
     public Ventasw(){
         
     }

    public Ventasw(TiposDeLavado[] _TiposDeLavado, int posicion, int RegistroDeVenta, int Venta, int ReporteDeVenta, double EstadisticaDeVenta) {
        this._TiposDeLavado = _TiposDeLavado;
        this.posicion = posicion;
        this.RegistroDeVenta = RegistroDeVenta;
        this.Venta = Venta;
        this.ReporteDeVenta = ReporteDeVenta;
        this.EstadisticaDeVenta = EstadisticaDeVenta;
    }

    public double getEstadisticaDeVenta() {
        return EstadisticaDeVenta;
    }

    public void setEstadisticaDeVenta(double EstadisticaDeVenta) {
        this.EstadisticaDeVenta = EstadisticaDeVenta;
    }

    public int getRegistroDeVenta() {
        return RegistroDeVenta;
    }

    public void setRegistroDeVenta(int RegistroDeVenta) {
        this.RegistroDeVenta = RegistroDeVenta;
    }

    public int getVenta() {
        return Venta;
    }

    public void setVenta(int Venta) {
        this.Venta = Venta;
    }

    public int getReporteDeVenta() {
        return ReporteDeVenta;
    }

    public void setReporteDeVenta(int ReporteDeVenta) {
        this.ReporteDeVenta = ReporteDeVenta;
    }

    public TiposDeLavado[] getTiposDeLavado() {
        return _TiposDeLavado;
    }

    public void setTiposDeLavado(TiposDeLavado[] _TiposDeLavado) {
        this._TiposDeLavado = _TiposDeLavado;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public int getModificarPrecios() {
        return ModificarPrecios;
    }

    public void setModificarPrecios(int ModificarPrecios) {
        this.ModificarPrecios = ModificarPrecios;
    }
    
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public cliente[] getCliente() {
        return _cliente;
    }

    public void setCliente(cliente[] _cliente) {
        this._cliente = _cliente;
    }




    
   public void AgregarTiposDeLavado(TiposDeLavado _TiposDeLavado){
        
        if (this.getPosicion() <  6){
            this._TiposDeLavado[this.getPosicion()] = _TiposDeLavado;
            System.out.println("Se agregó el siguiente tipo de lavado : "+_TiposDeLavado.getNombreDeLavado());
            this.setPosicion(this.getPosicion() + 1);
        }else{
            System.out.println("No se pudo ingresar el tipo de lavado: "+_TiposDeLavado.getNombreDeLavado()+" ya que se excedió el numero de servicios ...");
        }
   }
   public void ModificarPrecios(){
       int indice = 0;
       
       for (indice = 0; indice < _TiposDeLavado.length; indice ++) {
           _TiposDeLavado[indice].setPrecioDeLavado(_TiposDeLavado[indice].getPrecioDeLavado() * 1.1);
       }
         
                    }
   public void CatalogoDeServicio(){
        
           for (int indice = 0; indice < 6; indice++) {
               
               System.out.println(_TiposDeLavado[indice].getNombreDeLavado()+"\t" + _TiposDeLavado[indice].getPrecioDeLavado());
           
       }
          
       
       }
       public void AgregarCliente(){
           cliente _Cliente = new cliente();
           int i, r;
           System.out.println("Ingrese nombre de cliente");
                            _Cliente.setNombreDeCliente(teclado.next());
                            for( i =0; i <  this.getPosicion(); i++){
                                System.out.println("[" + (i + 1) + "]" + _TiposDeLavado[i].getNombreDeLavado());
                            }
                            System.out.println("Ingrese el tipo de lavado que desea comprar 1 ...  " + i);
                            int j = teclado.nextInt();
                            switch (j) {
               case 1:{
                   _Cliente.setCompraDeCliente(_TiposDeLavado[0].getPrecioDeLavado());
                   break;
               }
               case 2:{
                   _Cliente.setCompraDeCliente(_TiposDeLavado[1].getPrecioDeLavado());
                   break;
               }
               case 3:{
                   _Cliente.setCompraDeCliente(_TiposDeLavado[2].getPrecioDeLavado());
                   break;
               }
               case 4:{
                   _Cliente.setCompraDeCliente(_TiposDeLavado[3].getPrecioDeLavado());
                   break;
               }
               case 5:{
                   _Cliente.setCompraDeCliente(_TiposDeLavado[4].getPrecioDeLavado());
                   break;
               }
           }
           if(this.getH() >= 0){
               _Cliente.setId(this.getH() + 1);
               _cliente[h] = _Cliente;
               this.setH(this.getH() + 1);
           }
        }

    


}

         
                

       
   

