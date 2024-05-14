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
import us.hebi.quickbuf.RepeatedInt;

public final class RogueBonusSelectInfoOuterClass {
  /**
   * Protobuf type {@code RogueBonusSelectInfo}
   */
  public static final class RogueBonusSelectInfo extends ProtoMessage<RogueBonusSelectInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     */
    private final RepeatedInt bonusInfo = RepeatedInt.newEmptyInstance();

    private RogueBonusSelectInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueBonusSelectInfo}
     */
    public static RogueBonusSelectInfo newInstance() {
      return new RogueBonusSelectInfo();
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     * @return whether the bonusInfo field is set
     */
    public boolean hasBonusInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     * @return this
     */
    public RogueBonusSelectInfo clearBonusInfo() {
      bitField0_ &= ~0x00000001;
      bonusInfo.clear();
      return this;
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBonusInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBonusInfo() {
      return bonusInfo;
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBonusInfo() {
      bitField0_ |= 0x00000001;
      return bonusInfo;
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     * @param value the bonusInfo to add
     * @return this
     */
    public RogueBonusSelectInfo addBonusInfo(final int value) {
      bitField0_ |= 0x00000001;
      bonusInfo.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 bonus_info = 14;</code>
     * @param values the bonusInfo to add
     * @return this
     */
    public RogueBonusSelectInfo addAllBonusInfo(final int... values) {
      bitField0_ |= 0x00000001;
      bonusInfo.addAll(values);
      return this;
    }

    @Override
    public RogueBonusSelectInfo copyFrom(final RogueBonusSelectInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        bonusInfo.copyFrom(other.bonusInfo);
      }
      return this;
    }

    @Override
    public RogueBonusSelectInfo mergeFrom(final RogueBonusSelectInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBonusInfo()) {
        getMutableBonusInfo().addAll(other.bonusInfo);
      }
      return this;
    }

    @Override
    public RogueBonusSelectInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bonusInfo.clear();
      return this;
    }

    @Override
    public RogueBonusSelectInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bonusInfo.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueBonusSelectInfo)) {
        return false;
      }
      RogueBonusSelectInfo other = (RogueBonusSelectInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBonusInfo() || bonusInfo.equals(other.bonusInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < bonusInfo.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(bonusInfo.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * bonusInfo.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(bonusInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueBonusSelectInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // bonusInfo [packed=true]
            input.readPackedUInt32(bonusInfo, tag);
            bitField0_ |= 0x00000001;
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
          case 112: {
            // bonusInfo [packed=false]
            tag = input.readRepeatedUInt32(bonusInfo, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.bonusInfo, bonusInfo);
      }
      output.endObject();
    }

    @Override
    public RogueBonusSelectInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1440797037:
          case 1735211214: {
            if (input.isAtField(FieldNames.bonusInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(bonusInfo);
                bitField0_ |= 0x00000001;
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
    public RogueBonusSelectInfo clone() {
      return new RogueBonusSelectInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueBonusSelectInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueBonusSelectInfo(), data).checkInitialized();
    }

    public static RogueBonusSelectInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBonusSelectInfo(), input).checkInitialized();
    }

    public static RogueBonusSelectInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBonusSelectInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueBonusSelectInfo messages
     */
    public static MessageFactory<RogueBonusSelectInfo> getFactory() {
      return RogueBonusSelectInfoFactory.INSTANCE;
    }

    private enum RogueBonusSelectInfoFactory implements MessageFactory<RogueBonusSelectInfo> {
      INSTANCE;

      @Override
      public RogueBonusSelectInfo create() {
        return RogueBonusSelectInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName bonusInfo = FieldName.forField("bonusInfo", "bonus_info");
    }
  }
}
