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

public final class ExpUpRelicCsReqOuterClass {
  /**
   * Protobuf type {@code ExpUpRelicCsReq}
   */
  public static final class ExpUpRelicCsReq extends ProtoMessage<ExpUpRelicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 relic_unique_id = 11;</code>
     */
    private int relicUniqueId;

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     */
    private final ItemCostListOuterClass.ItemCostList itemCostList = ItemCostListOuterClass.ItemCostList.newInstance();

    private ExpUpRelicCsReq() {
    }

    /**
     * @return a new empty instance of {@code ExpUpRelicCsReq}
     */
    public static ExpUpRelicCsReq newInstance() {
      return new ExpUpRelicCsReq();
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 relic_unique_id = 11;</code>
     * @return whether the relicUniqueId field is set
     */
    public boolean hasRelicUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 relic_unique_id = 11;</code>
     * @return this
     */
    public ExpUpRelicCsReq clearRelicUniqueId() {
      bitField0_ &= ~0x00000001;
      relicUniqueId = 0;
      return this;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 relic_unique_id = 11;</code>
     * @return the relicUniqueId
     */
    public int getRelicUniqueId() {
      return relicUniqueId;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 relic_unique_id = 11;</code>
     * @param value the relicUniqueId to set
     * @return this
     */
    public ExpUpRelicCsReq setRelicUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      relicUniqueId = value;
      return this;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     * @return whether the itemCostList field is set
     */
    public boolean hasItemCostList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     * @return this
     */
    public ExpUpRelicCsReq clearItemCostList() {
      bitField0_ &= ~0x00000002;
      itemCostList.clear();
      return this;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemCostList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getItemCostList() {
      return itemCostList;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableItemCostList() {
      bitField0_ |= 0x00000002;
      return itemCostList;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional .ItemCostList item_cost_list = 1;</code>
     * @param value the itemCostList to set
     * @return this
     */
    public ExpUpRelicCsReq setItemCostList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000002;
      itemCostList.copyFrom(value);
      return this;
    }

    @Override
    public ExpUpRelicCsReq copyFrom(final ExpUpRelicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        relicUniqueId = other.relicUniqueId;
        itemCostList.copyFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public ExpUpRelicCsReq mergeFrom(final ExpUpRelicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRelicUniqueId()) {
        setRelicUniqueId(other.relicUniqueId);
      }
      if (other.hasItemCostList()) {
        getMutableItemCostList().mergeFrom(other.itemCostList);
      }
      return this;
    }

    @Override
    public ExpUpRelicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      relicUniqueId = 0;
      itemCostList.clear();
      return this;
    }

    @Override
    public ExpUpRelicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCostList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ExpUpRelicCsReq)) {
        return false;
      }
      ExpUpRelicCsReq other = (ExpUpRelicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasRelicUniqueId() || relicUniqueId == other.relicUniqueId)
        && (!hasItemCostList() || itemCostList.equals(other.itemCostList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(itemCostList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(itemCostList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ExpUpRelicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // relicUniqueId
            relicUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // itemCostList
            input.readMessage(itemCostList);
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
        output.writeUInt32(FieldNames.relicUniqueId, relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.itemCostList, itemCostList);
      }
      output.endObject();
    }

    @Override
    public ExpUpRelicCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1966200481:
          case 49648253: {
            if (input.isAtField(FieldNames.relicUniqueId)) {
              if (!input.trySkipNullValue()) {
                relicUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 203506238:
          case -1124889692: {
            if (input.isAtField(FieldNames.itemCostList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(itemCostList);
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
    public ExpUpRelicCsReq clone() {
      return new ExpUpRelicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ExpUpRelicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ExpUpRelicCsReq(), data).checkInitialized();
    }

    public static ExpUpRelicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExpUpRelicCsReq(), input).checkInitialized();
    }

    public static ExpUpRelicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExpUpRelicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ExpUpRelicCsReq messages
     */
    public static MessageFactory<ExpUpRelicCsReq> getFactory() {
      return ExpUpRelicCsReqFactory.INSTANCE;
    }

    private enum ExpUpRelicCsReqFactory implements MessageFactory<ExpUpRelicCsReq> {
      INSTANCE;

      @Override
      public ExpUpRelicCsReq create() {
        return ExpUpRelicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName relicUniqueId = FieldName.forField("relicUniqueId", "relic_unique_id");

      static final FieldName itemCostList = FieldName.forField("itemCostList", "item_cost_list");
    }
  }
}
