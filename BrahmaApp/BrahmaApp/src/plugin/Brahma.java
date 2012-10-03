package plugin;

public class Brahma {
	static PluginManager pluginManager;
	public static void main(String args[]) {
		PluginCore core = new PluginCore();
		try 
		{
			pluginManager = new PluginManager(core);
			core.addManager(pluginManager); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Thread thread = new Thread(pluginManager);
		thread.start();
		core.start();
	}
}
