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
import us.hebi.quickbuf.Utf8String;

public final class AnnounceDataOuterClass {
  /**
   * Protobuf type {@code AnnounceData}
   */
  public static final class AnnounceData extends ProtoMessage<AnnounceData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 end_time = 4;</code>
     */
    private long endTime;

    /**
     * <code>optional int64 begin_time = 11;</code>
     */
    private long beginTime;

    /**
     * <code>optional uint32 banner_frequency = 3;</code>
     */
    private int bannerFrequency;

    /**
     * <code>optional uint32 center_system_frequency = 7;</code>
     */
    private int centerSystemFrequency;

    /**
     * <code>optional uint32 config_id = 12;</code>
     */
    private int configId;

    /**
     * <code>optional bool unkbool = 15;</code>
     */
    private boolean unkbool;

    /**
     * <code>optional string emergency_text = 1;</code>
     */
    private final Utf8String emergencyText = Utf8String.newEmptyInstance();

    /**
     * <code>optional string banner_text = 6;</code>
     */
    private final Utf8String bannerText = Utf8String.newEmptyInstance();

    /**
     * <code>optional string unkstring = 9;</code>
     */
    private final Utf8String unkstring = Utf8String.newEmptyInstance();

    private AnnounceData() {
    }

    /**
     * @return a new empty instance of {@code AnnounceData}
     */
    public static AnnounceData newInstance() {
      return new AnnounceData();
    }

    /**
     * <code>optional int64 end_time = 4;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 end_time = 4;</code>
     * @return this
     */
    public AnnounceData clearEndTime() {
      bitField0_ &= ~0x00000001;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 4;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 4;</code>
     * @param value the endTime to set
     * @return this
     */
    public AnnounceData setEndTime(final long value) {
      bitField0_ |= 0x00000001;
      endTime = value;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return this
     */
    public AnnounceData clearBeginTime() {
      bitField0_ &= ~0x00000002;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 11;</code>
     * @param value the beginTime to set
     * @return this
     */
    public AnnounceData setBeginTime(final long value) {
      bitField0_ |= 0x00000002;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional uint32 banner_frequency = 3;</code>
     * @return whether the bannerFrequency field is set
     */
    public boolean hasBannerFrequency() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 banner_frequency = 3;</code>
     * @return this
     */
    public AnnounceData clearBannerFrequency() {
      bitField0_ &= ~0x00000004;
      bannerFrequency = 0;
      return this;
    }

    /**
     * <code>optional uint32 banner_frequency = 3;</code>
     * @return the bannerFrequency
     */
    public int getBannerFrequency() {
      return bannerFrequency;
    }

    /**
     * <code>optional uint32 banner_frequency = 3;</code>
     * @param value the bannerFrequency to set
     * @return this
     */
    public AnnounceData setBannerFrequency(final int value) {
      bitField0_ |= 0x00000004;
      bannerFrequency = value;
      return this;
    }

    /**
     * <code>optional uint32 center_system_frequency = 7;</code>
     * @return whether the centerSystemFrequency field is set
     */
    public boolean hasCenterSystemFrequency() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 center_system_frequency = 7;</code>
     * @return this
     */
    public AnnounceData clearCenterSystemFrequency() {
      bitField0_ &= ~0x00000008;
      centerSystemFrequency = 0;
      return this;
    }

    /**
     * <code>optional uint32 center_system_frequency = 7;</code>
     * @return the centerSystemFrequency
     */
    public int getCenterSystemFrequency() {
      return centerSystemFrequency;
    }

    /**
     * <code>optional uint32 center_system_frequency = 7;</code>
     * @param value the centerSystemFrequency to set
     * @return this
     */
    public AnnounceData setCenterSystemFrequency(final int value) {
      bitField0_ |= 0x00000008;
      centerSystemFrequency = value;
      return this;
    }

    /**
     * <code>optional uint32 config_id = 12;</code>
     * @return whether the configId field is set
     */
    public boolean hasConfigId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 config_id = 12;</code>
     * @return this
     */
    public AnnounceData clearConfigId() {
      bitField0_ &= ~0x00000010;
      configId = 0;
      return this;
    }

    /**
     * <code>optional uint32 config_id = 12;</code>
     * @return the configId
     */
    public int getConfigId() {
      return configId;
    }

    /**
     * <code>optional uint32 config_id = 12;</code>
     * @param value the configId to set
     * @return this
     */
    public AnnounceData setConfigId(final int value) {
      bitField0_ |= 0x00000010;
      configId = value;
      return this;
    }

    /**
     * <code>optional bool unkbool = 15;</code>
     * @return whether the unkbool field is set
     */
    public boolean hasUnkbool() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool unkbool = 15;</code>
     * @return this
     */
    public AnnounceData clearUnkbool() {
      bitField0_ &= ~0x00000020;
      unkbool = false;
      return this;
    }

    /**
     * <code>optional bool unkbool = 15;</code>
     * @return the unkbool
     */
    public boolean getUnkbool() {
      return unkbool;
    }

    /**
     * <code>optional bool unkbool = 15;</code>
     * @param value the unkbool to set
     * @return this
     */
    public AnnounceData setUnkbool(final boolean value) {
      bitField0_ |= 0x00000020;
      unkbool = value;
      return this;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @return whether the emergencyText field is set
     */
    public boolean hasEmergencyText() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @return this
     */
    public AnnounceData clearEmergencyText() {
      bitField0_ &= ~0x00000040;
      emergencyText.clear();
      return this;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @return the emergencyText
     */
    public String getEmergencyText() {
      return emergencyText.getString();
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @return internal {@code Utf8String} representation of emergencyText for reading
     */
    public Utf8String getEmergencyTextBytes() {
      return this.emergencyText;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @return internal {@code Utf8String} representation of emergencyText for modifications
     */
    public Utf8String getMutableEmergencyTextBytes() {
      bitField0_ |= 0x00000040;
      return this.emergencyText;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @param value the emergencyText to set
     * @return this
     */
    public AnnounceData setEmergencyText(final CharSequence value) {
      bitField0_ |= 0x00000040;
      emergencyText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string emergency_text = 1;</code>
     * @param value the emergencyText to set
     * @return this
     */
    public AnnounceData setEmergencyText(final Utf8String value) {
      bitField0_ |= 0x00000040;
      emergencyText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @return whether the bannerText field is set
     */
    public boolean hasBannerText() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @return this
     */
    public AnnounceData clearBannerText() {
      bitField0_ &= ~0x00000080;
      bannerText.clear();
      return this;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @return the bannerText
     */
    public String getBannerText() {
      return bannerText.getString();
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @return internal {@code Utf8String} representation of bannerText for reading
     */
    public Utf8String getBannerTextBytes() {
      return this.bannerText;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @return internal {@code Utf8String} representation of bannerText for modifications
     */
    public Utf8String getMutableBannerTextBytes() {
      bitField0_ |= 0x00000080;
      return this.bannerText;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @param value the bannerText to set
     * @return this
     */
    public AnnounceData setBannerText(final CharSequence value) {
      bitField0_ |= 0x00000080;
      bannerText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string banner_text = 6;</code>
     * @param value the bannerText to set
     * @return this
     */
    public AnnounceData setBannerText(final Utf8String value) {
      bitField0_ |= 0x00000080;
      bannerText.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @return whether the unkstring field is set
     */
    public boolean hasUnkstring() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @return this
     */
    public AnnounceData clearUnkstring() {
      bitField0_ &= ~0x00000100;
      unkstring.clear();
      return this;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @return the unkstring
     */
    public String getUnkstring() {
      return unkstring.getString();
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @return internal {@code Utf8String} representation of unkstring for reading
     */
    public Utf8String getUnkstringBytes() {
      return this.unkstring;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @return internal {@code Utf8String} representation of unkstring for modifications
     */
    public Utf8String getMutableUnkstringBytes() {
      bitField0_ |= 0x00000100;
      return this.unkstring;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @param value the unkstring to set
     * @return this
     */
    public AnnounceData setUnkstring(final CharSequence value) {
      bitField0_ |= 0x00000100;
      unkstring.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string unkstring = 9;</code>
     * @param value the unkstring to set
     * @return this
     */
    public AnnounceData setUnkstring(final Utf8String value) {
      bitField0_ |= 0x00000100;
      unkstring.copyFrom(value);
      return this;
    }

    @Override
    public AnnounceData copyFrom(final AnnounceData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        endTime = other.endTime;
        beginTime = other.beginTime;
        bannerFrequency = other.bannerFrequency;
        centerSystemFrequency = other.centerSystemFrequency;
        configId = other.configId;
        unkbool = other.unkbool;
        emergencyText.copyFrom(other.emergencyText);
        bannerText.copyFrom(other.bannerText);
        unkstring.copyFrom(other.unkstring);
      }
      return this;
    }

    @Override
    public AnnounceData mergeFrom(final AnnounceData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasBannerFrequency()) {
        setBannerFrequency(other.bannerFrequency);
      }
      if (other.hasCenterSystemFrequency()) {
        setCenterSystemFrequency(other.centerSystemFrequency);
      }
      if (other.hasConfigId()) {
        setConfigId(other.configId);
      }
      if (other.hasUnkbool()) {
        setUnkbool(other.unkbool);
      }
      if (other.hasEmergencyText()) {
        getMutableEmergencyTextBytes().copyFrom(other.emergencyText);
      }
      if (other.hasBannerText()) {
        getMutableBannerTextBytes().copyFrom(other.bannerText);
      }
      if (other.hasUnkstring()) {
        getMutableUnkstringBytes().copyFrom(other.unkstring);
      }
      return this;
    }

    @Override
    public AnnounceData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      endTime = 0L;
      beginTime = 0L;
      bannerFrequency = 0;
      centerSystemFrequency = 0;
      configId = 0;
      unkbool = false;
      emergencyText.clear();
      bannerText.clear();
      unkstring.clear();
      return this;
    }

    @Override
    public AnnounceData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      emergencyText.clear();
      bannerText.clear();
      unkstring.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof AnnounceData)) {
        return false;
      }
      AnnounceData other = (AnnounceData) o;
      return bitField0_ == other.bitField0_
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasBannerFrequency() || bannerFrequency == other.bannerFrequency)
        && (!hasCenterSystemFrequency() || centerSystemFrequency == other.centerSystemFrequency)
        && (!hasConfigId() || configId == other.configId)
        && (!hasUnkbool() || unkbool == other.unkbool)
        && (!hasEmergencyText() || emergencyText.equals(other.emergencyText))
        && (!hasBannerText() || bannerText.equals(other.bannerText))
        && (!hasUnkstring() || unkstring.equals(other.unkstring));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(bannerFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(centerSystemFrequency);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(configId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 120);
        output.writeBoolNoTag(unkbool);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 10);
        output.writeStringNoTag(emergencyText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(bannerText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 74);
        output.writeStringNoTag(unkstring);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bannerFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(centerSystemFrequency);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(configId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(emergencyText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(bannerText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(unkstring);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public AnnounceData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // bannerFrequency
            bannerFrequency = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // centerSystemFrequency
            centerSystemFrequency = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // configId
            configId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // unkbool
            unkbool = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // emergencyText
            input.readString(emergencyText);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // bannerText
            input.readString(bannerText);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // unkstring
            input.readString(unkstring);
            bitField0_ |= 0x00000100;
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
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.bannerFrequency, bannerFrequency);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.centerSystemFrequency, centerSystemFrequency);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.configId, configId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.unkbool, unkbool);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeString(FieldNames.emergencyText, emergencyText);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.bannerText, bannerText);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeString(FieldNames.unkstring, unkstring);
      }
      output.endObject();
    }

    @Override
    public AnnounceData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1075939440:
          case -376047607: {
            if (input.isAtField(FieldNames.bannerFrequency)) {
              if (!input.trySkipNullValue()) {
                bannerFrequency = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1285402920:
          case 671051254: {
            if (input.isAtField(FieldNames.centerSystemFrequency)) {
              if (!input.trySkipNullValue()) {
                centerSystemFrequency = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -580140035:
          case -804450504: {
            if (input.isAtField(FieldNames.configId)) {
              if (!input.trySkipNullValue()) {
                configId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -285198628: {
            if (input.isAtField(FieldNames.unkbool)) {
              if (!input.trySkipNullValue()) {
                unkbool = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -179220898:
          case -1250292965: {
            if (input.isAtField(FieldNames.emergencyText)) {
              if (!input.trySkipNullValue()) {
                input.readString(emergencyText);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1031683463:
          case -1906828704: {
            if (input.isAtField(FieldNames.bannerText)) {
              if (!input.trySkipNullValue()) {
                input.readString(bannerText);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1293428611: {
            if (input.isAtField(FieldNames.unkstring)) {
              if (!input.trySkipNullValue()) {
                input.readString(unkstring);
                bitField0_ |= 0x00000100;
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
    public AnnounceData clone() {
      return new AnnounceData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static AnnounceData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new AnnounceData(), data).checkInitialized();
    }

    public static AnnounceData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
    }

    public static AnnounceData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new AnnounceData(), input).checkInitialized();
    }

    /**
     * @return factory for creating AnnounceData messages
     */
    public static MessageFactory<AnnounceData> getFactory() {
      return AnnounceDataFactory.INSTANCE;
    }

    private enum AnnounceDataFactory implements MessageFactory<AnnounceData> {
      INSTANCE;

      @Override
      public AnnounceData create() {
        return AnnounceData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName bannerFrequency = FieldName.forField("bannerFrequency", "banner_frequency");

      static final FieldName centerSystemFrequency = FieldName.forField("centerSystemFrequency", "center_system_frequency");

      static final FieldName configId = FieldName.forField("configId", "config_id");

      static final FieldName unkbool = FieldName.forField("unkbool");

      static final FieldName emergencyText = FieldName.forField("emergencyText", "emergency_text");

      static final FieldName bannerText = FieldName.forField("bannerText", "banner_text");

      static final FieldName unkstring = FieldName.forField("unkstring");
    }
  }
}
