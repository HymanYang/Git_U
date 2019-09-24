package yunji.pins.plugins.extension

interface MicroModuleExtension {

    void codeCheckEnabled(boolean disable)

    void export(String... microModulePaths)

    void includeMain(String microModulePath)

    void include(String... microModulePaths)

}
