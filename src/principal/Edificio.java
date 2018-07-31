/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Yulian Cortes
 */
public class Edificio {
    private int area;
    private int sillas;
    private int puertas;
    
    
    public Edificio(){}
    
    public Edificio(int area, int sillas, int puertas){
        this.area = area;
        this.puertas = puertas;
        this.sillas = sillas;
    }
    
    public String quemarse()
    {
        return "SE ESTA QUEMANDO";
    }
    
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
}
