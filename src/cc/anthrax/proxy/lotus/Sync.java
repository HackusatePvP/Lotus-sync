package cc.anthrax.proxy.lotus;

import cc.anthrax.proxy.lotus.events.QueueEvent;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.plugin.Plugin;

public class Sync extends Plugin {
    private static Sync plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("[Sync] loaded sync.");
        getLogger().info("[Sync] loading events");
        BungeeCord.getInstance().getPluginManager().registerListener(this, new QueueEvent());
        BungeeCord.getInstance().registerChannel("Return");

    }

    public static Sync getPlugin() {
        return plugin;
    }
}
