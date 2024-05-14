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

public final class ChallengeSettleNotifyOuterClass {
  /**
   * Protobuf type {@code ChallengeSettleNotify}
   */
  public static final class ChallengeSettleNotify extends ProtoMessage<ChallengeSettleNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 stars = 1;</code>
     */
    private int stars;

    /**
     * <code>optional uint32 challenge_id = 3;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 challenge_score = 10;</code>
     */
    private int challengeScore;

    /**
     * <code>optional uint32 score_two = 12;</code>
     */
    private int scoreTwo;

    /**
     * <code>optional bool is_win = 5;</code>
     */
    private boolean isWin;

    /**
     * <code>optional .ItemList reward = 14;</code>
     */
    private final ItemListOuterClass.ItemList reward = ItemListOuterClass.ItemList.newInstance();

    private ChallengeSettleNotify() {
    }

    /**
     * @return a new empty instance of {@code ChallengeSettleNotify}
     */
    public static ChallengeSettleNotify newInstance() {
      return new ChallengeSettleNotify();
    }

    /**
     * <code>optional uint32 stars = 1;</code>
     * @return whether the stars field is set
     */
    public boolean hasStars() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 stars = 1;</code>
     * @return this
     */
    public ChallengeSettleNotify clearStars() {
      bitField0_ &= ~0x00000001;
      stars = 0;
      return this;
    }

    /**
     * <code>optional uint32 stars = 1;</code>
     * @return the stars
     */
    public int getStars() {
      return stars;
    }

    /**
     * <code>optional uint32 stars = 1;</code>
     * @param value the stars to set
     * @return this
     */
    public ChallengeSettleNotify setStars(final int value) {
      bitField0_ |= 0x00000001;
      stars = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 3;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 3;</code>
     * @return this
     */
    public ChallengeSettleNotify clearChallengeId() {
      bitField0_ &= ~0x00000002;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 3;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 3;</code>
     * @param value the challengeId to set
     * @return this
     */
    public ChallengeSettleNotify setChallengeId(final int value) {
      bitField0_ |= 0x00000002;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_score = 10;</code>
     * @return whether the challengeScore field is set
     */
    public boolean hasChallengeScore() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 challenge_score = 10;</code>
     * @return this
     */
    public ChallengeSettleNotify clearChallengeScore() {
      bitField0_ &= ~0x00000004;
      challengeScore = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_score = 10;</code>
     * @return the challengeScore
     */
    public int getChallengeScore() {
      return challengeScore;
    }

    /**
     * <code>optional uint32 challenge_score = 10;</code>
     * @param value the challengeScore to set
     * @return this
     */
    public ChallengeSettleNotify setChallengeScore(final int value) {
      bitField0_ |= 0x00000004;
      challengeScore = value;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 12;</code>
     * @return whether the scoreTwo field is set
     */
    public boolean hasScoreTwo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 score_two = 12;</code>
     * @return this
     */
    public ChallengeSettleNotify clearScoreTwo() {
      bitField0_ &= ~0x00000008;
      scoreTwo = 0;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 12;</code>
     * @return the scoreTwo
     */
    public int getScoreTwo() {
      return scoreTwo;
    }

    /**
     * <code>optional uint32 score_two = 12;</code>
     * @param value the scoreTwo to set
     * @return this
     */
    public ChallengeSettleNotify setScoreTwo(final int value) {
      bitField0_ |= 0x00000008;
      scoreTwo = value;
      return this;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return whether the isWin field is set
     */
    public boolean hasIsWin() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return this
     */
    public ChallengeSettleNotify clearIsWin() {
      bitField0_ &= ~0x00000010;
      isWin = false;
      return this;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return the isWin
     */
    public boolean getIsWin() {
      return isWin;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @param value the isWin to set
     * @return this
     */
    public ChallengeSettleNotify setIsWin(final boolean value) {
      bitField0_ |= 0x00000010;
      isWin = value;
      return this;
    }

    /**
     * <code>optional .ItemList reward = 14;</code>
     * @return whether the reward field is set
     */
    public boolean hasReward() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .ItemList reward = 14;</code>
     * @return this
     */
    public ChallengeSettleNotify clearReward() {
      bitField0_ &= ~0x00000020;
      reward.clear();
      return this;
    }

    /**
     * <code>optional .ItemList reward = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReward()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getReward() {
      return reward;
    }

    /**
     * <code>optional .ItemList reward = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableReward() {
      bitField0_ |= 0x00000020;
      return reward;
    }

    /**
     * <code>optional .ItemList reward = 14;</code>
     * @param value the reward to set
     * @return this
     */
    public ChallengeSettleNotify setReward(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000020;
      reward.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeSettleNotify copyFrom(final ChallengeSettleNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        stars = other.stars;
        challengeId = other.challengeId;
        challengeScore = other.challengeScore;
        scoreTwo = other.scoreTwo;
        isWin = other.isWin;
        reward.copyFrom(other.reward);
      }
      return this;
    }

    @Override
    public ChallengeSettleNotify mergeFrom(final ChallengeSettleNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStars()) {
        setStars(other.stars);
      }
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasChallengeScore()) {
        setChallengeScore(other.challengeScore);
      }
      if (other.hasScoreTwo()) {
        setScoreTwo(other.scoreTwo);
      }
      if (other.hasIsWin()) {
        setIsWin(other.isWin);
      }
      if (other.hasReward()) {
        getMutableReward().mergeFrom(other.reward);
      }
      return this;
    }

    @Override
    public ChallengeSettleNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      stars = 0;
      challengeId = 0;
      challengeScore = 0;
      scoreTwo = 0;
      isWin = false;
      reward.clear();
      return this;
    }

    @Override
    public ChallengeSettleNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      reward.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeSettleNotify)) {
        return false;
      }
      ChallengeSettleNotify other = (ChallengeSettleNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasStars() || stars == other.stars)
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasChallengeScore() || challengeScore == other.challengeScore)
        && (!hasScoreTwo() || scoreTwo == other.scoreTwo)
        && (!hasIsWin() || isWin == other.isWin)
        && (!hasReward() || reward.equals(other.reward));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(challengeScore);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isWin);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(reward);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeScore);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(reward);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeSettleNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // stars
            stars = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // challengeScore
            challengeScore = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // scoreTwo
            scoreTwo = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isWin
            isWin = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // reward
            input.readMessage(reward);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.stars, stars);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.challengeScore, challengeScore);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.scoreTwo, scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.isWin, isWin);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.reward, reward);
      }
      output.endObject();
    }

    @Override
    public ChallengeSettleNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109757537: {
            if (input.isAtField(FieldNames.stars)) {
              if (!input.trySkipNullValue()) {
                stars = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 591599599:
          case 1517684662: {
            if (input.isAtField(FieldNames.challengeScore)) {
              if (!input.trySkipNullValue()) {
                challengeScore = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -485512614:
          case 2129303327: {
            if (input.isAtField(FieldNames.scoreTwo)) {
              if (!input.trySkipNullValue()) {
                scoreTwo = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100482642:
          case -1179753657: {
            if (input.isAtField(FieldNames.isWin)) {
              if (!input.trySkipNullValue()) {
                isWin = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -934326481: {
            if (input.isAtField(FieldNames.reward)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(reward);
                bitField0_ |= 0x00000020;
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
    public ChallengeSettleNotify clone() {
      return new ChallengeSettleNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeSettleNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeSettleNotify(), data).checkInitialized();
    }

    public static ChallengeSettleNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeSettleNotify(), input).checkInitialized();
    }

    public static ChallengeSettleNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeSettleNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeSettleNotify messages
     */
    public static MessageFactory<ChallengeSettleNotify> getFactory() {
      return ChallengeSettleNotifyFactory.INSTANCE;
    }

    private enum ChallengeSettleNotifyFactory implements MessageFactory<ChallengeSettleNotify> {
      INSTANCE;

      @Override
      public ChallengeSettleNotify create() {
        return ChallengeSettleNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName stars = FieldName.forField("stars");

      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName challengeScore = FieldName.forField("challengeScore", "challenge_score");

      static final FieldName scoreTwo = FieldName.forField("scoreTwo", "score_two");

      static final FieldName isWin = FieldName.forField("isWin", "is_win");

      static final FieldName reward = FieldName.forField("reward");
    }
  }
}
