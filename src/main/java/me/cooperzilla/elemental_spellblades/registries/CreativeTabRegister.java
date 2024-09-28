package me.cooperzilla.elemental_spellblades.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTabRegister {
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemRegister.earth_spellblade))
            .displayName(Text.translatable("itemGroup.elemental_spellblades.creative_tab"))
            .entries((context, entries) -> {
                entries.add(ItemRegister.earth_spellblade);
                entries.add(ItemRegister.water_spellblade);
                entries.add(ItemRegister.wind_spellblade);
                entries.add(ItemRegister.earth_spike);
                entries.add(ItemRegister.water_cutlass);
                entries.add(ItemRegister.wind_greatblade);
            })
            .build();
    public static void register() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("elemental_spellblades", "creative_tab"), ITEM_GROUP);
    }
}
