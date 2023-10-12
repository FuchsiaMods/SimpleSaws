package json.jayson.simplesaws.common.objects.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public interface IChainsawType {

    int getBlockLimit();
    TagKey<Item> getFuel();

}
