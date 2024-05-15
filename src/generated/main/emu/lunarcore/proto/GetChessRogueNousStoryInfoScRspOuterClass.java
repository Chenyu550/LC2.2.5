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

public final class GetChessRogueNousStoryInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetChessRogueNousStoryInfoScRsp}
   */
  public static final class GetChessRogueNousStoryInfoScRsp extends ProtoMessage<GetChessRogueNousStoryInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     */
    private final RepeatedMessage<ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo> subStoryInfo = RepeatedMessage.newEmptyInstance(ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo.getFactory());

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     */
    private final RepeatedMessage<ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo> mainStoryInfo = RepeatedMessage.newEmptyInstance(ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo.getFactory());

    private GetChessRogueNousStoryInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetChessRogueNousStoryInfoScRsp}
     */
    public static GetChessRogueNousStoryInfoScRsp newInstance() {
      return new GetChessRogueNousStoryInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     * @return whether the subStoryInfo field is set
     */
    public boolean hasSubStoryInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp clearSubStoryInfo() {
      bitField0_ &= ~0x00000002;
      subStoryInfo.clear();
      return this;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubStoryInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo> getSubStoryInfo(
        ) {
      return subStoryInfo;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo> getMutableSubStoryInfo(
        ) {
      bitField0_ |= 0x00000002;
      return subStoryInfo;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     * @param value the subStoryInfo to add
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp addSubStoryInfo(
        final ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo value) {
      bitField0_ |= 0x00000002;
      subStoryInfo.add(value);
      return this;
    }

    /**
     * <pre>
     * or 15
     * </pre>
     *
     * <code>repeated .ChessRogueNousSubStoryInfo sub_story_info = 14;</code>
     * @param values the subStoryInfo to add
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp addAllSubStoryInfo(
        final ChessRogueNousSubStoryInfoOuterClass.ChessRogueNousSubStoryInfo... values) {
      bitField0_ |= 0x00000002;
      subStoryInfo.addAll(values);
      return this;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     * @return whether the mainStoryInfo field is set
     */
    public boolean hasMainStoryInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp clearMainStoryInfo() {
      bitField0_ &= ~0x00000004;
      mainStoryInfo.clear();
      return this;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMainStoryInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo> getMainStoryInfo(
        ) {
      return mainStoryInfo;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo> getMutableMainStoryInfo(
        ) {
      bitField0_ |= 0x00000004;
      return mainStoryInfo;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     * @param value the mainStoryInfo to add
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp addMainStoryInfo(
        final ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo value) {
      bitField0_ |= 0x00000004;
      mainStoryInfo.add(value);
      return this;
    }

    /**
     * <pre>
     * or 14
     * </pre>
     *
     * <code>repeated .ChessRogueNousMainStoryInfo main_story_info = 15;</code>
     * @param values the mainStoryInfo to add
     * @return this
     */
    public GetChessRogueNousStoryInfoScRsp addAllMainStoryInfo(
        final ChessRogueNousMainStoryInfoOuterClass.ChessRogueNousMainStoryInfo... values) {
      bitField0_ |= 0x00000004;
      mainStoryInfo.addAll(values);
      return this;
    }

    @Override
    public GetChessRogueNousStoryInfoScRsp copyFrom(final GetChessRogueNousStoryInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        subStoryInfo.copyFrom(other.subStoryInfo);
        mainStoryInfo.copyFrom(other.mainStoryInfo);
      }
      return this;
    }

    @Override
    public GetChessRogueNousStoryInfoScRsp mergeFrom(final GetChessRogueNousStoryInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasSubStoryInfo()) {
        getMutableSubStoryInfo().addAll(other.subStoryInfo);
      }
      if (other.hasMainStoryInfo()) {
        getMutableMainStoryInfo().addAll(other.mainStoryInfo);
      }
      return this;
    }

    @Override
    public GetChessRogueNousStoryInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      subStoryInfo.clear();
      mainStoryInfo.clear();
      return this;
    }

    @Override
    public GetChessRogueNousStoryInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subStoryInfo.clearQuick();
      mainStoryInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetChessRogueNousStoryInfoScRsp)) {
        return false;
      }
      GetChessRogueNousStoryInfoScRsp other = (GetChessRogueNousStoryInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasSubStoryInfo() || subStoryInfo.equals(other.subStoryInfo))
        && (!hasMainStoryInfo() || mainStoryInfo.equals(other.mainStoryInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < subStoryInfo.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(subStoryInfo.get(i));
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < mainStoryInfo.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(mainStoryInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * subStoryInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subStoryInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * mainStoryInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mainStoryInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetChessRogueNousStoryInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // subStoryInfo
            tag = input.readRepeatedMessage(subStoryInfo, tag);
            bitField0_ |= 0x00000002;
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // mainStoryInfo
            tag = input.readRepeatedMessage(mainStoryInfo, tag);
            bitField0_ |= 0x00000004;
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
        output.writeRepeatedMessage(FieldNames.subStoryInfo, subStoryInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.mainStoryInfo, mainStoryInfo);
      }
      output.endObject();
    }

    @Override
    public GetChessRogueNousStoryInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -489637661:
          case 74622231: {
            if (input.isAtField(FieldNames.subStoryInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subStoryInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1591069066:
          case -1820973058: {
            if (input.isAtField(FieldNames.mainStoryInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mainStoryInfo);
                bitField0_ |= 0x00000004;
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
    public GetChessRogueNousStoryInfoScRsp clone() {
      return new GetChessRogueNousStoryInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetChessRogueNousStoryInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetChessRogueNousStoryInfoScRsp(), data).checkInitialized();
    }

    public static GetChessRogueNousStoryInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetChessRogueNousStoryInfoScRsp(), input).checkInitialized();
    }

    public static GetChessRogueNousStoryInfoScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetChessRogueNousStoryInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetChessRogueNousStoryInfoScRsp messages
     */
    public static MessageFactory<GetChessRogueNousStoryInfoScRsp> getFactory() {
      return GetChessRogueNousStoryInfoScRspFactory.INSTANCE;
    }

    private enum GetChessRogueNousStoryInfoScRspFactory implements MessageFactory<GetChessRogueNousStoryInfoScRsp> {
      INSTANCE;

      @Override
      public GetChessRogueNousStoryInfoScRsp create() {
        return GetChessRogueNousStoryInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName subStoryInfo = FieldName.forField("subStoryInfo", "sub_story_info");

      static final FieldName mainStoryInfo = FieldName.forField("mainStoryInfo", "main_story_info");
    }
  }
}
