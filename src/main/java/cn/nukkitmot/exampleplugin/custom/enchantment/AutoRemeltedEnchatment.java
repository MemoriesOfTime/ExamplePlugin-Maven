package cn.nukkitmot.exampleplugin.custom.enchantment;

import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.item.enchantment.EnchantmentType;
import cn.nukkit.utils.Identifier;

public class AutoRemeltedEnchatment extends Enchantment {

    public AutoRemeltedEnchatment() {
        super(new Identifier("nukkit", "auto_remelted"), "autoRemelted", Rarity.COMMON, EnchantmentType.ALL);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public String getName() {
        return "%enchantment.custom." + this.name;
    }
}
