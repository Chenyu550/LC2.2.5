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

public final class ClientMailAttachmentItemOuterClass {
  /**
   * Protobuf type {@code ClientMailAttachmentItem}
   */
  public static final class ClientMailAttachmentItem extends ProtoMessage<ClientMailAttachmentItem> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * or 11 
     * </pre>
     *
     * <code>optional uint32 mail_id = 11;</code>
     */
    private int mailId;

    /**
     * <pre>
     * or 12
     * </pre>
     *
     * <code>optional uint32 item_id = 12;</code>
     */
    private int itemId;

    private ClientMailAttachmentItem() {
    }

    /**
     * @return a new empty instance of {@code ClientMailAttachmentItem}
     */
    public static ClientMailAttachmentItem newInstance() {
      return new ClientMailAttachmentItem();
    }

    /**
     * <pre>
     * or 11 
     * </pre>
     *
     * <code>optional uint32 mail_id = 11;</code>
     * @return whether the mailId field is set
     */
    public boolean hasMailId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * or 11 
     * </pre>
     *
     * <code>optional uint32 mail_id = 11;</code>
     * @return this
     */
    public ClientMailAttachmentItem clearMailId() {
      bitField0_ &= ~0x00000001;
      mailId = 0;
      return this;
    }

    /**
     * <pre>
     * or 11 
     * </pre>
     *
     * <code>optional uint32 mail_id = 11;</code>
     * @return the mailId
     */
    public int getMailId() {
      return mailId;
    }

    /**
     * <pre>
     * or 11 
     * </pre>
     *
     * <code>optional uint32 mail_id = 11;</code>
     * @param value the mailId to set
     * @return this
     */
    public ClientMailAttachmentItem setMailId(final int value) {
      bitField0_ |= 0x00000001;
      mailId = value;
      return this;
    }

    /**
     * <pre>
     * or 12
     * </pre>
     *
     * <code>optional uint32 item_id = 12;</code>
     * @return whether the itemId field is set
     */
    public boolean hasItemId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * or 12
     * </pre>
     *
     * <code>optional uint32 item_id = 12;</code>
     * @return this
     */
    public ClientMailAttachmentItem clearItemId() {
      bitField0_ &= ~0x00000002;
      itemId = 0;
      return this;
    }

    /**
     * <pre>
     * or 12
     * </pre>
     *
     * <code>optional uint32 item_id = 12;</code>
     * @return the itemId
     */
    public int getItemId() {
      return itemId;
    }

    /**
     * <pre>
     * or 12
     * </pre>
     *
     * <code>optional uint32 item_id = 12;</code>
     * @param value the itemId to set
     * @return this
     */
    public ClientMailAttachmentItem setItemId(final int value) {
      bitField0_ |= 0x00000002;
      itemId = value;
      return this;
    }

    @Override
    public ClientMailAttachmentItem copyFrom(final ClientMailAttachmentItem other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mailId = other.mailId;
        itemId = other.itemId;
      }
      return this;
    }

    @Override
    public ClientMailAttachmentItem mergeFrom(final ClientMailAttachmentItem other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMailId()) {
        setMailId(other.mailId);
      }
      if (other.hasItemId()) {
        setItemId(other.itemId);
      }
      return this;
    }

    @Override
    public ClientMailAttachmentItem clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mailId = 0;
      itemId = 0;
      return this;
    }

    @Override
    public ClientMailAttachmentItem clearQuick() {
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
      if (!(o instanceof ClientMailAttachmentItem)) {
        return false;
      }
      ClientMailAttachmentItem other = (ClientMailAttachmentItem) o;
      return bitField0_ == other.bitField0_
        && (!hasMailId() || mailId == other.mailId)
        && (!hasItemId() || itemId == other.itemId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(mailId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(itemId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mailId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ClientMailAttachmentItem mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // mailId
            mailId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // itemId
            itemId = input.readUInt32();
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
        output.writeUInt32(FieldNames.mailId, mailId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.itemId, itemId);
      }
      output.endObject();
    }

    @Override
    public ClientMailAttachmentItem mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1081574094:
          case 830962851: {
            if (input.isAtField(FieldNames.mailId)) {
              if (!input.trySkipNullValue()) {
                mailId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1178662002:
          case 2116204999: {
            if (input.isAtField(FieldNames.itemId)) {
              if (!input.trySkipNullValue()) {
                itemId = input.readUInt32();
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
    public ClientMailAttachmentItem clone() {
      return new ClientMailAttachmentItem().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ClientMailAttachmentItem parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ClientMailAttachmentItem(), data).checkInitialized();
    }

    public static ClientMailAttachmentItem parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientMailAttachmentItem(), input).checkInitialized();
    }

    public static ClientMailAttachmentItem parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ClientMailAttachmentItem(), input).checkInitialized();
    }

    /**
     * @return factory for creating ClientMailAttachmentItem messages
     */
    public static MessageFactory<ClientMailAttachmentItem> getFactory() {
      return ClientMailAttachmentItemFactory.INSTANCE;
    }

    private enum ClientMailAttachmentItemFactory implements MessageFactory<ClientMailAttachmentItem> {
      INSTANCE;

      @Override
      public ClientMailAttachmentItem create() {
        return ClientMailAttachmentItem.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mailId = FieldName.forField("mailId", "mail_id");

      static final FieldName itemId = FieldName.forField("itemId", "item_id");
    }
  }
}
