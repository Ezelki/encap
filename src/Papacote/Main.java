/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Papacote;

/**
 *
 * @author IFSC
 */
public class Main {
    public static void main(String[] args){
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(12, 10, "Dia das crianças.");
        agenda2.anote(25, 15, "Natal.");
        
        agenda1.showNota();
        agenda2.showNota();
    }
}
