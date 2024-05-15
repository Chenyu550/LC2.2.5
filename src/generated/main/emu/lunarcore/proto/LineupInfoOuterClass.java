// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class LineupInfoOuterClass {
  /**
   * Protobuf type {@code LineupInfo}
   */
  public static final class LineupInfo extends ProtoMessage<LineupInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 plane_id = 3;</code>
     */
    private int planeId;

    /**
     * <pre>
     * 6
     * </pre>
     *
     * <code>optional uint32 max_mp = 9;</code>
     */
    private int maxMp;

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 mp = 11;</code>
     */
    private int mp;

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 leader_slot = 12;</code>
     */
    private int leaderSlot;

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 index = 13;</code>
     */
    private int index;

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional .ExtraLineupType extra_lineup_type = 10;</code>
     */
    private int extraLineupType;

    /**
     * <pre>
     * 8
     * </pre>
     *
     * <code>optional bool is_virtual = 2;</code>
     */
    private boolean isVirtual;

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     */
    private final Utf8String name = Utf8String.newEmptyInstance();

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     */
    private final RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> avatarList = RepeatedMessage.newEmptyInstance(LineupAvatarOuterClass.LineupAvatar.getFactory());

    private LineupInfo() {
    }

    /**
     * @return a new empty instance of {@code LineupInfo}
     */
    public static LineupInfo newInstance() {
      return new LineupInfo();
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 plane_id = 3;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 plane_id = 3;</code>
     * @return this
     */
    public LineupInfo clearPlaneId() {
      bitField0_ &= ~0x00000001;
      planeId = 0;
      return this;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 plane_id = 3;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 plane_id = 3;</code>
     * @param value the planeId to set
     * @return this
     */
    public LineupInfo setPlaneId(final int value) {
      bitField0_ |= 0x00000001;
      planeId = value;
      return this;
    }

    /**
     * <pre>
     * 6
     * </pre>
     *
     * <code>optional uint32 max_mp = 9;</code>
     * @return whether the maxMp field is set
     */
    public boolean hasMaxMp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 6
     * </pre>
     *
     * <code>optional uint32 max_mp = 9;</code>
     * @return this
     */
    public LineupInfo clearMaxMp() {
      bitField0_ &= ~0x00000002;
      maxMp = 0;
      return this;
    }

    /**
     * <pre>
     * 6
     * </pre>
     *
     * <code>optional uint32 max_mp = 9;</code>
     * @return the maxMp
     */
    public int getMaxMp() {
      return maxMp;
    }

    /**
     * <pre>
     * 6
     * </pre>
     *
     * <code>optional uint32 max_mp = 9;</code>
     * @param value the maxMp to set
     * @return this
     */
    public LineupInfo setMaxMp(final int value) {
      bitField0_ |= 0x00000002;
      maxMp = value;
      return this;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 mp = 11;</code>
     * @return whether the mp field is set
     */
    public boolean hasMp() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 mp = 11;</code>
     * @return this
     */
    public LineupInfo clearMp() {
      bitField0_ &= ~0x00000004;
      mp = 0;
      return this;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 mp = 11;</code>
     * @return the mp
     */
    public int getMp() {
      return mp;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 mp = 11;</code>
     * @param value the mp to set
     * @return this
     */
    public LineupInfo setMp(final int value) {
      bitField0_ |= 0x00000004;
      mp = value;
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 leader_slot = 12;</code>
     * @return whether the leaderSlot field is set
     */
    public boolean hasLeaderSlot() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 leader_slot = 12;</code>
     * @return this
     */
    public LineupInfo clearLeaderSlot() {
      bitField0_ &= ~0x00000008;
      leaderSlot = 0;
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 leader_slot = 12;</code>
     * @return the leaderSlot
     */
    public int getLeaderSlot() {
      return leaderSlot;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 leader_slot = 12;</code>
     * @param value the leaderSlot to set
     * @return this
     */
    public LineupInfo setLeaderSlot(final int value) {
      bitField0_ |= 0x00000008;
      leaderSlot = value;
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 index = 13;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 index = 13;</code>
     * @return this
     */
    public LineupInfo clearIndex() {
      bitField0_ &= ~0x00000010;
      index = 0;
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 index = 13;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 index = 13;</code>
     * @param value the index to set
     * @return this
     */
    public LineupInfo setIndex(final int value) {
      bitField0_ |= 0x00000010;
      index = value;
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional .ExtraLineupType extra_lineup_type = 10;</code>
     * @return whether the extraLineupType field is set
     */
    public boolean hasExtraLineupType() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional .ExtraLineupType extra_lineup_type = 10;</code>
     * @return this
     */
    public LineupInfo clearExtraLineupType() {
      bitField0_ &= ~0x00000020;
      extraLineupType = 0;
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional .ExtraLineupType extra_lineup_type = 10;</code>
     * @return the extraLineupType
     */
    public ExtraLineupTypeOuterClass.ExtraLineupType getExtraLineupType() {
      return ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(extraLineupType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link LineupInfo#getExtraLineupType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getExtraLineupTypeValue() {
      return extraLineupType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ExtraLineupTypeOuterClass.ExtraLineupType}. Setting an invalid value
     * can cause {@link LineupInfo#getExtraLineupType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public LineupInfo setExtraLineupTypeValue(final int value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value;
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional .ExtraLineupType extra_lineup_type = 10;</code>
     * @param value the extraLineupType to set
     * @return this
     */
    public LineupInfo setExtraLineupType(final ExtraLineupTypeOuterClass.ExtraLineupType value) {
      bitField0_ |= 0x00000020;
      extraLineupType = value.getNumber();
      return this;
    }

    /**
     * <pre>
     * 8
     * </pre>
     *
     * <code>optional bool is_virtual = 2;</code>
     * @return whether the isVirtual field is set
     */
    public boolean hasIsVirtual() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     * 8
     * </pre>
     *
     * <code>optional bool is_virtual = 2;</code>
     * @return this
     */
    public LineupInfo clearIsVirtual() {
      bitField0_ &= ~0x00000040;
      isVirtual = false;
      return this;
    }

    /**
     * <pre>
     * 8
     * </pre>
     *
     * <code>optional bool is_virtual = 2;</code>
     * @return the isVirtual
     */
    public boolean getIsVirtual() {
      return isVirtual;
    }

    /**
     * <pre>
     * 8
     * </pre>
     *
     * <code>optional bool is_virtual = 2;</code>
     * @param value the isVirtual to set
     * @return this
     */
    public LineupInfo setIsVirtual(final boolean value) {
      bitField0_ |= 0x00000040;
      isVirtual = value;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return whether the name field is set
     */
    public boolean hasName() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return this
     */
    public LineupInfo clearName() {
      bitField0_ &= ~0x00000080;
      name.clear();
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return the name
     */
    public String getName() {
      return name.getString();
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return internal {@code Utf8String} representation of name for reading
     */
    public Utf8String getNameBytes() {
      return this.name;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return internal {@code Utf8String} representation of name for modifications
     */
    public Utf8String getMutableNameBytes() {
      bitField0_ |= 0x00000080;
      return this.name;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @param value the name to set
     * @return this
     */
    public LineupInfo setName(final CharSequence value) {
      bitField0_ |= 0x00000080;
      name.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @param value the name to set
     * @return this
     */
    public LineupInfo setName(final Utf8String value) {
      bitField0_ |= 0x00000080;
      name.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     * @return whether the avatarList field is set
     */
    public boolean hasAvatarList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     * @return this
     */
    public LineupInfo clearAvatarList() {
      bitField0_ &= ~0x00000100;
      avatarList.clear();
      return this;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> getAvatarList() {
      return avatarList;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<LineupAvatarOuterClass.LineupAvatar> getMutableAvatarList() {
      bitField0_ |= 0x00000100;
      return avatarList;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     * @param value the avatarList to add
     * @return this
     */
    public LineupInfo addAvatarList(final LineupAvatarOuterClass.LineupAvatar value) {
      bitField0_ |= 0x00000100;
      avatarList.add(value);
      return this;
    }

    /**
     * <pre>
     * 15
     * </pre>
     *
     * <code>repeated .LineupAvatar avatar_list = 7;</code>
     * @param values the avatarList to add
     * @return this
     */
    public LineupInfo addAllAvatarList(final LineupAvatarOuterClass.LineupAvatar... values) {
      bitField0_ |= 0x00000100;
      avatarList.addAll(values);
      return this;
    }

    @Override
    public LineupInfo copyFrom(final LineupInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        planeId = other.planeId;
        maxMp = other.maxMp;
        mp = other.mp;
        leaderSlot = other.leaderSlot;
        index = other.index;
        extraLineupType = other.extraLineupType;
        isVirtual = other.isVirtual;
        name.copyFrom(other.name);
        avatarList.copyFrom(other.avatarList);
      }
      return this;
    }

    @Override
    public LineupInfo mergeFrom(final LineupInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasMaxMp()) {
        setMaxMp(other.maxMp);
      }
      if (other.hasMp()) {
        setMp(other.mp);
      }
      if (other.hasLeaderSlot()) {
        setLeaderSlot(other.leaderSlot);
      }
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasExtraLineupType()) {
        setExtraLineupTypeValue(other.extraLineupType);
      }
      if (other.hasIsVirtual()) {
        setIsVirtual(other.isVirtual);
      }
      if (other.hasName()) {
        getMutableNameBytes().copyFrom(other.name);
      }
      if (other.hasAvatarList()) {
        getMutableAvatarList().addAll(other.avatarList);
      }
      return this;
    }

    @Override
    public LineupInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      planeId = 0;
      maxMp = 0;
      mp = 0;
      leaderSlot = 0;
      index = 0;
      extraLineupType = 0;
      isVirtual = false;
      name.clear();
      avatarList.clear();
      return this;
    }

    @Override
    public LineupInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      avatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LineupInfo)) {
        return false;
      }
      LineupInfo other = (LineupInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasMaxMp() || maxMp == other.maxMp)
        && (!hasMp() || mp == other.mp)
        && (!hasLeaderSlot() || leaderSlot == other.leaderSlot)
        && (!hasIndex() || index == other.index)
        && (!hasExtraLineupType() || extraLineupType == other.extraLineupType)
        && (!hasIsVirtual() || isVirtual == other.isVirtual)
        && (!hasName() || name.equals(other.name))
        && (!hasAvatarList() || avatarList.equals(other.avatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(isVirtual);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 42);
        output.writeStringNoTag(name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < avatarList.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(avatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(leaderSlot);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(extraLineupType);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * avatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(avatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LineupInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // maxMp
            maxMp = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // mp
            mp = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // leaderSlot
            leaderSlot = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // extraLineupType
            final int value = input.readInt32();
            if (ExtraLineupTypeOuterClass.ExtraLineupType.forNumber(value) != null) {
              extraLineupType = value;
              bitField0_ |= 0x00000020;
            }
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // isVirtual
            isVirtual = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // name
            input.readString(name);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // avatarList
            tag = input.readRepeatedMessage(avatarList, tag);
            bitField0_ |= 0x00000100;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.maxMp, maxMp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mp, mp);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.leaderSlot, leaderSlot);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeEnum(FieldNames.extraLineupType, extraLineupType, ExtraLineupTypeOuterClass.ExtraLineupType.converter());
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isVirtual, isVirtual);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.name, name);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.avatarList, avatarList);
      }
      output.endObject();
    }

    @Override
    public LineupInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 103671335:
          case -1081138594: {
            if (input.isAtField(FieldNames.maxMp)) {
              if (!input.trySkipNullValue()) {
                maxMp = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3491: {
            if (input.isAtField(FieldNames.mp)) {
              if (!input.trySkipNullValue()) {
                mp = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1191442087:
          case -1708713100: {
            if (input.isAtField(FieldNames.leaderSlot)) {
              if (!input.trySkipNullValue()) {
                leaderSlot = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -468135527:
          case -1144475077: {
            if (input.isAtField(FieldNames.extraLineupType)) {
              if (!input.trySkipNullValue()) {
                final ExtraLineupTypeOuterClass.ExtraLineupType value = input.readEnum(ExtraLineupTypeOuterClass.ExtraLineupType.converter());
                if (value != null) {
                  extraLineupType = value.getNumber();
                  bitField0_ |= 0x00000020;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -113613183:
          case 1966475510: {
            if (input.isAtField(FieldNames.isVirtual)) {
              if (!input.trySkipNullValue()) {
                isVirtual = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3373707: {
            if (input.isAtField(FieldNames.name)) {
              if (!input.trySkipNullValue()) {
                input.readString(name);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403402345:
          case 397055940: {
            if (input.isAtField(FieldNames.avatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(avatarList);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public LineupInfo clone() {
      return new LineupInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LineupInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LineupInfo(), data).checkInitialized();
    }

    public static LineupInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupInfo(), input).checkInitialized();
    }

    public static LineupInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating LineupInfo messages
     */
    public static MessageFactory<LineupInfo> getFactory() {
      return LineupInfoFactory.INSTANCE;
    }

    private enum LineupInfoFactory implements MessageFactory<LineupInfo> {
      INSTANCE;

      @Override
      public LineupInfo create() {
        return LineupInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName maxMp = FieldName.forField("maxMp", "max_mp");

      static final FieldName mp = FieldName.forField("mp");

      static final FieldName leaderSlot = FieldName.forField("leaderSlot", "leader_slot");

      static final FieldName index = FieldName.forField("index");

      static final FieldName extraLineupType = FieldName.forField("extraLineupType", "extra_lineup_type");

      static final FieldName isVirtual = FieldName.forField("isVirtual", "is_virtual");

      static final FieldName name = FieldName.forField("name");

      static final FieldName avatarList = FieldName.forField("avatarList", "avatar_list");
    }
  }
}
