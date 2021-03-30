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
public class Bagnodonne extends Thread
{
    Buffer b;
    Bagnodonne(Buffer b)
    {
        this.b=b;
    }
    public void run()
    {
        b.printBuffer(100);
    }
    
}
