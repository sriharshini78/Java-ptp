import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Table extends JFrame{

	Table(){
	super("JTable Demo");
	String[] heading = {"Name","age","city"};
	String[][] data= {
			{"sri","15","london"},
			{"siri","25","texas"},
	                {"sai","45","us"},
	};
	JTable jt = new JTable(data,heading);
	
	JScrollPane scrollPane = new JScrollPane(jt);
	add(scrollPane);
	//add(jt);
	setVisible(true);
	setSize(500,500);
	//setLocationRelativeTo(null); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Table();
	
	}
}