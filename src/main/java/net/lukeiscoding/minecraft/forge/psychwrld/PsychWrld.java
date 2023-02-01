package net.lukeiscoding.minecraft.forge.psychwrld;
/*
Copyright (C) 2023  Luke Is Coding
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PsychWrld.MOD_ID)
public class PsychWrld {

    // create a string to reference our mod id
    public static final String MOD_ID = "psychwrld";

    // create a string to reference our mod version
    public static final String MOD_VERSION = "0.0.1-alpha";

    // get a logger
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public PsychWrld() {
        // register event listeners
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    // create event listeners

    public void commonSetup(final FMLCommonSetupEvent event) {
    }

    public void clientSetup(final FMLClientSetupEvent event) {
    }
}
