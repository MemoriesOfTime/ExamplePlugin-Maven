package cn.nukkitmot.exampleplugin.custom.entity;

import cn.nukkit.entity.Entity;
import cn.nukkit.entity.custom.CustomEntity;
import cn.nukkit.entity.custom.EntityDefinition;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class MarkerEntity extends Entity implements CustomEntity {
    public static final EntityDefinition DEF =
            EntityDefinition
                    .builder()
                    .identifier("example:marker")
                    //.summonable(true)
                    .spawnEgg(true)
                    .implementation(MarkerEntity.class)
                    .build();
    private static final String MARKER_INDEX_KEY = "MarkerIndex";

    public MarkerEntity(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return this.getEntityDefinition().getRuntimeId();
    }

    @Override
    public EntityDefinition getEntityDefinition() {
        return DEF;
    }

    @Override
    public float getHeight() {
        return 0.5F;
    }

    @Override
    public float getWidth() {
        return 0.5F;
    }

    @Override
    public float getLength() {
        return 0.5F;
    }

    //@Override
    public String getOriginalName() {
        return "Marker";
    }

    public int getMarkerIndex() {
        return namedTag.getInt(MARKER_INDEX_KEY);
    }

    public void setMarkerIndex(int index) {
        namedTag.putInt(MARKER_INDEX_KEY, index);
        setNameTag("§a" + index);
    }
}