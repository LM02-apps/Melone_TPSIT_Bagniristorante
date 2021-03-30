/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagniristorante;

/**
 *
 * @author Melone
 */
public class main {
    public static void main (String args[])
    {
        Buffer obj=new Buffer();
        Bagnouomini t1=new Bagnouomini(obj);
        Bagnodonne t2=new Bagnodonne(obj);
        t1.start();
        t2.start();
    }
}
