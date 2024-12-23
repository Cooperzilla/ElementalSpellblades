package me.cooperzilla.elemental_spellblades.client.item.model;

import com.cleannrooster.spellblades.SpellbladesAndSuch;
import me.cooperzilla.elemental_spellblades.items.EarthOrb;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.minecraft.util.Identifier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

public class EarthOrbModel extends GeoModel<EarthOrb> {
    public EarthOrbModel() {
    }

    public Identifier getModelResource(EarthOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "geo/orb.geo.json");
    }

    public Identifier getTextureResource(EarthOrb orb) {
        return Identifier.of(MOD_ID, "textures/item/orb_earth.png");
    }

    public Identifier getAnimationResource(EarthOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "animations/orb.animations.json");
    }
}
