package me.cooperzilla.elemental_spellblades.client.item.model;

import com.cleannrooster.spellblades.SpellbladesAndSuch;
import me.cooperzilla.elemental_spellblades.items.WindOrb;
import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.minecraft.util.Identifier;

import static me.cooperzilla.elemental_spellblades.ElementalSpellblades.MOD_ID;

public class WindOrbModel extends GeoModel<WindOrb> {
    public WindOrbModel() {
    }

    public Identifier getModelResource(WindOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "geo/orb.geo.json");
    }

    public Identifier getTextureResource(WindOrb orb) {
        return Identifier.of(MOD_ID, "textures/item/orb_wind.png");
    }

    public Identifier getAnimationResource(WindOrb orb) {
        return Identifier.of(SpellbladesAndSuch.MOD_ID, "animations/orb.animations.json");
    }
}
