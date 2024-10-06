package me.cooperzilla.elemental_spellblades.client.item.renderer;

import me.cooperzilla.elemental_spellblades.client.item.model.WindOrbModel;
import me.cooperzilla.elemental_spellblades.items.WindOrb;
import mod.azure.azurelib.common.api.client.renderer.GeoItemRenderer;

public class WindOrbRenderer extends GeoItemRenderer<WindOrb> {
    public WindOrbRenderer() {
        super(new WindOrbModel());
    }
}
