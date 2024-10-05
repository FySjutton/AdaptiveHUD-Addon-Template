package ahud.ahudtemplate;

import ahud.adaptivehud.AdaptiveHudRegistry;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class AHUDTemplate implements ModInitializer {
	public static final String MOD_ID = "ahud-template";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AdaptiveHudRegistry variableRegister = new AdaptiveHudRegistry();

        for (Method variableMethod : Variables.class.getDeclaredMethods()) {
            variableRegister.registerVariable(variableMethod.getName(), variableMethod, false);
        }
    }
}