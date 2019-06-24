package me.flexdevelopment.servermanager.api.enums;

public enum Commands {

    MAINCOMMAND("servermanager", "/servermanger <help, update, updateinfo>", "De ServerManager main command", "servermanager.main", "[svm, serverm, servm]"),
    PLMANAGERCOMMAND("pluginmanager", "/pluginmanager <enable, disable, load, unload, reload, dump, info, list> <plugin (Restart/reload: all, *)>", "PluginManager command", "servermanager.pluginmanager", "[plugmanager, plmanager, pluginm]");

    private String command, usage, description, permission;
    private String[] aliases;

    Commands(String command, String usage, String description, String permission, String... aliases) {
        this.command = command;
        this.usage = usage;
        this.description = description;
        this.permission = permission;
        this.aliases = aliases;
    }

    public String getCommand() {
        return command;
    }

    public String getUsage() {
        return usage;
    }

    public String getDescription() {
        return description;
    }

    public String getPermission() {
        return permission;
    }

    public String[] getAliases() {
        return aliases;
    }
}
