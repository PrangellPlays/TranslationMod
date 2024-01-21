package net.prangellplays.pstranslate.plugin;

import de.maxhenkel.voicechat.api.VoicechatPlugin;
import net.prangellplays.pstranslate.PSTranslator;

public class TranslatorPlugin implements VoicechatPlugin {
    @Override
    public String getPluginId() {
        return PSTranslator.MOD_ID;
    }
}
