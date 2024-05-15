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

public final class EnterMapRotationRegionCsReqOuterClass {
  /**
   * Protobuf type {@code EnterMapRotationRegionCsReq}
   */
  public static final class EnterMapRotationRegionCsReq extends ProtoMessage<EnterMapRotationRegionCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    private EnterMapRotationRegionCsReq() {
    }

    /**
     * @return a new empty instance of {@code EnterMapRotationRegionCsReq}
     */
    public static EnterMapRotationRegionCsReq newInstance() {
      return new EnterMapRotationRegionCsReq();
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     * @return this
     */
    public EnterMapRotationRegionCsReq clearMotion() {
      bitField0_ &= ~0x00000001;
      motion.clear();
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000001;
      return motion;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional .MotionInfo motion = 5;</code>
     * @param value the motion to set
     * @return this
     */
    public EnterMapRotationRegionCsReq setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000001;
      motion.copyFrom(value);
      return this;
    }

    @Override
    public EnterMapRotationRegionCsReq copyFrom(final EnterMapRotationRegionCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        motion.copyFrom(other.motion);
      }
      return this;
    }

    @Override
    public EnterMapRotationRegionCsReq mergeFrom(final EnterMapRotationRegionCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      return this;
    }

    @Override
    public EnterMapRotationRegionCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clear();
      return this;
    }

    @Override
    public EnterMapRotationRegionCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EnterMapRotationRegionCsReq)) {
        return false;
      }
      EnterMapRotationRegionCsReq other = (EnterMapRotationRegionCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMotion() || motion.equals(other.motion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(motion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnterMapRotationRegionCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 42: {
            // motion
            input.readMessage(motion);
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
        output.writeMessage(FieldNames.motion, motion);
      }
      output.endObject();
    }

    @Override
    public EnterMapRotationRegionCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
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
    public EnterMapRotationRegionCsReq clone() {
      return new EnterMapRotationRegionCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnterMapRotationRegionCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnterMapRotationRegionCsReq(), data).checkInitialized();
    }

    public static EnterMapRotationRegionCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new EnterMapRotationRegionCsReq(), input).checkInitialized();
    }

    public static EnterMapRotationRegionCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EnterMapRotationRegionCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnterMapRotationRegionCsReq messages
     */
    public static MessageFactory<EnterMapRotationRegionCsReq> getFactory() {
      return EnterMapRotationRegionCsReqFactory.INSTANCE;
    }

    private enum EnterMapRotationRegionCsReqFactory implements MessageFactory<EnterMapRotationRegionCsReq> {
      INSTANCE;

      @Override
      public EnterMapRotationRegionCsReq create() {
        return EnterMapRotationRegionCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName motion = FieldName.forField("motion");
    }
  }
}
