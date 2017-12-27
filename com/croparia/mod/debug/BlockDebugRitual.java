package com.croparia.mod.debug;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDebugRitual extends Block{
	
	private int i = 0;
	
	public BlockDebugRitual() {
		super(Material.field_151578_c);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(i <= 3)
			i++;
		if(i > 3)
			i = 1;
		if(i == 1)
			Minecraft.func_71410_x().field_71439_g.func_71165_d("First Ritual");
		if(i == 2)
			Minecraft.func_71410_x().field_71439_g.func_71165_d("Second Ritual");
		if(i == 3)
			Minecraft.func_71410_x().field_71439_g.func_71165_d("Death Ritual");
		return true;
	}
	
	@Override
	public void func_176199_a(World worldIn, BlockPos pos, Entity entityIn) {

		if(i == 1 && entityIn instanceof EntityPlayer) 
		{
			worldIn.func_175656_a(pos.func_177977_b(), BlockMod.elemental_cobblestone.func_176223_P());
			worldIn.func_175656_a(pos.func_177978_c().func_177974_f(), BlockMod.block_crop_iron.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177978_c().func_177976_e(), BlockMod.block_crop_iron.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177968_d().func_177974_f(), BlockMod.block_crop_iron.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177968_d().func_177976_e(), BlockMod.block_crop_iron.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177964_d(3), BlockMod.block_crop_gold.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177970_e(3), BlockMod.block_crop_gold.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177965_g(3), BlockMod.block_crop_gold.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177985_f(3), BlockMod.block_crop_gold.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2).func_177985_f(2), Blocks.field_150355_j.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2).func_177965_g(2), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2).func_177985_f(2), Blocks.field_150355_j.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2).func_177965_g(2), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177964_d(4).func_177974_f(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177964_d(4).func_177976_e(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177970_e(4).func_177974_f(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177970_e(4).func_177976_e(), Blocks.field_150348_b.func_176203_a(3));
			worldIn.func_175656_a(pos.func_177985_f(4).func_177978_c(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177985_f(4).func_177968_d(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177965_g(4).func_177978_c(), Blocks.field_150348_b.func_176203_a(3)); 
			worldIn.func_175656_a(pos.func_177965_g(4).func_177968_d(), Blocks.field_150348_b.func_176203_a(3));
			worldIn.func_175656_a(pos.func_177964_d(3).func_177965_g(3), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177964_d(3).func_177985_f(3), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177970_e(3).func_177965_g(3), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177970_e(3).func_177985_f(3), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177985_f(3).func_177964_d(3), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177985_f(3).func_177970_e(3), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177965_g(3).func_177964_d(3), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177965_g(3).func_177970_e(3), Blocks.field_150348_b.func_176203_a(5));
								
		}
		//2nd ritual
		if(i == 2 && entityIn instanceof EntityPlayer)
		{
			worldIn.func_175656_a(pos.func_177977_b(), BlockMod.elemental_cobblestone.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), BlockMod.elemental_stone.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), BlockMod.elemental_stone.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), BlockMod.elemental_stone.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), BlockMod.elemental_stone.func_176223_P());						
			worldIn.func_175656_a(pos.func_177964_d(5), BlockMod.block_crop_redstone.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177970_e(5), BlockMod.block_crop_redstone.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177965_g(5), BlockMod.block_crop_redstone.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177985_f(5), BlockMod.block_crop_redstone.func_176203_a(7));	
			worldIn.func_175656_a(pos.func_177964_d(3).func_177985_f(3), BlockMod.elemental_crop.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177964_d(3).func_177965_g(3), BlockMod.elemental_crop.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177970_e(3).func_177985_f(3), BlockMod.elemental_crop.func_176203_a(7)); 
			worldIn.func_175656_a(pos.func_177970_e(3).func_177965_g(3), BlockMod.elemental_crop.func_176203_a(7));
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177976_e(), Blocks.field_150355_j.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177974_f(), Blocks.field_150355_j.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177976_e(), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177974_f(), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177978_c(), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177968_d(), Blocks.field_150355_j.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177978_c(), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177968_d(), Blocks.field_150355_j.func_176223_P());
			worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4), Blocks.field_150348_b.func_176203_a(6)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177964_d(4).func_177985_f(4), BlockMod.elemental_stone.func_176223_P());
			worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(4).func_177985_f(4), Blocks.field_150348_b.func_176203_a(6));
			worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4), Blocks.field_150348_b.func_176203_a(6)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177964_d(4).func_177965_g(4), BlockMod.elemental_stone.func_176223_P());
			worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(4).func_177965_g(4), Blocks.field_150348_b.func_176203_a(6));
			worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4), Blocks.field_150348_b.func_176203_a(6)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177970_e(4).func_177985_f(4), BlockMod.elemental_stone.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(4).func_177985_f(4), Blocks.field_150348_b.func_176203_a(6));
			worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4), Blocks.field_150348_b.func_176203_a(6)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177970_e(4).func_177965_g(4), BlockMod.elemental_stone.func_176223_P()); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(4).func_177965_g(4), Blocks.field_150348_b.func_176203_a(6));
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177964_d(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177964_d(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177974_f(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177976_e(), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5), BlockMod.water_block.func_176223_P());
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177970_e(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177970_e(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177965_g(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177985_f(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177974_f(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177976_e(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5), BlockMod.fire_block.func_176223_P());
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177985_f(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177984_a().func_177985_f(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(2).func_177985_f(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(2).func_177985_f(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5));
			worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177978_c(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177968_d(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5), BlockMod.earth_block.func_176223_P());
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177965_g(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177984_a().func_177965_g(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177965_g(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(2).func_177965_g(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177964_d(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177970_e(2), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177978_c(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177968_d(), Blocks.field_150348_b.func_176203_a(5)); 
			worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5), BlockMod.air_block.func_176223_P());
														
		}
		//Death ritual
		if(i == 3 && entityIn instanceof EntityPlayer)
		{
			IBlockState soulsand = BlockMod.ghost_soulsand.func_176223_P();
			IBlockState elemental = BlockMod.ghost_elemental_cobble.func_176223_P();
			IBlockState slab = BlockMod.ghost_slabstone.func_176223_P();
			IBlockState lave = BlockMod.ghost_lava.func_176223_P();
			IBlockState plant = BlockMod.ghost_death.func_176203_a(7);
			IBlockState nether = BlockMod.ghost_nether.func_176223_P();
			IBlockState nethers = BlockMod.ghost_slabnether.func_176223_P();
			IBlockState nethersu = BlockMod.ghost_slabnetherup.func_176223_P();
			IBlockState magma = BlockMod.ghost_magma.func_176223_P();
				
			worldIn.func_175656_a(pos.func_177977_b(), elemental);
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2), soulsand);
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177965_g(2), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177985_f(2), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177978_c().func_177976_e(), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177978_c().func_177974_f(), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177968_d().func_177976_e(), soulsand);   
			worldIn.func_175656_a(pos.func_177977_b().func_177968_d().func_177974_f(), soulsand);
			worldIn.func_175656_a(pos.func_177978_c(), slab);   
			worldIn.func_175656_a(pos.func_177968_d(), slab);   
			worldIn.func_175656_a(pos.func_177974_f(), slab);   
			worldIn.func_175656_a(pos.func_177976_e(), slab);
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177976_e(), lave);   
			worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177974_f(), lave);
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177976_e(), lave);  
			worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177974_f(), lave);
			worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177968_d(), lave);   
			worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177978_c(), lave);
			worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177968_d(), lave);   
			worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177978_c(), lave);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177976_e(), plant);   
			worldIn.func_175656_a(pos.func_177964_d(5).func_177974_f(), plant);   
			worldIn.func_175656_a(pos.func_177964_d(5), plant);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177976_e(), plant);   
			worldIn.func_175656_a(pos.func_177970_e(5).func_177974_f(), plant);   
			worldIn.func_175656_a(pos.func_177970_e(5), plant);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177968_d(), plant);   
			worldIn.func_175656_a(pos.func_177965_g(5).func_177978_c(), plant);   
			worldIn.func_175656_a(pos.func_177965_g(5), plant);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177968_d(), plant);   
			worldIn.func_175656_a(pos.func_177985_f(5).func_177978_c(), plant);   
			worldIn.func_175656_a(pos.func_177985_f(5), plant);
			worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4), nether);  
			worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177984_a(), elemental);   
			worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177981_b(2), elemental);  
			worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4), nether);  
			worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177984_a(), elemental);  
			worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177981_b(2), elemental); 
			worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4), nether);  
			worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177984_a(), elemental);  
			worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177981_b(2), elemental);  
			worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4), nether);  
			worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177984_a(), elemental);   
			worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177981_b(2), elemental);   
			worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2), nether);	
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(5), nethersu);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(6), magma);
			worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(7), nethers);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(5), nethersu);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(6), magma);
			worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(7), nethers);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2), nether);	
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(5), nethersu);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(6), magma);
			worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(7), nethers);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2), nether);	
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177984_a(), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(2), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(3), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(4), nethers);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177984_a(), nethersu);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(2), magma);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(3), nethers);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(4), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(5), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(6), nether);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(5), nethersu);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(6), magma);
			worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(7), nethers);						
		}
		//Satan ritual
	//	if(i == 4 && playerIn.getHeldItemMainhand().getItem() == ItemMod.seed_crop_redstone)
		//Angel ritual
	/*	if(playerIn.getHeldItemMainhand().getItem() == ItemMod.seed_crop_lapis)
		{
			IBlockState soulsand = Blocks.SEA_LANTERN.getDefaultState();
			IBlockState elemental = BlockMod.elemental_cobblestone.getDefaultState();
			IBlockState slab = Blocks.STONE_SLAB.getStateFromMeta(3);
			IBlockState lave = Blocks.WATER.getDefaultState();
			IBlockState plant = BlockMod.block_crop_totem.getStateFromMeta(7);
			IBlockState nether = Blocks.QUARTZ_BLOCK.getDefaultState();
			IBlockState stone = BlockMod.elemental_stone.getDefaultState();
			IBlockState nethers = Blocks.STONE_SLAB.getStateFromMeta(7);
			IBlockState nethersu = Blocks.STONE_SLAB.getStateFromMeta(15);
			IBlockState magma = Blocks.GLOWSTONE.getDefaultState();
				
			worldIn.setBlockState(pos.down(), elemental);
			worldIn.setBlockState(pos.down().north(2), soulsand);
			worldIn.setBlockState(pos.down().south(2), soulsand);   
			worldIn.setBlockState(pos.down().east(2), soulsand);   
			worldIn.setBlockState(pos.down().west(2), soulsand);   
			worldIn.setBlockState(pos.down().north().west(), soulsand);   
			worldIn.setBlockState(pos.down().north().east(), soulsand);   
			worldIn.setBlockState(pos.down().south().west(), soulsand);   
			worldIn.setBlockState(pos.down().south().east(), soulsand);
			worldIn.setBlockState(pos.north(), slab);   
			worldIn.setBlockState(pos.south(), slab);   
			worldIn.setBlockState(pos.east(), slab);   
			worldIn.setBlockState(pos.west(), slab);
			worldIn.setBlockState(pos.down().north(4).west(), lave);   
			worldIn.setBlockState(pos.down().north(4).east(), lave);
			worldIn.setBlockState(pos.down().south(4).west(), lave);  
			worldIn.setBlockState(pos.down().south(4).east(), lave);
			worldIn.setBlockState(pos.down().east(4).south(), lave);   
			worldIn.setBlockState(pos.down().east(4).north(), lave);
			worldIn.setBlockState(pos.down().west(4).south(), lave);   
			worldIn.setBlockState(pos.down().west(4).north(), lave);
			worldIn.setBlockState(pos.north(5).west(), plant);   
			worldIn.setBlockState(pos.north(5).east(), plant);   
			worldIn.setBlockState(pos.north(5), plant);
			worldIn.setBlockState(pos.south(5).west(), plant);   
			worldIn.setBlockState(pos.south(5).east(), plant);   
			worldIn.setBlockState(pos.south(5), plant);
			worldIn.setBlockState(pos.east(5).south(), plant);   
			worldIn.setBlockState(pos.east(5).north(), plant);   
			worldIn.setBlockState(pos.east(5), plant);
			worldIn.setBlockState(pos.west(5).south(), plant);   
			worldIn.setBlockState(pos.west(5).north(), plant);   
			worldIn.setBlockState(pos.west(5), plant);
			worldIn.setBlockState(pos.north(4).east(4), nether);  
			worldIn.setBlockState(pos.north(4).east(4).up(), elemental);   
			worldIn.setBlockState(pos.north(4).east(4).up(2), elemental);  
			worldIn.setBlockState(pos.north(4).east(4).up(3), nethers);
			worldIn.setBlockState(pos.south(4).east(4), nether);  
			worldIn.setBlockState(pos.south(4).east(4).up(), elemental);  
			worldIn.setBlockState(pos.south(4).east(4).up(2), elemental); 
			worldIn.setBlockState(pos.south(4).east(4).up(3), nethers);
			worldIn.setBlockState(pos.north(4).west(4), nether);  
			worldIn.setBlockState(pos.north(4).west(4).up(), elemental);  
			worldIn.setBlockState(pos.north(4).west(4).up(2), elemental);  
			worldIn.setBlockState(pos.north(4).west(4).up(3), nethers);
			worldIn.setBlockState(pos.south(4).west(4), nether);  
			worldIn.setBlockState(pos.south(4).west(4).up(), elemental);   
			worldIn.setBlockState(pos.south(4).west(4).up(2), elemental);   
			worldIn.setBlockState(pos.south(4).west(4).up(3), nethers);
			worldIn.setBlockState(pos.north(5).east(2), nether);	
			worldIn.setBlockState(pos.north(5).east(2).up(), nether);
			worldIn.setBlockState(pos.north(5).east(2).up(2), nether);
			worldIn.setBlockState(pos.north(5).east(2).up(3), nether);
			worldIn.setBlockState(pos.north(5).east(2).up(4), nethers);
			worldIn.setBlockState(pos.north(5).west(2), nether);
			worldIn.setBlockState(pos.north(5).west(2).up(), nether);
			worldIn.setBlockState(pos.north(5).west(2).up(2), nether);
			worldIn.setBlockState(pos.north(5).west(2).up(3), nether);
			worldIn.setBlockState(pos.north(5).west(2).up(4), nethers);
			worldIn.setBlockState(pos.north(5).east(1).up(), nethersu);
			worldIn.setBlockState(pos.north(5).east(1).up(2), magma);
			worldIn.setBlockState(pos.north(5).east(1).up(3), nethers);
			worldIn.setBlockState(pos.north(5).east(1).up(4), nether);
			worldIn.setBlockState(pos.north(5).east(1).up(5), nether);
			worldIn.setBlockState(pos.north(5).east(1).up(6), nether);
			worldIn.setBlockState(pos.north(5).west(1).up(), nethersu);
			worldIn.setBlockState(pos.north(5).west(1).up(2), magma);
			worldIn.setBlockState(pos.north(5).west(1).up(3), nethers);
			worldIn.setBlockState(pos.north(5).west(1).up(4), nether);
			worldIn.setBlockState(pos.north(5).west(1).up(5), nether);
			worldIn.setBlockState(pos.north(5).west(1).up(6), nether);
			worldIn.setBlockState(pos.north(5).up(5), nethersu);
			worldIn.setBlockState(pos.north(5).up(6), magma);
			worldIn.setBlockState(pos.north(5).up(7), nethers);
			worldIn.setBlockState(pos.south(5).east(2), nether);
			worldIn.setBlockState(pos.south(5).east(2).up(), nether);
			worldIn.setBlockState(pos.south(5).east(2).up(2), nether);
			worldIn.setBlockState(pos.south(5).east(2).up(3), nether);
			worldIn.setBlockState(pos.south(5).east(2).up(4), nethers);
			worldIn.setBlockState(pos.south(5).west(2), nether);
			worldIn.setBlockState(pos.south(5).west(2).up(), nether);
			worldIn.setBlockState(pos.south(5).west(2).up(2), nether);
			worldIn.setBlockState(pos.south(5).west(2).up(3), nether);
			worldIn.setBlockState(pos.south(5).west(2).up(4), nethers);
			worldIn.setBlockState(pos.south(5).east(1).up(), nethersu);
			worldIn.setBlockState(pos.south(5).east(1).up(2), magma);
			worldIn.setBlockState(pos.south(5).east(1).up(3), nethers);
			worldIn.setBlockState(pos.south(5).east(1).up(4), nether);
			worldIn.setBlockState(pos.south(5).east(1).up(5), nether);
			worldIn.setBlockState(pos.south(5).east(1).up(6), nether);
			worldIn.setBlockState(pos.south(5).west(1).up(), nethersu);
			worldIn.setBlockState(pos.south(5).west(1).up(2), magma);
			worldIn.setBlockState(pos.south(5).west(1).up(3), nethers);
			worldIn.setBlockState(pos.south(5).west(1).up(4), nether);
			worldIn.setBlockState(pos.south(5).west(1).up(5), nether);
			worldIn.setBlockState(pos.south(5).west(1).up(6), nether);
			worldIn.setBlockState(pos.south(5).up(5), nethersu);
			worldIn.setBlockState(pos.south(5).up(6), magma);
			worldIn.setBlockState(pos.south(5).up(7), nethers);
			worldIn.setBlockState(pos.east(5).north(2), nether);	
			worldIn.setBlockState(pos.east(5).north(2).up(), nether);
			worldIn.setBlockState(pos.east(5).north(2).up(2), nether);
			worldIn.setBlockState(pos.east(5).north(2).up(3), nether);
			worldIn.setBlockState(pos.east(5).north(2).up(4), nethers);
			worldIn.setBlockState(pos.east(5).south(2), nether);
			worldIn.setBlockState(pos.east(5).south(2).up(), nether);
			worldIn.setBlockState(pos.east(5).south(2).up(2), nether);
			worldIn.setBlockState(pos.east(5).south(2).up(3), nether);
			worldIn.setBlockState(pos.east(5).south(2).up(4), nethers);
			worldIn.setBlockState(pos.east(5).north(1).up(), nethersu);
			worldIn.setBlockState(pos.east(5).north(1).up(2), magma);
			worldIn.setBlockState(pos.east(5).north(1).up(3), nethers);
			worldIn.setBlockState(pos.east(5).north(1).up(4), nether);
			worldIn.setBlockState(pos.east(5).north(1).up(5), nether);
			worldIn.setBlockState(pos.east(5).north(1).up(6), nether);
			worldIn.setBlockState(pos.east(5).south(1).up(), nethersu);
			worldIn.setBlockState(pos.east(5).south(1).up(2), magma);
			worldIn.setBlockState(pos.east(5).south(1).up(3), nethers);
			worldIn.setBlockState(pos.east(5).south(1).up(4), nether);
			worldIn.setBlockState(pos.east(5).south(1).up(5), nether);
			worldIn.setBlockState(pos.east(5).south(1).up(6), nether);
			worldIn.setBlockState(pos.east(5).up(5), nethersu);
			worldIn.setBlockState(pos.east(5).up(6), magma);
			worldIn.setBlockState(pos.east(5).up(7), nethers);
			worldIn.setBlockState(pos.west(5).north(2), nether);	
			worldIn.setBlockState(pos.west(5).north(2).up(), nether);
			worldIn.setBlockState(pos.west(5).north(2).up(2), nether);
			worldIn.setBlockState(pos.west(5).north(2).up(3), nether);
			worldIn.setBlockState(pos.west(5).north(2).up(4), nethers);
			worldIn.setBlockState(pos.west(5).south(2), nether);
			worldIn.setBlockState(pos.west(5).south(2).up(), nether);
			worldIn.setBlockState(pos.west(5).south(2).up(2), nether);
			worldIn.setBlockState(pos.west(5).south(2).up(3), nether);
			worldIn.setBlockState(pos.west(5).south(2).up(4), nethers);
			worldIn.setBlockState(pos.west(5).north(1).up(), nethersu);
			worldIn.setBlockState(pos.west(5).north(1).up(2), magma);
			worldIn.setBlockState(pos.west(5).north(1).up(3), nethers);
			worldIn.setBlockState(pos.west(5).north(1).up(4), nether);
			worldIn.setBlockState(pos.west(5).north(1).up(5), nether);
			worldIn.setBlockState(pos.west(5).north(1).up(6), nether);
			worldIn.setBlockState(pos.west(5).south(1).up(), nethersu);
			worldIn.setBlockState(pos.west(5).south(1).up(2), magma);
			worldIn.setBlockState(pos.west(5).south(1).up(3), nethers);
			worldIn.setBlockState(pos.west(5).south(1).up(4), nether);
			worldIn.setBlockState(pos.west(5).south(1).up(5), nether);
			worldIn.setBlockState(pos.west(5).south(1).up(6), nether);
			worldIn.setBlockState(pos.west(5).up(5), nethersu);
			worldIn.setBlockState(pos.west(5).up(6), magma);
			worldIn.setBlockState(pos.west(5).up(7), nethers);									
			worldIn.setBlockState(pos.up(), BlockMod.reaper_spawn.getDefaultState());
			worldIn.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
		}*/
	}
}
				
