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

public final class SetGameplayBirthdayCsReqOuterClass {
  /**
   * Protobuf type {@code SetGameplayBirthdayCsReq}
   */
  public static final class SetGameplayBirthdayCsReq extends ProtoMessage<SetGameplayBirthdayCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 birthday = 2;</code>
     */
    private int birthday;

    private SetGameplayBirthdayCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetGameplayBirthdayCsReq}
     */
    public static SetGameplayBirthdayCsReq newInstance() {
      return new SetGameplayBirthdayCsReq();
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 birthday = 2;</code>
     * @return whether the birthday field is set
     */
    public boolean hasBirthday() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 birthday = 2;</code>
     * @return this
     */
    public SetGameplayBirthdayCsReq clearBirthday() {
      bitField0_ &= ~0x00000001;
      birthday = 0;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 birthday = 2;</code>
     * @return the birthday
     */
    public int getBirthday() {
      return birthday;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 birthday = 2;</code>
     * @param value the birthday to set
     * @return this
     */
    public SetGameplayBirthdayCsReq setBirthday(final int value) {
      bitField0_ |= 0x00000001;
      birthday = value;
      return this;
    }

    @Override
    public SetGameplayBirthdayCsReq copyFrom(final SetGameplayBirthdayCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        birthday = other.birthday;
      }
      return this;
    }

    @Override
    public SetGameplayBirthdayCsReq mergeFrom(final SetGameplayBirthdayCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBirthday()) {
        setBirthday(other.birthday);
      }
      return this;
    }

    @Override
    public SetGameplayBirthdayCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      birthday = 0;
      return this;
    }

    @Override
    public SetGameplayBirthdayCsReq clearQuick() {
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
      if (!(o instanceof SetGameplayBirthdayCsReq)) {
        return false;
      }
      SetGameplayBirthdayCsReq other = (SetGameplayBirthdayCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasBirthday() || birthday == other.birthday);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(birthday);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(birthday);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetGameplayBirthdayCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // birthday
            birthday = input.readUInt32();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.birthday, birthday);
      }
      output.endObject();
    }

    @Override
    public SetGameplayBirthdayCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1069376125: {
            if (input.isAtField(FieldNames.birthday)) {
              if (!input.trySkipNullValue()) {
                birthday = input.readUInt32();
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
    public SetGameplayBirthdayCsReq clone() {
      return new SetGameplayBirthdayCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetGameplayBirthdayCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayCsReq(), data).checkInitialized();
    }

    public static SetGameplayBirthdayCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayCsReq(), input).checkInitialized();
    }

    public static SetGameplayBirthdayCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetGameplayBirthdayCsReq messages
     */
    public static MessageFactory<SetGameplayBirthdayCsReq> getFactory() {
      return SetGameplayBirthdayCsReqFactory.INSTANCE;
    }

    private enum SetGameplayBirthdayCsReqFactory implements MessageFactory<SetGameplayBirthdayCsReq> {
      INSTANCE;

      @Override
      public SetGameplayBirthdayCsReq create() {
        return SetGameplayBirthdayCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName birthday = FieldName.forField("birthday");
    }
  }
}
