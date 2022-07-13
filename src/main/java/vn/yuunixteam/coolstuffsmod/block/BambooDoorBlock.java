package vn.yuunixteam.coolstuffsmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BambooDoorBlock extends DoorBlock {
    public BambooDoorBlock(AbstractBlock.Settings settings)  { super(settings);}

    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (world.getDimension().isUltrawarm()) {
            world.setBlockState(pos, ModBlocks.DRIED_BAMBOO_DOOR.getStateWithProperties(state), 3);
            world.setBlockState(pos.up(), ModBlocks.DRIED_BAMBOO_DOOR.getStateWithProperties(state).with(HALF, DoubleBlockHalf.UPPER), 3);
            world.syncWorldEvent(2009, pos, 0);
            world.playSound(null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
        }

    }
}
