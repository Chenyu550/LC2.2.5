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

public final class ComposeSelectedRelicScRspOuterClass {
  /**
   * Protobuf type {@code ComposeSelectedRelicScRsp}
   */
  public static final class ComposeSelectedRelicScRsp extends ProtoMessage<ComposeSelectedRelicScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional uint32 compose_id = 10;</code>
     */
    private int composeId;

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 retcode = 13;</code>
     */
    private int retcode;

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     */
    private final ItemListOuterClass.ItemList returnItemList = ItemListOuterClass.ItemList.newInstance();

    private ComposeSelectedRelicScRsp() {
    }

    /**
     * @return a new empty instance of {@code ComposeSelectedRelicScRsp}
     */
    public static ComposeSelectedRelicScRsp newInstance() {
      return new ComposeSelectedRelicScRsp();
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional uint32 compose_id = 10;</code>
     * @return whether the composeId field is set
     */
    public boolean hasComposeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional uint32 compose_id = 10;</code>
     * @return this
     */
    public ComposeSelectedRelicScRsp clearComposeId() {
      bitField0_ &= ~0x00000001;
      composeId = 0;
      return this;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional uint32 compose_id = 10;</code>
     * @return the composeId
     */
    public int getComposeId() {
      return composeId;
    }

    /**
     * <pre>
     * 13
     * </pre>
     *
     * <code>optional uint32 compose_id = 10;</code>
     * @param value the composeId to set
     * @return this
     */
    public ComposeSelectedRelicScRsp setComposeId(final int value) {
      bitField0_ |= 0x00000001;
      composeId = value;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 retcode = 13;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 retcode = 13;</code>
     * @return this
     */
    public ComposeSelectedRelicScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 retcode = 13;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 retcode = 13;</code>
     * @param value the retcode to set
     * @return this
     */
    public ComposeSelectedRelicScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     * @return whether the returnItemList field is set
     */
    public boolean hasReturnItemList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     * @return this
     */
    public ComposeSelectedRelicScRsp clearReturnItemList() {
      bitField0_ &= ~0x00000004;
      returnItemList.clear();
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReturnItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getReturnItemList() {
      return returnItemList;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableReturnItemList() {
      bitField0_ |= 0x00000004;
      return returnItemList;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional .ItemList return_item_list = 7;</code>
     * @param value the returnItemList to set
     * @return this
     */
    public ComposeSelectedRelicScRsp setReturnItemList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000004;
      returnItemList.copyFrom(value);
      return this;
    }

    @Override
    public ComposeSelectedRelicScRsp copyFrom(final ComposeSelectedRelicScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        composeId = other.composeId;
        retcode = other.retcode;
        returnItemList.copyFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public ComposeSelectedRelicScRsp mergeFrom(final ComposeSelectedRelicScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasComposeId()) {
        setComposeId(other.composeId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasReturnItemList()) {
        getMutableReturnItemList().mergeFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public ComposeSelectedRelicScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      composeId = 0;
      retcode = 0;
      returnItemList.clear();
      return this;
    }

    @Override
    public ComposeSelectedRelicScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      returnItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ComposeSelectedRelicScRsp)) {
        return false;
      }
      ComposeSelectedRelicScRsp other = (ComposeSelectedRelicScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasComposeId() || composeId == other.composeId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasReturnItemList() || returnItemList.equals(other.returnItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(composeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(returnItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(composeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(returnItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ComposeSelectedRelicScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // composeId
            composeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // returnItemList
            input.readMessage(returnItemList);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.composeId, composeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.returnItemList, returnItemList);
      }
      output.endObject();
    }

    @Override
    public ComposeSelectedRelicScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1399759283:
          case -442843416: {
            if (input.isAtField(FieldNames.composeId)) {
              if (!input.trySkipNullValue()) {
                composeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -6533215:
          case -807051781: {
            if (input.isAtField(FieldNames.returnItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(returnItemList);
                bitField0_ |= 0x00000004;
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
    public ComposeSelectedRelicScRsp clone() {
      return new ComposeSelectedRelicScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ComposeSelectedRelicScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicScRsp(), data).checkInitialized();
    }

    public static ComposeSelectedRelicScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicScRsp(), input).checkInitialized();
    }

    public static ComposeSelectedRelicScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeSelectedRelicScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ComposeSelectedRelicScRsp messages
     */
    public static MessageFactory<ComposeSelectedRelicScRsp> getFactory() {
      return ComposeSelectedRelicScRspFactory.INSTANCE;
    }

    private enum ComposeSelectedRelicScRspFactory implements MessageFactory<ComposeSelectedRelicScRsp> {
      INSTANCE;

      @Override
      public ComposeSelectedRelicScRsp create() {
        return ComposeSelectedRelicScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName composeId = FieldName.forField("composeId", "compose_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName returnItemList = FieldName.forField("returnItemList", "return_item_list");
    }
  }
}
