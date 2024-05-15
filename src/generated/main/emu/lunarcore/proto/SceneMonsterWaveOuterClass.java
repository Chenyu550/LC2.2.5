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
import us.hebi.quickbuf.RepeatedMessage;

public final class SceneMonsterWaveOuterClass {
  /**
   * Protobuf type {@code SceneMonsterWave}
   */
  public static final class SceneMonsterWave extends ProtoMessage<SceneMonsterWave> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 或14
     * </pre>
     *
     * <code>optional uint32 wave_id = 1;</code>
     */
    private int waveId;

    /**
     * <pre>
     * 或1
     * </pre>
     *
     * <code>optional uint32 stage_id = 14;</code>
     */
    private int stageId;

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     */
    private final SceneMonsterWaveParamOuterClass.SceneMonsterWaveParam waveParam = SceneMonsterWaveParamOuterClass.SceneMonsterWaveParam.newInstance();

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     */
    private final RepeatedMessage<SceneMonsterOuterClass.SceneMonster> monsterList = RepeatedMessage.newEmptyInstance(SceneMonsterOuterClass.SceneMonster.getFactory());

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     */
    private final RepeatedMessage<ItemListOuterClass.ItemList> dropList = RepeatedMessage.newEmptyInstance(ItemListOuterClass.ItemList.getFactory());

    private SceneMonsterWave() {
    }

    /**
     * @return a new empty instance of {@code SceneMonsterWave}
     */
    public static SceneMonsterWave newInstance() {
      return new SceneMonsterWave();
    }

    /**
     * <pre>
     * 或14
     * </pre>
     *
     * <code>optional uint32 wave_id = 1;</code>
     * @return whether the waveId field is set
     */
    public boolean hasWaveId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 或14
     * </pre>
     *
     * <code>optional uint32 wave_id = 1;</code>
     * @return this
     */
    public SceneMonsterWave clearWaveId() {
      bitField0_ &= ~0x00000001;
      waveId = 0;
      return this;
    }

    /**
     * <pre>
     * 或14
     * </pre>
     *
     * <code>optional uint32 wave_id = 1;</code>
     * @return the waveId
     */
    public int getWaveId() {
      return waveId;
    }

    /**
     * <pre>
     * 或14
     * </pre>
     *
     * <code>optional uint32 wave_id = 1;</code>
     * @param value the waveId to set
     * @return this
     */
    public SceneMonsterWave setWaveId(final int value) {
      bitField0_ |= 0x00000001;
      waveId = value;
      return this;
    }

    /**
     * <pre>
     * 或1
     * </pre>
     *
     * <code>optional uint32 stage_id = 14;</code>
     * @return whether the stageId field is set
     */
    public boolean hasStageId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 或1
     * </pre>
     *
     * <code>optional uint32 stage_id = 14;</code>
     * @return this
     */
    public SceneMonsterWave clearStageId() {
      bitField0_ &= ~0x00000002;
      stageId = 0;
      return this;
    }

    /**
     * <pre>
     * 或1
     * </pre>
     *
     * <code>optional uint32 stage_id = 14;</code>
     * @return the stageId
     */
    public int getStageId() {
      return stageId;
    }

    /**
     * <pre>
     * 或1
     * </pre>
     *
     * <code>optional uint32 stage_id = 14;</code>
     * @param value the stageId to set
     * @return this
     */
    public SceneMonsterWave setStageId(final int value) {
      bitField0_ |= 0x00000002;
      stageId = value;
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     * @return whether the waveParam field is set
     */
    public boolean hasWaveParam() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     * @return this
     */
    public SceneMonsterWave clearWaveParam() {
      bitField0_ &= ~0x00000004;
      waveParam.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableWaveParam()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneMonsterWaveParamOuterClass.SceneMonsterWaveParam getWaveParam() {
      return waveParam;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneMonsterWaveParamOuterClass.SceneMonsterWaveParam getMutableWaveParam() {
      bitField0_ |= 0x00000004;
      return waveParam;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>optional .SceneMonsterWaveParam wave_param = 8;</code>
     * @param value the waveParam to set
     * @return this
     */
    public SceneMonsterWave setWaveParam(
        final SceneMonsterWaveParamOuterClass.SceneMonsterWaveParam value) {
      bitField0_ |= 0x00000004;
      waveParam.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     * @return whether the monsterList field is set
     */
    public boolean hasMonsterList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     * @return this
     */
    public SceneMonsterWave clearMonsterList() {
      bitField0_ &= ~0x00000008;
      monsterList.clear();
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMonsterList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneMonsterOuterClass.SceneMonster> getMonsterList() {
      return monsterList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneMonsterOuterClass.SceneMonster> getMutableMonsterList() {
      bitField0_ |= 0x00000008;
      return monsterList;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     * @param value the monsterList to add
     * @return this
     */
    public SceneMonsterWave addMonsterList(final SceneMonsterOuterClass.SceneMonster value) {
      bitField0_ |= 0x00000008;
      monsterList.add(value);
      return this;
    }

    /**
     * <pre>
     *
     * </pre>
     *
     * <code>repeated .SceneMonster monster_list = 3;</code>
     * @param values the monsterList to add
     * @return this
     */
    public SceneMonsterWave addAllMonsterList(final SceneMonsterOuterClass.SceneMonster... values) {
      bitField0_ |= 0x00000008;
      monsterList.addAll(values);
      return this;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     * @return whether the dropList field is set
     */
    public boolean hasDropList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     * @return this
     */
    public SceneMonsterWave clearDropList() {
      bitField0_ &= ~0x00000010;
      dropList.clear();
      return this;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDropList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ItemListOuterClass.ItemList> getDropList() {
      return dropList;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ItemListOuterClass.ItemList> getMutableDropList() {
      bitField0_ |= 0x00000010;
      return dropList;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     * @param value the dropList to add
     * @return this
     */
    public SceneMonsterWave addDropList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000010;
      dropList.add(value);
      return this;
    }

    /**
     * <pre>
     * 5
     * </pre>
     *
     * <code>repeated .ItemList drop_list = 4;</code>
     * @param values the dropList to add
     * @return this
     */
    public SceneMonsterWave addAllDropList(final ItemListOuterClass.ItemList... values) {
      bitField0_ |= 0x00000010;
      dropList.addAll(values);
      return this;
    }

    @Override
    public SceneMonsterWave copyFrom(final SceneMonsterWave other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        waveId = other.waveId;
        stageId = other.stageId;
        waveParam.copyFrom(other.waveParam);
        monsterList.copyFrom(other.monsterList);
        dropList.copyFrom(other.dropList);
      }
      return this;
    }

    @Override
    public SceneMonsterWave mergeFrom(final SceneMonsterWave other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWaveId()) {
        setWaveId(other.waveId);
      }
      if (other.hasStageId()) {
        setStageId(other.stageId);
      }
      if (other.hasWaveParam()) {
        getMutableWaveParam().mergeFrom(other.waveParam);
      }
      if (other.hasMonsterList()) {
        getMutableMonsterList().addAll(other.monsterList);
      }
      if (other.hasDropList()) {
        getMutableDropList().addAll(other.dropList);
      }
      return this;
    }

    @Override
    public SceneMonsterWave clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      waveId = 0;
      stageId = 0;
      waveParam.clear();
      monsterList.clear();
      dropList.clear();
      return this;
    }

    @Override
    public SceneMonsterWave clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      waveParam.clearQuick();
      monsterList.clearQuick();
      dropList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneMonsterWave)) {
        return false;
      }
      SceneMonsterWave other = (SceneMonsterWave) o;
      return bitField0_ == other.bitField0_
        && (!hasWaveId() || waveId == other.waveId)
        && (!hasStageId() || stageId == other.stageId)
        && (!hasWaveParam() || waveParam.equals(other.waveParam))
        && (!hasMonsterList() || monsterList.equals(other.monsterList))
        && (!hasDropList() || dropList.equals(other.dropList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(waveId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(waveParam);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < monsterList.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(monsterList.get(i));
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < dropList.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(dropList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(waveId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(waveParam);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * monsterList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(monsterList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * dropList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dropList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneMonsterWave mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // waveId
            waveId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // stageId
            stageId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // waveParam
            input.readMessage(waveParam);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // monsterList
            tag = input.readRepeatedMessage(monsterList, tag);
            bitField0_ |= 0x00000008;
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // dropList
            tag = input.readRepeatedMessage(dropList, tag);
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.waveId, waveId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.stageId, stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.waveParam, waveParam);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.monsterList, monsterList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.dropList, dropList);
      }
      output.endObject();
    }

    @Override
    public SceneMonsterWave mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -794902028:
          case 1127862305: {
            if (input.isAtField(FieldNames.waveId)) {
              if (!input.trySkipNullValue()) {
                waveId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1897528135:
          case 1306191356: {
            if (input.isAtField(FieldNames.stageId)) {
              if (!input.trySkipNullValue()) {
                stageId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1529841940:
          case 623259591: {
            if (input.isAtField(FieldNames.waveParam)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(waveParam);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1541271448:
          case 552401379: {
            if (input.isAtField(FieldNames.monsterList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(monsterList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -432782291:
          case -513722386: {
            if (input.isAtField(FieldNames.dropList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dropList);
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
    public SceneMonsterWave clone() {
      return new SceneMonsterWave().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneMonsterWave parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneMonsterWave(), data).checkInitialized();
    }

    public static SceneMonsterWave parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneMonsterWave(), input).checkInitialized();
    }

    public static SceneMonsterWave parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneMonsterWave(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneMonsterWave messages
     */
    public static MessageFactory<SceneMonsterWave> getFactory() {
      return SceneMonsterWaveFactory.INSTANCE;
    }

    private enum SceneMonsterWaveFactory implements MessageFactory<SceneMonsterWave> {
      INSTANCE;

      @Override
      public SceneMonsterWave create() {
        return SceneMonsterWave.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName waveId = FieldName.forField("waveId", "wave_id");

      static final FieldName stageId = FieldName.forField("stageId", "stage_id");

      static final FieldName waveParam = FieldName.forField("waveParam", "wave_param");

      static final FieldName monsterList = FieldName.forField("monsterList", "monster_list");

      static final FieldName dropList = FieldName.forField("dropList", "drop_list");
    }
  }
}
