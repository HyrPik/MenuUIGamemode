package fr.hyrpik.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

        public void onEnable() {
            System.out.println("Les menu sont en cour de chargement ...");
            @SuppressWarnings("unused")
            PluginManager pm = getServer().getPluginManager();
            getLogger().info("..");
            getLogger().info(".... ");
            getLogger().info("........... OK");
            pm.registerEvents(new MenuPrincipal(this), this);

           }

        public void onDisable() {
            System.out.println("Les menu sont en cour de déchargement ...");
            getLogger().info("..");
            getLogger().info(".... ");
            getLogger().info("........... OK");
           }

}
