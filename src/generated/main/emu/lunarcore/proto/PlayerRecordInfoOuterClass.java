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

public final class PlayerRecordInfoOuterClass {
  /**
   * Protobuf type {@code PlayerRecordInfo}
   */
  public static final class PlayerRecordInfo extends ProtoMessage<PlayerRecordInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 GBNLDJIPEEK = 1;</code>
     */
    private int gBNLDJIPEEK;

    /**
     * <code>optional uint32 FKBLOGEAFJJ = 2;</code>
     */
    private int fKBLOGEAFJJ;

    /**
     * <code>optional uint32 GDHMMFELCDH = 3;</code>
     */
    private int gDHMMFELCDH;

    /**
     * <code>optional uint32 MODAPIGJNNJ = 5;</code>
     */
    private int mODAPIGJNNJ;

    /**
     * <code>optional uint32 HFJEBEENDDH = 7;</code>
     */
    private int hFJEBEENDDH;

    /**
     * <code>optional uint32 KOKKGADOAGL = 12;</code>
     */
    private int kOKKGADOAGL;

    /**
     * <code>optional uint32 ODLMOCDBJHP = 13;</code>
     */
    private int oDLMOCDBJHP;

    /**
     * <code>optional uint32 NDKOPEJBGAE = 15;</code>
     */
    private int nDKOPEJBGAE;

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     */
    private final PlayerCollectionInfoOuterClass.PlayerCollectionInfo collectionInfo = PlayerCollectionInfoOuterClass.PlayerCollectionInfo.newInstance();

    private PlayerRecordInfo() {
    }

    /**
     * @return a new empty instance of {@code PlayerRecordInfo}
     */
    public static PlayerRecordInfo newInstance() {
      return new PlayerRecordInfo();
    }

    /**
     * <code>optional uint32 GBNLDJIPEEK = 1;</code>
     * @return whether the gBNLDJIPEEK field is set
     */
    public boolean hasGBNLDJIPEEK() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 GBNLDJIPEEK = 1;</code>
     * @return this
     */
    public PlayerRecordInfo clearGBNLDJIPEEK() {
      bitField0_ &= ~0x00000001;
      gBNLDJIPEEK = 0;
      return this;
    }

    /**
     * <code>optional uint32 GBNLDJIPEEK = 1;</code>
     * @return the gBNLDJIPEEK
     */
    public int getGBNLDJIPEEK() {
      return gBNLDJIPEEK;
    }

    /**
     * <code>optional uint32 GBNLDJIPEEK = 1;</code>
     * @param value the gBNLDJIPEEK to set
     * @return this
     */
    public PlayerRecordInfo setGBNLDJIPEEK(final int value) {
      bitField0_ |= 0x00000001;
      gBNLDJIPEEK = value;
      return this;
    }

    /**
     * <code>optional uint32 FKBLOGEAFJJ = 2;</code>
     * @return whether the fKBLOGEAFJJ field is set
     */
    public boolean hasFKBLOGEAFJJ() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 FKBLOGEAFJJ = 2;</code>
     * @return this
     */
    public PlayerRecordInfo clearFKBLOGEAFJJ() {
      bitField0_ &= ~0x00000002;
      fKBLOGEAFJJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 FKBLOGEAFJJ = 2;</code>
     * @return the fKBLOGEAFJJ
     */
    public int getFKBLOGEAFJJ() {
      return fKBLOGEAFJJ;
    }

    /**
     * <code>optional uint32 FKBLOGEAFJJ = 2;</code>
     * @param value the fKBLOGEAFJJ to set
     * @return this
     */
    public PlayerRecordInfo setFKBLOGEAFJJ(final int value) {
      bitField0_ |= 0x00000002;
      fKBLOGEAFJJ = value;
      return this;
    }

    /**
     * <code>optional uint32 GDHMMFELCDH = 3;</code>
     * @return whether the gDHMMFELCDH field is set
     */
    public boolean hasGDHMMFELCDH() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 GDHMMFELCDH = 3;</code>
     * @return this
     */
    public PlayerRecordInfo clearGDHMMFELCDH() {
      bitField0_ &= ~0x00000004;
      gDHMMFELCDH = 0;
      return this;
    }

    /**
     * <code>optional uint32 GDHMMFELCDH = 3;</code>
     * @return the gDHMMFELCDH
     */
    public int getGDHMMFELCDH() {
      return gDHMMFELCDH;
    }

    /**
     * <code>optional uint32 GDHMMFELCDH = 3;</code>
     * @param value the gDHMMFELCDH to set
     * @return this
     */
    public PlayerRecordInfo setGDHMMFELCDH(final int value) {
      bitField0_ |= 0x00000004;
      gDHMMFELCDH = value;
      return this;
    }

    /**
     * <code>optional uint32 MODAPIGJNNJ = 5;</code>
     * @return whether the mODAPIGJNNJ field is set
     */
    public boolean hasMODAPIGJNNJ() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 MODAPIGJNNJ = 5;</code>
     * @return this
     */
    public PlayerRecordInfo clearMODAPIGJNNJ() {
      bitField0_ &= ~0x00000008;
      mODAPIGJNNJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 MODAPIGJNNJ = 5;</code>
     * @return the mODAPIGJNNJ
     */
    public int getMODAPIGJNNJ() {
      return mODAPIGJNNJ;
    }

    /**
     * <code>optional uint32 MODAPIGJNNJ = 5;</code>
     * @param value the mODAPIGJNNJ to set
     * @return this
     */
    public PlayerRecordInfo setMODAPIGJNNJ(final int value) {
      bitField0_ |= 0x00000008;
      mODAPIGJNNJ = value;
      return this;
    }

    /**
     * <code>optional uint32 HFJEBEENDDH = 7;</code>
     * @return whether the hFJEBEENDDH field is set
     */
    public boolean hasHFJEBEENDDH() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 HFJEBEENDDH = 7;</code>
     * @return this
     */
    public PlayerRecordInfo clearHFJEBEENDDH() {
      bitField0_ &= ~0x00000010;
      hFJEBEENDDH = 0;
      return this;
    }

    /**
     * <code>optional uint32 HFJEBEENDDH = 7;</code>
     * @return the hFJEBEENDDH
     */
    public int getHFJEBEENDDH() {
      return hFJEBEENDDH;
    }

    /**
     * <code>optional uint32 HFJEBEENDDH = 7;</code>
     * @param value the hFJEBEENDDH to set
     * @return this
     */
    public PlayerRecordInfo setHFJEBEENDDH(final int value) {
      bitField0_ |= 0x00000010;
      hFJEBEENDDH = value;
      return this;
    }

    /**
     * <code>optional uint32 KOKKGADOAGL = 12;</code>
     * @return whether the kOKKGADOAGL field is set
     */
    public boolean hasKOKKGADOAGL() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 KOKKGADOAGL = 12;</code>
     * @return this
     */
    public PlayerRecordInfo clearKOKKGADOAGL() {
      bitField0_ &= ~0x00000020;
      kOKKGADOAGL = 0;
      return this;
    }

    /**
     * <code>optional uint32 KOKKGADOAGL = 12;</code>
     * @return the kOKKGADOAGL
     */
    public int getKOKKGADOAGL() {
      return kOKKGADOAGL;
    }

    /**
     * <code>optional uint32 KOKKGADOAGL = 12;</code>
     * @param value the kOKKGADOAGL to set
     * @return this
     */
    public PlayerRecordInfo setKOKKGADOAGL(final int value) {
      bitField0_ |= 0x00000020;
      kOKKGADOAGL = value;
      return this;
    }

    /**
     * <code>optional uint32 ODLMOCDBJHP = 13;</code>
     * @return whether the oDLMOCDBJHP field is set
     */
    public boolean hasODLMOCDBJHP() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 ODLMOCDBJHP = 13;</code>
     * @return this
     */
    public PlayerRecordInfo clearODLMOCDBJHP() {
      bitField0_ &= ~0x00000040;
      oDLMOCDBJHP = 0;
      return this;
    }

    /**
     * <code>optional uint32 ODLMOCDBJHP = 13;</code>
     * @return the oDLMOCDBJHP
     */
    public int getODLMOCDBJHP() {
      return oDLMOCDBJHP;
    }

    /**
     * <code>optional uint32 ODLMOCDBJHP = 13;</code>
     * @param value the oDLMOCDBJHP to set
     * @return this
     */
    public PlayerRecordInfo setODLMOCDBJHP(final int value) {
      bitField0_ |= 0x00000040;
      oDLMOCDBJHP = value;
      return this;
    }

    /**
     * <code>optional uint32 NDKOPEJBGAE = 15;</code>
     * @return whether the nDKOPEJBGAE field is set
     */
    public boolean hasNDKOPEJBGAE() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional uint32 NDKOPEJBGAE = 15;</code>
     * @return this
     */
    public PlayerRecordInfo clearNDKOPEJBGAE() {
      bitField0_ &= ~0x00000080;
      nDKOPEJBGAE = 0;
      return this;
    }

    /**
     * <code>optional uint32 NDKOPEJBGAE = 15;</code>
     * @return the nDKOPEJBGAE
     */
    public int getNDKOPEJBGAE() {
      return nDKOPEJBGAE;
    }

    /**
     * <code>optional uint32 NDKOPEJBGAE = 15;</code>
     * @param value the nDKOPEJBGAE to set
     * @return this
     */
    public PlayerRecordInfo setNDKOPEJBGAE(final int value) {
      bitField0_ |= 0x00000080;
      nDKOPEJBGAE = value;
      return this;
    }

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     * @return whether the collectionInfo field is set
     */
    public boolean hasCollectionInfo() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     * @return this
     */
    public PlayerRecordInfo clearCollectionInfo() {
      bitField0_ &= ~0x00000100;
      collectionInfo.clear();
      return this;
    }

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCollectionInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PlayerCollectionInfoOuterClass.PlayerCollectionInfo getCollectionInfo() {
      return collectionInfo;
    }

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PlayerCollectionInfoOuterClass.PlayerCollectionInfo getMutableCollectionInfo() {
      bitField0_ |= 0x00000100;
      return collectionInfo;
    }

    /**
     * <code>optional .PlayerCollectionInfo collection_info = 4;</code>
     * @param value the collectionInfo to set
     * @return this
     */
    public PlayerRecordInfo setCollectionInfo(
        final PlayerCollectionInfoOuterClass.PlayerCollectionInfo value) {
      bitField0_ |= 0x00000100;
      collectionInfo.copyFrom(value);
      return this;
    }

    @Override
    public PlayerRecordInfo copyFrom(final PlayerRecordInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gBNLDJIPEEK = other.gBNLDJIPEEK;
        fKBLOGEAFJJ = other.fKBLOGEAFJJ;
        gDHMMFELCDH = other.gDHMMFELCDH;
        mODAPIGJNNJ = other.mODAPIGJNNJ;
        hFJEBEENDDH = other.hFJEBEENDDH;
        kOKKGADOAGL = other.kOKKGADOAGL;
        oDLMOCDBJHP = other.oDLMOCDBJHP;
        nDKOPEJBGAE = other.nDKOPEJBGAE;
        collectionInfo.copyFrom(other.collectionInfo);
      }
      return this;
    }

    @Override
    public PlayerRecordInfo mergeFrom(final PlayerRecordInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGBNLDJIPEEK()) {
        setGBNLDJIPEEK(other.gBNLDJIPEEK);
      }
      if (other.hasFKBLOGEAFJJ()) {
        setFKBLOGEAFJJ(other.fKBLOGEAFJJ);
      }
      if (other.hasGDHMMFELCDH()) {
        setGDHMMFELCDH(other.gDHMMFELCDH);
      }
      if (other.hasMODAPIGJNNJ()) {
        setMODAPIGJNNJ(other.mODAPIGJNNJ);
      }
      if (other.hasHFJEBEENDDH()) {
        setHFJEBEENDDH(other.hFJEBEENDDH);
      }
      if (other.hasKOKKGADOAGL()) {
        setKOKKGADOAGL(other.kOKKGADOAGL);
      }
      if (other.hasODLMOCDBJHP()) {
        setODLMOCDBJHP(other.oDLMOCDBJHP);
      }
      if (other.hasNDKOPEJBGAE()) {
        setNDKOPEJBGAE(other.nDKOPEJBGAE);
      }
      if (other.hasCollectionInfo()) {
        getMutableCollectionInfo().mergeFrom(other.collectionInfo);
      }
      return this;
    }

    @Override
    public PlayerRecordInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gBNLDJIPEEK = 0;
      fKBLOGEAFJJ = 0;
      gDHMMFELCDH = 0;
      mODAPIGJNNJ = 0;
      hFJEBEENDDH = 0;
      kOKKGADOAGL = 0;
      oDLMOCDBJHP = 0;
      nDKOPEJBGAE = 0;
      collectionInfo.clear();
      return this;
    }

    @Override
    public PlayerRecordInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      collectionInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerRecordInfo)) {
        return false;
      }
      PlayerRecordInfo other = (PlayerRecordInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasGBNLDJIPEEK() || gBNLDJIPEEK == other.gBNLDJIPEEK)
        && (!hasFKBLOGEAFJJ() || fKBLOGEAFJJ == other.fKBLOGEAFJJ)
        && (!hasGDHMMFELCDH() || gDHMMFELCDH == other.gDHMMFELCDH)
        && (!hasMODAPIGJNNJ() || mODAPIGJNNJ == other.mODAPIGJNNJ)
        && (!hasHFJEBEENDDH() || hFJEBEENDDH == other.hFJEBEENDDH)
        && (!hasKOKKGADOAGL() || kOKKGADOAGL == other.kOKKGADOAGL)
        && (!hasODLMOCDBJHP() || oDLMOCDBJHP == other.oDLMOCDBJHP)
        && (!hasNDKOPEJBGAE() || nDKOPEJBGAE == other.nDKOPEJBGAE)
        && (!hasCollectionInfo() || collectionInfo.equals(other.collectionInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(gBNLDJIPEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(fKBLOGEAFJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(gDHMMFELCDH);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(mODAPIGJNNJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(hFJEBEENDDH);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(kOKKGADOAGL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(oDLMOCDBJHP);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(nDKOPEJBGAE);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(collectionInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gBNLDJIPEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(fKBLOGEAFJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gDHMMFELCDH);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mODAPIGJNNJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(hFJEBEENDDH);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kOKKGADOAGL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(oDLMOCDBJHP);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(nDKOPEJBGAE);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(collectionInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerRecordInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // gBNLDJIPEEK
            gBNLDJIPEEK = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // fKBLOGEAFJJ
            fKBLOGEAFJJ = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // gDHMMFELCDH
            gDHMMFELCDH = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // mODAPIGJNNJ
            mODAPIGJNNJ = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // hFJEBEENDDH
            hFJEBEENDDH = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // kOKKGADOAGL
            kOKKGADOAGL = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // oDLMOCDBJHP
            oDLMOCDBJHP = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // nDKOPEJBGAE
            nDKOPEJBGAE = input.readUInt32();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // collectionInfo
            input.readMessage(collectionInfo);
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
        output.writeUInt32(FieldNames.gBNLDJIPEEK, gBNLDJIPEEK);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.fKBLOGEAFJJ, fKBLOGEAFJJ);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gDHMMFELCDH, gDHMMFELCDH);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.mODAPIGJNNJ, mODAPIGJNNJ);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.hFJEBEENDDH, hFJEBEENDDH);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.kOKKGADOAGL, kOKKGADOAGL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.oDLMOCDBJHP, oDLMOCDBJHP);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeUInt32(FieldNames.nDKOPEJBGAE, nDKOPEJBGAE);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeMessage(FieldNames.collectionInfo, collectionInfo);
      }
      output.endObject();
    }

    @Override
    public PlayerRecordInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -643278235: {
            if (input.isAtField(FieldNames.gBNLDJIPEEK)) {
              if (!input.trySkipNullValue()) {
                gBNLDJIPEEK = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 682247267: {
            if (input.isAtField(FieldNames.fKBLOGEAFJJ)) {
              if (!input.trySkipNullValue()) {
                fKBLOGEAFJJ = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2054403291: {
            if (input.isAtField(FieldNames.gDHMMFELCDH)) {
              if (!input.trySkipNullValue()) {
                gDHMMFELCDH = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -161665553: {
            if (input.isAtField(FieldNames.mODAPIGJNNJ)) {
              if (!input.trySkipNullValue()) {
                mODAPIGJNNJ = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1528111293: {
            if (input.isAtField(FieldNames.hFJEBEENDDH)) {
              if (!input.trySkipNullValue()) {
                hFJEBEENDDH = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -11041379: {
            if (input.isAtField(FieldNames.kOKKGADOAGL)) {
              if (!input.trySkipNullValue()) {
                kOKKGADOAGL = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -497090198: {
            if (input.isAtField(FieldNames.oDLMOCDBJHP)) {
              if (!input.trySkipNullValue()) {
                oDLMOCDBJHP = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1046698300: {
            if (input.isAtField(FieldNames.nDKOPEJBGAE)) {
              if (!input.trySkipNullValue()) {
                nDKOPEJBGAE = input.readUInt32();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 310642796:
          case 1060168111: {
            if (input.isAtField(FieldNames.collectionInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(collectionInfo);
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
    public PlayerRecordInfo clone() {
      return new PlayerRecordInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerRecordInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerRecordInfo(), data).checkInitialized();
    }

    public static PlayerRecordInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerRecordInfo(), input).checkInitialized();
    }

    public static PlayerRecordInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerRecordInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerRecordInfo messages
     */
    public static MessageFactory<PlayerRecordInfo> getFactory() {
      return PlayerRecordInfoFactory.INSTANCE;
    }

    private enum PlayerRecordInfoFactory implements MessageFactory<PlayerRecordInfo> {
      INSTANCE;

      @Override
      public PlayerRecordInfo create() {
        return PlayerRecordInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gBNLDJIPEEK = FieldName.forField("GBNLDJIPEEK");

      static final FieldName fKBLOGEAFJJ = FieldName.forField("FKBLOGEAFJJ");

      static final FieldName gDHMMFELCDH = FieldName.forField("GDHMMFELCDH");

      static final FieldName mODAPIGJNNJ = FieldName.forField("MODAPIGJNNJ");

      static final FieldName hFJEBEENDDH = FieldName.forField("HFJEBEENDDH");

      static final FieldName kOKKGADOAGL = FieldName.forField("KOKKGADOAGL");

      static final FieldName oDLMOCDBJHP = FieldName.forField("ODLMOCDBJHP");

      static final FieldName nDKOPEJBGAE = FieldName.forField("NDKOPEJBGAE");

      static final FieldName collectionInfo = FieldName.forField("collectionInfo", "collection_info");
    }
  }
}
