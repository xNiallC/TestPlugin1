package io.github.xNiallC;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin{
	// On plugin enable
	@Override
	public void onEnable() {
		getLogger().info("Niall's Plugin enabled!");
		this.getCommand("getitems").setExecutor(new GetItems());
	}
	// On plugin disable
	@Override
	public void onDisable() {
		
	}
}
