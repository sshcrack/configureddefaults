package fuzs.configureddefaults;

import fuzs.configureddefaults.handler.DefaultFilesHandler;
import net.fabricmc.loader.api.LanguageAdapter;
import net.fabricmc.loader.api.LanguageAdapterException;
import net.fabricmc.loader.api.ModContainer;

public class ConfiguredDefaultsFabric implements LanguageAdapter {

    public ConfiguredDefaultsFabric() {
        DefaultFilesHandler.initialize();
    }

    @Override
    public <T> T create(ModContainer mod, String value, Class<T> type) throws LanguageAdapterException {
        throw new LanguageAdapterException(ConfiguredDefaults.MOD_NAME);
    }
}
