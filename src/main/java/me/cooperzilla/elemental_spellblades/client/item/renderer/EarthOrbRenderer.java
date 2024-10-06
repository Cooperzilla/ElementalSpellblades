package me.cooperzilla.elemental_spellblades.client.item.renderer;

import me.cooperzilla.elemental_spellblades.client.item.model.EarthOrbModel;
import me.cooperzilla.elemental_spellblades.items.EarthOrb;
import mod.azure.azurelib.common.api.client.renderer.GeoItemRenderer;

public class EarthOrbRenderer extends GeoItemRenderer<EarthOrb> {
    public EarthOrbRenderer() {
        super(new EarthOrbModel());
    }
}
