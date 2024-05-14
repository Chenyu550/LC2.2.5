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
import us.hebi.quickbuf.Utf8String;

public final class GachaInfoOuterClass {
  /**
   * Protobuf type {@code GachaInfo}
   */
  public static final class GachaInfo extends ProtoMessage<GachaInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 1;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 7;</code>
     */
    private long endTime;

    /**
     * <code>optional uint32 gacha_id = 10;</code>
     */
    private int gachaId;

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     */
    private final GachaCeilingOuterClass.GachaCeiling gachaCeiling = GachaCeilingOuterClass.GachaCeiling.newInstance();

    /**
     * <code>optional string history_url = 4;</code>
     */
    private final Utf8String historyUrl = Utf8String.newEmptyInstance();

    /**
     * <code>optional string detail_url = 6;</code>
     */
    private final Utf8String detailUrl = Utf8String.newEmptyInstance();

    /**
     * <code>repeated uint32 up_info = 11;</code>
     */
    private final RepeatedInt upInfo = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 featured = 13;</code>
     */
    private final RepeatedInt featured = RepeatedInt.newEmptyInstance();

    private GachaInfo() {
    }

    /**
     * @return a new empty instance of {@code GachaInfo}
     */
    public static GachaInfo newInstance() {
      return new GachaInfo();
    }

    /**
     * <code>optional int64 begin_time = 1;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 1;</code>
     * @return this
     */
    public GachaInfo clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 1;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 1;</code>
     * @param value the beginTime to set
     * @return this
     */
    public GachaInfo setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return this
     */
    public GachaInfo clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @param value the endTime to set
     * @return this
     */
    public GachaInfo setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 10;</code>
     * @return whether the gachaId field is set
     */
    public boolean hasGachaId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gacha_id = 10;</code>
     * @return this
     */
    public GachaInfo clearGachaId() {
      bitField0_ &= ~0x00000004;
      gachaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 10;</code>
     * @return the gachaId
     */
    public int getGachaId() {
      return gachaId;
    }

    /**
     * <code>optional uint32 gacha_id = 10;</code>
     * @param value the gachaId to set
     * @return this
     */
    public GachaInfo setGachaId(final int value) {
      bitField0_ |= 0x00000004;
      gachaId = value;
      return this;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     * @return whether the gachaCeiling field is set
     */
    public boolean hasGachaCeiling() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     * @return this
     */
    public GachaInfo clearGachaCeiling() {
      bitField0_ &= ~0x00000008;
      gachaCeiling.clear();
      return this;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGachaCeiling()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public GachaCeilingOuterClass.GachaCeiling getGachaCeiling() {
      return gachaCeiling;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public GachaCeilingOuterClass.GachaCeiling getMutableGachaCeiling() {
      bitField0_ |= 0x00000008;
      return gachaCeiling;
    }

    /**
     * <code>optional .GachaCeiling gacha_ceiling = 5;</code>
     * @param value the gachaCeiling to set
     * @return this
     */
    public GachaInfo setGachaCeiling(final GachaCeilingOuterClass.GachaCeiling value) {
      bitField0_ |= 0x00000008;
      gachaCeiling.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @return whether the historyUrl field is set
     */
    public boolean hasHistoryUrl() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @return this
     */
    public GachaInfo clearHistoryUrl() {
      bitField0_ &= ~0x00000010;
      historyUrl.clear();
      return this;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @return the historyUrl
     */
    public String getHistoryUrl() {
      return historyUrl.getString();
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @return internal {@code Utf8String} representation of historyUrl for reading
     */
    public Utf8String getHistoryUrlBytes() {
      return this.historyUrl;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @return internal {@code Utf8String} representation of historyUrl for modifications
     */
    public Utf8String getMutableHistoryUrlBytes() {
      bitField0_ |= 0x00000010;
      return this.historyUrl;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @param value the historyUrl to set
     * @return this
     */
    public GachaInfo setHistoryUrl(final CharSequence value) {
      bitField0_ |= 0x00000010;
      historyUrl.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string history_url = 4;</code>
     * @param value the historyUrl to set
     * @return this
     */
    public GachaInfo setHistoryUrl(final Utf8String value) {
      bitField0_ |= 0x00000010;
      historyUrl.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @return whether the detailUrl field is set
     */
    public boolean hasDetailUrl() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @return this
     */
    public GachaInfo clearDetailUrl() {
      bitField0_ &= ~0x00000020;
      detailUrl.clear();
      return this;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @return the detailUrl
     */
    public String getDetailUrl() {
      return detailUrl.getString();
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @return internal {@code Utf8String} representation of detailUrl for reading
     */
    public Utf8String getDetailUrlBytes() {
      return this.detailUrl;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @return internal {@code Utf8String} representation of detailUrl for modifications
     */
    public Utf8String getMutableDetailUrlBytes() {
      bitField0_ |= 0x00000020;
      return this.detailUrl;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @param value the detailUrl to set
     * @return this
     */
    public GachaInfo setDetailUrl(final CharSequence value) {
      bitField0_ |= 0x00000020;
      detailUrl.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string detail_url = 6;</code>
     * @param value the detailUrl to set
     * @return this
     */
    public GachaInfo setDetailUrl(final Utf8String value) {
      bitField0_ |= 0x00000020;
      detailUrl.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     * @return whether the upInfo field is set
     */
    public boolean hasUpInfo() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     * @return this
     */
    public GachaInfo clearUpInfo() {
      bitField0_ &= ~0x00000040;
      upInfo.clear();
      return this;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUpInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUpInfo() {
      return upInfo;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUpInfo() {
      bitField0_ |= 0x00000040;
      return upInfo;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     * @param value the upInfo to add
     * @return this
     */
    public GachaInfo addUpInfo(final int value) {
      bitField0_ |= 0x00000040;
      upInfo.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 up_info = 11;</code>
     * @param values the upInfo to add
     * @return this
     */
    public GachaInfo addAllUpInfo(final int... values) {
      bitField0_ |= 0x00000040;
      upInfo.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     * @return whether the featured field is set
     */
    public boolean hasFeatured() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     * @return this
     */
    public GachaInfo clearFeatured() {
      bitField0_ &= ~0x00000080;
      featured.clear();
      return this;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFeatured()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFeatured() {
      return featured;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFeatured() {
      bitField0_ |= 0x00000080;
      return featured;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     * @param value the featured to add
     * @return this
     */
    public GachaInfo addFeatured(final int value) {
      bitField0_ |= 0x00000080;
      featured.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 featured = 13;</code>
     * @param values the featured to add
     * @return this
     */
    public GachaInfo addAllFeatured(final int... values) {
      bitField0_ |= 0x00000080;
      featured.addAll(values);
      return this;
    }

    @Override
    public GachaInfo copyFrom(final GachaInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        gachaId = other.gachaId;
        gachaCeiling.copyFrom(other.gachaCeiling);
        historyUrl.copyFrom(other.historyUrl);
        detailUrl.copyFrom(other.detailUrl);
        upInfo.copyFrom(other.upInfo);
        featured.copyFrom(other.featured);
      }
      return this;
    }

    @Override
    public GachaInfo mergeFrom(final GachaInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasGachaId()) {
        setGachaId(other.gachaId);
      }
      if (other.hasGachaCeiling()) {
        getMutableGachaCeiling().mergeFrom(other.gachaCeiling);
      }
      if (other.hasHistoryUrl()) {
        getMutableHistoryUrlBytes().copyFrom(other.historyUrl);
      }
      if (other.hasDetailUrl()) {
        getMutableDetailUrlBytes().copyFrom(other.detailUrl);
      }
      if (other.hasUpInfo()) {
        getMutableUpInfo().addAll(other.upInfo);
      }
      if (other.hasFeatured()) {
        getMutableFeatured().addAll(other.featured);
      }
      return this;
    }

    @Override
    public GachaInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      gachaId = 0;
      gachaCeiling.clear();
      historyUrl.clear();
      detailUrl.clear();
      upInfo.clear();
      featured.clear();
      return this;
    }

    @Override
    public GachaInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaCeiling.clearQuick();
      historyUrl.clear();
      detailUrl.clear();
      upInfo.clear();
      featured.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GachaInfo)) {
        return false;
      }
      GachaInfo other = (GachaInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasGachaId() || gachaId == other.gachaId)
        && (!hasGachaCeiling() || gachaCeiling.equals(other.gachaCeiling))
        && (!hasHistoryUrl() || historyUrl.equals(other.historyUrl))
        && (!hasDetailUrl() || detailUrl.equals(other.detailUrl))
        && (!hasUpInfo() || upInfo.equals(other.upInfo))
        && (!hasFeatured() || featured.equals(other.featured));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(gachaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(gachaCeiling);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 34);
        output.writeStringNoTag(historyUrl);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(detailUrl);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < upInfo.length(); i++) {
          output.writeRawByte((byte) 88);
          output.writeUInt32NoTag(upInfo.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < featured.length(); i++) {
          output.writeRawByte((byte) 104);
          output.writeUInt32NoTag(featured.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(gachaCeiling);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(historyUrl);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(detailUrl);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * upInfo.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(upInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * featured.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(featured);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GachaInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // gachaId
            gachaId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // gachaCeiling
            input.readMessage(gachaCeiling);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // historyUrl
            input.readString(historyUrl);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // detailUrl
            input.readString(detailUrl);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // upInfo [packed=true]
            input.readPackedUInt32(upInfo, tag);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // featured [packed=true]
            input.readPackedUInt32(featured, tag);
            bitField0_ |= 0x00000080;
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
          case 88: {
            // upInfo [packed=false]
            tag = input.readRepeatedUInt32(upInfo, tag);
            bitField0_ |= 0x00000040;
            break;
          }
          case 104: {
            // featured [packed=false]
            tag = input.readRepeatedUInt32(featured, tag);
            bitField0_ |= 0x00000080;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gachaId, gachaId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.gachaCeiling, gachaCeiling);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeString(FieldNames.historyUrl, historyUrl);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeString(FieldNames.detailUrl, detailUrl);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedUInt32(FieldNames.upInfo, upInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedUInt32(FieldNames.featured, featured);
      }
      output.endObject();
    }

    @Override
    public GachaInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -204751299:
          case -2052301576: {
            if (input.isAtField(FieldNames.gachaId)) {
              if (!input.trySkipNullValue()) {
                gachaId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 507275483:
          case -1792489728: {
            if (input.isAtField(FieldNames.gachaCeiling)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(gachaCeiling);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1951019067:
          case 352350020: {
            if (input.isAtField(FieldNames.historyUrl)) {
              if (!input.trySkipNullValue()) {
                input.readString(historyUrl);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1973090466:
          case -1035961215: {
            if (input.isAtField(FieldNames.detailUrl)) {
              if (!input.trySkipNullValue()) {
                input.readString(detailUrl);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -839638551:
          case -238815278: {
            if (input.isAtField(FieldNames.upInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(upInfo);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -290659282: {
            if (input.isAtField(FieldNames.featured)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(featured);
                bitField0_ |= 0x00000080;
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
    public GachaInfo clone() {
      return new GachaInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GachaInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GachaInfo(), data).checkInitialized();
    }

    public static GachaInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaInfo(), input).checkInitialized();
    }

    public static GachaInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating GachaInfo messages
     */
    public static MessageFactory<GachaInfo> getFactory() {
      return GachaInfoFactory.INSTANCE;
    }

    private enum GachaInfoFactory implements MessageFactory<GachaInfo> {
      INSTANCE;

      @Override
      public GachaInfo create() {
        return GachaInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName gachaId = FieldName.forField("gachaId", "gacha_id");

      static final FieldName gachaCeiling = FieldName.forField("gachaCeiling", "gacha_ceiling");

      static final FieldName historyUrl = FieldName.forField("historyUrl", "history_url");

      static final FieldName detailUrl = FieldName.forField("detailUrl", "detail_url");

      static final FieldName upInfo = FieldName.forField("upInfo", "up_info");

      static final FieldName featured = FieldName.forField("featured");
    }
  }
}
