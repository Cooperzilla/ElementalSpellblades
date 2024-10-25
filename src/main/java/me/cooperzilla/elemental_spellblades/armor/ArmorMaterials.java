package me.cooperzilla.elemental_spellblades.armor;

import com.extraspellattributes.ReabsorptionInit;
import me.cooperzilla.elemental_spellblades.registries.ItemRegister;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;
import static net.minecraft.item.Item.BASE_ATTACK_DAMAGE_MODIFIER_ID;

public class ArmorMaterials {
    public static RegistryEntry<ArmorMaterial> runeArmor(
            String id,
            Supplier<Ingredient> repairIngredientSupplier
    ) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(Identifier.of(MOD_ID, id), "", false),
                new ArmorMaterial.Layer(Identifier.of(MOD_ID, id), "", false)
        );

        ArmorMaterial material = new ArmorMaterial(Map.of(
                ArmorItem.Type.HELMET, 2,
                ArmorItem.Type.CHESTPLATE, 5,
                ArmorItem.Type.LEGGINGS, 4,
                ArmorItem.Type.BOOTS, 2
        ), 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, repairIngredientSupplier, layers, 0F, 0F);

        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(MOD_ID, id), material);

        return RegistryEntry.of(material);
    }

    public static RegistryEntry<ArmorMaterial> earth_material = runeArmor(
            "runequake_material",
            () -> Ingredient.ofItems(ItemRegister.runequake_ingot)
    );
    public static RegistryEntry<ArmorMaterial> water_material = runeArmor(
            "runewave_material",
            () -> Ingredient.ofItems(ItemRegister.runewave_ingot)
    );
    public static RegistryEntry<ArmorMaterial> wind_material = runeArmor(
            "runestorm_material",
            () -> Ingredient.ofItems(ItemRegister.runestorm_ingot)
    );

    public static AttributeModifiersComponent runeArmorStats(RegistryEntry<EntityAttribute> attr, Identifier id) {
        return AttributeModifiersComponent.builder()
                .add(
                        attr,
                        new EntityAttributeModifier(
                                id,
                                0.15F,
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ),
                        AttributeModifierSlot.ARMOR
                )
                .add(
                        EntityAttributes.GENERIC_ATTACK_DAMAGE,
                        new EntityAttributeModifier(
                                BASE_ATTACK_DAMAGE_MODIFIER_ID,
                                0.03,
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
                        ),
                        AttributeModifierSlot.MAINHAND
                )
                .add(
                        RegistryEntry.of(ReabsorptionInit.WARDING),
                        new EntityAttributeModifier(
                                Identifier.of(ReabsorptionInit.MOD_ID,"reabsorption"),
                                1.5,
                                EntityAttributeModifier.Operation.ADD_VALUE
                        ),
                        AttributeModifierSlot.MAINHAND
                )
                .build();
    }
}
