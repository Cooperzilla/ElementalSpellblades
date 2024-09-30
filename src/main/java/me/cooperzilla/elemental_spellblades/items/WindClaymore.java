package me.cooperzilla.elemental_spellblades.items;

import me.cooperzilla.elemental_spellblades.materials.ItemMaterials;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.more_rpg_classes.custom.MoreSpellSchools;

import static me.cooperzilla.elemental_spellblades.registries.AttributeRegister.convert_to_wind;

public class WindClaymore extends SwordItem {
    public WindClaymore() {
        super(ItemMaterials.airMaterial, new Settings().attributeModifiers(
                AttributeModifiersComponent.builder()
                        .add(
                                EntityAttributes.GENERIC_ATTACK_DAMAGE,
                                new EntityAttributeModifier(
                                        BASE_ATTACK_DAMAGE_MODIFIER_ID,
                                        6,
                                        EntityAttributeModifier.Operation.ADD_VALUE
                                ),
                                AttributeModifierSlot.MAINHAND
                        )
                        .add(
                                EntityAttributes.GENERIC_ATTACK_SPEED,
                                new EntityAttributeModifier(
                                        BASE_ATTACK_SPEED_MODIFIER_ID,
                                        -3,
                                        EntityAttributeModifier.Operation.ADD_VALUE
                                ),
                                AttributeModifierSlot.MAINHAND
                        )
                        .add(
                                MoreSpellSchools.AIR.attributeEntry,
                                new EntityAttributeModifier(
                                        MoreSpellSchools.AIR.id,
                                        4,
                                        EntityAttributeModifier.Operation.ADD_VALUE)
                                ,
                                AttributeModifierSlot.MAINHAND
                        )
                        .add(
                                convert_to_wind,
                                new EntityAttributeModifier(
                                        Identifier.of("converttowind"),
                                        0.2,
                                        EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE
                                ),
                                AttributeModifierSlot.MAINHAND
                        )
                        .build()
                )
        );
    }
}
