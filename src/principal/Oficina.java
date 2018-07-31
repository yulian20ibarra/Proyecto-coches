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
public class Oficina extends Edificio{
    private int escritorio;
    private int archivero;
    private boolean telefono;
    
    public Oficina(){}
    
    public Oficina(int area, int sillas, int puertas, int escritorio, int archivero, boolean telefono)
    {
        super(area, sillas, puertas);
        this.escritorio = escritorio;
        this.archivero = archivero;
        this.telefono = telefono;
    }
    
    @Override
    public String quemarse()
    {
        return "INFIERNO";
    } 
    
    public int getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }

    public int getArchivero() {
        return archivero;
    }

    public void setArchivero(int archivero) {
        this.archivero = archivero;
    }

    public boolean isTelefono() {
        return telefono;
    }

    public void setTelefono(boolean telefono) {
        this.telefono = telefono;
    }
    
    
}
