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

public final class StartCocoonStageCsReqOuterClass {
  /**
   * Protobuf type {@code StartCocoonStageCsReq}
   */
  public static final class StartCocoonStageCsReq extends ProtoMessage<StartCocoonStageCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 wave = 2;</code>
     */
    private int wave;

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 prop_entity_id = 7;</code>
     */
    private int propEntityId;

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 cocoon_id = 9;</code>
     */
    private int cocoonId;

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 world_level = 15;</code>
     */
    private int worldLevel;

    private StartCocoonStageCsReq() {
    }

    /**
     * @return a new empty instance of {@code StartCocoonStageCsReq}
     */
    public static StartCocoonStageCsReq newInstance() {
      return new StartCocoonStageCsReq();
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 wave = 2;</code>
     * @return whether the wave field is set
     */
    public boolean hasWave() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 wave = 2;</code>
     * @return this
     */
    public StartCocoonStageCsReq clearWave() {
      bitField0_ &= ~0x00000001;
      wave = 0;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 wave = 2;</code>
     * @return the wave
     */
    public int getWave() {
      return wave;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional uint32 wave = 2;</code>
     * @param value the wave to set
     * @return this
     */
    public StartCocoonStageCsReq setWave(final int value) {
      bitField0_ |= 0x00000001;
      wave = value;
      return this;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 prop_entity_id = 7;</code>
     * @return whether the propEntityId field is set
     */
    public boolean hasPropEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 prop_entity_id = 7;</code>
     * @return this
     */
    public StartCocoonStageCsReq clearPropEntityId() {
      bitField0_ &= ~0x00000002;
      propEntityId = 0;
      return this;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 prop_entity_id = 7;</code>
     * @return the propEntityId
     */
    public int getPropEntityId() {
      return propEntityId;
    }

    /**
     * <pre>
     * 9
     * </pre>
     *
     * <code>optional uint32 prop_entity_id = 7;</code>
     * @param value the propEntityId to set
     * @return this
     */
    public StartCocoonStageCsReq setPropEntityId(final int value) {
      bitField0_ |= 0x00000002;
      propEntityId = value;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return whether the cocoonId field is set
     */
    public boolean hasCocoonId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return this
     */
    public StartCocoonStageCsReq clearCocoonId() {
      bitField0_ &= ~0x00000004;
      cocoonId = 0;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 cocoon_id = 9;</code>
     * @return the cocoonId
     */
    public int getCocoonId() {
      return cocoonId;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional uint32 cocoon_id = 9;</code>
     * @param value the cocoonId to set
     * @return this
     */
    public StartCocoonStageCsReq setCocoonId(final int value) {
      bitField0_ |= 0x00000004;
      cocoonId = value;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 world_level = 15;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 world_level = 15;</code>
     * @return this
     */
    public StartCocoonStageCsReq clearWorldLevel() {
      bitField0_ &= ~0x00000008;
      worldLevel = 0;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 world_level = 15;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>optional uint32 world_level = 15;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public StartCocoonStageCsReq setWorldLevel(final int value) {
      bitField0_ |= 0x00000008;
      worldLevel = value;
      return this;
    }

    @Override
    public StartCocoonStageCsReq copyFrom(final StartCocoonStageCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        wave = other.wave;
        propEntityId = other.propEntityId;
        cocoonId = other.cocoonId;
        worldLevel = other.worldLevel;
      }
      return this;
    }

    @Override
    public StartCocoonStageCsReq mergeFrom(final StartCocoonStageCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWave()) {
        setWave(other.wave);
      }
      if (other.hasPropEntityId()) {
        setPropEntityId(other.propEntityId);
      }
      if (other.hasCocoonId()) {
        setCocoonId(other.cocoonId);
      }
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      return this;
    }

    @Override
    public StartCocoonStageCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      wave = 0;
      propEntityId = 0;
      cocoonId = 0;
      worldLevel = 0;
      return this;
    }

    @Override
    public StartCocoonStageCsReq clearQuick() {
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
      if (!(o instanceof StartCocoonStageCsReq)) {
        return false;
      }
      StartCocoonStageCsReq other = (StartCocoonStageCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasWave() || wave == other.wave)
        && (!hasPropEntityId() || propEntityId == other.propEntityId)
        && (!hasCocoonId() || cocoonId == other.cocoonId)
        && (!hasWorldLevel() || worldLevel == other.worldLevel);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(worldLevel);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartCocoonStageCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // wave
            wave = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // propEntityId
            propEntityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // cocoonId
            cocoonId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // worldLevel
            worldLevel = input.readUInt32();
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
        output.writeUInt32(FieldNames.wave, wave);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.propEntityId, propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.cocoonId, cocoonId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      output.endObject();
    }

    @Override
    public StartCocoonStageCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3642105: {
            if (input.isAtField(FieldNames.wave)) {
              if (!input.trySkipNullValue()) {
                wave = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -68717343:
          case -57484005: {
            if (input.isAtField(FieldNames.propEntityId)) {
              if (!input.trySkipNullValue()) {
                propEntityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -886563534:
          case -1713644381: {
            if (input.isAtField(FieldNames.cocoonId)) {
              if (!input.trySkipNullValue()) {
                cocoonId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
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
    public StartCocoonStageCsReq clone() {
      return new StartCocoonStageCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartCocoonStageCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartCocoonStageCsReq(), data).checkInitialized();
    }

    public static StartCocoonStageCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartCocoonStageCsReq(), input).checkInitialized();
    }

    public static StartCocoonStageCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartCocoonStageCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartCocoonStageCsReq messages
     */
    public static MessageFactory<StartCocoonStageCsReq> getFactory() {
      return StartCocoonStageCsReqFactory.INSTANCE;
    }

    private enum StartCocoonStageCsReqFactory implements MessageFactory<StartCocoonStageCsReq> {
      INSTANCE;

      @Override
      public StartCocoonStageCsReq create() {
        return StartCocoonStageCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName wave = FieldName.forField("wave");

      static final FieldName propEntityId = FieldName.forField("propEntityId", "prop_entity_id");

      static final FieldName cocoonId = FieldName.forField("cocoonId", "cocoon_id");

      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");
    }
  }
}
