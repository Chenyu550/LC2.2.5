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
import us.hebi.quickbuf.ProtoUtil;

public final class RotateMapCsReqOuterClass {
  /**
   * Protobuf type {@code RotateMapCsReq}
   */
  public static final class RotateMapCsReq extends ProtoMessage<RotateMapCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 5;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 unk_int = 7;</code>
     */
    private int unkInt;

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     */
    private final OCNLBAGJONP rogueMap = OCNLBAGJONP.newInstance();

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    private RotateMapCsReq() {
    }

    /**
     * @return a new empty instance of {@code RotateMapCsReq}
     */
    public static RotateMapCsReq newInstance() {
      return new RotateMapCsReq();
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return this
     */
    public RotateMapCsReq clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @param value the groupId to set
     * @return this
     */
    public RotateMapCsReq setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 unk_int = 7;</code>
     * @return whether the unkInt field is set
     */
    public boolean hasUnkInt() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 unk_int = 7;</code>
     * @return this
     */
    public RotateMapCsReq clearUnkInt() {
      bitField0_ &= ~0x00000002;
      unkInt = 0;
      return this;
    }

    /**
     * <code>optional uint32 unk_int = 7;</code>
     * @return the unkInt
     */
    public int getUnkInt() {
      return unkInt;
    }

    /**
     * <code>optional uint32 unk_int = 7;</code>
     * @param value the unkInt to set
     * @return this
     */
    public RotateMapCsReq setUnkInt(final int value) {
      bitField0_ |= 0x00000002;
      unkInt = value;
      return this;
    }

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     * @return whether the rogueMap field is set
     */
    public boolean hasRogueMap() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     * @return this
     */
    public RotateMapCsReq clearRogueMap() {
      bitField0_ &= ~0x00000004;
      rogueMap.clear();
      return this;
    }

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueMap()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public OCNLBAGJONP getRogueMap() {
      return rogueMap;
    }

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public OCNLBAGJONP getMutableRogueMap() {
      bitField0_ |= 0x00000004;
      return rogueMap;
    }

    /**
     * <code>optional .RotateMapCsReq.OCNLBAGJONP rogue_map = 6;</code>
     * @param value the rogueMap to set
     * @return this
     */
    public RotateMapCsReq setRogueMap(final OCNLBAGJONP value) {
      bitField0_ |= 0x00000004;
      rogueMap.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @return this
     */
    public RotateMapCsReq clearMotion() {
      bitField0_ &= ~0x00000008;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000008;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 12;</code>
     * @param value the motion to set
     * @return this
     */
    public RotateMapCsReq setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000008;
      motion.copyFrom(value);
      return this;
    }

    @Override
    public RotateMapCsReq copyFrom(final RotateMapCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        unkInt = other.unkInt;
        rogueMap.copyFrom(other.rogueMap);
        motion.copyFrom(other.motion);
      }
      return this;
    }

    @Override
    public RotateMapCsReq mergeFrom(final RotateMapCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasUnkInt()) {
        setUnkInt(other.unkInt);
      }
      if (other.hasRogueMap()) {
        getMutableRogueMap().mergeFrom(other.rogueMap);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      return this;
    }

    @Override
    public RotateMapCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      unkInt = 0;
      rogueMap.clear();
      motion.clear();
      return this;
    }

    @Override
    public RotateMapCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMap.clearQuick();
      motion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RotateMapCsReq)) {
        return false;
      }
      RotateMapCsReq other = (RotateMapCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasUnkInt() || unkInt == other.unkInt)
        && (!hasRogueMap() || rogueMap.equals(other.rogueMap))
        && (!hasMotion() || motion.equals(other.motion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(rogueMap);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(motion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueMap);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RotateMapCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // unkInt
            unkInt = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // rogueMap
            input.readMessage(rogueMap);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.unkInt, unkInt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueMap, rogueMap);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      output.endObject();
    }

    @Override
    public RotateMapCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -840508003:
          case -285293790: {
            if (input.isAtField(FieldNames.unkInt)) {
              if (!input.trySkipNullValue()) {
                unkInt = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -394483422:
          case 656463223: {
            if (input.isAtField(FieldNames.rogueMap)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueMap);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000008;
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
    public RotateMapCsReq clone() {
      return new RotateMapCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RotateMapCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RotateMapCsReq(), data).checkInitialized();
    }

    public static RotateMapCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotateMapCsReq(), input).checkInitialized();
    }

    public static RotateMapCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotateMapCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating RotateMapCsReq messages
     */
    public static MessageFactory<RotateMapCsReq> getFactory() {
      return RotateMapCsReqFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code OJMHCNLOLPH}
     */
    public static final class OJMHCNLOLPH extends ProtoMessage<OJMHCNLOLPH> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional float x = 8;</code>
       */
      private float x;

      /**
       * <code>optional float z = 10;</code>
       */
      private float z;

      /**
       * <code>optional float y = 11;</code>
       */
      private float y;

      /**
       * <code>optional float GHDEDODMHLD = 12;</code>
       */
      private float gHDEDODMHLD;

      private OJMHCNLOLPH() {
      }

      /**
       * @return a new empty instance of {@code OJMHCNLOLPH}
       */
      public static OJMHCNLOLPH newInstance() {
        return new OJMHCNLOLPH();
      }

      /**
       * <code>optional float x = 8;</code>
       * @return whether the x field is set
       */
      public boolean hasX() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional float x = 8;</code>
       * @return this
       */
      public OJMHCNLOLPH clearX() {
        bitField0_ &= ~0x00000001;
        x = 0F;
        return this;
      }

      /**
       * <code>optional float x = 8;</code>
       * @return the x
       */
      public float getX() {
        return x;
      }

      /**
       * <code>optional float x = 8;</code>
       * @param value the x to set
       * @return this
       */
      public OJMHCNLOLPH setX(final float value) {
        bitField0_ |= 0x00000001;
        x = value;
        return this;
      }

      /**
       * <code>optional float z = 10;</code>
       * @return whether the z field is set
       */
      public boolean hasZ() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional float z = 10;</code>
       * @return this
       */
      public OJMHCNLOLPH clearZ() {
        bitField0_ &= ~0x00000002;
        z = 0F;
        return this;
      }

      /**
       * <code>optional float z = 10;</code>
       * @return the z
       */
      public float getZ() {
        return z;
      }

      /**
       * <code>optional float z = 10;</code>
       * @param value the z to set
       * @return this
       */
      public OJMHCNLOLPH setZ(final float value) {
        bitField0_ |= 0x00000002;
        z = value;
        return this;
      }

      /**
       * <code>optional float y = 11;</code>
       * @return whether the y field is set
       */
      public boolean hasY() {
        return (bitField0_ & 0x00000004) != 0;
      }

      /**
       * <code>optional float y = 11;</code>
       * @return this
       */
      public OJMHCNLOLPH clearY() {
        bitField0_ &= ~0x00000004;
        y = 0F;
        return this;
      }

      /**
       * <code>optional float y = 11;</code>
       * @return the y
       */
      public float getY() {
        return y;
      }

      /**
       * <code>optional float y = 11;</code>
       * @param value the y to set
       * @return this
       */
      public OJMHCNLOLPH setY(final float value) {
        bitField0_ |= 0x00000004;
        y = value;
        return this;
      }

      /**
       * <code>optional float GHDEDODMHLD = 12;</code>
       * @return whether the gHDEDODMHLD field is set
       */
      public boolean hasGHDEDODMHLD() {
        return (bitField0_ & 0x00000008) != 0;
      }

      /**
       * <code>optional float GHDEDODMHLD = 12;</code>
       * @return this
       */
      public OJMHCNLOLPH clearGHDEDODMHLD() {
        bitField0_ &= ~0x00000008;
        gHDEDODMHLD = 0F;
        return this;
      }

      /**
       * <code>optional float GHDEDODMHLD = 12;</code>
       * @return the gHDEDODMHLD
       */
      public float getGHDEDODMHLD() {
        return gHDEDODMHLD;
      }

      /**
       * <code>optional float GHDEDODMHLD = 12;</code>
       * @param value the gHDEDODMHLD to set
       * @return this
       */
      public OJMHCNLOLPH setGHDEDODMHLD(final float value) {
        bitField0_ |= 0x00000008;
        gHDEDODMHLD = value;
        return this;
      }

      @Override
      public OJMHCNLOLPH copyFrom(final OJMHCNLOLPH other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          x = other.x;
          z = other.z;
          y = other.y;
          gHDEDODMHLD = other.gHDEDODMHLD;
        }
        return this;
      }

      @Override
      public OJMHCNLOLPH mergeFrom(final OJMHCNLOLPH other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasX()) {
          setX(other.x);
        }
        if (other.hasZ()) {
          setZ(other.z);
        }
        if (other.hasY()) {
          setY(other.y);
        }
        if (other.hasGHDEDODMHLD()) {
          setGHDEDODMHLD(other.gHDEDODMHLD);
        }
        return this;
      }

      @Override
      public OJMHCNLOLPH clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        x = 0F;
        z = 0F;
        y = 0F;
        gHDEDODMHLD = 0F;
        return this;
      }

      @Override
      public OJMHCNLOLPH clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof OJMHCNLOLPH)) {
          return false;
        }
        OJMHCNLOLPH other = (OJMHCNLOLPH) o;
        return bitField0_ == other.bitField0_
          && (!hasX() || ProtoUtil.isEqual(x, other.x))
          && (!hasZ() || ProtoUtil.isEqual(z, other.z))
          && (!hasY() || ProtoUtil.isEqual(y, other.y))
          && (!hasGHDEDODMHLD() || ProtoUtil.isEqual(gHDEDODMHLD, other.gHDEDODMHLD));
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 69);
          output.writeFloatNoTag(x);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 85);
          output.writeFloatNoTag(z);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeRawByte((byte) 93);
          output.writeFloatNoTag(y);
        }
        if ((bitField0_ & 0x00000008) != 0) {
          output.writeRawByte((byte) 101);
          output.writeFloatNoTag(gHDEDODMHLD);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 5;
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 5;
        }
        if ((bitField0_ & 0x00000004) != 0) {
          size += 5;
        }
        if ((bitField0_ & 0x00000008) != 0) {
          size += 5;
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public OJMHCNLOLPH mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 69: {
              // x
              x = input.readFloat();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 85) {
                break;
              }
            }
            case 85: {
              // z
              z = input.readFloat();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 93) {
                break;
              }
            }
            case 93: {
              // y
              y = input.readFloat();
              bitField0_ |= 0x00000004;
              tag = input.readTag();
              if (tag != 101) {
                break;
              }
            }
            case 101: {
              // gHDEDODMHLD
              gHDEDODMHLD = input.readFloat();
              bitField0_ |= 0x00000008;
              tag = input.readTag();
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
          output.writeFloat(FieldNames.x, x);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeFloat(FieldNames.z, z);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeFloat(FieldNames.y, y);
        }
        if ((bitField0_ & 0x00000008) != 0) {
          output.writeFloat(FieldNames.gHDEDODMHLD, gHDEDODMHLD);
        }
        output.endObject();
      }

      @Override
      public OJMHCNLOLPH mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 120: {
              if (input.isAtField(FieldNames.x)) {
                if (!input.trySkipNullValue()) {
                  x = input.readFloat();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 122: {
              if (input.isAtField(FieldNames.z)) {
                if (!input.trySkipNullValue()) {
                  z = input.readFloat();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 121: {
              if (input.isAtField(FieldNames.y)) {
                if (!input.trySkipNullValue()) {
                  y = input.readFloat();
                  bitField0_ |= 0x00000004;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -104012406: {
              if (input.isAtField(FieldNames.gHDEDODMHLD)) {
                if (!input.trySkipNullValue()) {
                  gHDEDODMHLD = input.readFloat();
                  bitField0_ |= 0x00000008;
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
      public OJMHCNLOLPH clone() {
        return new OJMHCNLOLPH().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static OJMHCNLOLPH parseFrom(final byte[] data) throws InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new OJMHCNLOLPH(), data).checkInitialized();
      }

      public static OJMHCNLOLPH parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new OJMHCNLOLPH(), input).checkInitialized();
      }

      public static OJMHCNLOLPH parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new OJMHCNLOLPH(), input).checkInitialized();
      }

      /**
       * @return factory for creating OJMHCNLOLPH messages
       */
      public static MessageFactory<OJMHCNLOLPH> getFactory() {
        return OJMHCNLOLPHFactory.INSTANCE;
      }

      private enum OJMHCNLOLPHFactory implements MessageFactory<OJMHCNLOLPH> {
        INSTANCE;

        @Override
        public OJMHCNLOLPH create() {
          return OJMHCNLOLPH.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName x = FieldName.forField("x");

        static final FieldName z = FieldName.forField("z");

        static final FieldName y = FieldName.forField("y");

        static final FieldName gHDEDODMHLD = FieldName.forField("GHDEDODMHLD");
      }
    }

    /**
     * Protobuf type {@code OCNLBAGJONP}
     */
    public static final class OCNLBAGJONP extends ProtoMessage<OCNLBAGJONP> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       */
      private final VectorOuterClass.Vector iENLJAFIBOL = VectorOuterClass.Vector.newInstance();

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       */
      private final OJMHCNLOLPH jBCABOABIDI = OJMHCNLOLPH.newInstance();

      private OCNLBAGJONP() {
      }

      /**
       * @return a new empty instance of {@code OCNLBAGJONP}
       */
      public static OCNLBAGJONP newInstance() {
        return new OCNLBAGJONP();
      }

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       * @return whether the iENLJAFIBOL field is set
       */
      public boolean hasIENLJAFIBOL() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       * @return this
       */
      public OCNLBAGJONP clearIENLJAFIBOL() {
        bitField0_ &= ~0x00000001;
        iENLJAFIBOL.clear();
        return this;
      }

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       *
       * This method returns the internal storage object without modifying any has state.
       * The returned object should not be modified and be treated as read-only.
       *
       * Use {@link #getMutableIENLJAFIBOL()} if you want to modify it.
       *
       * @return internal storage object for reading
       */
      public VectorOuterClass.Vector getIENLJAFIBOL() {
        return iENLJAFIBOL;
      }

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       *
       * This method returns the internal storage object and sets the corresponding
       * has state. The returned object will become part of this message and its
       * contents may be modified as long as the has state is not cleared.
       *
       * @return internal storage object for modifications
       */
      public VectorOuterClass.Vector getMutableIENLJAFIBOL() {
        bitField0_ |= 0x00000001;
        return iENLJAFIBOL;
      }

      /**
       * <code>optional .Vector IENLJAFIBOL = 2;</code>
       * @param value the iENLJAFIBOL to set
       * @return this
       */
      public OCNLBAGJONP setIENLJAFIBOL(final VectorOuterClass.Vector value) {
        bitField0_ |= 0x00000001;
        iENLJAFIBOL.copyFrom(value);
        return this;
      }

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       * @return whether the jBCABOABIDI field is set
       */
      public boolean hasJBCABOABIDI() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       * @return this
       */
      public OCNLBAGJONP clearJBCABOABIDI() {
        bitField0_ &= ~0x00000002;
        jBCABOABIDI.clear();
        return this;
      }

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       *
       * This method returns the internal storage object without modifying any has state.
       * The returned object should not be modified and be treated as read-only.
       *
       * Use {@link #getMutableJBCABOABIDI()} if you want to modify it.
       *
       * @return internal storage object for reading
       */
      public OJMHCNLOLPH getJBCABOABIDI() {
        return jBCABOABIDI;
      }

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       *
       * This method returns the internal storage object and sets the corresponding
       * has state. The returned object will become part of this message and its
       * contents may be modified as long as the has state is not cleared.
       *
       * @return internal storage object for modifications
       */
      public OJMHCNLOLPH getMutableJBCABOABIDI() {
        bitField0_ |= 0x00000002;
        return jBCABOABIDI;
      }

      /**
       * <code>optional .RotateMapCsReq.OJMHCNLOLPH JBCABOABIDI = 9;</code>
       * @param value the jBCABOABIDI to set
       * @return this
       */
      public OCNLBAGJONP setJBCABOABIDI(final OJMHCNLOLPH value) {
        bitField0_ |= 0x00000002;
        jBCABOABIDI.copyFrom(value);
        return this;
      }

      @Override
      public OCNLBAGJONP copyFrom(final OCNLBAGJONP other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          iENLJAFIBOL.copyFrom(other.iENLJAFIBOL);
          jBCABOABIDI.copyFrom(other.jBCABOABIDI);
        }
        return this;
      }

      @Override
      public OCNLBAGJONP mergeFrom(final OCNLBAGJONP other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasIENLJAFIBOL()) {
          getMutableIENLJAFIBOL().mergeFrom(other.iENLJAFIBOL);
        }
        if (other.hasJBCABOABIDI()) {
          getMutableJBCABOABIDI().mergeFrom(other.jBCABOABIDI);
        }
        return this;
      }

      @Override
      public OCNLBAGJONP clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        iENLJAFIBOL.clear();
        jBCABOABIDI.clear();
        return this;
      }

      @Override
      public OCNLBAGJONP clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        iENLJAFIBOL.clearQuick();
        jBCABOABIDI.clearQuick();
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof OCNLBAGJONP)) {
          return false;
        }
        OCNLBAGJONP other = (OCNLBAGJONP) o;
        return bitField0_ == other.bitField0_
          && (!hasIENLJAFIBOL() || iENLJAFIBOL.equals(other.iENLJAFIBOL))
          && (!hasJBCABOABIDI() || jBCABOABIDI.equals(other.jBCABOABIDI));
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(iENLJAFIBOL);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(jBCABOABIDI);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeMessageSizeNoTag(iENLJAFIBOL);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeMessageSizeNoTag(jBCABOABIDI);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public OCNLBAGJONP mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 18: {
              // iENLJAFIBOL
              input.readMessage(iENLJAFIBOL);
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 74) {
                break;
              }
            }
            case 74: {
              // jBCABOABIDI
              input.readMessage(jBCABOABIDI);
              bitField0_ |= 0x00000002;
              tag = input.readTag();
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
          output.writeMessage(FieldNames.iENLJAFIBOL, iENLJAFIBOL);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeMessage(FieldNames.jBCABOABIDI, jBCABOABIDI);
        }
        output.endObject();
      }

      @Override
      public OCNLBAGJONP mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 237656587: {
              if (input.isAtField(FieldNames.iENLJAFIBOL)) {
                if (!input.trySkipNullValue()) {
                  input.readMessage(iENLJAFIBOL);
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 1627224650: {
              if (input.isAtField(FieldNames.jBCABOABIDI)) {
                if (!input.trySkipNullValue()) {
                  input.readMessage(jBCABOABIDI);
                  bitField0_ |= 0x00000002;
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
      public OCNLBAGJONP clone() {
        return new OCNLBAGJONP().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static OCNLBAGJONP parseFrom(final byte[] data) throws InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new OCNLBAGJONP(), data).checkInitialized();
      }

      public static OCNLBAGJONP parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new OCNLBAGJONP(), input).checkInitialized();
      }

      public static OCNLBAGJONP parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new OCNLBAGJONP(), input).checkInitialized();
      }

      /**
       * @return factory for creating OCNLBAGJONP messages
       */
      public static MessageFactory<OCNLBAGJONP> getFactory() {
        return OCNLBAGJONPFactory.INSTANCE;
      }

      private enum OCNLBAGJONPFactory implements MessageFactory<OCNLBAGJONP> {
        INSTANCE;

        @Override
        public OCNLBAGJONP create() {
          return OCNLBAGJONP.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName iENLJAFIBOL = FieldName.forField("IENLJAFIBOL");

        static final FieldName jBCABOABIDI = FieldName.forField("JBCABOABIDI");
      }
    }

    private enum RotateMapCsReqFactory implements MessageFactory<RotateMapCsReq> {
      INSTANCE;

      @Override
      public RotateMapCsReq create() {
        return RotateMapCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName unkInt = FieldName.forField("unkInt", "unk_int");

      static final FieldName rogueMap = FieldName.forField("rogueMap", "rogue_map");

      static final FieldName motion = FieldName.forField("motion");
    }
  }
}
