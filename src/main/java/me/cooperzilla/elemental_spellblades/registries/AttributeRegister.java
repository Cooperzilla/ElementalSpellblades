package me.cooperzilla.elemental_spellblades.registries;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.more_rpg_classes.custom.MoreSpellSchools;
import net.spell_power.api.SpellSchool;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

public class AttributeRegister {

    public static final RegistryEntry<EntityAttribute> convert_to_earth = Registry.registerReference(
            Registries.ATTRIBUTE,
            Identifier.of(MOD_ID, "converttoearth"),
            new ClampedEntityAttribute(
                    "attribute.name.elemental_spellblades.convert_to_earth",
                    100, 100, 9999
            ).setTracked(true)
    );
    public static final RegistryEntry<EntityAttribute> convert_to_water = Registry.registerReference(
            Registries.ATTRIBUTE,
            Identifier.of(MOD_ID, "converttowater"),
            new ClampedEntityAttribute(
                    "attribute.name.elemental_spellblades.convert_to_water",
                    100, 100, 9999
            ).setTracked(true)
    );
    public static final RegistryEntry<EntityAttribute> convert_to_wind = Registry.registerReference(
            Registries.ATTRIBUTE,
            Identifier.of(MOD_ID, "converttowind"),
            new ClampedEntityAttribute(
                    "attribute.name.elemental_spellblades.convert_to_wind",
                    100, 100, 9999
            ).setTracked(true)
    );

    public static void register() {
        MoreSpellSchools.EARTH.addSource(
                SpellSchool.Trait.POWER, SpellSchool.Apply.ADD, queryArgs ->
                        queryArgs.entity().getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)
                        * 0.01
                        * (queryArgs.entity().getAttributeValue(convert_to_earth) - 100)
        );
        MoreSpellSchools.WATER.addSource(
                SpellSchool.Trait.POWER, SpellSchool.Apply.ADD, queryArgs ->
                        queryArgs.entity().getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)
                        * 0.01
                        * (queryArgs.entity().getAttributeValue(convert_to_water) - 100)
        );
        MoreSpellSchools.AIR.addSource(
                SpellSchool.Trait.POWER, SpellSchool.Apply.ADD, queryArgs ->
                        queryArgs.entity().getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)
                        * 0.01
                        * (queryArgs.entity().getAttributeValue(convert_to_wind) - 100)
        );
    }
}
