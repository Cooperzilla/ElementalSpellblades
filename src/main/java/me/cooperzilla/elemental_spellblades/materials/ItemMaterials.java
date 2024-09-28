package me.cooperzilla.elemental_spellblades.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class ItemMaterials {
    public static ToolMaterial earthMaterial = new ItemMaterial(
            ToolMaterials.DIAMOND,
            () -> Ingredient.ofItems(Items.OBSIDIAN)
    );
    public static ToolMaterial waterMaterial = new ItemMaterial(
            ToolMaterials.DIAMOND,
            () -> Ingredient.ofItems(Items.PRISMARINE_CRYSTALS)
    );
    public static ToolMaterial airMaterial = new ItemMaterial(
            ToolMaterials.DIAMOND,
            () -> Ingredient.ofItems(Items.WIND_CHARGE)
    );

}


