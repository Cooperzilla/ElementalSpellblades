package me.cooperzilla.elemental_spellblades.registries;

import me.cooperzilla.elemental_spellblades.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegister {
    static SwordItem earth_spellblade = new EarthSpellblade();
    static SwordItem water_spellblade = new WaterSpellblade();
    static SwordItem wind_spellblade = new WindSpellblade();
    static SwordItem earth_spike = new EarthSpike();
    static SwordItem water_cutlass = new WaterCutlass();
    static SwordItem wind_greatblade = new WindGreatblade();
    static SwordItem earth_claymore = new EarthClaymore();
    static SwordItem water_claymore = new WaterClaymore();
    static SwordItem wind_claymore = new WindClaymore();
    static SwordItem earth_orb = new EarthOrb();
    static SwordItem water_orb = new WaterOrb();
    static SwordItem wind_orb = new WindOrb();

    static Item runewave_ingot = new Item(new Item.Settings());
    static Item runequake_ingot = new Item(new Item.Settings());
    static Item runestorm_ingot = new Item(new Item.Settings());

    static void registerItem(String s, Item i) {
        Registry.register(Registries.ITEM, Identifier.of("elemental_spellblades", s), i);
    }

    public static void register() {
        registerItem("earth_spellblade", earth_spellblade);
        registerItem("water_spellblade", water_spellblade);
        registerItem("wind_spellblade", wind_spellblade);
        registerItem("earth_spike", earth_spike);
        registerItem("water_cutlass", water_cutlass);
        registerItem("wind_greatblade", wind_greatblade);
        registerItem("runewave_ingot", runewave_ingot);
        registerItem("runequake_ingot", runequake_ingot);
        registerItem("runestorm_ingot", runestorm_ingot);
        registerItem("earth_claymore", earth_claymore);
        registerItem("water_claymore", water_claymore);
        registerItem("wind_claymore", wind_claymore);
        registerItem("earth_orb", earth_orb);
        registerItem("water_orb", water_orb);
        registerItem("wind_orb", wind_orb);
    }
}
