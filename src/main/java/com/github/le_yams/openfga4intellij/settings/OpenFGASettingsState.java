package com.github.le_yams.openfga4intellij.settings;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Supports storing the application settings in a persistent way.
 * The {@link State} and {@link Storage} annotations define the name of the data and the file name where
 * these persistent application settings are stored.
 */
@State(
        name = "com.github.le_yams.openfga4intellij.settings.OpenFGASettingsState",
        storages = @Storage("OpenFGASettingsPlugin.xml")
)
public class OpenFGASettingsState implements PersistentStateComponent<OpenFGASettingsState> {

    public String cliPath = "";

    public static OpenFGASettingsState getInstance() {
        return ApplicationManager.getApplication().getService(OpenFGASettingsState.class);
    }

    @Nullable
    @Override
    public OpenFGASettingsState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull OpenFGASettingsState state) {
        XmlSerializerUtil.copyBean(state, this);
    }

}
