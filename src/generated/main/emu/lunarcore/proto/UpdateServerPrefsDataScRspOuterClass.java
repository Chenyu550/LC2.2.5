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

public final class UpdateServerPrefsDataScRspOuterClass {
  /**
   * Protobuf type {@code UpdateServerPrefsDataScRsp}
   */
  public static final class UpdateServerPrefsDataScRsp extends ProtoMessage<UpdateServerPrefsDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 server_prefs_id = 1;</code>
     */
    private int serverPrefsId;

    /**
     * <pre>
     *  PDBKKNJFBAJ FDAJEIDNMAK = 9;
     * </pre>
     *
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    private UpdateServerPrefsDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code UpdateServerPrefsDataScRsp}
     */
    public static UpdateServerPrefsDataScRsp newInstance() {
      return new UpdateServerPrefsDataScRsp();
    }

    /**
     * <code>optional uint32 server_prefs_id = 1;</code>
     * @return whether the serverPrefsId field is set
     */
    public boolean hasServerPrefsId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 server_prefs_id = 1;</code>
     * @return this
     */
    public UpdateServerPrefsDataScRsp clearServerPrefsId() {
      bitField0_ &= ~0x00000001;
      serverPrefsId = 0;
      return this;
    }

    /**
     * <code>optional uint32 server_prefs_id = 1;</code>
     * @return the serverPrefsId
     */
    public int getServerPrefsId() {
      return serverPrefsId;
    }

    /**
     * <code>optional uint32 server_prefs_id = 1;</code>
     * @param value the serverPrefsId to set
     * @return this
     */
    public UpdateServerPrefsDataScRsp setServerPrefsId(final int value) {
      bitField0_ |= 0x00000001;
      serverPrefsId = value;
      return this;
    }

    /**
     * <pre>
     *  PDBKKNJFBAJ FDAJEIDNMAK = 9;
     * </pre>
     *
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  PDBKKNJFBAJ FDAJEIDNMAK = 9;
     * </pre>
     *
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public UpdateServerPrefsDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *  PDBKKNJFBAJ FDAJEIDNMAK = 9;
     * </pre>
     *
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <pre>
     *  PDBKKNJFBAJ FDAJEIDNMAK = 9;
     * </pre>
     *
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public UpdateServerPrefsDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public UpdateServerPrefsDataScRsp copyFrom(final UpdateServerPrefsDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        serverPrefsId = other.serverPrefsId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public UpdateServerPrefsDataScRsp mergeFrom(final UpdateServerPrefsDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasServerPrefsId()) {
        setServerPrefsId(other.serverPrefsId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public UpdateServerPrefsDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      serverPrefsId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public UpdateServerPrefsDataScRsp clearQuick() {
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
      if (!(o instanceof UpdateServerPrefsDataScRsp)) {
        return false;
      }
      UpdateServerPrefsDataScRsp other = (UpdateServerPrefsDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasServerPrefsId() || serverPrefsId == other.serverPrefsId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(serverPrefsId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(serverPrefsId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UpdateServerPrefsDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // serverPrefsId
            serverPrefsId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // retcode
            retcode = input.readUInt32();
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
        output.writeUInt32(FieldNames.serverPrefsId, serverPrefsId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public UpdateServerPrefsDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 656672552:
          case 2077691526: {
            if (input.isAtField(FieldNames.serverPrefsId)) {
              if (!input.trySkipNullValue()) {
                serverPrefsId = input.readUInt32();
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
    public UpdateServerPrefsDataScRsp clone() {
      return new UpdateServerPrefsDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UpdateServerPrefsDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataScRsp(), data).checkInitialized();
    }

    public static UpdateServerPrefsDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataScRsp(), input).checkInitialized();
    }

    public static UpdateServerPrefsDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UpdateServerPrefsDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UpdateServerPrefsDataScRsp messages
     */
    public static MessageFactory<UpdateServerPrefsDataScRsp> getFactory() {
      return UpdateServerPrefsDataScRspFactory.INSTANCE;
    }

    private enum UpdateServerPrefsDataScRspFactory implements MessageFactory<UpdateServerPrefsDataScRsp> {
      INSTANCE;

      @Override
      public UpdateServerPrefsDataScRsp create() {
        return UpdateServerPrefsDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName serverPrefsId = FieldName.forField("serverPrefsId", "server_prefs_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
