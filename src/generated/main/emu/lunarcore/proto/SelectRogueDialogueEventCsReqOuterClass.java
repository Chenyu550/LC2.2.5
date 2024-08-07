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

public final class SelectRogueDialogueEventCsReqOuterClass {
  /**
   * Protobuf type {@code SelectRogueDialogueEventCsReq}
   */
  public static final class SelectRogueDialogueEventCsReq extends ProtoMessage<SelectRogueDialogueEventCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 entity_id = 6;</code>
     */
    private int entityId;

    /**
     * <code>optional uint32 dialogue_event_id = 13;</code>
     */
    private int dialogueEventId;

    private SelectRogueDialogueEventCsReq() {
    }

    /**
     * @return a new empty instance of {@code SelectRogueDialogueEventCsReq}
     */
    public static SelectRogueDialogueEventCsReq newInstance() {
      return new SelectRogueDialogueEventCsReq();
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 entity_id = 6;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 entity_id = 6;</code>
     * @return this
     */
    public SelectRogueDialogueEventCsReq clearEntityId() {
      bitField0_ &= ~0x00000001;
      entityId = 0;
      return this;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 entity_id = 6;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 entity_id = 6;</code>
     * @param value the entityId to set
     * @return this
     */
    public SelectRogueDialogueEventCsReq setEntityId(final int value) {
      bitField0_ |= 0x00000001;
      entityId = value;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 13;</code>
     * @return whether the dialogueEventId field is set
     */
    public boolean hasDialogueEventId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 13;</code>
     * @return this
     */
    public SelectRogueDialogueEventCsReq clearDialogueEventId() {
      bitField0_ &= ~0x00000002;
      dialogueEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 13;</code>
     * @return the dialogueEventId
     */
    public int getDialogueEventId() {
      return dialogueEventId;
    }

    /**
     * <code>optional uint32 dialogue_event_id = 13;</code>
     * @param value the dialogueEventId to set
     * @return this
     */
    public SelectRogueDialogueEventCsReq setDialogueEventId(final int value) {
      bitField0_ |= 0x00000002;
      dialogueEventId = value;
      return this;
    }

    @Override
    public SelectRogueDialogueEventCsReq copyFrom(final SelectRogueDialogueEventCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityId = other.entityId;
        dialogueEventId = other.dialogueEventId;
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventCsReq mergeFrom(final SelectRogueDialogueEventCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasDialogueEventId()) {
        setDialogueEventId(other.dialogueEventId);
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityId = 0;
      dialogueEventId = 0;
      return this;
    }

    @Override
    public SelectRogueDialogueEventCsReq clearQuick() {
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
      if (!(o instanceof SelectRogueDialogueEventCsReq)) {
        return false;
      }
      SelectRogueDialogueEventCsReq other = (SelectRogueDialogueEventCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasDialogueEventId() || dialogueEventId == other.dialogueEventId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(dialogueEventId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueEventId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectRogueDialogueEventCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // dialogueEventId
            dialogueEventId = input.readUInt32();
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
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.dialogueEventId, dialogueEventId);
      }
      output.endObject();
    }

    @Override
    public SelectRogueDialogueEventCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 88389725:
          case 1671736167: {
            if (input.isAtField(FieldNames.dialogueEventId)) {
              if (!input.trySkipNullValue()) {
                dialogueEventId = input.readUInt32();
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
    public SelectRogueDialogueEventCsReq clone() {
      return new SelectRogueDialogueEventCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectRogueDialogueEventCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventCsReq(), data).checkInitialized();
    }

    public static SelectRogueDialogueEventCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventCsReq(), input).checkInitialized();
    }

    public static SelectRogueDialogueEventCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectRogueDialogueEventCsReq messages
     */
    public static MessageFactory<SelectRogueDialogueEventCsReq> getFactory() {
      return SelectRogueDialogueEventCsReqFactory.INSTANCE;
    }

    private enum SelectRogueDialogueEventCsReqFactory implements MessageFactory<SelectRogueDialogueEventCsReq> {
      INSTANCE;

      @Override
      public SelectRogueDialogueEventCsReq create() {
        return SelectRogueDialogueEventCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName dialogueEventId = FieldName.forField("dialogueEventId", "dialogue_event_id");
    }
  }
}
