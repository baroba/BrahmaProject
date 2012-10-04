package plugin;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import plugin.Plugin;

public class pluginClass extends Plugin {
	public static final String PLUGIN_ID = "plugin2";
	public int x=1;
	public int y=0;


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
				int z=x;
				x=x+y;
				y=z;
				
				button.setText(Integer.toString(x));
				
			}
			
		});
		panel.add(button);
		
	}


	@Override
	public void start() {
		
	}


	@Override
	public void stop() {
		this.x=1;
		this.y=0;
	}

	public static void main(String[] args) {
		
	}
}
