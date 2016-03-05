/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.PaguitoApp.prueba;

import pe.egcc.PaguitoApp.dto.Paguitodto;

/**
 *
 * @author Alumno
 */
public class PaguitoPrueba {
     //data
    Paguitodto dto=new Paguitodto();
   dto.setHoras
    dto.setDias(20);
    dto.setPagoHora(140);
    //proceso
    PagoService.pagoService =new PagoService();
    pagoService.procesar(dto);
    //reporte
    System.out.println("Ingreso:"+dto.getIngresos());
     System.out.println("Renta:"+dto.getRenta());
      System.out.println("Neto:"+dto.getNeto());
}
