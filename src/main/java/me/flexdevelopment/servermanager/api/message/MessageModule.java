package me.flexdevelopment.servermanager.api.message;

import me.flexdevelopment.servermanager.ServerManager;
import me.flexdevelopment.servermanager.api.utils.FileManager;

import static me.flexdevelopment.servermanager.api.utils.Chat.color;

public class MessageModule {

    private static ServerManager plugin;

    public MessageModule(ServerManager serverManager) {
        plugin = serverManager;
    }

    private String prefix = FileManager.get("messages.yml").getString("prefix").replace("&", "§");
    private String geenPerms = FileManager.get("messages.yml").getString("geen-perms");
    private String mainArgsNotFound = FileManager.get("messages.yml").getString("Commands.Main.geenArgs");
    private String geenSubCommandFound = FileManager.get("messages.yml").getString("Commands.Default.subCommandNotFound");
    private String plManagerArgsNotFound = FileManager.get("messages.yml").getString("Commands.PluginManager.geenArgs");
    private String loginMessageCanceled = FileManager.get("messages.yml").getString("login-message-canceled");
    private String loginMessageChatMessage = FileManager.get("messages.yml").getString("login-message-chat-message");
    private String loginMessageSetToGeen = FileManager.get("messages.yml").getString("login-message-gezet-naar-geen");
    private String loginMessageSuccesSet = FileManager.get("messages.yml").getString("login-message-succes");

    private String getLogoutMessageCanceled = FileManager.get("messages.yml").getString("logout-message-canceled");
    private String getLogoutMessageChatMessage = FileManager.get("messages.yml").getString("logout-message-chat-message");
    private String getLogoutMessageSetToGeen = FileManager.get("messages.yml").getString("logout-message-gezet-naar-geen");
    private String getLogoutMessageSuccesSet = FileManager.get("messages.yml").getString("logout-message-succes");


    // pluginmanager
    private String pluginAlreadyEnabled = FileManager.get("messages.yml").getString("Commands.PluginManager.pluginAlreadyEnabled");
    private String pluginEnabled = FileManager.get("messages.yml").getString("Commands.PluginManager.pluginEnabled");
    private String pluginNotExists = FileManager.get("messages.yml").getString("Commands.PluginManager.enable.pluginNotExists");

    // pluginmanager - load
    private String invalidPlugin = FileManager.get("messages.yml").getString("Commands.PluginManager.load.invalidPlugin");
    private String invalidDiractory = FileManager.get("messages.yml").getString("Commands.PluginManager.load.invalidDirectory");
    private String pluginAlreadyLoaded = FileManager.get("messages.yml").getString("Commands.PluginManager.load.pluginAlreadyLoaded");
    private String pluginLoaded = FileManager.get("messages.yml").getString("Commands.PluginManager.load.pluginLoaded");
    private String cannotFindLoad = FileManager.get("messages.yml").getString("Commands.PluginManager.load.cannotFindLoad");
    private String pluginIgnored = FileManager.get("messages.yml").getString("Commands.PluginManager.load.pluginIgnored");

    // pluginmanager - unload
    private String pluginUnloaded = FileManager.get("messages.yml").getString("Commands.PluginManager.unload.pluginUnloaded");

    // pluginmanager - restart
    private String allPluginsRestarted = FileManager.get("messages.yml").getString("Commands.PluginManager.restart.allPluginsRestarted");
    private String pluginRestarted = FileManager.get("messages.yml").getString("Commands.PluginManager.restart.pluginRestarted");

    // pluginmanager - reload
    private String allPluginsReloaded = FileManager.get("messages.yml").getString("Commands.PluginManager.reload.allPluginsReloaded");
    private String pluginReloaded = FileManager.get("messages.yml").getString("Commands.PluginManager.reload.pluginReloaded");

    // pluginmanager - disable
    private String allPluginsDisabled = FileManager.get("messages.yml").getString("Commands.PluginManager.disable.allPluginsDisabled");
    private String pluginIsNotEnabled = FileManager.get("messages.yml").getString("Commands.PluginManager.disable.pluginIsNotEnabled");
    private String pluginDisabled = FileManager.get("messages.yml").getString("Commands.PluginManager.disable.pluginDisabled");

    // pluginmanager - dump
    private String dumpOnFileName = FileManager.get("messages.yml").getString("Commands.PluginManager.dump.dumpOnFileName");
    private String dumpError = FileManager.get("messages.yml").getString("Commands.PluginManager.dump.dumpError");

    // pluginmanager - info
    private String infoHeader = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoHeader");
    private String infoVersion = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoVersion");
    private String infoAuthors = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoAuthors");
    private String infoStatus = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoStatus");
    private String infoDepends = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoDepends");
    private String infoSoftDepends = FileManager.get("messages.yml").getString("Commands.PluginManager.info.infoSoftDepends");

    // pluginmanager - list
    private String listHeader = FileManager.get("messages.yml").getString("Commands.PluginManager.list.listHeader");

    // opties - whitelist
    private String whitelistAan = FileManager.get("messages.yml").getString("Opties.Whitelist.whitelistAan");
    private String whitelistUit = FileManager.get("messages.yml").getString("Opties.Whitelist.whitelistUit");

    public String getPrefix() {
        return color(prefix);
    }

    public String getGeenPerms() {
        return color(geenPerms).replace("%prefix%", prefix);
    }

    public String getMainArgsNotFound() {
        return color(mainArgsNotFound).replace("%prefix%", prefix);
    }

    public String getGeenSubCommandFound() {
        return color(geenSubCommandFound).replace("%prefix%", prefix);
    }

    public String getPlManagerArgsNotFound() {
        return color(plManagerArgsNotFound);
    }

    public String getPluginAlreadyEnabled() {
        return color(pluginAlreadyEnabled).replace("%prefix%", prefix);
    }

    public String getPluginEnabled() {
        return color(pluginEnabled).replace("%prefix%", prefix);
    }

    public String getPluginNotExists() {
        return color(pluginNotExists).replace("%prefix%", prefix);
    }

    public String getInvalidPlugin() {
        return color(invalidPlugin).replace("%prefix%", prefix);
    }

    public String getInvalidDiractory() {
        return color(invalidDiractory).replace("%prefix%", prefix);
    }

    public String getPluginAlreadyLoaded() {
        return color(pluginAlreadyLoaded).replace("%prefix%", prefix);
    }

    public String getPluginLoaded() {
        return color(pluginLoaded).replace("%prefix%", prefix);
    }

    public String getCannotFindLoad() {
        return color(cannotFindLoad).replace("%prefix%", prefix);
    }

    public String getPluginUnloaded() {
        return color(pluginUnloaded).replace("%prefix%", prefix);
    }

    public String getPluginIgnored() {
        return color(pluginIgnored).replace("%prefix%", prefix);
    }

    public String getAllPluginsRestarted() {
        return color(allPluginsRestarted).replace("%prefix%", prefix);
    }

    public String getPluginRestarted() {
        return color(pluginRestarted).replace("%prefix%", prefix);
    }

    public String getAllPluginsReloaded() {
        return color(allPluginsReloaded).replace("%prefix%", prefix);
    }

    public String getPluginReloaded() {
        return color(pluginReloaded).replace("%prefix%", prefix);
    }

    public String getAllPluginsDisabled() {
        return color(allPluginsDisabled).replace("%prefix%", prefix);
    }

    public String getPluginIsNotEnabled() {
        return color(pluginIsNotEnabled).replace("%prefix%", prefix);
    }

    public String getPluginDisabled() {
        return color(pluginDisabled).replace("%prefix%", prefix);
    }

    public String getDumpOnFileName() {
        return color(dumpOnFileName).replace("%prefix%", prefix);
    }

    public String getDumpError() {
        return color(dumpError).replace("%prefix%", prefix);
    }

    public String getInfoHeader() {
        return color(infoHeader);
    }

    public String getInfoVersion() {
        return color(infoVersion);
    }

    public String getInfoAuthors() {
        return color(infoAuthors);
    }

    public String getInfoStatus() {
        return color(infoStatus);
    }

    public String getInfoDepends() {
        return color(infoDepends);
    }

    public String getInfoSoftDepends() {
        return color(infoSoftDepends);
    }

    public String getWhitelistAan() {
        return color(whitelistAan).replace("%prefix%", prefix);
    }

    public String getWhitelistUit() {
        return color(whitelistUit).replace("%prefix%", prefix);
    }

    public String getListHeader() {
        return color(listHeader);
    }

    public String getLoginMessageCanceled() {
        return color(loginMessageCanceled).replace("%prefix%", prefix);
    }

    public String getLoginMessageChatMessage() {
        return color(loginMessageChatMessage).replace("%prefix%", prefix);
    }

    public String getLoginMessageSetToGeen() {
        return color(loginMessageSetToGeen).replace("%prefix%", prefix);
    }

    public String getLoginMessageSuccesSet() {
        return color(loginMessageSuccesSet).replace("%prefix%", prefix);
    }

    public String getLogoutMessageCanceled() {
        return color(getLogoutMessageCanceled).replace("%prefix%", prefix);
    }

    public String getLogoutMessageChatMessage() {
        return color(getLogoutMessageChatMessage).replace("%prefix%", prefix);
    }

    public String getLogoutMessageSetToGeen() {
        return color(getLogoutMessageSetToGeen).replace("%prefix%", prefix);
    }

    public String getLogoutMessageSuccesSet() {
        return color(getLogoutMessageSuccesSet).replace("%prefix%", prefix);
    }
}
