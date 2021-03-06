// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package fun.madeby.models;

/**
 * Protobuf type {@code Car}
 */
public  final class Car extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Car)
    CarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Car.newBuilder() to construct.
  private Car(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Car() {
    make_ = "";
    model_ = "";
    year_ = 0;
    avMarketValue_ = 0D;
    bodyStyle_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Car(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            make_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
            break;
          }
          case 24: {

            year_ = input.readInt32();
            break;
          }
          case 33: {

            avMarketValue_ = input.readDouble();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            bodyStyle_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fun.madeby.models.CarOuterClass.internal_static_Car_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fun.madeby.models.CarOuterClass.internal_static_Car_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fun.madeby.models.Car.class, fun.madeby.models.Car.Builder.class);
  }

  public static final int MAKE_FIELD_NUMBER = 1;
  private volatile java.lang.Object make_;
  /**
   * <code>string make = 1;</code>
   */
  public java.lang.String getMake() {
    java.lang.Object ref = make_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      make_ = s;
      return s;
    }
  }
  /**
   * <code>string make = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMakeBytes() {
    java.lang.Object ref = make_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      make_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object model_;
  /**
   * <code>string model = 2;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <code>string model = 2;</code>
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YEAR_FIELD_NUMBER = 3;
  private int year_;
  /**
   * <code>int32 year = 3;</code>
   */
  public int getYear() {
    return year_;
  }

  public static final int AVMARKETVALUE_FIELD_NUMBER = 4;
  private double avMarketValue_;
  /**
   * <code>double avMarketValue = 4;</code>
   */
  public double getAvMarketValue() {
    return avMarketValue_;
  }

  public static final int BODY_STYLE_FIELD_NUMBER = 5;
  private int bodyStyle_;
  /**
   * <code>.BodyStyle body_style = 5;</code>
   */
  public int getBodyStyleValue() {
    return bodyStyle_;
  }
  /**
   * <code>.BodyStyle body_style = 5;</code>
   */
  public fun.madeby.models.BodyStyle getBodyStyle() {
    @SuppressWarnings("deprecation")
    fun.madeby.models.BodyStyle result = fun.madeby.models.BodyStyle.valueOf(bodyStyle_);
    return result == null ? fun.madeby.models.BodyStyle.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMakeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, make_);
    }
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    if (year_ != 0) {
      output.writeInt32(3, year_);
    }
    if (avMarketValue_ != 0D) {
      output.writeDouble(4, avMarketValue_);
    }
    if (bodyStyle_ != fun.madeby.models.BodyStyle.DEFAULT.getNumber()) {
      output.writeEnum(5, bodyStyle_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMakeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, make_);
    }
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
    }
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, year_);
    }
    if (avMarketValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, avMarketValue_);
    }
    if (bodyStyle_ != fun.madeby.models.BodyStyle.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, bodyStyle_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof fun.madeby.models.Car)) {
      return super.equals(obj);
    }
    fun.madeby.models.Car other = (fun.madeby.models.Car) obj;

    boolean result = true;
    result = result && getMake()
        .equals(other.getMake());
    result = result && getModel()
        .equals(other.getModel());
    result = result && (getYear()
        == other.getYear());
    result = result && (
        java.lang.Double.doubleToLongBits(getAvMarketValue())
        == java.lang.Double.doubleToLongBits(
            other.getAvMarketValue()));
    result = result && bodyStyle_ == other.bodyStyle_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MAKE_FIELD_NUMBER;
    hash = (53 * hash) + getMake().hashCode();
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + AVMARKETVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAvMarketValue()));
    hash = (37 * hash) + BODY_STYLE_FIELD_NUMBER;
    hash = (53 * hash) + bodyStyle_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fun.madeby.models.Car parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Car parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static fun.madeby.models.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fun.madeby.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(fun.madeby.models.Car prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Car)
      fun.madeby.models.CarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fun.madeby.models.CarOuterClass.internal_static_Car_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fun.madeby.models.CarOuterClass.internal_static_Car_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fun.madeby.models.Car.class, fun.madeby.models.Car.Builder.class);
    }

    // Construct using fun.madeby.models.Car.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      make_ = "";

      model_ = "";

      year_ = 0;

      avMarketValue_ = 0D;

      bodyStyle_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fun.madeby.models.CarOuterClass.internal_static_Car_descriptor;
    }

    @java.lang.Override
    public fun.madeby.models.Car getDefaultInstanceForType() {
      return fun.madeby.models.Car.getDefaultInstance();
    }

    @java.lang.Override
    public fun.madeby.models.Car build() {
      fun.madeby.models.Car result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fun.madeby.models.Car buildPartial() {
      fun.madeby.models.Car result = new fun.madeby.models.Car(this);
      result.make_ = make_;
      result.model_ = model_;
      result.year_ = year_;
      result.avMarketValue_ = avMarketValue_;
      result.bodyStyle_ = bodyStyle_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof fun.madeby.models.Car) {
        return mergeFrom((fun.madeby.models.Car)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fun.madeby.models.Car other) {
      if (other == fun.madeby.models.Car.getDefaultInstance()) return this;
      if (!other.getMake().isEmpty()) {
        make_ = other.make_;
        onChanged();
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (other.getAvMarketValue() != 0D) {
        setAvMarketValue(other.getAvMarketValue());
      }
      if (other.bodyStyle_ != 0) {
        setBodyStyleValue(other.getBodyStyleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      fun.madeby.models.Car parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (fun.madeby.models.Car) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object make_ = "";
    /**
     * <code>string make = 1;</code>
     */
    public java.lang.String getMake() {
      java.lang.Object ref = make_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        make_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string make = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMakeBytes() {
      java.lang.Object ref = make_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        make_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string make = 1;</code>
     */
    public Builder setMake(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      make_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string make = 1;</code>
     */
    public Builder clearMake() {
      
      make_ = getDefaultInstance().getMake();
      onChanged();
      return this;
    }
    /**
     * <code>string make = 1;</code>
     */
    public Builder setMakeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      make_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>string model = 2;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model = 2;</code>
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model = 2;</code>
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <code>string model = 2;</code>
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private int year_ ;
    /**
     * <code>int32 year = 3;</code>
     */
    public int getYear() {
      return year_;
    }
    /**
     * <code>int32 year = 3;</code>
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 year = 3;</code>
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private double avMarketValue_ ;
    /**
     * <code>double avMarketValue = 4;</code>
     */
    public double getAvMarketValue() {
      return avMarketValue_;
    }
    /**
     * <code>double avMarketValue = 4;</code>
     */
    public Builder setAvMarketValue(double value) {
      
      avMarketValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double avMarketValue = 4;</code>
     */
    public Builder clearAvMarketValue() {
      
      avMarketValue_ = 0D;
      onChanged();
      return this;
    }

    private int bodyStyle_ = 0;
    /**
     * <code>.BodyStyle body_style = 5;</code>
     */
    public int getBodyStyleValue() {
      return bodyStyle_;
    }
    /**
     * <code>.BodyStyle body_style = 5;</code>
     */
    public Builder setBodyStyleValue(int value) {
      bodyStyle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.BodyStyle body_style = 5;</code>
     */
    public fun.madeby.models.BodyStyle getBodyStyle() {
      @SuppressWarnings("deprecation")
      fun.madeby.models.BodyStyle result = fun.madeby.models.BodyStyle.valueOf(bodyStyle_);
      return result == null ? fun.madeby.models.BodyStyle.UNRECOGNIZED : result;
    }
    /**
     * <code>.BodyStyle body_style = 5;</code>
     */
    public Builder setBodyStyle(fun.madeby.models.BodyStyle value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bodyStyle_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.BodyStyle body_style = 5;</code>
     */
    public Builder clearBodyStyle() {
      
      bodyStyle_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Car)
  }

  // @@protoc_insertion_point(class_scope:Car)
  private static final fun.madeby.models.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fun.madeby.models.Car();
  }

  public static fun.madeby.models.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Car>
      PARSER = new com.google.protobuf.AbstractParser<Car>() {
    @java.lang.Override
    public Car parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Car(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Car> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Car> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fun.madeby.models.Car getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

