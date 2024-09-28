package me.cooperzilla.elemental_spellblades.mixin;

import me.cooperzilla.elemental_spellblades.registries.AttributeRegister;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(
            method = "createLivingAttributes()Lnet/minecraft/entity/attribute/DefaultAttributeContainer$Builder;",
            require = 1, allow = 1, at = @At("RETURN")
    )
    private static void moreEntityAttributes$addAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> info) {
        info.getReturnValue().add(AttributeRegister.convert_to_earth);
        info.getReturnValue().add(AttributeRegister.convert_to_water);
        info.getReturnValue().add(AttributeRegister.convert_to_wind);
    }

}
