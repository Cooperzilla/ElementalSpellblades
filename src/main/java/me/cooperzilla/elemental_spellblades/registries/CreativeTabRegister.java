package me.cooperzilla.elemental_spellblades.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;
import static me.cooperzilla.elemental_spellblades.armor.Armor.*;
import static me.cooperzilla.elemental_spellblades.registries.ItemRegister.*;

public class CreativeTabRegister {
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegister.earth_spellblade))
            .displayName(Text.translatable("itemGroup.elemental_spellblades.creative_tab"))
            .entries((context, entries) -> {
                entries.add(earth_spellblade);
                entries.add(water_spellblade);
                entries.add(wind_spellblade);
                entries.add(earth_spike);
                entries.add(water_cutlass);
                entries.add(wind_greatblade);
                entries.add(runequake_ingot);
                entries.add(runewave_ingot);
                entries.add(runestorm_ingot);
                entries.add(earth_claymore);
                entries.add(water_claymore);
                entries.add(wind_claymore);
                entries.add(earth_orb);
                entries.add(water_orb);
                entries.add(wind_orb);
                entries.add(earth_helmet);
                entries.add(earth_chestplate);
                entries.add(earth_leggings);
                entries.add(earth_boots);
                entries.add(wind_helmet);
                entries.add(wind_chestplate);
                entries.add(wind_leggings);
                entries.add(wind_boots);
                entries.add(water_helmet);
                entries.add(water_chestplate);
                entries.add(water_leggings);
                entries.add(water_boots);
            })
            .build();
    public static void register() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, "creative_tab"), ITEM_GROUP);
    }
}
