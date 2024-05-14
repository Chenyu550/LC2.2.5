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

public final class RogueReviveInfoOuterClass {
  /**
   * Protobuf type {@code RogueReviveInfo}
   */
  public static final class RogueReviveInfo extends ProtoMessage<RogueReviveInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 LIEPDHFMFCG = 1;</code>
     */
    private int lIEPDHFMFCG;

    /**
     * <code>optional uint32 IHCAKFFLLPP = 10;</code>
     */
    private int iHCAKFFLLPP;

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     */
    private final ItemCostListOuterClass.ItemCostList costData = ItemCostListOuterClass.ItemCostList.newInstance();

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     */
    private final RepeatedInt mBHEKFAONEB = RepeatedInt.newEmptyInstance();

    private RogueReviveInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueReviveInfo}
     */
    public static RogueReviveInfo newInstance() {
      return new RogueReviveInfo();
    }

    /**
     * <code>optional uint32 LIEPDHFMFCG = 1;</code>
     * @return whether the lIEPDHFMFCG field is set
     */
    public boolean hasLIEPDHFMFCG() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 LIEPDHFMFCG = 1;</code>
     * @return this
     */
    public RogueReviveInfo clearLIEPDHFMFCG() {
      bitField0_ &= ~0x00000001;
      lIEPDHFMFCG = 0;
      return this;
    }

    /**
     * <code>optional uint32 LIEPDHFMFCG = 1;</code>
     * @return the lIEPDHFMFCG
     */
    public int getLIEPDHFMFCG() {
      return lIEPDHFMFCG;
    }

    /**
     * <code>optional uint32 LIEPDHFMFCG = 1;</code>
     * @param value the lIEPDHFMFCG to set
     * @return this
     */
    public RogueReviveInfo setLIEPDHFMFCG(final int value) {
      bitField0_ |= 0x00000001;
      lIEPDHFMFCG = value;
      return this;
    }

    /**
     * <code>optional uint32 IHCAKFFLLPP = 10;</code>
     * @return whether the iHCAKFFLLPP field is set
     */
    public boolean hasIHCAKFFLLPP() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 IHCAKFFLLPP = 10;</code>
     * @return this
     */
    public RogueReviveInfo clearIHCAKFFLLPP() {
      bitField0_ &= ~0x00000002;
      iHCAKFFLLPP = 0;
      return this;
    }

    /**
     * <code>optional uint32 IHCAKFFLLPP = 10;</code>
     * @return the iHCAKFFLLPP
     */
    public int getIHCAKFFLLPP() {
      return iHCAKFFLLPP;
    }

    /**
     * <code>optional uint32 IHCAKFFLLPP = 10;</code>
     * @param value the iHCAKFFLLPP to set
     * @return this
     */
    public RogueReviveInfo setIHCAKFFLLPP(final int value) {
      bitField0_ |= 0x00000002;
      iHCAKFFLLPP = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     * @return whether the costData field is set
     */
    public boolean hasCostData() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     * @return this
     */
    public RogueReviveInfo clearCostData() {
      bitField0_ &= ~0x00000004;
      costData.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCostData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getCostData() {
      return costData;
    }

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableCostData() {
      bitField0_ |= 0x00000004;
      return costData;
    }

    /**
     * <code>optional .ItemCostList cost_data = 12;</code>
     * @param value the costData to set
     * @return this
     */
    public RogueReviveInfo setCostData(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000004;
      costData.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     * @return whether the mBHEKFAONEB field is set
     */
    public boolean hasMBHEKFAONEB() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     * @return this
     */
    public RogueReviveInfo clearMBHEKFAONEB() {
      bitField0_ &= ~0x00000008;
      mBHEKFAONEB.clear();
      return this;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMBHEKFAONEB()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMBHEKFAONEB() {
      return mBHEKFAONEB;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMBHEKFAONEB() {
      bitField0_ |= 0x00000008;
      return mBHEKFAONEB;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     * @param value the mBHEKFAONEB to add
     * @return this
     */
    public RogueReviveInfo addMBHEKFAONEB(final int value) {
      bitField0_ |= 0x00000008;
      mBHEKFAONEB.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 MBHEKFAONEB = 6;</code>
     * @param values the mBHEKFAONEB to add
     * @return this
     */
    public RogueReviveInfo addAllMBHEKFAONEB(final int... values) {
      bitField0_ |= 0x00000008;
      mBHEKFAONEB.addAll(values);
      return this;
    }

    @Override
    public RogueReviveInfo copyFrom(final RogueReviveInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        lIEPDHFMFCG = other.lIEPDHFMFCG;
        iHCAKFFLLPP = other.iHCAKFFLLPP;
        costData.copyFrom(other.costData);
        mBHEKFAONEB.copyFrom(other.mBHEKFAONEB);
      }
      return this;
    }

    @Override
    public RogueReviveInfo mergeFrom(final RogueReviveInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLIEPDHFMFCG()) {
        setLIEPDHFMFCG(other.lIEPDHFMFCG);
      }
      if (other.hasIHCAKFFLLPP()) {
        setIHCAKFFLLPP(other.iHCAKFFLLPP);
      }
      if (other.hasCostData()) {
        getMutableCostData().mergeFrom(other.costData);
      }
      if (other.hasMBHEKFAONEB()) {
        getMutableMBHEKFAONEB().addAll(other.mBHEKFAONEB);
      }
      return this;
    }

    @Override
    public RogueReviveInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lIEPDHFMFCG = 0;
      iHCAKFFLLPP = 0;
      costData.clear();
      mBHEKFAONEB.clear();
      return this;
    }

    @Override
    public RogueReviveInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      costData.clearQuick();
      mBHEKFAONEB.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueReviveInfo)) {
        return false;
      }
      RogueReviveInfo other = (RogueReviveInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasLIEPDHFMFCG() || lIEPDHFMFCG == other.lIEPDHFMFCG)
        && (!hasIHCAKFFLLPP() || iHCAKFFLLPP == other.iHCAKFFLLPP)
        && (!hasCostData() || costData.equals(other.costData))
        && (!hasMBHEKFAONEB() || mBHEKFAONEB.equals(other.mBHEKFAONEB));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(lIEPDHFMFCG);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(iHCAKFFLLPP);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(costData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < mBHEKFAONEB.length(); i++) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(mBHEKFAONEB.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(lIEPDHFMFCG);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(iHCAKFFLLPP);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(costData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * mBHEKFAONEB.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(mBHEKFAONEB);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueReviveInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // lIEPDHFMFCG
            lIEPDHFMFCG = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // iHCAKFFLLPP
            iHCAKFFLLPP = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // costData
            input.readMessage(costData);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // mBHEKFAONEB [packed=true]
            input.readPackedUInt32(mBHEKFAONEB, tag);
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
          case 48: {
            // mBHEKFAONEB [packed=false]
            tag = input.readRepeatedUInt32(mBHEKFAONEB, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.lIEPDHFMFCG, lIEPDHFMFCG);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.iHCAKFFLLPP, iHCAKFFLLPP);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.costData, costData);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.mBHEKFAONEB, mBHEKFAONEB);
      }
      output.endObject();
    }

    @Override
    public RogueReviveInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -710317289: {
            if (input.isAtField(FieldNames.lIEPDHFMFCG)) {
              if (!input.trySkipNullValue()) {
                lIEPDHFMFCG = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1389949934: {
            if (input.isAtField(FieldNames.iHCAKFFLLPP)) {
              if (!input.trySkipNullValue()) {
                iHCAKFFLLPP = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -425171689:
          case -270413604: {
            if (input.isAtField(FieldNames.costData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(costData);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1900602480: {
            if (input.isAtField(FieldNames.mBHEKFAONEB)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(mBHEKFAONEB);
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
    public RogueReviveInfo clone() {
      return new RogueReviveInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueReviveInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueReviveInfo(), data).checkInitialized();
    }

    public static RogueReviveInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueReviveInfo(), input).checkInitialized();
    }

    public static RogueReviveInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueReviveInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueReviveInfo messages
     */
    public static MessageFactory<RogueReviveInfo> getFactory() {
      return RogueReviveInfoFactory.INSTANCE;
    }

    private enum RogueReviveInfoFactory implements MessageFactory<RogueReviveInfo> {
      INSTANCE;

      @Override
      public RogueReviveInfo create() {
        return RogueReviveInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName lIEPDHFMFCG = FieldName.forField("LIEPDHFMFCG");

      static final FieldName iHCAKFFLLPP = FieldName.forField("IHCAKFFLLPP");

      static final FieldName costData = FieldName.forField("costData", "cost_data");

      static final FieldName mBHEKFAONEB = FieldName.forField("MBHEKFAONEB");
    }
  }
}
