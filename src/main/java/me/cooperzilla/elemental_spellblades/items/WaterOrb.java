package me.cooperzilla.elemental_spellblades.items;

import me.cooperzilla.elemental_spellblades.client.item.renderer.WaterOrbRenderer;
import me.cooperzilla.elemental_spellblades.materials.ItemMaterials;
import mod.azure.azurelib.common.api.common.animatable.GeoItem;
import mod.azure.azurelib.common.internal.client.RenderProvider;
import mod.azure.azurelib.common.internal.common.util.AzureLibUtil;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.core.animation.Animation;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.animation.RawAnimation;
import mod.azure.azurelib.core.object.PlayState;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.more_rpg_classes.custom.MoreSpellSchools;
import net.spell_power.api.SpellPowerMechanics;

import java.util.List;
import java.util.function.Consumer;

public class WaterOrb extends SwordItem implements GeoItem {
    public static final RawAnimation IDLE = RawAnimation.begin().thenLoop("idle");
    private AnimatableInstanceCache factory;

    public WaterOrb() {
        super(ItemMaterials.earthMaterial, new Settings().attributeModifiers(AttributeModifiersComponent.builder()
                .add(
                        EntityAttributes.GENERIC_ATTACK_DAMAGE,
                        new EntityAttributeModifier(
                                BASE_ATTACK_DAMAGE_MODIFIER_ID,
                                1,
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
                        MoreSpellSchools.WATER.attributeEntry,
                        new EntityAttributeModifier(
                                MoreSpellSchools.WATER.id,
                                2,
                                EntityAttributeModifier.Operation.ADD_VALUE)
                        ,
                        AttributeModifierSlot.MAINHAND
                )
                .add(
                        SpellPowerMechanics.HASTE.attributeEntry,
                        new EntityAttributeModifier(
                                SpellPowerMechanics.HASTE.id,
                                0.25,
                                EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE
                        ),
                        AttributeModifierSlot.MAINHAND
                )
                .build()
        ));
        this.factory = AzureLibUtil.createInstanceCache(this);
    }

    public void createRenderer(Consumer<RenderProvider> consumer) {
        consumer.accept(new RenderProvider() {
            private WaterOrbRenderer renderer;

            @Override
            public BuiltinModelItemRenderer getCustomRenderer() {
                if (this.renderer == null) {
                    this.renderer = new WaterOrbRenderer();
                }
                return this.renderer;
            }
        });
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController[]{new AnimationController(this, "idle", 0, (animationState) -> {
            animationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        })});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.factory;
    }

    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("Orbweaver's Grace").formatted(Formatting.LIGHT_PURPLE));
        tooltip.add(Text.translatable("Move normally while casting").formatted(Formatting.GRAY));
        super.appendTooltip(stack, context, tooltip, type);
    }
}