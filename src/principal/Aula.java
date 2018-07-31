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
public class Aula extends Edificio{
    private int pintarron;
    private int mesas;
    private boolean proyector;
    
    public Aula(){}
    
    public Aula(int area, int sillas, int puertas, int pintarron, int mesas, boolean proyector)
    {
        super(area, sillas, puertas);
        this.pintarron = pintarron;
        this.mesas = mesas;
        this.proyector = proyector;
    }
    
    public int getPintarron() {
        return pintarron;
    }

    public void setPintarron(int pintarron) {
        this.pintarron = pintarron;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public boolean isProyector() {
        return proyector;
    }

    public void setProyector(boolean proyector) {
        this.proyector = proyector;
    }
    
    
}
