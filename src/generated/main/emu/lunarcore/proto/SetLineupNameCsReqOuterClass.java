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
import us.hebi.quickbuf.Utf8String;

public final class SetLineupNameCsReqOuterClass {
  /**
   * Protobuf type {@code SetLineupNameCsReq}
   */
  public static final class SetLineupNameCsReq extends ProtoMessage<SetLineupNameCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 index = 10;</code>
     */
    private int index;

    /**
     * <code>optional string name = 12;</code>
     */
    private final Utf8String name = Utf8String.newEmptyInstance();

    private SetLineupNameCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetLineupNameCsReq}
     */
    public static SetLineupNameCsReq newInstance() {
      return new SetLineupNameCsReq();
    }

    /**
     * <code>optional uint32 index = 10;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 index = 10;</code>
     * @return this
     */
    public SetLineupNameCsReq clearIndex() {
      bitField0_ &= ~0x00000001;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 10;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 10;</code>
     * @param value the index to set
     * @return this
     */
    public SetLineupNameCsReq setIndex(final int value) {
      bitField0_ |= 0x00000001;
      index = value;
      return this;
    }

    /**
     * <code>optional string name = 12;</code>
     * @return whether the name field is set
     */
    public boolean hasName() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional string name = 12;</code>
     * @return this
     */
    public SetLineupNameCsReq clearName() {
      bitField0_ &= ~0x00000002;
      name.clear();
      return this;
    }

    /**
     * <code>optional string name = 12;</code>
     * @return the name
     */
    public String getName() {
      return name.getString();
    }

    /**
     * <code>optional string name = 12;</code>
     * @return internal {@code Utf8String} representation of name for reading
     */
    public Utf8String getNameBytes() {
      return this.name;
    }

    /**
     * <code>optional string name = 12;</code>
     * @return internal {@code Utf8String} representation of name for modifications
     */
    public Utf8String getMutableNameBytes() {
      bitField0_ |= 0x00000002;
      return this.name;
    }

    /**
     * <code>optional string name = 12;</code>
     * @param value the name to set
     * @return this
     */
    public SetLineupNameCsReq setName(final CharSequence value) {
      bitField0_ |= 0x00000002;
      name.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string name = 12;</code>
     * @param value the name to set
     * @return this
     */
    public SetLineupNameCsReq setName(final Utf8String value) {
      bitField0_ |= 0x00000002;
      name.copyFrom(value);
      return this;
    }

    @Override
    public SetLineupNameCsReq copyFrom(final SetLineupNameCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        index = other.index;
        name.copyFrom(other.name);
      }
      return this;
    }

    @Override
    public SetLineupNameCsReq mergeFrom(final SetLineupNameCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasName()) {
        getMutableNameBytes().copyFrom(other.name);
      }
      return this;
    }

    @Override
    public SetLineupNameCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      index = 0;
      name.clear();
      return this;
    }

    @Override
    public SetLineupNameCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetLineupNameCsReq)) {
        return false;
      }
      SetLineupNameCsReq other = (SetLineupNameCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIndex() || index == other.index)
        && (!hasName() || name.equals(other.name));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 98);
        output.writeStringNoTag(name);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(name);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetLineupNameCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // name
            input.readString(name);
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
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeString(FieldNames.name, name);
      }
      output.endObject();
    }

    @Override
    public SetLineupNameCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3373707: {
            if (input.isAtField(FieldNames.name)) {
              if (!input.trySkipNullValue()) {
                input.readString(name);
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
    public SetLineupNameCsReq clone() {
      return new SetLineupNameCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetLineupNameCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetLineupNameCsReq(), data).checkInitialized();
    }

    public static SetLineupNameCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetLineupNameCsReq(), input).checkInitialized();
    }

    public static SetLineupNameCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetLineupNameCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetLineupNameCsReq messages
     */
    public static MessageFactory<SetLineupNameCsReq> getFactory() {
      return SetLineupNameCsReqFactory.INSTANCE;
    }

    private enum SetLineupNameCsReqFactory implements MessageFactory<SetLineupNameCsReq> {
      INSTANCE;

      @Override
      public SetLineupNameCsReq create() {
        return SetLineupNameCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName index = FieldName.forField("index");

      static final FieldName name = FieldName.forField("name");
    }
  }
}
