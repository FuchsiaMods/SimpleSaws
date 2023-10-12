package json.jayson.simplesaws.common.objects.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public enum ChainsawType implements IChainsawType {
    WOOD(5, Tags.Items.ORES_COAL);

    int blockLimit;
    TagKey<Item> fuel;
    ChainsawType(int blockLimit, TagKey<Item> fuel) {
        this.blockLimit = blockLimit;
        this.fuel = fuel;
    }
    @Override
    public int getBlockLimit() {
        return blockLimit;
    }

    @Override
    public TagKey<Item> getFuel() {
        return fuel;
    }
}
