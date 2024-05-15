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

public final class ItemListOuterClass {
  /**
   * Protobuf type {@code ItemList}
   */
  public static final class ItemList extends ProtoMessage<ItemList> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     */
    private final RepeatedMessage<ItemOuterClass.Item> itemList = RepeatedMessage.newEmptyInstance(ItemOuterClass.Item.getFactory());

    private ItemList() {
    }

    /**
     * @return a new empty instance of {@code ItemList}
     */
    public static ItemList newInstance() {
      return new ItemList();
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     * @return whether the itemList field is set
     */
    public boolean hasItemList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     * @return this
     */
    public ItemList clearItemList() {
      bitField0_ &= ~0x00000001;
      itemList.clear();
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ItemOuterClass.Item> getItemList() {
      return itemList;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ItemOuterClass.Item> getMutableItemList() {
      bitField0_ |= 0x00000001;
      return itemList;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     * @param value the itemList to add
     * @return this
     */
    public ItemList addItemList(final ItemOuterClass.Item value) {
      bitField0_ |= 0x00000001;
      itemList.add(value);
      return this;
    }

    /**
     * <pre>
     * 4
     * </pre>
     *
     * <code>repeated .Item item_list = 2;</code>
     * @param values the itemList to add
     * @return this
     */
    public ItemList addAllItemList(final ItemOuterClass.Item... values) {
      bitField0_ |= 0x00000001;
      itemList.addAll(values);
      return this;
    }

    @Override
    public ItemList copyFrom(final ItemList other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        itemList.copyFrom(other.itemList);
      }
      return this;
    }

    @Override
    public ItemList mergeFrom(final ItemList other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItemList()) {
        getMutableItemList().addAll(other.itemList);
      }
      return this;
    }

    @Override
    public ItemList clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemList.clear();
      return this;
    }

    @Override
    public ItemList clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ItemList)) {
        return false;
      }
      ItemList other = (ItemList) o;
      return bitField0_ == other.bitField0_
        && (!hasItemList() || itemList.equals(other.itemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < itemList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(itemList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * itemList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(itemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ItemList mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 18: {
            // itemList
            tag = input.readRepeatedMessage(itemList, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.itemList, itemList);
      }
      output.endObject();
    }

    @Override
    public ItemList mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1177280081:
          case -2141396406: {
            if (input.isAtField(FieldNames.itemList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(itemList);
                bitField0_ |= 0x00000001;
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
    public ItemList clone() {
      return new ItemList().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ItemList parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ItemList(), data).checkInitialized();
    }

    public static ItemList parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemList(), input).checkInitialized();
    }

    public static ItemList parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemList(), input).checkInitialized();
    }

    /**
     * @return factory for creating ItemList messages
     */
    public static MessageFactory<ItemList> getFactory() {
      return ItemListFactory.INSTANCE;
    }

    private enum ItemListFactory implements MessageFactory<ItemList> {
      INSTANCE;

      @Override
      public ItemList create() {
        return ItemList.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName itemList = FieldName.forField("itemList", "item_list");
    }
  }
}
