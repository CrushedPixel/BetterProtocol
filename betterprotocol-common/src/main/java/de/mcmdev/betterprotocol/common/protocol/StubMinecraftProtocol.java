package de.mcmdev.betterprotocol.common.protocol;

import com.github.steveice10.mc.protocol.packet.ingame.client.*;
import com.github.steveice10.mc.protocol.packet.ingame.client.player.*;
import com.github.steveice10.mc.protocol.packet.ingame.client.window.*;
import com.github.steveice10.mc.protocol.packet.ingame.client.world.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.player.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.entity.spawn.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerDisplayScoreboardPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerScoreboardObjectivePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerTeamPacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.scoreboard.ServerUpdateScorePacket;
import com.github.steveice10.mc.protocol.packet.ingame.server.window.*;
import com.github.steveice10.mc.protocol.packet.ingame.server.world.*;
import com.github.steveice10.packetlib.packet.*;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.lang.reflect.Constructor;

public class StubMinecraftProtocol {

    private final BiMap<Integer, Class<? extends Packet>> incoming = HashBiMap.create();
    private final BiMap<Integer, Class<? extends Packet>> outgoing = HashBiMap.create();

    private final PacketHeader packetHeader = new DefaultPacketHeader();

    public StubMinecraftProtocol() {
        this.registerIncoming(0x00, ClientTeleportConfirmPacket.class);
        this.registerIncoming(0x01, ClientBlockNBTRequestPacket.class);
        this.registerIncoming(0x02, ClientSetDifficultyPacket.class);
        this.registerIncoming(0x03, ClientChatPacket.class);
        this.registerIncoming(0x04, ClientRequestPacket.class);
        this.registerIncoming(0x05, ClientSettingsPacket.class);
        this.registerIncoming(0x06, ClientTabCompletePacket.class);
        this.registerIncoming(0x07, ClientConfirmTransactionPacket.class);
        this.registerIncoming(0x08, ClientClickWindowButtonPacket.class);
        this.registerIncoming(0x09, ClientWindowActionPacket.class);
        this.registerIncoming(0x0A, ClientCloseWindowPacket.class);
        this.registerIncoming(0x0B, ClientPluginMessagePacket.class);
        this.registerIncoming(0x0C, ClientEditBookPacket.class);
        this.registerIncoming(0x0D, ClientEntityNBTRequestPacket.class);
        this.registerIncoming(0x0E, ClientPlayerInteractEntityPacket.class);
        this.registerIncoming(0x0F, ClientGenerateStructuresPacket.class);
        this.registerIncoming(0x10, ClientKeepAlivePacket.class);
        this.registerIncoming(0x11, ClientLockDifficultyPacket.class);
        this.registerIncoming(0x12, ClientPlayerPositionPacket.class);
        this.registerIncoming(0x13, ClientPlayerPositionRotationPacket.class);
        this.registerIncoming(0x14, ClientPlayerRotationPacket.class);
        this.registerIncoming(0x15, ClientPlayerMovementPacket.class);
        this.registerIncoming(0x16, ClientVehicleMovePacket.class);
        this.registerIncoming(0x17, ClientSteerBoatPacket.class);
        this.registerIncoming(0x18, ClientMoveItemToHotbarPacket.class);
        this.registerIncoming(0x19, ClientPrepareCraftingGridPacket.class);
        this.registerIncoming(0x1A, ClientPlayerAbilitiesPacket.class);
        this.registerIncoming(0x1B, ClientPlayerActionPacket.class);
        this.registerIncoming(0x1C, ClientPlayerStatePacket.class);
        this.registerIncoming(0x1D, ClientSteerVehiclePacket.class);
        this.registerIncoming(0x1E, ClientCraftingBookStatePacket.class);
        this.registerIncoming(0x1F, ClientDisplayedRecipePacket.class);
        this.registerIncoming(0x20, ClientRenameItemPacket.class);
        this.registerIncoming(0x21, ClientResourcePackStatusPacket.class);
        this.registerIncoming(0x22, ClientAdvancementTabPacket.class);
        this.registerIncoming(0x23, ClientSelectTradePacket.class);
        this.registerIncoming(0x24, ClientSetBeaconEffectPacket.class);
        this.registerIncoming(0x25, ClientPlayerChangeHeldItemPacket.class);
        this.registerIncoming(0x26, ClientUpdateCommandBlockPacket.class);
        this.registerIncoming(0x27, ClientUpdateCommandBlockMinecartPacket.class);
        this.registerIncoming(0x28, ClientCreativeInventoryActionPacket.class);
        this.registerIncoming(0x29, ClientUpdateJigsawBlockPacket.class);
        this.registerIncoming(0x2A, ClientUpdateStructureBlockPacket.class);
        this.registerIncoming(0x2B, ClientUpdateSignPacket.class);
        this.registerIncoming(0x2C, ClientPlayerSwingArmPacket.class);
        this.registerIncoming(0x2D, ClientSpectatePacket.class);
        this.registerIncoming(0x2E, ClientPlayerPlaceBlockPacket.class);
        this.registerIncoming(0x2F, ClientPlayerUseItemPacket.class);

        this.registerOutgoing(0x00, ServerSpawnEntityPacket.class);
        this.registerOutgoing(0x01, ServerSpawnExpOrbPacket.class);
        this.registerOutgoing(0x02, ServerSpawnLivingEntityPacket.class);
        this.registerOutgoing(0x03, ServerSpawnPaintingPacket.class);
        this.registerOutgoing(0x04, ServerSpawnPlayerPacket.class);
        this.registerOutgoing(0x05, ServerEntityAnimationPacket.class);
        this.registerOutgoing(0x06, ServerStatisticsPacket.class);
        this.registerOutgoing(0x07, ServerPlayerActionAckPacket.class);
        this.registerOutgoing(0x08, ServerBlockBreakAnimPacket.class);
        this.registerOutgoing(0x09, ServerUpdateTileEntityPacket.class);
        this.registerOutgoing(0x0A, ServerBlockValuePacket.class);
        this.registerOutgoing(0x0B, ServerBlockChangePacket.class);
        this.registerOutgoing(0x0C, ServerBossBarPacket.class);
        this.registerOutgoing(0x0D, ServerDifficultyPacket.class);
        this.registerOutgoing(0x0E, ServerChatPacket.class);
        this.registerOutgoing(0x0F, ServerTabCompletePacket.class);
        this.registerOutgoing(0x10, ServerDeclareCommandsPacket.class);
        this.registerOutgoing(0x11, ServerConfirmTransactionPacket.class);
        this.registerOutgoing(0x12, ServerCloseWindowPacket.class);
        this.registerOutgoing(0x13, ServerWindowItemsPacket.class);
        this.registerOutgoing(0x14, ServerWindowPropertyPacket.class);
        this.registerOutgoing(0x15, ServerSetSlotPacket.class);
        this.registerOutgoing(0x16, ServerSetCooldownPacket.class);
        this.registerOutgoing(0x17, ServerPluginMessagePacket.class);
        this.registerOutgoing(0x18, ServerPlaySoundPacket.class);
        this.registerOutgoing(0x19, ServerDisconnectPacket.class);
        this.registerOutgoing(0x1A, ServerEntityStatusPacket.class);
        this.registerOutgoing(0x1B, ServerExplosionPacket.class);
        this.registerOutgoing(0x1C, ServerUnloadChunkPacket.class);
        this.registerOutgoing(0x1D, ServerNotifyClientPacket.class);
        this.registerOutgoing(0x1E, ServerOpenHorseWindowPacket.class);
        this.registerOutgoing(0x1F, ServerKeepAlivePacket.class);
        this.registerOutgoing(0x20, ServerChunkDataPacket.class);
        this.registerOutgoing(0x21, ServerPlayEffectPacket.class);
        this.registerOutgoing(0x22, ServerSpawnParticlePacket.class);
        this.registerOutgoing(0x23, ServerUpdateLightPacket.class);
        this.registerOutgoing(0x24, ServerJoinGamePacket.class);
        this.registerOutgoing(0x25, ServerMapDataPacket.class);
        this.registerOutgoing(0x26, ServerTradeListPacket.class);
        this.registerOutgoing(0x27, ServerEntityPositionPacket.class);
        this.registerOutgoing(0x28, ServerEntityPositionRotationPacket.class);
        this.registerOutgoing(0x29, ServerEntityRotationPacket.class);
        this.registerOutgoing(0x2A, ServerEntityMovementPacket.class);
        this.registerOutgoing(0x2B, ServerVehicleMovePacket.class);
        this.registerOutgoing(0x2C, ServerOpenBookPacket.class);
        this.registerOutgoing(0x2D, ServerOpenWindowPacket.class);
        this.registerOutgoing(0x2E, ServerOpenTileEntityEditorPacket.class);
        this.registerOutgoing(0x2F, ServerPreparedCraftingGridPacket.class);
        this.registerOutgoing(0x30, ServerPlayerAbilitiesPacket.class);
        this.registerOutgoing(0x31, ServerCombatPacket.class);
        this.registerOutgoing(0x32, ServerPlayerListEntryPacket.class);
        this.registerOutgoing(0x33, ServerPlayerFacingPacket.class);
        this.registerOutgoing(0x34, ServerPlayerPositionRotationPacket.class);
        this.registerOutgoing(0x35, ServerUnlockRecipesPacket.class);
        this.registerOutgoing(0x36, ServerEntityDestroyPacket.class);
        this.registerOutgoing(0x37, ServerEntityRemoveEffectPacket.class);
        this.registerOutgoing(0x38, ServerResourcePackSendPacket.class);
        this.registerOutgoing(0x39, ServerRespawnPacket.class);
        this.registerOutgoing(0x3A, ServerEntityHeadLookPacket.class);
        this.registerOutgoing(0x3B, ServerMultiBlockChangePacket.class);
        this.registerOutgoing(0x3C, ServerAdvancementTabPacket.class);
        this.registerOutgoing(0x3D, ServerWorldBorderPacket.class);
        this.registerOutgoing(0x3E, ServerSwitchCameraPacket.class);
        this.registerOutgoing(0x3F, ServerPlayerChangeHeldItemPacket.class);
        this.registerOutgoing(0x40, ServerUpdateViewPositionPacket.class);
        this.registerOutgoing(0x41, ServerUpdateViewDistancePacket.class);
        this.registerOutgoing(0x42, ServerSpawnPositionPacket.class);
        this.registerOutgoing(0x43, ServerDisplayScoreboardPacket.class);
        this.registerOutgoing(0x44, ServerEntityMetadataPacket.class);
        this.registerOutgoing(0x45, ServerEntityAttachPacket.class);
        this.registerOutgoing(0x46, ServerEntityVelocityPacket.class);
        this.registerOutgoing(0x47, ServerEntityEquipmentPacket.class);
        this.registerOutgoing(0x48, ServerPlayerSetExperiencePacket.class);
        this.registerOutgoing(0x49, ServerPlayerHealthPacket.class);
        this.registerOutgoing(0x4A, ServerScoreboardObjectivePacket.class);
        this.registerOutgoing(0x4B, ServerEntitySetPassengersPacket.class);
        this.registerOutgoing(0x4C, ServerTeamPacket.class);
        this.registerOutgoing(0x4D, ServerUpdateScorePacket.class);
        this.registerOutgoing(0x4E, ServerUpdateTimePacket.class);
        this.registerOutgoing(0x4F, ServerTitlePacket.class);
        this.registerOutgoing(0x50, ServerEntitySoundEffectPacket.class);
        this.registerOutgoing(0x51, ServerPlayBuiltinSoundPacket.class);
        this.registerOutgoing(0x52, ServerStopSoundPacket.class);
        this.registerOutgoing(0x53, ServerPlayerListDataPacket.class);
        this.registerOutgoing(0x54, ServerNBTResponsePacket.class);
        this.registerOutgoing(0x55, ServerEntityCollectItemPacket.class);
        this.registerOutgoing(0x56, ServerEntityTeleportPacket.class);
        this.registerOutgoing(0x57, ServerAdvancementsPacket.class);
        this.registerOutgoing(0x58, ServerEntityPropertiesPacket.class);
        this.registerOutgoing(0x59, ServerEntityEffectPacket.class);
        this.registerOutgoing(0x5A, ServerDeclareRecipesPacket.class);
        this.registerOutgoing(0x5B, ServerDeclareTagsPacket.class);
    }

    public PacketHeader getPacketHeader() {
        return packetHeader;
    }

    public final void registerIncoming(int id, Class<? extends Packet> packet) {
        this.incoming.put(id, packet);
    }

    public final void registerOutgoing(int id, Class<? extends Packet> packet) {
        this.outgoing.put(id, packet);
    }

    public final Packet createIncomingPacket(int id) {
        Class<? extends Packet> packet = (Class)this.incoming.get(id);
        if (packet == null) {
            throw new IllegalArgumentException("Invalid packet id: " + id);
        } else {
            try {
                Constructor<? extends Packet> constructor = packet.getDeclaredConstructor();
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }

                return (Packet)constructor.newInstance();
            } catch (NoSuchMethodError var4) {
                throw new IllegalStateException("Packet \"" + id + ", " + packet.getName() + "\" does not have a no-params constructor for instantiation.");
            } catch (Exception var5) {
                throw new IllegalStateException("Failed to instantiate packet \"" + id + ", " + packet.getName() + "\".", var5);
            }
        }
    }

    public final int getIncomingId(Class<? extends Packet> packetClass) {
        Integer packetId = this.incoming.inverse().get(packetClass);
        if (packetId == null) {
            throw new IllegalArgumentException("Unregistered outgoing packet class: " + packetClass.getName());
        } else {
            return packetId;
        }
    }

    public final int getIncomingId(Packet packet) {
        return packet instanceof BufferedPacket ? this.getIncomingId(((BufferedPacket)packet).getPacketClass()) : this.getIncomingId(packet.getClass());
    }

    public final int getOutgoingId(Class<? extends Packet> packetClass) {
        Integer packetId = this.outgoing.inverse().get(packetClass);
        if (packetId == null) {
            throw new IllegalArgumentException("Unregistered outgoing packet class: " + packetClass.getName());
        } else {
            return packetId;
        }
    }

    public final int getOutgoingId(Packet packet) {
        return packet instanceof BufferedPacket ? this.getIncomingId(((BufferedPacket)packet).getPacketClass()) : this.getOutgoingId(packet.getClass());
    }

    public final Packet createOutgoingPacket(int id) {
        Class<? extends Packet> packet = (Class)this.outgoing.get(id);
        if (packet == null) {
            throw new IllegalArgumentException("Invalid packet id: " + id);
        } else {
            try {
                Constructor<? extends Packet> constructor = packet.getDeclaredConstructor();
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }

                return (Packet)constructor.newInstance();
            } catch (NoSuchMethodError var4) {
                throw new IllegalStateException("Packet \"" + id + ", " + packet.getName() + "\" does not have a no-params constructor for instantiation.");
            } catch (Exception var5) {
                throw new IllegalStateException("Failed to instantiate packet \"" + id + ", " + packet.getName() + "\".", var5);
            }
        }
    }
}
