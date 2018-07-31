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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula salon1 = new Aula (20,30,1,1,15,true);
        System.out.println("\nEl aula tiene "+ salon1.getMesas()+ " mesas y " + salon1.getSillas() +" sillas");
        
        Edificio espacioFisico;
        
        /*Auditorio salonAudi = new Auditorio (50,85,1,false,true);
        System.out.println("\nEl auditorio " + (salonAudi.isEstrado() ? " Tiene estrado" : " No tiene estrado")
                +" y tiene "+salonAudi.getSillas()+ " sillas");*/
        
        espacioFisico = new Auditorio (50,85,1,false,true);
        imprimir(espacioFisico);
        //System.out.println("\nEl " + espacioFisico.getClass().getSimpleName() + " se esta " + espacioFisico.quemmarse());
        
        espacioFisico = new Oficina (8,4,1,2,3,false);
        imprimir(espacioFisico);
        //System.out.println("\nLa " + espacioFisico.getClass().getSimpleName() + " se esta " + espacioFisico.quemarse() );
        
    }
    
    public static void imprimir(Edificio espacioFisico){
        System.out.println("El " + espacioFisico.getClass().getSimpleName()
                + " esta " + espacioFisico.quemarse());
    }
}
