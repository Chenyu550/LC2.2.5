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

public final class PlayerDetailInfoOuterClass {
  /**
   * Protobuf type {@code PlayerDetailInfo}
   */
  public static final class PlayerDetailInfo extends ProtoMessage<PlayerDetailInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 5;</code>
     */
    private int uid;

    /**
     * <code>optional uint32 head_icon = 6;</code>
     */
    private int headIcon;

    /**
     * <code>optional uint32 world_level = 9;</code>
     */
    private int worldLevel;

    /**
     * <code>optional uint32 level = 10;</code>
     */
    private int level;

    /**
     * <code>optional .PlatformType platform_type = 15;</code>
     */
    private int platformType;

    /**
     * <code>optional string signature = 3;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    /**
     * <code>optional string nickname = 4;</code>
     */
    private final Utf8String nickname = Utf8String.newEmptyInstance();

    /**
     * <code>optional string display_avatar_info = 13;</code>
     */
    private final Utf8String displayAvatarInfo = Utf8String.newEmptyInstance();

    /**
     * <code>optional string record_info = 757;</code>
     */
    private final Utf8String recordInfo = Utf8String.newEmptyInstance();

    private PlayerDetailInfo() {
    }

    /**
     * @return a new empty instance of {@code PlayerDetailInfo}
     */
    public static PlayerDetailInfo newInstance() {
      return new PlayerDetailInfo();
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return this
     */
    public PlayerDetailInfo clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @param value the uid to set
     * @return this
     */
    public PlayerDetailInfo setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional uint32 head_icon = 6;</code>
     * @return whether the headIcon field is set
     */
    public boolean hasHeadIcon() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 head_icon = 6;</code>
     * @return this
     */
    public PlayerDetailInfo clearHeadIcon() {
      bitField0_ &= ~0x00000002;
      headIcon = 0;
      return this;
    }

    /**
     * <code>optional uint32 head_icon = 6;</code>
     * @return the headIcon
     */
    public int getHeadIcon() {
      return headIcon;
    }

    /**
     * <code>optional uint32 head_icon = 6;</code>
     * @param value the headIcon to set
     * @return this
     */
    public PlayerDetailInfo setHeadIcon(final int value) {
      bitField0_ |= 0x00000002;
      headIcon = value;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 9;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 world_level = 9;</code>
     * @return this
     */
    public PlayerDetailInfo clearWorldLevel() {
      bitField0_ &= ~0x00000004;
      worldLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 9;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <code>optional uint32 world_level = 9;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public PlayerDetailInfo setWorldLevel(final int value) {
      bitField0_ |= 0x00000004;
      worldLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return this
     */
    public PlayerDetailInfo clearLevel() {
      bitField0_ &= ~0x00000008;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @param value the level to set
     * @return this
     */
    public PlayerDetailInfo setLevel(final int value) {
      bitField0_ |= 0x00000008;
      level = value;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 15;</code>
     * @return whether the platformType field is set
     */
    public boolean hasPlatformType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .PlatformType platform_type = 15;</code>
     * @return this
     */
    public PlayerDetailInfo clearPlatformType() {
      bitField0_ &= ~0x00000010;
      platformType = 0;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 15;</code>
     * @return the platformType
     */
    public PlatformTypeOuterClass.PlatformType getPlatformType() {
      return PlatformTypeOuterClass.PlatformType.forNumber(platformType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link PlayerDetailInfo#getPlatformType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getPlatformTypeValue() {
      return platformType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link PlatformTypeOuterClass.PlatformType}. Setting an invalid value
     * can cause {@link PlayerDetailInfo#getPlatformType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public PlayerDetailInfo setPlatformTypeValue(final int value) {
      bitField0_ |= 0x00000010;
      platformType = value;
      return this;
    }

    /**
     * <code>optional .PlatformType platform_type = 15;</code>
     * @param value the platformType to set
     * @return this
     */
    public PlayerDetailInfo setPlatformType(final PlatformTypeOuterClass.PlatformType value) {
      bitField0_ |= 0x00000010;
      platformType = value.getNumber();
      return this;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @return this
     */
    public PlayerDetailInfo clearSignature() {
      bitField0_ &= ~0x00000020;
      signature.clear();
      return this;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <code>optional string signature = 3;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000020;
      return this.signature;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @param value the signature to set
     * @return this
     */
    public PlayerDetailInfo setSignature(final CharSequence value) {
      bitField0_ |= 0x00000020;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string signature = 3;</code>
     * @param value the signature to set
     * @return this
     */
    public PlayerDetailInfo setSignature(final Utf8String value) {
      bitField0_ |= 0x00000020;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return whether the nickname field is set
     */
    public boolean hasNickname() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return this
     */
    public PlayerDetailInfo clearNickname() {
      bitField0_ &= ~0x00000040;
      nickname.clear();
      return this;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return the nickname
     */
    public String getNickname() {
      return nickname.getString();
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return internal {@code Utf8String} representation of nickname for reading
     */
    public Utf8String getNicknameBytes() {
      return this.nickname;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @return internal {@code Utf8String} representation of nickname for modifications
     */
    public Utf8String getMutableNicknameBytes() {
      bitField0_ |= 0x00000040;
      return this.nickname;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @param value the nickname to set
     * @return this
     */
    public PlayerDetailInfo setNickname(final CharSequence value) {
      bitField0_ |= 0x00000040;
      nickname.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string nickname = 4;</code>
     * @param value the nickname to set
     * @return this
     */
    public PlayerDetailInfo setNickname(final Utf8String value) {
      bitField0_ |= 0x00000040;
      nickname.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @return whether the displayAvatarInfo field is set
     */
    public boolean hasDisplayAvatarInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @return this
     */
    public PlayerDetailInfo clearDisplayAvatarInfo() {
      bitField0_ &= ~0x00000080;
      displayAvatarInfo.clear();
      return this;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @return the displayAvatarInfo
     */
    public String getDisplayAvatarInfo() {
      return displayAvatarInfo.getString();
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @return internal {@code Utf8String} representation of displayAvatarInfo for reading
     */
    public Utf8String getDisplayAvatarInfoBytes() {
      return this.displayAvatarInfo;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @return internal {@code Utf8String} representation of displayAvatarInfo for modifications
     */
    public Utf8String getMutableDisplayAvatarInfoBytes() {
      bitField0_ |= 0x00000080;
      return this.displayAvatarInfo;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @param value the displayAvatarInfo to set
     * @return this
     */
    public PlayerDetailInfo setDisplayAvatarInfo(final CharSequence value) {
      bitField0_ |= 0x00000080;
      displayAvatarInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string display_avatar_info = 13;</code>
     * @param value the displayAvatarInfo to set
     * @return this
     */
    public PlayerDetailInfo setDisplayAvatarInfo(final Utf8String value) {
      bitField0_ |= 0x00000080;
      displayAvatarInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @return whether the recordInfo field is set
     */
    public boolean hasRecordInfo() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @return this
     */
    public PlayerDetailInfo clearRecordInfo() {
      bitField0_ &= ~0x00000100;
      recordInfo.clear();
      return this;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @return the recordInfo
     */
    public String getRecordInfo() {
      return recordInfo.getString();
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @return internal {@code Utf8String} representation of recordInfo for reading
     */
    public Utf8String getRecordInfoBytes() {
      return this.recordInfo;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @return internal {@code Utf8String} representation of recordInfo for modifications
     */
    public Utf8String getMutableRecordInfoBytes() {
      bitField0_ |= 0x00000100;
      return this.recordInfo;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @param value the recordInfo to set
     * @return this
     */
    public PlayerDetailInfo setRecordInfo(final CharSequence value) {
      bitField0_ |= 0x00000100;
      recordInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string record_info = 757;</code>
     * @param value the recordInfo to set
     * @return this
     */
    public PlayerDetailInfo setRecordInfo(final Utf8String value) {
      bitField0_ |= 0x00000100;
      recordInfo.copyFrom(value);
      return this;
    }

    @Override
    public PlayerDetailInfo copyFrom(final PlayerDetailInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        headIcon = other.headIcon;
        worldLevel = other.worldLevel;
        level = other.level;
        platformType = other.platformType;
        signature.copyFrom(other.signature);
        nickname.copyFrom(other.nickname);
        displayAvatarInfo.copyFrom(other.displayAvatarInfo);
        recordInfo.copyFrom(other.recordInfo);
      }
      return this;
    }

    @Override
    public PlayerDetailInfo mergeFrom(final PlayerDetailInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasHeadIcon()) {
        setHeadIcon(other.headIcon);
      }
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasPlatformType()) {
        setPlatformTypeValue(other.platformType);
      }
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      if (other.hasNickname()) {
        getMutableNicknameBytes().copyFrom(other.nickname);
      }
      if (other.hasDisplayAvatarInfo()) {
        getMutableDisplayAvatarInfoBytes().copyFrom(other.displayAvatarInfo);
      }
      if (other.hasRecordInfo()) {
        getMutableRecordInfoBytes().copyFrom(other.recordInfo);
      }
      return this;
    }

    @Override
    public PlayerDetailInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      headIcon = 0;
      worldLevel = 0;
      level = 0;
      platformType = 0;
      signature.clear();
      nickname.clear();
      displayAvatarInfo.clear();
      recordInfo.clear();
      return this;
    }

    @Override
    public PlayerDetailInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      nickname.clear();
      displayAvatarInfo.clear();
      recordInfo.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerDetailInfo)) {
        return false;
      }
      PlayerDetailInfo other = (PlayerDetailInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasHeadIcon() || headIcon == other.headIcon)
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasLevel() || level == other.level)
        && (!hasPlatformType() || platformType == other.platformType)
        && (!hasSignature() || signature.equals(other.signature))
        && (!hasNickname() || nickname.equals(other.nickname))
        && (!hasDisplayAvatarInfo() || displayAvatarInfo.equals(other.displayAvatarInfo))
        && (!hasRecordInfo() || recordInfo.equals(other.recordInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(headIcon);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeEnumNoTag(platformType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 26);
        output.writeStringNoTag(signature);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 34);
        output.writeStringNoTag(nickname);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 106);
        output.writeStringNoTag(displayAvatarInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawLittleEndian16((short) 12202);
        output.writeStringNoTag(recordInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(headIcon);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(platformType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(nickname);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(displayAvatarInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 2 + ProtoSink.computeStringSizeNoTag(recordInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerDetailInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // headIcon
            headIcon = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // platformType
            final int value = input.readInt32();
            if (PlatformTypeOuterClass.PlatformType.forNumber(value) != null) {
              platformType = value;
              bitField0_ |= 0x00000010;
            }
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // nickname
            input.readString(nickname);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // displayAvatarInfo
            input.readString(displayAvatarInfo);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 6058) {
              break;
            }
          }
          case 6058: {
            // recordInfo
            input.readString(recordInfo);
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
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.headIcon, headIcon);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.platformType, platformType, PlatformTypeOuterClass.PlatformType.converter());
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeString(FieldNames.signature, signature);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeString(FieldNames.nickname, nickname);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.displayAvatarInfo, displayAvatarInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeString(FieldNames.recordInfo, recordInfo);
      }
      output.endObject();
    }

    @Override
    public PlayerDetailInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1116107143:
          case -219098248: {
            if (input.isAtField(FieldNames.headIcon)) {
              if (!input.trySkipNullValue()) {
                headIcon = input.readUInt32();
                bitField0_ |= 0x00000002;
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
          case 155581005:
          case 538062726: {
            if (input.isAtField(FieldNames.platformType)) {
              if (!input.trySkipNullValue()) {
                final PlatformTypeOuterClass.PlatformType value = input.readEnum(PlatformTypeOuterClass.PlatformType.converter());
                if (value != null) {
                  platformType = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 70690926: {
            if (input.isAtField(FieldNames.nickname)) {
              if (!input.trySkipNullValue()) {
                input.readString(nickname);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2117840905:
          case 245477335: {
            if (input.isAtField(FieldNames.displayAvatarInfo)) {
              if (!input.trySkipNullValue()) {
                input.readString(displayAvatarInfo);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 734573727:
          case 1317125084: {
            if (input.isAtField(FieldNames.recordInfo)) {
              if (!input.trySkipNullValue()) {
                input.readString(recordInfo);
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
    public PlayerDetailInfo clone() {
      return new PlayerDetailInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerDetailInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerDetailInfo(), data).checkInitialized();
    }

    public static PlayerDetailInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerDetailInfo(), input).checkInitialized();
    }

    public static PlayerDetailInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerDetailInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerDetailInfo messages
     */
    public static MessageFactory<PlayerDetailInfo> getFactory() {
      return PlayerDetailInfoFactory.INSTANCE;
    }

    private enum PlayerDetailInfoFactory implements MessageFactory<PlayerDetailInfo> {
      INSTANCE;

      @Override
      public PlayerDetailInfo create() {
        return PlayerDetailInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName headIcon = FieldName.forField("headIcon", "head_icon");

      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName level = FieldName.forField("level");

      static final FieldName platformType = FieldName.forField("platformType", "platform_type");

      static final FieldName signature = FieldName.forField("signature");

      static final FieldName nickname = FieldName.forField("nickname");

      static final FieldName displayAvatarInfo = FieldName.forField("displayAvatarInfo", "display_avatar_info");

      static final FieldName recordInfo = FieldName.forField("recordInfo", "record_info");
    }
  }
}
