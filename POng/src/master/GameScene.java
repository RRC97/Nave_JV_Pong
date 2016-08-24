/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Matheus
 */
public class GameScene extends JPanel
{
    private int time;
    private JFrame parent;
    private Player player;
    public GameScene(JFrame screen)
    {
        parent = screen;
        setSize(800, 600);
        
        player = new Player();
    }
    
    @Override
    public void paint(Graphics g)
    {
        //Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, parent.getWidth(), parent.getHeight());
        
        player.onDraw(g);
    }
    
    public void onUpdate()
    {
        time++;
        if(time > 10000)
        {
            player.onUpdate();
            time = 0;
        }
    }
}
