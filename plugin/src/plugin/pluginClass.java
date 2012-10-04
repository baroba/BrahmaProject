package plugin;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import plugin.Plugin;

public class pluginClass extends Plugin {
	public static final String PLUGIN_ID = "plugin";


	public pluginClass() {
		super(PLUGIN_ID);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void layout(JPanel panel) {
		panel.setLayout(new BorderLayout());
		final JButton button= new JButton("Click me");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				button.setText("Thank You");
				
			}
			
		});
		panel.add(button);
		
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
	}
}
