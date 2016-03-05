
package pe.susy.pagoapp.service;
import pe.
/**
 *
 * @author Alumno
 */
public class PagoService {
   public void procesar(Pagodto dto){
       //variables
       double ingresos, rentas, neto;
       //proceso
       ingresos=dto.getHorasDia()*dto.getDias()*dto.getPagoHora();
       if(ingresos>1500){
           renta=ingresos*0.8;
       }
       else {renta=0.0;
       }
       neto=ingresos-renta;
       //salida
       dto.setIngresos(ingresos);
       dto.setRenta(renta);
       dto.setNeto(neto);
       
   }
    
}
