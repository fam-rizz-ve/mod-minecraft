package net.mcreator.utility.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.utility.network.UtilityModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HowPlayerEnterInADimensionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).switch_dimension).equals("true")) {
			if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							" fill ~-1 ~-1 ~-1 ~1 ~1 ~1 minecraft:air");
			}
			if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				if (((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).last_key).equals("flate key")
						|| ((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).last_key).equals("overword key")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~-1 ~ ~-1 ~1 ~ ~1 minecraft:dirt");
				} else if (((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).last_key).equals("nether key")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~-1 ~ ~-1 ~1 ~ ~1 minecraft:netherrack");
				} else if (((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).last_key).equals("end key")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ~-1 ~ ~-1 ~1 ~ ~1 minecraft:end_stone");
				}
			}
			if (((entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new UtilityModVariables.PlayerVariables())).last_key).equals("limbo key")) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("utility", "limbo_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(0, 0, 0), new BlockPos(0, 0, 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(75, 12, 48);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(75, 12, 48, _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof Player _player) {
					_player.getAbilities().mayBuild = false;
					_player.onUpdateAbilities();
				}
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player) {
					_player.getAbilities().invulnerable = true;
					_player.onUpdateAbilities();
				}
			}
		}
		{
			String _setval = "false";
			entity.getCapability(UtilityModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.switch_dimension = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
