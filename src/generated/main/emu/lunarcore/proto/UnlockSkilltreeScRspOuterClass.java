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

public final class UnlockSkilltreeScRspOuterClass {
  /**
   * Protobuf type {@code UnlockSkilltreeScRsp}
   */
  public static final class UnlockSkilltreeScRsp extends ProtoMessage<UnlockSkilltreeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 point_id = 5;</code>
     */
    private int pointId;

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 base_avatar_id = 6;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 level = 8;</code>
     */
    private int level;

    private UnlockSkilltreeScRsp() {
    }

    /**
     * @return a new empty instance of {@code UnlockSkilltreeScRsp}
     */
    public static UnlockSkilltreeScRsp newInstance() {
      return new UnlockSkilltreeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public UnlockSkilltreeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public UnlockSkilltreeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 point_id = 5;</code>
     * @return whether the pointId field is set
     */
    public boolean hasPointId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 point_id = 5;</code>
     * @return this
     */
    public UnlockSkilltreeScRsp clearPointId() {
      bitField0_ &= ~0x00000002;
      pointId = 0;
      return this;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 point_id = 5;</code>
     * @return the pointId
     */
    public int getPointId() {
      return pointId;
    }

    /**
     * <pre>
     * 12
     * </pre>
     *
     * <code>optional uint32 point_id = 5;</code>
     * @param value the pointId to set
     * @return this
     */
    public UnlockSkilltreeScRsp setPointId(final int value) {
      bitField0_ |= 0x00000002;
      pointId = value;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 base_avatar_id = 6;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 base_avatar_id = 6;</code>
     * @return this
     */
    public UnlockSkilltreeScRsp clearBaseAvatarId() {
      bitField0_ &= ~0x00000004;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 base_avatar_id = 6;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 base_avatar_id = 6;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public UnlockSkilltreeScRsp setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000004;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return this
     */
    public UnlockSkilltreeScRsp clearLevel() {
      bitField0_ &= ~0x00000008;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 8;</code>
     * @param value the level to set
     * @return this
     */
    public UnlockSkilltreeScRsp setLevel(final int value) {
      bitField0_ |= 0x00000008;
      level = value;
      return this;
    }

    @Override
    public UnlockSkilltreeScRsp copyFrom(final UnlockSkilltreeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        pointId = other.pointId;
        baseAvatarId = other.baseAvatarId;
        level = other.level;
      }
      return this;
    }

    @Override
    public UnlockSkilltreeScRsp mergeFrom(final UnlockSkilltreeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPointId()) {
        setPointId(other.pointId);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      return this;
    }

    @Override
    public UnlockSkilltreeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      pointId = 0;
      baseAvatarId = 0;
      level = 0;
      return this;
    }

    @Override
    public UnlockSkilltreeScRsp clearQuick() {
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
      if (!(o instanceof UnlockSkilltreeScRsp)) {
        return false;
      }
      UnlockSkilltreeScRsp other = (UnlockSkilltreeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPointId() || pointId == other.pointId)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasLevel() || level == other.level);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(pointId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(level);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(pointId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockSkilltreeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // pointId
            pointId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.pointId, pointId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      output.endObject();
    }

    @Override
    public UnlockSkilltreeScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -400606517:
          case 466121258: {
            if (input.isAtField(FieldNames.pointId)) {
              if (!input.trySkipNullValue()) {
                pointId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000008;
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
    public UnlockSkilltreeScRsp clone() {
      return new UnlockSkilltreeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockSkilltreeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockSkilltreeScRsp(), data).checkInitialized();
    }

    public static UnlockSkilltreeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockSkilltreeScRsp(), input).checkInitialized();
    }

    public static UnlockSkilltreeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockSkilltreeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockSkilltreeScRsp messages
     */
    public static MessageFactory<UnlockSkilltreeScRsp> getFactory() {
      return UnlockSkilltreeScRspFactory.INSTANCE;
    }

    private enum UnlockSkilltreeScRspFactory implements MessageFactory<UnlockSkilltreeScRsp> {
      INSTANCE;

      @Override
      public UnlockSkilltreeScRsp create() {
        return UnlockSkilltreeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName pointId = FieldName.forField("pointId", "point_id");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName level = FieldName.forField("level");
    }
  }
}
