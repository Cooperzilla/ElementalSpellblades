package me.cooperzilla.elemental_spellblades;

import me.cooperzilla.elemental_spellblades.registries.AttributeRegister;
import me.cooperzilla.elemental_spellblades.registries.CreativeTabRegister;
import me.cooperzilla.elemental_spellblades.registries.ItemRegister;
import net.fabricmc.api.ModInitializer;

public class ElementalSpellblades implements ModInitializer {
    public static String MOD_ID = "elemental_spellblades";

    @Override
    public void onInitialize() {
        ItemRegister.register();
        CreativeTabRegister.register();
        AttributeRegister.register();
    }
}
