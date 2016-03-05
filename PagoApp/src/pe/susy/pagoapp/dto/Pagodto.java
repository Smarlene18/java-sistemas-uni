
package pe.susy.pagoapp.dto;

/**
 *
 * @author Alumno
 */
public class Pagodto{
    //datos
    private int horasDia;
    private int dias;
    private int pagoHora;
   
    //resultado
    private double ingresos;
    private double renta;
    private double neto;

    public Pagodto() {
    }
    
    

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
}
