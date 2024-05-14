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

public final class SyncClientResVersionScRspOuterClass {
  /**
   * Protobuf type {@code SyncClientResVersionScRsp}
   */
  public static final class SyncClientResVersionScRsp extends ProtoMessage<SyncClientResVersionScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 client_res_version = 11;</code>
     */
    private int clientResVersion;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    private SyncClientResVersionScRsp() {
    }

    /**
     * @return a new empty instance of {@code SyncClientResVersionScRsp}
     */
    public static SyncClientResVersionScRsp newInstance() {
      return new SyncClientResVersionScRsp();
    }

    /**
     * <code>optional uint32 client_res_version = 11;</code>
     * @return whether the clientResVersion field is set
     */
    public boolean hasClientResVersion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 client_res_version = 11;</code>
     * @return this
     */
    public SyncClientResVersionScRsp clearClientResVersion() {
      bitField0_ &= ~0x00000001;
      clientResVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_res_version = 11;</code>
     * @return the clientResVersion
     */
    public int getClientResVersion() {
      return clientResVersion;
    }

    /**
     * <code>optional uint32 client_res_version = 11;</code>
     * @param value the clientResVersion to set
     * @return this
     */
    public SyncClientResVersionScRsp setClientResVersion(final int value) {
      bitField0_ |= 0x00000001;
      clientResVersion = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public SyncClientResVersionScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public SyncClientResVersionScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public SyncClientResVersionScRsp copyFrom(final SyncClientResVersionScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        clientResVersion = other.clientResVersion;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public SyncClientResVersionScRsp mergeFrom(final SyncClientResVersionScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasClientResVersion()) {
        setClientResVersion(other.clientResVersion);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public SyncClientResVersionScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      clientResVersion = 0;
      retcode = 0;
      return this;
    }

    @Override
    public SyncClientResVersionScRsp clearQuick() {
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
      if (!(o instanceof SyncClientResVersionScRsp)) {
        return false;
      }
      SyncClientResVersionScRsp other = (SyncClientResVersionScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasClientResVersion() || clientResVersion == other.clientResVersion)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(clientResVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientResVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncClientResVersionScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // clientResVersion
            clientResVersion = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
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
        output.writeUInt32(FieldNames.clientResVersion, clientResVersion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public SyncClientResVersionScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -2005674429:
          case -349907515: {
            if (input.isAtField(FieldNames.clientResVersion)) {
              if (!input.trySkipNullValue()) {
                clientResVersion = input.readUInt32();
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
    public SyncClientResVersionScRsp clone() {
      return new SyncClientResVersionScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncClientResVersionScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionScRsp(), data).checkInitialized();
    }

    public static SyncClientResVersionScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionScRsp(), input).checkInitialized();
    }

    public static SyncClientResVersionScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncClientResVersionScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncClientResVersionScRsp messages
     */
    public static MessageFactory<SyncClientResVersionScRsp> getFactory() {
      return SyncClientResVersionScRspFactory.INSTANCE;
    }

    private enum SyncClientResVersionScRspFactory implements MessageFactory<SyncClientResVersionScRsp> {
      INSTANCE;

      @Override
      public SyncClientResVersionScRsp create() {
        return SyncClientResVersionScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName clientResVersion = FieldName.forField("clientResVersion", "client_res_version");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}
