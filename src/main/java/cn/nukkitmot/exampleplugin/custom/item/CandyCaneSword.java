package cn.nukkitmot.exampleplugin.custom.item;

import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustom;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;
import cn.nukkit.item.customitem.data.RenderOffsets;

public class CandyCaneSword extends ItemCustom {
    private static String spacenameId = "nukkit:candy_cane_sword";
    private static String textureName = "candy_cane_sword";
    public static String name = "糖果剑";

    @Override
    public int getMaxStackSize() {
        return 1;
    }

    public int scaleOffset() {
        return 32; // 需要是16的倍数，如 32、64、128
    }

    /**
     * 该方法设置自定义物品的定义
     */
    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .simpleBuilder(this, ItemCreativeCategory.EQUIPMENT)
                .creativeGroup("itemGroup.name.item")
                .allowOffHand(false)
                .renderOffsets(RenderOffsets.scaleOffset(scaleOffset()))
                .build();
    }

    public CandyCaneSword() {
        super(spacenameId, name, textureName);
    }

    @Override
    public int getMaxDurability() {
        return 500;
    }
}