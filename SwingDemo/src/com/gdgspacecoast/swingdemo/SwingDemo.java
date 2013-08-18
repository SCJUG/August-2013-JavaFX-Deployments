package com.gdgspacecoast.swingdemo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.text.html.HTMLEditorKit;

/**
 * @author mprentice
 */
public class SwingDemo {

	SwingDemo() {
		initComponents();
	}
	
	public void initComponents() {
		try
		{
			JFrame frame = new JFrame();
			frame.setBounds(50, 50, 1000, 730);
			
			JEditorPane pane = new JEditorPane();
			pane.setContentType( "text/html" ); 
			
			// JEditor pane is only HTML 3.2 or 4 compliant, chokes on HTML5 or JavaScript.
			//pane.setPage(new URL("https://plus.google.com/103959793061819610212"));
			
			// Simple HTML works fine.
			//pane.setText( "<html><body>Hello, world</body></html>" );
			
			// Google has a dumb version of their home page for old browsers.
			pane.setPage(new URL("http://www.google.com"));
			
			pane.setEditable(false);
			pane.setEditorKit(new HTMLEditorKit());
			
			frame.addWindowListener(new WindowListener() {

				@Override
				public void windowOpened(WindowEvent e) {}

				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}

				@Override
				public void windowClosed(WindowEvent e) {}

				@Override
				public void windowIconified(WindowEvent e) {}

				@Override
				public void windowDeiconified(WindowEvent e) {}

				@Override
				public void windowActivated(WindowEvent e) {}

				@Override
				public void windowDeactivated(WindowEvent e) {}				
			});
			
			frame.add(pane);
			frame.setVisible(true);
			frame.setAutoRequestFocus(true);
			frame.setAlwaysOnTop(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try {
			new SwingDemo();	
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
