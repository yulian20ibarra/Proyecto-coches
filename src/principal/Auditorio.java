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
public class Auditorio extends Edificio{

    private boolean estrado;
    private boolean proyector;

    public Auditorio() {
    }

    public Auditorio(int area, int sillas, int puertas, boolean estrado, boolean proyector) {
        super(area, sillas, puertas);
        this.estrado = estrado;
        this.proyector = proyector;
    }

    @Override
    public String quemarse()
    {
        return super.quemarse();
    } 
    
    public boolean isEstrado() {
        return estrado;
    }

    public void setEstrado(boolean estrado) {
        this.estrado = estrado;
    }

    public boolean isProyector() {
        return proyector;
    }

    public void setProyector(boolean proyector) {
        this.proyector = proyector;
    }
    
}
