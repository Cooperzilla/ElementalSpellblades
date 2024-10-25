package me.cooperzilla.elemental_spellblades.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.more_rpg_classes.custom.MoreSpellSchools;

import static me.cooperzilla.elemental_spellblades.registries.ItemRegister.registerItem;

public class Armor {
    public static Item earth_helmet = new ArmorItem(
            ArmorMaterials.earth_material,
            ArmorItem.Type.HELMET,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.EARTH.attributeEntry,
                            MoreSpellSchools.EARTH.id)
                    )
    );

    public static Item earth_chestplate = new ArmorItem(
            ArmorMaterials.earth_material,
            ArmorItem.Type.CHESTPLATE,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.EARTH.attributeEntry,
                            MoreSpellSchools.EARTH.id)
                    )
    );

    public static Item earth_leggings = new ArmorItem(
            ArmorMaterials.earth_material,
            ArmorItem.Type.LEGGINGS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.EARTH.attributeEntry,
                            MoreSpellSchools.EARTH.id)
                    )
    );

    public static Item earth_boots = new ArmorItem(
            ArmorMaterials.earth_material,
            ArmorItem.Type.BOOTS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.EARTH.attributeEntry,
                            MoreSpellSchools.EARTH.id)
                    )
    );

    public static Item wind_helmet = new ArmorItem(
            ArmorMaterials.wind_material,
            ArmorItem.Type.HELMET,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.AIR.attributeEntry,
                            MoreSpellSchools.AIR.id)
                    )
    );

    public static Item wind_chestplate = new ArmorItem(
            ArmorMaterials.wind_material,
            ArmorItem.Type.CHESTPLATE,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.AIR.attributeEntry,
                            MoreSpellSchools.AIR.id)
                    )
    );

    public static Item wind_leggings = new ArmorItem(
            ArmorMaterials.wind_material,
            ArmorItem.Type.LEGGINGS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.AIR.attributeEntry,
                            MoreSpellSchools.AIR.id)
                    )
    );

    public static Item wind_boots = new ArmorItem(
            ArmorMaterials.wind_material,
            ArmorItem.Type.BOOTS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.AIR.attributeEntry,
                            MoreSpellSchools.AIR.id)
                    )
    );

    public static Item water_helmet = new ArmorItem(
            ArmorMaterials.water_material,
            ArmorItem.Type.HELMET,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.WATER.attributeEntry,
                            MoreSpellSchools.WATER.id)
                    )
    );

    public static Item water_chestplate = new ArmorItem(
            ArmorMaterials.water_material,
            ArmorItem.Type.CHESTPLATE,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.WATER.attributeEntry,
                            MoreSpellSchools.WATER.id)
                    )
    );

    public static Item water_leggings = new ArmorItem(
            ArmorMaterials.water_material,
            ArmorItem.Type.LEGGINGS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.WATER.attributeEntry,
                            MoreSpellSchools.WATER.id)
                    )
    );

    public static Item water_boots = new ArmorItem(
            ArmorMaterials.water_material,
            ArmorItem.Type.BOOTS,
            new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))
                    .attributeModifiers(ArmorMaterials.runeArmorStats(
                            MoreSpellSchools.WATER.attributeEntry,
                            MoreSpellSchools.WATER.id)
                    )
    );

    public static void register() {
        registerItem("runequake_helmet", earth_helmet);
        registerItem("runequake_chestplate", earth_chestplate);
        registerItem("runequake_leggings", earth_leggings);
        registerItem("runequake_boots", earth_boots);
        registerItem("runestorm_helmet", wind_helmet);
        registerItem("runestorm_chestplate", wind_chestplate);
        registerItem("runestorm_leggings", wind_leggings);
        registerItem("runestorm_boots", wind_boots);
        registerItem("runewave_helmet", water_helmet);
        registerItem("runewave_chestplate", water_chestplate);
        registerItem("runewave_leggings", water_leggings);
        registerItem("runewave_boots", water_boots);
    }
}
