package me.cooperzilla.elemental_spellblades.client.item.renderer;

import me.cooperzilla.elemental_spellblades.client.item.model.WaterOrbModel;
import me.cooperzilla.elemental_spellblades.items.WaterOrb;
import mod.azure.azurelib.common.api.client.renderer.GeoItemRenderer;

public class WaterOrbRenderer extends GeoItemRenderer<WaterOrb> {
    public WaterOrbRenderer() {
        super(new WaterOrbModel());
    }
}
