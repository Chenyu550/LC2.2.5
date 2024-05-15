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

public final class ScenePropInfoOuterClass {
  /**
   * Protobuf type {@code ScenePropInfo}
   */
  public static final class ScenePropInfo extends ProtoMessage<ScenePropInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 1;</code>
     */
    private long createTimeMs;

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 prop_id = 5;</code>
     */
    private int propId;

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 life_time_ms = 6;</code>
     */
    private int lifeTimeMs;

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 prop_state = 11;</code>
     */
    private int propState;

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     */
    private final PropExtraInfoOuterClass.PropExtraInfo extraInfo = PropExtraInfoOuterClass.PropExtraInfo.newInstance();

    private ScenePropInfo() {
    }

    /**
     * @return a new empty instance of {@code ScenePropInfo}
     */
    public static ScenePropInfo newInstance() {
      return new ScenePropInfo();
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 1;</code>
     * @return whether the createTimeMs field is set
     */
    public boolean hasCreateTimeMs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 1;</code>
     * @return this
     */
    public ScenePropInfo clearCreateTimeMs() {
      bitField0_ &= ~0x00000001;
      createTimeMs = 0L;
      return this;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 1;</code>
     * @return the createTimeMs
     */
    public long getCreateTimeMs() {
      return createTimeMs;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint64 create_time_ms = 1;</code>
     * @param value the createTimeMs to set
     * @return this
     */
    public ScenePropInfo setCreateTimeMs(final long value) {
      bitField0_ |= 0x00000001;
      createTimeMs = value;
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 prop_id = 5;</code>
     * @return whether the propId field is set
     */
    public boolean hasPropId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 prop_id = 5;</code>
     * @return this
     */
    public ScenePropInfo clearPropId() {
      bitField0_ &= ~0x00000002;
      propId = 0;
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 prop_id = 5;</code>
     * @return the propId
     */
    public int getPropId() {
      return propId;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional uint32 prop_id = 5;</code>
     * @param value the propId to set
     * @return this
     */
    public ScenePropInfo setPropId(final int value) {
      bitField0_ |= 0x00000002;
      propId = value;
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 life_time_ms = 6;</code>
     * @return whether the lifeTimeMs field is set
     */
    public boolean hasLifeTimeMs() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 life_time_ms = 6;</code>
     * @return this
     */
    public ScenePropInfo clearLifeTimeMs() {
      bitField0_ &= ~0x00000004;
      lifeTimeMs = 0;
      return this;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 life_time_ms = 6;</code>
     * @return the lifeTimeMs
     */
    public int getLifeTimeMs() {
      return lifeTimeMs;
    }

    /**
     * <pre>
     * 7
     * </pre>
     *
     * <code>optional uint32 life_time_ms = 6;</code>
     * @param value the lifeTimeMs to set
     * @return this
     */
    public ScenePropInfo setLifeTimeMs(final int value) {
      bitField0_ |= 0x00000004;
      lifeTimeMs = value;
      return this;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 prop_state = 11;</code>
     * @return whether the propState field is set
     */
    public boolean hasPropState() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 prop_state = 11;</code>
     * @return this
     */
    public ScenePropInfo clearPropState() {
      bitField0_ &= ~0x00000008;
      propState = 0;
      return this;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 prop_state = 11;</code>
     * @return the propState
     */
    public int getPropState() {
      return propState;
    }

    /**
     * <pre>
     * 10
     * </pre>
     *
     * <code>optional uint32 prop_state = 11;</code>
     * @param value the propState to set
     * @return this
     */
    public ScenePropInfo setPropState(final int value) {
      bitField0_ |= 0x00000008;
      propState = value;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     * @return whether the extraInfo field is set
     */
    public boolean hasExtraInfo() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     * @return this
     */
    public ScenePropInfo clearExtraInfo() {
      bitField0_ &= ~0x00000010;
      extraInfo.clear();
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtraInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PropExtraInfoOuterClass.PropExtraInfo getExtraInfo() {
      return extraInfo;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PropExtraInfoOuterClass.PropExtraInfo getMutableExtraInfo() {
      bitField0_ |= 0x00000010;
      return extraInfo;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional .PropExtraInfo extra_info = 15;</code>
     * @param value the extraInfo to set
     * @return this
     */
    public ScenePropInfo setExtraInfo(final PropExtraInfoOuterClass.PropExtraInfo value) {
      bitField0_ |= 0x00000010;
      extraInfo.copyFrom(value);
      return this;
    }

    @Override
    public ScenePropInfo copyFrom(final ScenePropInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        createTimeMs = other.createTimeMs;
        propId = other.propId;
        lifeTimeMs = other.lifeTimeMs;
        propState = other.propState;
        extraInfo.copyFrom(other.extraInfo);
      }
      return this;
    }

    @Override
    public ScenePropInfo mergeFrom(final ScenePropInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCreateTimeMs()) {
        setCreateTimeMs(other.createTimeMs);
      }
      if (other.hasPropId()) {
        setPropId(other.propId);
      }
      if (other.hasLifeTimeMs()) {
        setLifeTimeMs(other.lifeTimeMs);
      }
      if (other.hasPropState()) {
        setPropState(other.propState);
      }
      if (other.hasExtraInfo()) {
        getMutableExtraInfo().mergeFrom(other.extraInfo);
      }
      return this;
    }

    @Override
    public ScenePropInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      createTimeMs = 0L;
      propId = 0;
      lifeTimeMs = 0;
      propState = 0;
      extraInfo.clear();
      return this;
    }

    @Override
    public ScenePropInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      extraInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ScenePropInfo)) {
        return false;
      }
      ScenePropInfo other = (ScenePropInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasCreateTimeMs() || createTimeMs == other.createTimeMs)
        && (!hasPropId() || propId == other.propId)
        && (!hasLifeTimeMs() || lifeTimeMs == other.lifeTimeMs)
        && (!hasPropState() || propState == other.propState)
        && (!hasExtraInfo() || extraInfo.equals(other.extraInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt64NoTag(createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(propId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(lifeTimeMs);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(propState);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(extraInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(lifeTimeMs);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propState);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extraInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ScenePropInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // createTimeMs
            createTimeMs = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // propId
            propId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // lifeTimeMs
            lifeTimeMs = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // propState
            propState = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // extraInfo
            input.readMessage(extraInfo);
            bitField0_ |= 0x00000010;
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
        output.writeUInt64(FieldNames.createTimeMs, createTimeMs);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.propId, propId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.lifeTimeMs, lifeTimeMs);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.propState, propState);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.extraInfo, extraInfo);
      }
      output.endObject();
    }

    @Override
    public ScenePropInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1554103663:
          case 1902222357: {
            if (input.isAtField(FieldNames.createTimeMs)) {
              if (!input.trySkipNullValue()) {
                createTimeMs = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -979804194:
          case -309137545: {
            if (input.isAtField(FieldNames.propId)) {
              if (!input.trySkipNullValue()) {
                propId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1226028177:
          case 1665182229: {
            if (input.isAtField(FieldNames.lifeTimeMs)) {
              if (!input.trySkipNullValue()) {
                lifeTimeMs = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -739191058:
          case -1096911691: {
            if (input.isAtField(FieldNames.propState)) {
              if (!input.trySkipNullValue()) {
                propState = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -253631266:
          case 747541373: {
            if (input.isAtField(FieldNames.extraInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extraInfo);
                bitField0_ |= 0x00000010;
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
    public ScenePropInfo clone() {
      return new ScenePropInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ScenePropInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ScenePropInfo(), data).checkInitialized();
    }

    public static ScenePropInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ScenePropInfo(), input).checkInitialized();
    }

    public static ScenePropInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ScenePropInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ScenePropInfo messages
     */
    public static MessageFactory<ScenePropInfo> getFactory() {
      return ScenePropInfoFactory.INSTANCE;
    }

    private enum ScenePropInfoFactory implements MessageFactory<ScenePropInfo> {
      INSTANCE;

      @Override
      public ScenePropInfo create() {
        return ScenePropInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName createTimeMs = FieldName.forField("createTimeMs", "create_time_ms");

      static final FieldName propId = FieldName.forField("propId", "prop_id");

      static final FieldName lifeTimeMs = FieldName.forField("lifeTimeMs", "life_time_ms");

      static final FieldName propState = FieldName.forField("propState", "prop_state");

      static final FieldName extraInfo = FieldName.forField("extraInfo", "extra_info");
    }
  }
}
