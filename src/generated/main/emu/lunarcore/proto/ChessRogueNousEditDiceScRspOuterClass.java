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

public final class ChessRogueNousEditDiceScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueNousEditDiceScRsp}
   */
  public static final class ChessRogueNousEditDiceScRsp extends ProtoMessage<ChessRogueNousEditDiceScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 14
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     */
    private final ChessRogueNousDiceInfoOuterClass.ChessRogueNousDiceInfo diceInfo = ChessRogueNousDiceInfoOuterClass.ChessRogueNousDiceInfo.newInstance();

    private ChessRogueNousEditDiceScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueNousEditDiceScRsp}
     */
    public static ChessRogueNousEditDiceScRsp newInstance() {
      return new ChessRogueNousEditDiceScRsp();
    }

    /**
     * <pre>
     * 14
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 14
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public ChessRogueNousEditDiceScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     * 14
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <pre>
     * 14
     * </pre>
     *
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueNousEditDiceScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     * @return whether the diceInfo field is set
     */
    public boolean hasDiceInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     * @return this
     */
    public ChessRogueNousEditDiceScRsp clearDiceInfo() {
      bitField0_ &= ~0x00000002;
      diceInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDiceInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousDiceInfoOuterClass.ChessRogueNousDiceInfo getDiceInfo() {
      return diceInfo;
    }

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousDiceInfoOuterClass.ChessRogueNousDiceInfo getMutableDiceInfo() {
      bitField0_ |= 0x00000002;
      return diceInfo;
    }

    /**
     * <code>optional .ChessRogueNousDiceInfo dice_info = 13;</code>
     * @param value the diceInfo to set
     * @return this
     */
    public ChessRogueNousEditDiceScRsp setDiceInfo(
        final ChessRogueNousDiceInfoOuterClass.ChessRogueNousDiceInfo value) {
      bitField0_ |= 0x00000002;
      diceInfo.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueNousEditDiceScRsp copyFrom(final ChessRogueNousEditDiceScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        diceInfo.copyFrom(other.diceInfo);
      }
      return this;
    }

    @Override
    public ChessRogueNousEditDiceScRsp mergeFrom(final ChessRogueNousEditDiceScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasDiceInfo()) {
        getMutableDiceInfo().mergeFrom(other.diceInfo);
      }
      return this;
    }

    @Override
    public ChessRogueNousEditDiceScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      diceInfo.clear();
      return this;
    }

    @Override
    public ChessRogueNousEditDiceScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      diceInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueNousEditDiceScRsp)) {
        return false;
      }
      ChessRogueNousEditDiceScRsp other = (ChessRogueNousEditDiceScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasDiceInfo() || diceInfo.equals(other.diceInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(diceInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(diceInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueNousEditDiceScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // diceInfo
            input.readMessage(diceInfo);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.diceInfo, diceInfo);
      }
      output.endObject();
    }

    @Override
    public ChessRogueNousEditDiceScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -184174347:
          case -1394261434: {
            if (input.isAtField(FieldNames.diceInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(diceInfo);
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
    public ChessRogueNousEditDiceScRsp clone() {
      return new ChessRogueNousEditDiceScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueNousEditDiceScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEditDiceScRsp(), data).checkInitialized();
    }

    public static ChessRogueNousEditDiceScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEditDiceScRsp(), input).checkInitialized();
    }

    public static ChessRogueNousEditDiceScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueNousEditDiceScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueNousEditDiceScRsp messages
     */
    public static MessageFactory<ChessRogueNousEditDiceScRsp> getFactory() {
      return ChessRogueNousEditDiceScRspFactory.INSTANCE;
    }

    private enum ChessRogueNousEditDiceScRspFactory implements MessageFactory<ChessRogueNousEditDiceScRsp> {
      INSTANCE;

      @Override
      public ChessRogueNousEditDiceScRsp create() {
        return ChessRogueNousEditDiceScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName diceInfo = FieldName.forField("diceInfo", "dice_info");
    }
  }
}
