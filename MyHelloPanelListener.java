import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHelloPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (2018315010,2018315057) 
 * @version (버전번호나 날짜)
 */
public class MyHelloPanelListener extends JPanel
implements MouseListener,keyListener
{
    public JPanel p;
    public JLabel l;
    public MyHellpPanelListener (JPanel p,JLabel l){
        l.setSize(100,20);
        l.setLocation(50,50);
        this.setLayout(null);
        l.setFocusable(true);
        l.requestFocus();
        this.add(l);
    }
    public void mouseClicked(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        l.setLocation(x,y);
    }
    public void mouseReleased(MouseEvent e){}
    public void keyPressed(KeyEvent e){
    int keyCode = e.getKeyCode();
        switch(keyCode){
            case KeyEvent.VK_UP:
            l.setLocation(l.getX(), l.getY()-10);break;
            case KeyEvent.VK_DOWN:
            l.setLocation(l.getX(), l.getY()+10);break;
            case KeyEvent.VK_LEFT:
            l.setLocation(l.getX()-10,l.getY());break;
            case KeyEvent.VK_RIGHT:
            l.setLocation(l.getX()+10,l.getY());break;
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
