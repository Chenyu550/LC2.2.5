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

public final class TakePromotionRewardScRspOuterClass {
  /**
   * Protobuf type {@code TakePromotionRewardScRsp}
   */
  public static final class TakePromotionRewardScRsp extends ProtoMessage<TakePromotionRewardScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 6;</code>
     */
    private int retcode;

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     */
    private final ItemListOuterClass.ItemList rewardList = ItemListOuterClass.ItemList.newInstance();

    private TakePromotionRewardScRsp() {
    }

    /**
     * @return a new empty instance of {@code TakePromotionRewardScRsp}
     */
    public static TakePromotionRewardScRsp newInstance() {
      return new TakePromotionRewardScRsp();
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return this
     */
    public TakePromotionRewardScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @param value the retcode to set
     * @return this
     */
    public TakePromotionRewardScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     * @return whether the rewardList field is set
     */
    public boolean hasRewardList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     * @return this
     */
    public TakePromotionRewardScRsp clearRewardList() {
      bitField0_ &= ~0x00000002;
      rewardList.clear();
      return this;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRewardList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getRewardList() {
      return rewardList;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableRewardList() {
      bitField0_ |= 0x00000002;
      return rewardList;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>optional .ItemList reward_list = 13;</code>
     * @param value the rewardList to set
     * @return this
     */
    public TakePromotionRewardScRsp setRewardList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000002;
      rewardList.copyFrom(value);
      return this;
    }

    @Override
    public TakePromotionRewardScRsp copyFrom(final TakePromotionRewardScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        rewardList.copyFrom(other.rewardList);
      }
      return this;
    }

    @Override
    public TakePromotionRewardScRsp mergeFrom(final TakePromotionRewardScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasRewardList()) {
        getMutableRewardList().mergeFrom(other.rewardList);
      }
      return this;
    }

    @Override
    public TakePromotionRewardScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      rewardList.clear();
      return this;
    }

    @Override
    public TakePromotionRewardScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rewardList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakePromotionRewardScRsp)) {
        return false;
      }
      TakePromotionRewardScRsp other = (TakePromotionRewardScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasRewardList() || rewardList.equals(other.rewardList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(rewardList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rewardList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakePromotionRewardScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // rewardList
            input.readMessage(rewardList);
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
        output.writeMessage(FieldNames.rewardList, rewardList);
      }
      output.endObject();
    }

    @Override
    public TakePromotionRewardScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1690977389:
          case 898318254: {
            if (input.isAtField(FieldNames.rewardList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rewardList);
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
    public TakePromotionRewardScRsp clone() {
      return new TakePromotionRewardScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakePromotionRewardScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardScRsp(), data).checkInitialized();
    }

    public static TakePromotionRewardScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardScRsp(), input).checkInitialized();
    }

    public static TakePromotionRewardScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakePromotionRewardScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakePromotionRewardScRsp messages
     */
    public static MessageFactory<TakePromotionRewardScRsp> getFactory() {
      return TakePromotionRewardScRspFactory.INSTANCE;
    }

    private enum TakePromotionRewardScRspFactory implements MessageFactory<TakePromotionRewardScRsp> {
      INSTANCE;

      @Override
      public TakePromotionRewardScRsp create() {
        return TakePromotionRewardScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName rewardList = FieldName.forField("rewardList", "reward_list");
    }
  }
}
