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

public final class SetClientPausedScRspOuterClass {
  /**
   * Protobuf type {@code SetClientPausedScRsp}
   */
  public static final class SetClientPausedScRsp extends ProtoMessage<SetClientPausedScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional bool paused = 11;</code>
     */
    private boolean paused;

    private SetClientPausedScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetClientPausedScRsp}
     */
    public static SetClientPausedScRsp newInstance() {
      return new SetClientPausedScRsp();
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public SetClientPausedScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetClientPausedScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool paused = 11;</code>
     * @return whether the paused field is set
     */
    public boolean hasPaused() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool paused = 11;</code>
     * @return this
     */
    public SetClientPausedScRsp clearPaused() {
      bitField0_ &= ~0x00000002;
      paused = false;
      return this;
    }

    /**
     * <code>optional bool paused = 11;</code>
     * @return the paused
     */
    public boolean getPaused() {
      return paused;
    }

    /**
     * <code>optional bool paused = 11;</code>
     * @param value the paused to set
     * @return this
     */
    public SetClientPausedScRsp setPaused(final boolean value) {
      bitField0_ |= 0x00000002;
      paused = value;
      return this;
    }

    @Override
    public SetClientPausedScRsp copyFrom(final SetClientPausedScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        paused = other.paused;
      }
      return this;
    }

    @Override
    public SetClientPausedScRsp mergeFrom(final SetClientPausedScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPaused()) {
        setPaused(other.paused);
      }
      return this;
    }

    @Override
    public SetClientPausedScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      paused = false;
      return this;
    }

    @Override
    public SetClientPausedScRsp clearQuick() {
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
      if (!(o instanceof SetClientPausedScRsp)) {
        return false;
      }
      SetClientPausedScRsp other = (SetClientPausedScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPaused() || paused == other.paused);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeBoolNoTag(paused);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetClientPausedScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // paused
            paused = input.readBool();
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
        output.writeBool(FieldNames.paused, paused);
      }
      output.endObject();
    }

    @Override
    public SetClientPausedScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -995321554: {
            if (input.isAtField(FieldNames.paused)) {
              if (!input.trySkipNullValue()) {
                paused = input.readBool();
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
    public SetClientPausedScRsp clone() {
      return new SetClientPausedScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetClientPausedScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetClientPausedScRsp(), data).checkInitialized();
    }

    public static SetClientPausedScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetClientPausedScRsp(), input).checkInitialized();
    }

    public static SetClientPausedScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetClientPausedScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetClientPausedScRsp messages
     */
    public static MessageFactory<SetClientPausedScRsp> getFactory() {
      return SetClientPausedScRspFactory.INSTANCE;
    }

    private enum SetClientPausedScRspFactory implements MessageFactory<SetClientPausedScRsp> {
      INSTANCE;

      @Override
      public SetClientPausedScRsp create() {
        return SetClientPausedScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName paused = FieldName.forField("paused");
    }
  }
}
