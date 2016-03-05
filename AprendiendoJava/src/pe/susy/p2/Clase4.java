/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.susy.p2;
import pe.susy.p1.Clase1;
/**
 *
 * @author Alumno
 */
public class Clase4 {
     public void mostrarDatos(){
       Clase1 bean= new Clase1();
        //System.out.println("n1: "+ bean.n1);
        //System.out.println("n2: "+ bean.n2);
        //System.out.println("n3: "+ bean.n3);
        System.out.println("n4: "+ bean.n4);
 //la clase4 solo tiene acceso a la variable n4 de clase1,por ser
 //publica
}
}
