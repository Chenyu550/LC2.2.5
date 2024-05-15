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

public final class GetFriendLoginInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetFriendLoginInfoScRsp}
   */
  public static final class GetFriendLoginInfoScRsp extends ProtoMessage<GetFriendLoginInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     */
    private final RepeatedInt friendUidList = RepeatedInt.newEmptyInstance();

    private GetFriendLoginInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFriendLoginInfoScRsp}
     */
    public static GetFriendLoginInfoScRsp newInstance() {
      return new GetFriendLoginInfoScRsp();
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
    public GetFriendLoginInfoScRsp clearRetcode() {
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
    public GetFriendLoginInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     * @return whether the friendUidList field is set
     */
    public boolean hasFriendUidList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearFriendUidList() {
      bitField0_ &= ~0x00000002;
      friendUidList.clear();
      return this;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendUidList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFriendUidList() {
      return friendUidList;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFriendUidList() {
      bitField0_ |= 0x00000002;
      return friendUidList;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     * @param value the friendUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addFriendUidList(final int value) {
      bitField0_ |= 0x00000002;
      friendUidList.add(value);
      return this;
    }

    /**
     * <pre>
     * 5,7
     * </pre>
     *
     * <code>repeated uint32 friend_uid_list = 5;</code>
     * @param values the friendUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addAllFriendUidList(final int... values) {
      bitField0_ |= 0x00000002;
      friendUidList.addAll(values);
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp copyFrom(final GetFriendLoginInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        friendUidList.copyFrom(other.friendUidList);
      }
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp mergeFrom(final GetFriendLoginInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFriendUidList()) {
        getMutableFriendUidList().addAll(other.friendUidList);
      }
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      friendUidList.clear();
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendUidList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFriendLoginInfoScRsp)) {
        return false;
      }
      GetFriendLoginInfoScRsp other = (GetFriendLoginInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFriendUidList() || friendUidList.equals(other.friendUidList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < friendUidList.length(); i++) {
          output.writeRawByte((byte) 40);
          output.writeUInt32NoTag(friendUidList.array()[i]);
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
        size += (1 * friendUidList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(friendUidList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFriendLoginInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // friendUidList [packed=true]
            input.readPackedUInt32(friendUidList, tag);
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
          case 40: {
            // friendUidList [packed=false]
            tag = input.readRepeatedUInt32(friendUidList, tag);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.friendUidList, friendUidList);
      }
      output.endObject();
    }

    @Override
    public GetFriendLoginInfoScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 2058895504:
          case -2016931922: {
            if (input.isAtField(FieldNames.friendUidList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(friendUidList);
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
    public GetFriendLoginInfoScRsp clone() {
      return new GetFriendLoginInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFriendLoginInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), data).checkInitialized();
    }

    public static GetFriendLoginInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), input).checkInitialized();
    }

    public static GetFriendLoginInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFriendLoginInfoScRsp messages
     */
    public static MessageFactory<GetFriendLoginInfoScRsp> getFactory() {
      return GetFriendLoginInfoScRspFactory.INSTANCE;
    }

    private enum GetFriendLoginInfoScRspFactory implements MessageFactory<GetFriendLoginInfoScRsp> {
      INSTANCE;

      @Override
      public GetFriendLoginInfoScRsp create() {
        return GetFriendLoginInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName friendUidList = FieldName.forField("friendUidList", "friend_uid_list");
    }
  }
}
