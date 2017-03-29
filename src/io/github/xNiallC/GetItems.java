package io.github.xNiallC;

import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GetItems implements CommandExecutor {
	// Called when somebody uses command
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			// Create new item stack
			ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
			
			player.getInventory().addItem(diamond);
			
		}
		// If command used correctly, return true
		return true;
	}
}
