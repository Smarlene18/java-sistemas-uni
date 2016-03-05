
package pe.eggc.pedidoapp.prueba;
import pe.eggc.pedidoapp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        //dato
        double importe=1870.0;
        //proceso
        PedidoService service= new PedidoService();
        double impuesto=service.calcularImpuesto(importe);
        double total=service.calcularTotal(importe);
        //reporte
        System.out.println("Importe: "+importe);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+total);
        
    }
    
}
