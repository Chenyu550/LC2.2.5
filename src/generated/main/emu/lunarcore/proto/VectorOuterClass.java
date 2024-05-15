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

public final class VectorOuterClass {
  /**
   * Protobuf type {@code Vector}
   */
  public static final class Vector extends ProtoMessage<Vector> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional sint32 z = 8;</code>
     */
    private int z;

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional sint32 y = 10;</code>
     */
    private int y;

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional sint32 x = 12;</code>
     */
    private int x;

    private Vector() {
    }

    /**
     * @return a new empty instance of {@code Vector}
     */
    public static Vector newInstance() {
      return new Vector();
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional sint32 z = 8;</code>
     * @return whether the z field is set
     */
    public boolean hasZ() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional sint32 z = 8;</code>
     * @return this
     */
    public Vector clearZ() {
      bitField0_ &= ~0x00000001;
      z = 0;
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional sint32 z = 8;</code>
     * @return the z
     */
    public int getZ() {
      return z;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>optional sint32 z = 8;</code>
     * @param value the z to set
     * @return this
     */
    public Vector setZ(final int value) {
      bitField0_ |= 0x00000001;
      z = value;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional sint32 y = 10;</code>
     * @return whether the y field is set
     */
    public boolean hasY() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional sint32 y = 10;</code>
     * @return this
     */
    public Vector clearY() {
      bitField0_ &= ~0x00000002;
      y = 0;
      return this;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional sint32 y = 10;</code>
     * @return the y
     */
    public int getY() {
      return y;
    }

    /**
     * <pre>
     * 3
     * </pre>
     *
     * <code>optional sint32 y = 10;</code>
     * @param value the y to set
     * @return this
     */
    public Vector setY(final int value) {
      bitField0_ |= 0x00000002;
      y = value;
      return this;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional sint32 x = 12;</code>
     * @return whether the x field is set
     */
    public boolean hasX() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional sint32 x = 12;</code>
     * @return this
     */
    public Vector clearX() {
      bitField0_ &= ~0x00000004;
      x = 0;
      return this;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional sint32 x = 12;</code>
     * @return the x
     */
    public int getX() {
      return x;
    }

    /**
     * <pre>
     * 2
     * </pre>
     *
     * <code>optional sint32 x = 12;</code>
     * @param value the x to set
     * @return this
     */
    public Vector setX(final int value) {
      bitField0_ |= 0x00000004;
      x = value;
      return this;
    }

    @Override
    public Vector copyFrom(final Vector other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        z = other.z;
        y = other.y;
        x = other.x;
      }
      return this;
    }

    @Override
    public Vector mergeFrom(final Vector other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasZ()) {
        setZ(other.z);
      }
      if (other.hasY()) {
        setY(other.y);
      }
      if (other.hasX()) {
        setX(other.x);
      }
      return this;
    }

    @Override
    public Vector clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      z = 0;
      y = 0;
      x = 0;
      return this;
    }

    @Override
    public Vector clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Vector)) {
        return false;
      }
      Vector other = (Vector) o;
      return bitField0_ == other.bitField0_
        && (!hasZ() || z == other.z)
        && (!hasY() || y == other.y)
        && (!hasX() || x == other.x);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeSInt32NoTag(z);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeSInt32NoTag(y);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeSInt32NoTag(x);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeSInt32SizeNoTag(z);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeSInt32SizeNoTag(y);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeSInt32SizeNoTag(x);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Vector mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // z
            z = input.readSInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // y
            y = input.readSInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // x
            x = input.readSInt32();
            bitField0_ |= 0x00000004;
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
        output.writeSInt32(FieldNames.z, z);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeSInt32(FieldNames.y, y);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeSInt32(FieldNames.x, x);
      }
      output.endObject();
    }

    @Override
    public Vector mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 122: {
            if (input.isAtField(FieldNames.z)) {
              if (!input.trySkipNullValue()) {
                z = input.readSInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 121: {
            if (input.isAtField(FieldNames.y)) {
              if (!input.trySkipNullValue()) {
                y = input.readSInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 120: {
            if (input.isAtField(FieldNames.x)) {
              if (!input.trySkipNullValue()) {
                x = input.readSInt32();
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
    public Vector clone() {
      return new Vector().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Vector parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Vector(), data).checkInitialized();
    }

    public static Vector parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Vector(), input).checkInitialized();
    }

    public static Vector parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Vector(), input).checkInitialized();
    }

    /**
     * @return factory for creating Vector messages
     */
    public static MessageFactory<Vector> getFactory() {
      return VectorFactory.INSTANCE;
    }

    private enum VectorFactory implements MessageFactory<Vector> {
      INSTANCE;

      @Override
      public Vector create() {
        return Vector.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName z = FieldName.forField("z");

      static final FieldName y = FieldName.forField("y");

      static final FieldName x = FieldName.forField("x");
    }
  }
}
