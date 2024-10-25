package me.cooperzilla.elemental_spellblades.registries;

import me.cooperzilla.elemental_spellblades.armor.Armor;
import me.cooperzilla.elemental_spellblades.items.*;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

public class ItemRegister {
    public static SwordItem earth_spellblade = new EarthSpellblade();
    public static SwordItem water_spellblade = new WaterSpellblade();
    public static SwordItem wind_spellblade = new WindSpellblade();
    public static SwordItem earth_spike = new EarthSpike();
    public static SwordItem water_cutlass = new WaterCutlass();
    public static SwordItem wind_greatblade = new WindGreatblade();
    public static SwordItem earth_claymore = new EarthClaymore();
    public static SwordItem water_claymore = new WaterClaymore();
    public static SwordItem wind_claymore = new WindClaymore();
    public static SwordItem earth_orb = new EarthOrb();
    public static SwordItem water_orb = new WaterOrb();
    public static SwordItem wind_orb = new WindOrb();

    public static Item runewave_ingot = new Item(new Item.Settings());
    public static Item runequake_ingot = new Item(new Item.Settings());
    public static Item runestorm_ingot = new Item(new Item.Settings());

    public static void registerItem(String s, Item i) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, s), i);
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
        Armor.register();
    }
}
