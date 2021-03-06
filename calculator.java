
/**

 * @author Cong Do Nguyen

 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class calculator
{
    // instance variables 
    private int x;
    private JFrame frame;
    private JTextField displayArea;
    private JLabel status;
    /**
     * Constructor
     */
    public calculator()
    {
       makeFrame();
       frame.pack();
       frame.setVisible(true);
    }
// Make Frame Method
    public void makeFrame(){
        frame = new JFrame("Calculator");
        JPanel contentPane = (JPanel)frame.getContentPane();
        makeMenus();
        //Layout
        contentPane.setLayout(new BorderLayout(24, 24));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        //Text field
        displayArea = new JTextField();
        contentPane.add(displayArea, BorderLayout.NORTH);
        
        //Panel
        JPanel buttonPanel = new JPanel(new GridLayout(4,4));
        
        //Number buttons
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        
        //Sign Buttons
        JButton add = new JButton("+");
        JButton substract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton CE = new JButton("C/CE");
        JButton equal = new JButton("=");
        
        //Add buttons
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(add);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(substract);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(multiply);
        buttonPanel.add(CE);
        buttonPanel.add(button0);
        buttonPanel.add(equal);
        buttonPanel.add(divide);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
    }
    
    public void makeMenus(){
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        
        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);
        
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);
        
        JMenuItem quit = new JMenuItem("Quit");
        fileMenu.add(quit);
    }
   
}
