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

public final class GetGachaCeilingCsReqOuterClass {
  /**
   * Protobuf type {@code GetGachaCeilingCsReq}
   */
  public static final class GetGachaCeilingCsReq extends ProtoMessage<GetGachaCeilingCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional uint32 gacha_type = 7;</code>
     */
    private int gachaType;

    private GetGachaCeilingCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetGachaCeilingCsReq}
     */
    public static GetGachaCeilingCsReq newInstance() {
      return new GetGachaCeilingCsReq();
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional uint32 gacha_type = 7;</code>
     * @return whether the gachaType field is set
     */
    public boolean hasGachaType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional uint32 gacha_type = 7;</code>
     * @return this
     */
    public GetGachaCeilingCsReq clearGachaType() {
      bitField0_ &= ~0x00000001;
      gachaType = 0;
      return this;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional uint32 gacha_type = 7;</code>
     * @return the gachaType
     */
    public int getGachaType() {
      return gachaType;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional uint32 gacha_type = 7;</code>
     * @param value the gachaType to set
     * @return this
     */
    public GetGachaCeilingCsReq setGachaType(final int value) {
      bitField0_ |= 0x00000001;
      gachaType = value;
      return this;
    }

    @Override
    public GetGachaCeilingCsReq copyFrom(final GetGachaCeilingCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gachaType = other.gachaType;
      }
      return this;
    }

    @Override
    public GetGachaCeilingCsReq mergeFrom(final GetGachaCeilingCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGachaType()) {
        setGachaType(other.gachaType);
      }
      return this;
    }

    @Override
    public GetGachaCeilingCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaType = 0;
      return this;
    }

    @Override
    public GetGachaCeilingCsReq clearQuick() {
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
      if (!(o instanceof GetGachaCeilingCsReq)) {
        return false;
      }
      GetGachaCeilingCsReq other = (GetGachaCeilingCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGachaType() || gachaType == other.gachaType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(gachaType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetGachaCeilingCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // gachaType
            gachaType = input.readUInt32();
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
        output.writeUInt32(FieldNames.gachaType, gachaType);
      }
      output.endObject();
    }

    @Override
    public GetGachaCeilingCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 802848732:
          case -871474217: {
            if (input.isAtField(FieldNames.gachaType)) {
              if (!input.trySkipNullValue()) {
                gachaType = input.readUInt32();
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
    public GetGachaCeilingCsReq clone() {
      return new GetGachaCeilingCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetGachaCeilingCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetGachaCeilingCsReq(), data).checkInitialized();
    }

    public static GetGachaCeilingCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetGachaCeilingCsReq(), input).checkInitialized();
    }

    public static GetGachaCeilingCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetGachaCeilingCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetGachaCeilingCsReq messages
     */
    public static MessageFactory<GetGachaCeilingCsReq> getFactory() {
      return GetGachaCeilingCsReqFactory.INSTANCE;
    }

    private enum GetGachaCeilingCsReqFactory implements MessageFactory<GetGachaCeilingCsReq> {
      INSTANCE;

      @Override
      public GetGachaCeilingCsReq create() {
        return GetGachaCeilingCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gachaType = FieldName.forField("gachaType", "gacha_type");
    }
  }
}
