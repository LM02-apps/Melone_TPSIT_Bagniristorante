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
public class Buffer 
{
    synchronized void printBuffer (int n)
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("persona"+i);
            try
            {
                Thread.sleep(400);
            }catch (Exception e){System.out.println(e);}
            
        }
    }
}
