package fr.hyrpik.main;
 
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
 
public class MenuPrincipal implements Listener {
 
   
    public MenuPrincipal(Main main) {}
       
    @EventHandler
        public void onClicBoussole(PlayerInteractEvent e) {
            Player p = e.getPlayer() ;
            if(e.getItem().getType() == Material.COMPASS);
            if(e.getAction() == Action.RIGHT_CLICK_AIR) {
               Inventory inv = Bukkit.createInventory(null, 27, "§6MenuUI Gamemode");
               ItemStack pomme = new ItemStack(Material.APPLE, 1);
               ItemMeta pommeMeta = pomme.getItemMeta();
               pommeMeta.setDisplayName("§ePour ce mettre en creatif !");
               pomme.setItemMeta(pommeMeta);
               inv.setItem(11, pomme);
               
               ItemStack enclume = new ItemStack(Material.ANVIL, 1);
               ItemMeta enclumeMeta = enclume.getItemMeta();
               enclumeMeta.setDisplayName("§ePour ce mettre en survie !");
               enclume.setItemMeta(enclumeMeta);
               inv.setItem(15, enclume);
               p.openInventory(inv);
               
               
               
       
     }
  }
 
    
     @EventHandler
     public void OnClick(InventoryClickEvent event) {
    	 Inventory inv = event.getInventory();
    	 Player player = (Player) event.getWhoClicked();
    	 ItemStack current = event.getCurrentItem();
    	 
    	 if(current == null) return;
    	 
    	 if(inv.getName().equalsIgnoreCase("§6MenuUI Gamemode")) {
    		 event.setCancelled(true);
    		 
    		 if(current.getType() == Material.APPLE) {
    			 player.closeInventory();
    			 player.setGameMode(GameMode.CREATIVE);
    			 Bukkit.broadcastMessage("§6Tu as bien était mis en créatif !");
    		 }
    		 
    		 if(current.getType() == Material.ANVIL) {
    			 player.closeInventory();
    			 player.setGameMode(GameMode.SURVIVAL);
    			 Bukkit.broadcastMessage("§6Tu as bien était mis en survie !");
    	 }
     }
   }
}
