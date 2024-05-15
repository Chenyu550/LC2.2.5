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
import us.hebi.quickbuf.RepeatedInt;

public final class GetSceneMapInfoCsReqOuterClass {
  /**
   * Protobuf type {@code GetSceneMapInfoCsReq}
   */
  public static final class GetSceneMapInfoCsReq extends ProtoMessage<GetSceneMapInfoCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 entry_id = 9;</code>
     */
    private int entryId;

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     */
    private final RepeatedInt entryIdList = RepeatedInt.newEmptyInstance();

    private GetSceneMapInfoCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetSceneMapInfoCsReq}
     */
    public static GetSceneMapInfoCsReq newInstance() {
      return new GetSceneMapInfoCsReq();
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 entry_id = 9;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 entry_id = 9;</code>
     * @return this
     */
    public GetSceneMapInfoCsReq clearEntryId() {
      bitField0_ &= ~0x00000001;
      entryId = 0;
      return this;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 entry_id = 9;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <pre>
     * 11
     * </pre>
     *
     * <code>optional uint32 entry_id = 9;</code>
     * @param value the entryId to set
     * @return this
     */
    public GetSceneMapInfoCsReq setEntryId(final int value) {
      bitField0_ |= 0x00000001;
      entryId = value;
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     * @return whether the entryIdList field is set
     */
    public boolean hasEntryIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     * @return this
     */
    public GetSceneMapInfoCsReq clearEntryIdList() {
      bitField0_ &= ~0x00000002;
      entryIdList.clear();
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntryIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getEntryIdList() {
      return entryIdList;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableEntryIdList() {
      bitField0_ |= 0x00000002;
      return entryIdList;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     * @param value the entryIdList to add
     * @return this
     */
    public GetSceneMapInfoCsReq addEntryIdList(final int value) {
      bitField0_ |= 0x00000002;
      entryIdList.add(value);
      return this;
    }

    /**
     * <pre>
     * 1
     * </pre>
     *
     * <code>repeated uint32 entry_id_list = 2;</code>
     * @param values the entryIdList to add
     * @return this
     */
    public GetSceneMapInfoCsReq addAllEntryIdList(final int... values) {
      bitField0_ |= 0x00000002;
      entryIdList.addAll(values);
      return this;
    }

    @Override
    public GetSceneMapInfoCsReq copyFrom(final GetSceneMapInfoCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entryId = other.entryId;
        entryIdList.copyFrom(other.entryIdList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoCsReq mergeFrom(final GetSceneMapInfoCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasEntryIdList()) {
        getMutableEntryIdList().addAll(other.entryIdList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryId = 0;
      entryIdList.clear();
      return this;
    }

    @Override
    public GetSceneMapInfoCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetSceneMapInfoCsReq)) {
        return false;
      }
      GetSceneMapInfoCsReq other = (GetSceneMapInfoCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasEntryIdList() || entryIdList.equals(other.entryIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < entryIdList.length(); i++) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(entryIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * entryIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(entryIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetSceneMapInfoCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // entryIdList [packed=true]
            input.readPackedUInt32(entryIdList, tag);
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
          case 16: {
            // entryIdList [packed=false]
            tag = input.readRepeatedUInt32(entryIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.entryIdList, entryIdList);
      }
      output.endObject();
    }

    @Override
    public GetSceneMapInfoCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1441102997:
          case -1413189003: {
            if (input.isAtField(FieldNames.entryIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(entryIdList);
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
    public GetSceneMapInfoCsReq clone() {
      return new GetSceneMapInfoCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetSceneMapInfoCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoCsReq(), data).checkInitialized();
    }

    public static GetSceneMapInfoCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoCsReq(), input).checkInitialized();
    }

    public static GetSceneMapInfoCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetSceneMapInfoCsReq messages
     */
    public static MessageFactory<GetSceneMapInfoCsReq> getFactory() {
      return GetSceneMapInfoCsReqFactory.INSTANCE;
    }

    private enum GetSceneMapInfoCsReqFactory implements MessageFactory<GetSceneMapInfoCsReq> {
      INSTANCE;

      @Override
      public GetSceneMapInfoCsReq create() {
        return GetSceneMapInfoCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName entryIdList = FieldName.forField("entryIdList", "entry_id_list");
    }
  }
}
