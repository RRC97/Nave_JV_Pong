/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Matheus
 */
public class ScreenGame extends JFrame implements Runnable
{
    private GameScene scene;
    public ScreenGame()
    {
        super();
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setResizable(false);
        
        scene = new GameScene(this);
        
        add(scene);
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    }
    
    
    public void onUpdate()
    {
        scene.onUpdate();
    }
    
    @Override
    public void run()
    {
        while(isActive())
        {            
            onUpdate();
            repaint();
        }
    }
}
