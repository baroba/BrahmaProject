package testPackage;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import plugin.Plugin;
import plugin.PluginCore;
import plugin.PluginManager;
import static org.junit.Assert.*;
import junit.framework.Assert;

import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Path; 
import java.nio.file.FileSystem;
import java.nio.file.Files;
import org.junit.Test;

import plugin.PluginCore;

public class loadTester 
{

	@Test
	public void coreInitialize() 
	{
		PluginCore core = new PluginCore();
		Assert.assertNotNull(core);
	}
	
	@Test 	
	public void managerInitialize()
	{
		PluginCore core = new PluginCore();
		Assert.assertNotNull(core);
		PluginManager m = null;
		try 
		{
			m = new PluginManager(core);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertNotNull(m); 
	}
	
	@Test
	public void listInitializeAndLoad()
	{
		PluginCore core = new PluginCore();
		PluginManager m = null;
		try 
		{
			m = new PluginManager(core);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Thread thread = new Thread(m);
		thread.start();
		Assert.assertNotNull(core.pluginMap());
	}

}
