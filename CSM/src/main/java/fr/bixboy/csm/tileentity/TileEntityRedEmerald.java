package fr.bixboy.csm.tileentity;

import fr.bixboy.csm.init.ModTileEntities;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRedEmerald extends TileEntity implements ITickableTileEntity {

    private int counter = 0;

    public TileEntityRedEmerald() {
        super(ModTileEntities.RED_EMERALD_TILE_ENTITY.get());
    }

    @Override
    public void load(BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);

        this.setCounter(nbt.getInt("counter"));
    }

    @Override
    public CompoundNBT save(CompoundNBT compound) {
        super.save(compound);

        compound.putInt("counter", this.getCounter());

        return compound;
    }


    @Override
    public void tick() {
        this.setCounter(getCounter()+1);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
