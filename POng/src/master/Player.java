/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Matheus
 */
public class Player implements 
{
    private int x, y, width, height;
    public Player()
    {
        x = 0;
        y = 0;
        width = 30;
        height = 100;
    }
    
    public void onDraw(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }
    
    public void onUpdate()
    {
        y++;
    }
}
