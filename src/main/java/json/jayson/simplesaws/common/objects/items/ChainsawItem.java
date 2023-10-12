package json.jayson.simplesaws.common.objects.items;

import net.minecraft.world.item.Item;

public class ChainsawItem extends Item {

    IChainsawType type;
    public ChainsawItem(Properties properties, IChainsawType type) {
        super(properties);
        this.type = type;
    }



    public IChainsawType getType() {
        return type;
    }
}
