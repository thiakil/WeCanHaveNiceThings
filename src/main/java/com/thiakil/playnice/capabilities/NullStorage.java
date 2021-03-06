package com.thiakil.playnice.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class NullStorage<T> implements IStorage<T> {

	@Override
	public NBTBase writeNBT(Capability<T> capability, T instance, EnumFacing side) {
		return new NBTTagCompound();
	}

	@Override
	public void readNBT(Capability<T> capability, T instance, EnumFacing side, NBTBase nbt) {
		//nothing to do here
	}

}
