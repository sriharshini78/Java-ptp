import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Test extends JFrame {
 private JLabel l;
    Test(){
        l= new JLabel("move or click the mouse");
      
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
          add(l);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        this.addMouseListener(new AmouseAdapter());
        this.addMouseMotionListener(new MouseMotionAdapter());
        setVisible(true);
    }
    class AmouseAdapter extends MouseAdapter{
        public void mouseClicked( MouseEvent me){
            updateLabel("mouse clicked");
        
        }
        public void mousePressed( MouseEvent me){
            updateLabel("mouse Pressed");
        
        }
        public void mouseExited( MouseEvent me){
            updateLabel("mouse Exited");
        
        }
        public void mouseEntered( MouseEvent me){
            updateLabel("mouse Entered");
        
        }
        public void mouseReleased( MouseEvent me){
            updateLabel("mouse released");
        
        }
    }
    class MouseMotionAdapter extends MouseAdapter{
        public void mouseMoved( MouseEvent me){
            updateLabel("mouse Moved ("+me.getX()+ "," +  me.getY()+")");
        
        }
        public void mouseDragged( MouseEvent me){
            updateLabel("mouse Dragged("+me.getX()+ "," + me.getY()+")");
        
        }

    }


    public void updateLabel(String eventName){

        l.setText(eventName);
    }





    
       

 public static void main(String[] args) {
        new Test();
    }

}