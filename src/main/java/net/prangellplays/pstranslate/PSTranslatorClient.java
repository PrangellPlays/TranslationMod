package net.prangellplays.pstranslate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.prangellplays.pstranslate.event.EventHandler;
import org.lwjgl.glfw.GLFW;

public class PSTranslatorClient implements ClientModInitializer {
    public static KeyBinding vKeyBinding;

    @Override
    public void onInitializeClient() {
        vKeyBinding = new KeyBinding("key.pstranslate.mic", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, KeyBinding.MISC_CATEGORY);
        KeyBindingHelper.registerKeyBinding(vKeyBinding);
        EventHandler.register();
    }
}