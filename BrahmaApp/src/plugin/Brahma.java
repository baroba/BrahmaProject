package plugin;

public class Brahma {
	static PluginManager pluginManager;
	public static void main(String args[]) {
		PluginCore core = new PluginCore();
		try 
		{
			pluginManager = new PluginManager(core);
			core.addAddActionListener(pluginManager.AddListener());
			core.addRemoveActionListener(pluginManager.RemoveListener());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		Thread thread = new Thread(pluginManager);
		thread.start();
		core.start();
	}
}
