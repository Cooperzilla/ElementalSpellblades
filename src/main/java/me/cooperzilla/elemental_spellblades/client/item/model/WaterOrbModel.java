package me.cooperzilla.elemental_spellblades.client.item.model;

import com.cleannrooster.spellblades.SpellbladesAndSuch;
import me.cooperzilla.elemental_spellblades.items.WaterOrb;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.minecraft.util.Identifier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

public class WaterOrbModel extends GeoModel<WaterOrb> {
    public WaterOrbModel() {
    }

    public Identifier getModelResource(WaterOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "geo/orb.geo.json");
    }

    public Identifier getTextureResource(WaterOrb orb) {
        return Identifier.of(MOD_ID, "textures/item/orb_water.png");
    }

    public Identifier getAnimationResource(WaterOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "animations/orb.animations.json");
    }
}
