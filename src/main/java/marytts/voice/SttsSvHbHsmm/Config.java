package marytts.voice.Victor_stts;

import marytts.config.VoiceConfig;
import marytts.exceptions.MaryConfigurationException;

public class Config extends VoiceConfig {
    public Config() throws MaryConfigurationException {
        super(Config.class.getResourceAsStream("voice.config"));
    }
}