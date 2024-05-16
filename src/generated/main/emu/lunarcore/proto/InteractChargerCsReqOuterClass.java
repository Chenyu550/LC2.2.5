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

public final class InteractChargerCsReqOuterClass {
  /**
   * Protobuf type {@code InteractChargerCsReq}
   */
  public static final class InteractChargerCsReq extends ProtoMessage<InteractChargerCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     */
    private final ChargerInfoOuterClass.ChargerInfo chargerInfo = ChargerInfoOuterClass.ChargerInfo.newInstance();

    private InteractChargerCsReq() {
    }

    /**
     * @return a new empty instance of {@code InteractChargerCsReq}
     */
    public static InteractChargerCsReq newInstance() {
      return new InteractChargerCsReq();
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     * @return whether the chargerInfo field is set
     */
    public boolean hasChargerInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     * @return this
     */
    public InteractChargerCsReq clearChargerInfo() {
      bitField0_ &= ~0x00000001;
      chargerInfo.clear();
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChargerInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChargerInfoOuterClass.ChargerInfo getChargerInfo() {
      return chargerInfo;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChargerInfoOuterClass.ChargerInfo getMutableChargerInfo() {
      bitField0_ |= 0x00000001;
      return chargerInfo;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .ChargerInfo charger_info = 2;</code>
     * @param value the chargerInfo to set
     * @return this
     */
    public InteractChargerCsReq setChargerInfo(final ChargerInfoOuterClass.ChargerInfo value) {
      bitField0_ |= 0x00000001;
      chargerInfo.copyFrom(value);
      return this;
    }

    @Override
    public InteractChargerCsReq copyFrom(final InteractChargerCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        chargerInfo.copyFrom(other.chargerInfo);
      }
      return this;
    }

    @Override
    public InteractChargerCsReq mergeFrom(final InteractChargerCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasChargerInfo()) {
        getMutableChargerInfo().mergeFrom(other.chargerInfo);
      }
      return this;
    }

    @Override
    public InteractChargerCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      chargerInfo.clear();
      return this;
    }

    @Override
    public InteractChargerCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      chargerInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof InteractChargerCsReq)) {
        return false;
      }
      InteractChargerCsReq other = (InteractChargerCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasChargerInfo() || chargerInfo.equals(other.chargerInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(chargerInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(chargerInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public InteractChargerCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // chargerInfo
            input.readMessage(chargerInfo);
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
        output.writeMessage(FieldNames.chargerInfo, chargerInfo);
      }
      output.endObject();
    }

    @Override
    public InteractChargerCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1038073356:
          case 2135678991: {
            if (input.isAtField(FieldNames.chargerInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(chargerInfo);
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
    public InteractChargerCsReq clone() {
      return new InteractChargerCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static InteractChargerCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new InteractChargerCsReq(), data).checkInitialized();
    }

    public static InteractChargerCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractChargerCsReq(), input).checkInitialized();
    }

    public static InteractChargerCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new InteractChargerCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating InteractChargerCsReq messages
     */
    public static MessageFactory<InteractChargerCsReq> getFactory() {
      return InteractChargerCsReqFactory.INSTANCE;
    }

    private enum InteractChargerCsReqFactory implements MessageFactory<InteractChargerCsReq> {
      INSTANCE;

      @Override
      public InteractChargerCsReq create() {
        return InteractChargerCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName chargerInfo = FieldName.forField("chargerInfo", "charger_info");
    }
  }
}
