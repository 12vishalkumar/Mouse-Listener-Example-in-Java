//******************** Importing the required Libararies **************************************************************
import java.awt.*;  
import java.awt.event.*;  

//******************** Mouse Listener Class and extended the Frame class and Implented the Mouse Listener Class *******
public class MouseListenerExample extends Frame implements MouseListener{  
    Label l;  
    //***************************** MouseListenerExample Function *****************************************************
    MouseListenerExample(){  
        addMouseListener(this);  
        l = new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  

    //****************************** mouseClicked Function ************************************************************
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    } 

    //****************************** mouseEntered Function *************************************************************
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }

    //****************************** mouseExited Function **************************************************************
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  

    //****************************** mousePressed Function *************************************************************
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    } 

    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }
    
    //******************************** Main Function *******************************************************************
    public static void main(String[] args) { 
        //**************************** Function call of MouseListenerExample *******************************************
        new MouseListenerExample();  
    }  
}  
