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

public final class SetFriendMarkScRspOuterClass {
  /**
   * Protobuf type {@code SetFriendMarkScRsp}
   */
  public static final class SetFriendMarkScRsp extends ProtoMessage<SetFriendMarkScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 4;</code>
     */
    private int uid;

    /**
     * <code>optional uint32 retcode = 13;</code>
     */
    private int retcode;

    /**
     * <code>optional bool is_set_mark = 2;</code>
     */
    private boolean isSetMark;

    private SetFriendMarkScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetFriendMarkScRsp}
     */
    public static SetFriendMarkScRsp newInstance() {
      return new SetFriendMarkScRsp();
    }

    /**
     * <code>optional uint32 uid = 4;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 4;</code>
     * @return this
     */
    public SetFriendMarkScRsp clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 4;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 4;</code>
     * @param value the uid to set
     * @return this
     */
    public SetFriendMarkScRsp setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return this
     */
    public SetFriendMarkScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetFriendMarkScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool is_set_mark = 2;</code>
     * @return whether the isSetMark field is set
     */
    public boolean hasIsSetMark() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_set_mark = 2;</code>
     * @return this
     */
    public SetFriendMarkScRsp clearIsSetMark() {
      bitField0_ &= ~0x00000004;
      isSetMark = false;
      return this;
    }

    /**
     * <code>optional bool is_set_mark = 2;</code>
     * @return the isSetMark
     */
    public boolean getIsSetMark() {
      return isSetMark;
    }

    /**
     * <code>optional bool is_set_mark = 2;</code>
     * @param value the isSetMark to set
     * @return this
     */
    public SetFriendMarkScRsp setIsSetMark(final boolean value) {
      bitField0_ |= 0x00000004;
      isSetMark = value;
      return this;
    }

    @Override
    public SetFriendMarkScRsp copyFrom(final SetFriendMarkScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        retcode = other.retcode;
        isSetMark = other.isSetMark;
      }
      return this;
    }

    @Override
    public SetFriendMarkScRsp mergeFrom(final SetFriendMarkScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIsSetMark()) {
        setIsSetMark(other.isSetMark);
      }
      return this;
    }

    @Override
    public SetFriendMarkScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      retcode = 0;
      isSetMark = false;
      return this;
    }

    @Override
    public SetFriendMarkScRsp clearQuick() {
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
      if (!(o instanceof SetFriendMarkScRsp)) {
        return false;
      }
      SetFriendMarkScRsp other = (SetFriendMarkScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIsSetMark() || isSetMark == other.isSetMark);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(isSetMark);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetFriendMarkScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // uid
            uid = input.readUInt32();
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
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // isSetMark
            isSetMark = input.readBool();
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
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isSetMark, isSetMark);
      }
      output.endObject();
    }

    @Override
    public SetFriendMarkScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
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
          case 1404992965:
          case 680313855: {
            if (input.isAtField(FieldNames.isSetMark)) {
              if (!input.trySkipNullValue()) {
                isSetMark = input.readBool();
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
    public SetFriendMarkScRsp clone() {
      return new SetFriendMarkScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetFriendMarkScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetFriendMarkScRsp(), data).checkInitialized();
    }

    public static SetFriendMarkScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetFriendMarkScRsp(), input).checkInitialized();
    }

    public static SetFriendMarkScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetFriendMarkScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetFriendMarkScRsp messages
     */
    public static MessageFactory<SetFriendMarkScRsp> getFactory() {
      return SetFriendMarkScRspFactory.INSTANCE;
    }

    private enum SetFriendMarkScRspFactory implements MessageFactory<SetFriendMarkScRsp> {
      INSTANCE;

      @Override
      public SetFriendMarkScRsp create() {
        return SetFriendMarkScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName isSetMark = FieldName.forField("isSetMark", "is_set_mark");
    }
  }
}
