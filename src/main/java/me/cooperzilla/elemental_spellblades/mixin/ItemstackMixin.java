package me.cooperzilla.elemental_spellblades.mixin;

import com.cleannrooster.spellblades.SpellbladesAndSuch;
import com.cleannrooster.spellblades.items.interfaces.PlayerDamageInterface;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.more_rpg_classes.custom.MoreSpellSchools;
import net.spell_engine.internals.SpellContainerHelper;
import net.spell_power.api.SpellPower;
import net.spell_power.api.SpellSchools;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

@Mixin({ItemStack.class})
public class ItemstackMixin {

    @Inject(
            at = {@At("HEAD")},
            method = {"postDamageEntity"},
            cancellable = true
    )
    public void postDamageEntityElementalSpellblades(LivingEntity target, PlayerEntity player, CallbackInfo callbackInfo) {
        if (player.hasStatusEffect(SpellbladesAndSuch.SPELLSTRIKE) && player instanceof PlayerDamageInterface playerDamageInterface) {
            if (playerDamageInterface.getSpellstriking() && !player.getWorld().isClient() && SpellContainerHelper.getEquipped(player.getMainHandStack(), player).spell_ids() != null && SpellContainerHelper.getEquipped(player.getMainHandStack(), player).spell_ids().contains("spellbladenext:spellstrike")) {
                if (playerDamageInterface.getSpellstrikeSpells().isEmpty()) {
                    if (SpellPower.getSpellPower(MoreSpellSchools.EARTH, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of(MOD_ID, "blastearth"));
                    }

                    if (SpellPower.getSpellPower(MoreSpellSchools.WATER, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of(MOD_ID, "blastwater"));
                    }

                    if (SpellPower.getSpellPower(MoreSpellSchools.AIR, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of(MOD_ID, "blastair"));
                    }

                    if (SpellPower.getSpellPower(SpellSchools.ARCANE, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of("spellbladenext", "blastarcane"));
                    }
                    if (SpellPower.getSpellPower(SpellSchools.FIRE, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of("spellbladenext", "blastfire"));
                    }
                    if (SpellPower.getSpellPower(SpellSchools.FROST, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of("spellbladenext", "blastfrost"));
                    }
                    if (SpellPower.getSpellPower(SpellSchools.LIGHTNING, player).baseValue() >= 1.0) {
                        playerDamageInterface.queueSpellStrikeSpell(Identifier.of("spellbladenext", "blastlightning"));
                    }
                }
            }
        }
    }
}
