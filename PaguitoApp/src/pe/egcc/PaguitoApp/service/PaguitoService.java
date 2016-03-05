/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.PaguitoApp.service;
import pe.egcc.PaguitoApp.dto.Paguitodto;
/**
 *
 * @author Alumno
 */
public class PaguitoService {
     public void procesar(Paguitodto dto){
       //variables
       double ingresos, renta, neto;
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
