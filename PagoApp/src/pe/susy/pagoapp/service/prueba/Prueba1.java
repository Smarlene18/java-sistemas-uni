/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.susy.pagoapp.service.prueba;

/**
 *
 * @author Alumno
 */
public class Prueba1 {
    //data
    Pagodto Dto=new Pagodto();
    Dto.setHorasDia(6);
    dto.setDias(20);
    dto.setPagoHora(1400.0);
    //proceso
    PagoService.pagoService =new PagoService();
    pagoService.procesar(dto);
    //reporte
    System.out.println("Ingreso:"+dto.getIngresos());
     System.out.println("Renta:"+dto.getRenta());
      System.out.println("Neto:"+dto.getNeto());
    
    
    //variables
    
}
