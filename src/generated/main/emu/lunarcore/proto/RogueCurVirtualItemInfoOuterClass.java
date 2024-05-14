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

public final class RogueCurVirtualItemInfoOuterClass {
  /**
   * Protobuf type {@code RogueCurVirtualItemInfo}
   */
  public static final class RogueCurVirtualItemInfo extends ProtoMessage<RogueCurVirtualItemInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  idk, isnt being used by official server
     * </pre>
     *
     * <code>optional uint32 cur_rogue_ability_point = 1;</code>
     */
    private int curRogueAbilityPoint;

    /**
     * <code>optional uint32 cur_rogue_coin = 12;</code>
     */
    private int curRogueCoin;

    private RogueCurVirtualItemInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueCurVirtualItemInfo}
     */
    public static RogueCurVirtualItemInfo newInstance() {
      return new RogueCurVirtualItemInfo();
    }

    /**
     * <pre>
     *  idk, isnt being used by official server
     * </pre>
     *
     * <code>optional uint32 cur_rogue_ability_point = 1;</code>
     * @return whether the curRogueAbilityPoint field is set
     */
    public boolean hasCurRogueAbilityPoint() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  idk, isnt being used by official server
     * </pre>
     *
     * <code>optional uint32 cur_rogue_ability_point = 1;</code>
     * @return this
     */
    public RogueCurVirtualItemInfo clearCurRogueAbilityPoint() {
      bitField0_ &= ~0x00000001;
      curRogueAbilityPoint = 0;
      return this;
    }

    /**
     * <pre>
     *  idk, isnt being used by official server
     * </pre>
     *
     * <code>optional uint32 cur_rogue_ability_point = 1;</code>
     * @return the curRogueAbilityPoint
     */
    public int getCurRogueAbilityPoint() {
      return curRogueAbilityPoint;
    }

    /**
     * <pre>
     *  idk, isnt being used by official server
     * </pre>
     *
     * <code>optional uint32 cur_rogue_ability_point = 1;</code>
     * @param value the curRogueAbilityPoint to set
     * @return this
     */
    public RogueCurVirtualItemInfo setCurRogueAbilityPoint(final int value) {
      bitField0_ |= 0x00000001;
      curRogueAbilityPoint = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_rogue_coin = 12;</code>
     * @return whether the curRogueCoin field is set
     */
    public boolean hasCurRogueCoin() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cur_rogue_coin = 12;</code>
     * @return this
     */
    public RogueCurVirtualItemInfo clearCurRogueCoin() {
      bitField0_ &= ~0x00000002;
      curRogueCoin = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_rogue_coin = 12;</code>
     * @return the curRogueCoin
     */
    public int getCurRogueCoin() {
      return curRogueCoin;
    }

    /**
     * <code>optional uint32 cur_rogue_coin = 12;</code>
     * @param value the curRogueCoin to set
     * @return this
     */
    public RogueCurVirtualItemInfo setCurRogueCoin(final int value) {
      bitField0_ |= 0x00000002;
      curRogueCoin = value;
      return this;
    }

    @Override
    public RogueCurVirtualItemInfo copyFrom(final RogueCurVirtualItemInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curRogueAbilityPoint = other.curRogueAbilityPoint;
        curRogueCoin = other.curRogueCoin;
      }
      return this;
    }

    @Override
    public RogueCurVirtualItemInfo mergeFrom(final RogueCurVirtualItemInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurRogueAbilityPoint()) {
        setCurRogueAbilityPoint(other.curRogueAbilityPoint);
      }
      if (other.hasCurRogueCoin()) {
        setCurRogueCoin(other.curRogueCoin);
      }
      return this;
    }

    @Override
    public RogueCurVirtualItemInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curRogueAbilityPoint = 0;
      curRogueCoin = 0;
      return this;
    }

    @Override
    public RogueCurVirtualItemInfo clearQuick() {
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
      if (!(o instanceof RogueCurVirtualItemInfo)) {
        return false;
      }
      RogueCurVirtualItemInfo other = (RogueCurVirtualItemInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasCurRogueAbilityPoint() || curRogueAbilityPoint == other.curRogueAbilityPoint)
        && (!hasCurRogueCoin() || curRogueCoin == other.curRogueCoin);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(curRogueAbilityPoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(curRogueCoin);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curRogueAbilityPoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curRogueCoin);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCurVirtualItemInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // curRogueAbilityPoint
            curRogueAbilityPoint = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // curRogueCoin
            curRogueCoin = input.readUInt32();
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
        output.writeUInt32(FieldNames.curRogueAbilityPoint, curRogueAbilityPoint);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.curRogueCoin, curRogueCoin);
      }
      output.endObject();
    }

    @Override
    public RogueCurVirtualItemInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1423162144:
          case 1565581335: {
            if (input.isAtField(FieldNames.curRogueAbilityPoint)) {
              if (!input.trySkipNullValue()) {
                curRogueAbilityPoint = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1836271915:
          case -979997387: {
            if (input.isAtField(FieldNames.curRogueCoin)) {
              if (!input.trySkipNullValue()) {
                curRogueCoin = input.readUInt32();
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
    public RogueCurVirtualItemInfo clone() {
      return new RogueCurVirtualItemInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCurVirtualItemInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCurVirtualItemInfo(), data).checkInitialized();
    }

    public static RogueCurVirtualItemInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCurVirtualItemInfo(), input).checkInitialized();
    }

    public static RogueCurVirtualItemInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCurVirtualItemInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCurVirtualItemInfo messages
     */
    public static MessageFactory<RogueCurVirtualItemInfo> getFactory() {
      return RogueCurVirtualItemInfoFactory.INSTANCE;
    }

    private enum RogueCurVirtualItemInfoFactory implements MessageFactory<RogueCurVirtualItemInfo> {
      INSTANCE;

      @Override
      public RogueCurVirtualItemInfo create() {
        return RogueCurVirtualItemInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curRogueAbilityPoint = FieldName.forField("curRogueAbilityPoint", "cur_rogue_ability_point");

      static final FieldName curRogueCoin = FieldName.forField("curRogueCoin", "cur_rogue_coin");
    }
  }
}
