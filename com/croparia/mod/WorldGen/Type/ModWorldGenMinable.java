package com.croparia.mod.WorldGen.Type;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGenMinable extends WorldGenerator
{
    private final IBlockState oreBlock;
    /** The number of blocks to generate. */
    private final int numberOfBlocks;
    private final Predicate<IBlockState> predicate;

    public ModWorldGenMinable(IBlockState state, int blockCount)
    {
        this(state, blockCount, new ModWorldGenMinable.StonePredicate());
    }

    public ModWorldGenMinable(IBlockState state, int blockCount, Predicate<IBlockState> p_i45631_3_)
    {
        this.oreBlock = state;
        this.numberOfBlocks = blockCount;
        this.predicate = p_i45631_3_;
    }

    public boolean func_180709_b(World worldIn, Random rand, BlockPos position)
    {
        float f = rand.nextFloat() * (float)Math.PI;
        double d0 = (double)((float)(position.func_177958_n() + 8) + MathHelper.func_76126_a(f) * (float)this.numberOfBlocks / 8.0F);
        double d1 = (double)((float)(position.func_177958_n() + 8) - MathHelper.func_76126_a(f) * (float)this.numberOfBlocks / 8.0F);
        double d2 = (double)((float)(position.func_177952_p() + 8) + MathHelper.func_76134_b(f) * (float)this.numberOfBlocks / 8.0F);
        double d3 = (double)((float)(position.func_177952_p() + 8) - MathHelper.func_76134_b(f) * (float)this.numberOfBlocks / 8.0F);
        double d4 = (double)(position.func_177956_o() + rand.nextInt(3) - 2);
        double d5 = (double)(position.func_177956_o() + rand.nextInt(3) - 2);

        for (int i = 0; i < this.numberOfBlocks; ++i)
        {
            float f1 = (float)i / (float)this.numberOfBlocks;
            double d6 = d0 + (d1 - d0) * (double)f1;
            double d7 = d4 + (d5 - d4) * (double)f1;
            double d8 = d2 + (d3 - d2) * (double)f1;
            double d9 = rand.nextDouble() * (double)this.numberOfBlocks / 16.0D;
            double d10 = (double)(MathHelper.func_76126_a((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(MathHelper.func_76126_a((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            int j = MathHelper.func_76128_c(d6 - d10 / 2.0D);
            int k = MathHelper.func_76128_c(d7 - d11 / 2.0D);
            int l = MathHelper.func_76128_c(d8 - d10 / 2.0D);
            int i1 = MathHelper.func_76128_c(d6 + d10 / 2.0D);
            int j1 = MathHelper.func_76128_c(d7 + d11 / 2.0D);
            int k1 = MathHelper.func_76128_c(d8 + d10 / 2.0D);

            for (int l1 = j; l1 <= i1; ++l1)
            {
                double d12 = ((double)l1 + 0.5D - d6) / (d10 / 2.0D);

                if (d12 * d12 < 1.0D)
                {
                    for (int i2 = k; i2 <= j1; ++i2)
                    {
                        double d13 = ((double)i2 + 0.5D - d7) / (d11 / 2.0D);

                        if (d12 * d12 + d13 * d13 < 1.0D)
                        {
                            for (int j2 = l; j2 <= k1; ++j2)
                            {
                                double d14 = ((double)j2 + 0.5D - d8) / (d10 / 2.0D);

                                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D)
                                {
                                    BlockPos blockpos = new BlockPos(l1, i2, j2);

                                    IBlockState state = worldIn.func_180495_p(blockpos);
                                    if (state.func_177230_c().isReplaceableOreGen(state, worldIn, blockpos, this.predicate))
                                    {
                                        worldIn.func_180501_a(blockpos, this.oreBlock, 2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    static class StonePredicate implements Predicate<IBlockState>
        {
            private StonePredicate()
            {
            }

            public boolean apply(IBlockState p_apply_1_)
            {
                if (p_apply_1_ != null && p_apply_1_.func_177230_c() == Blocks.field_150348_b)
                {
                    BlockStone.EnumType blockstone$enumtype = (BlockStone.EnumType)p_apply_1_.func_177229_b(BlockStone.field_176247_a);
                    return blockstone$enumtype.func_190912_e();
                }
                else
                {
                    return false;
                }
            }
        }
}
