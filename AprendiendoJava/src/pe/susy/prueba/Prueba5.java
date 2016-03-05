/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.susy.prueba;
import pe.susy.dto.Producto;
/**
 *
 * @author Alumno
 */
public class Prueba5 {
    public static void main(String[] args) {
        Producto bean=new Producto();
       
        mostrar(bean);
        bean.setNombre("Chockis");
        bean.setPrecio(1.00);
        bean.setStock(15);
         mostrar(bean);
    }

    private static void mostrar(Producto bean) {
        
        System.out.println("----------------");
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Precio: "+bean.getPrecio());
        System.out.println("Stock:"+bean.getStock());
        
    }
}
