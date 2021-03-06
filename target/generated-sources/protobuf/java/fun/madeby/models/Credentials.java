// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/credentials.proto

package fun.madeby.models;

/**
 * Protobuf type {@code Credentials}
 */
public  final class Credentials extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Credentials)
    CredentialsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Credentials.newBuilder() to construct.
  private Credentials(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credentials() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Credentials(
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
            fun.madeby.models.EmailCredentials.Builder subBuilder = null;
            if (dingleberryCase_ == 1) {
              subBuilder = ((fun.madeby.models.EmailCredentials) dingleberry_).toBuilder();
            }
            dingleberry_ =
                input.readMessage(fun.madeby.models.EmailCredentials.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((fun.madeby.models.EmailCredentials) dingleberry_);
              dingleberry_ = subBuilder.buildPartial();
            }
            dingleberryCase_ = 1;
            break;
          }
          case 18: {
            fun.madeby.models.PhoneOTP.Builder subBuilder = null;
            if (dingleberryCase_ == 2) {
              subBuilder = ((fun.madeby.models.PhoneOTP) dingleberry_).toBuilder();
            }
            dingleberry_ =
                input.readMessage(fun.madeby.models.PhoneOTP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((fun.madeby.models.PhoneOTP) dingleberry_);
              dingleberry_ = subBuilder.buildPartial();
            }
            dingleberryCase_ = 2;
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
    return fun.madeby.models.CredentialsOuterClass.internal_static_Credentials_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fun.madeby.models.CredentialsOuterClass.internal_static_Credentials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fun.madeby.models.Credentials.class, fun.madeby.models.Credentials.Builder.class);
  }

  private int dingleberryCase_ = 0;
  private java.lang.Object dingleberry_;
  public enum DingleberryCase
      implements com.google.protobuf.Internal.EnumLite {
    EMAILDINGLEBERRY(1),
    PHONEDINGLEBERRY(2),
    DINGLEBERRY_NOT_SET(0);
    private final int value;
    private DingleberryCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DingleberryCase valueOf(int value) {
      return forNumber(value);
    }

    public static DingleberryCase forNumber(int value) {
      switch (value) {
        case 1: return EMAILDINGLEBERRY;
        case 2: return PHONEDINGLEBERRY;
        case 0: return DINGLEBERRY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DingleberryCase
  getDingleberryCase() {
    return DingleberryCase.forNumber(
        dingleberryCase_);
  }

  public static final int EMAILDINGLEBERRY_FIELD_NUMBER = 1;
  /**
   * <code>.EmailCredentials emailDingleberry = 1;</code>
   */
  public boolean hasEmailDingleberry() {
    return dingleberryCase_ == 1;
  }
  /**
   * <code>.EmailCredentials emailDingleberry = 1;</code>
   */
  public fun.madeby.models.EmailCredentials getEmailDingleberry() {
    if (dingleberryCase_ == 1) {
       return (fun.madeby.models.EmailCredentials) dingleberry_;
    }
    return fun.madeby.models.EmailCredentials.getDefaultInstance();
  }
  /**
   * <code>.EmailCredentials emailDingleberry = 1;</code>
   */
  public fun.madeby.models.EmailCredentialsOrBuilder getEmailDingleberryOrBuilder() {
    if (dingleberryCase_ == 1) {
       return (fun.madeby.models.EmailCredentials) dingleberry_;
    }
    return fun.madeby.models.EmailCredentials.getDefaultInstance();
  }

  public static final int PHONEDINGLEBERRY_FIELD_NUMBER = 2;
  /**
   * <code>.PhoneOTP phoneDingleberry = 2;</code>
   */
  public boolean hasPhoneDingleberry() {
    return dingleberryCase_ == 2;
  }
  /**
   * <code>.PhoneOTP phoneDingleberry = 2;</code>
   */
  public fun.madeby.models.PhoneOTP getPhoneDingleberry() {
    if (dingleberryCase_ == 2) {
       return (fun.madeby.models.PhoneOTP) dingleberry_;
    }
    return fun.madeby.models.PhoneOTP.getDefaultInstance();
  }
  /**
   * <code>.PhoneOTP phoneDingleberry = 2;</code>
   */
  public fun.madeby.models.PhoneOTPOrBuilder getPhoneDingleberryOrBuilder() {
    if (dingleberryCase_ == 2) {
       return (fun.madeby.models.PhoneOTP) dingleberry_;
    }
    return fun.madeby.models.PhoneOTP.getDefaultInstance();
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
    if (dingleberryCase_ == 1) {
      output.writeMessage(1, (fun.madeby.models.EmailCredentials) dingleberry_);
    }
    if (dingleberryCase_ == 2) {
      output.writeMessage(2, (fun.madeby.models.PhoneOTP) dingleberry_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dingleberryCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (fun.madeby.models.EmailCredentials) dingleberry_);
    }
    if (dingleberryCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (fun.madeby.models.PhoneOTP) dingleberry_);
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
    if (!(obj instanceof fun.madeby.models.Credentials)) {
      return super.equals(obj);
    }
    fun.madeby.models.Credentials other = (fun.madeby.models.Credentials) obj;

    boolean result = true;
    result = result && getDingleberryCase().equals(
        other.getDingleberryCase());
    if (!result) return false;
    switch (dingleberryCase_) {
      case 1:
        result = result && getEmailDingleberry()
            .equals(other.getEmailDingleberry());
        break;
      case 2:
        result = result && getPhoneDingleberry()
            .equals(other.getPhoneDingleberry());
        break;
      case 0:
      default:
    }
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
    switch (dingleberryCase_) {
      case 1:
        hash = (37 * hash) + EMAILDINGLEBERRY_FIELD_NUMBER;
        hash = (53 * hash) + getEmailDingleberry().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PHONEDINGLEBERRY_FIELD_NUMBER;
        hash = (53 * hash) + getPhoneDingleberry().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fun.madeby.models.Credentials parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Credentials parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Credentials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Credentials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Credentials parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fun.madeby.models.Credentials parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fun.madeby.models.Credentials parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Credentials parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static fun.madeby.models.Credentials parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Credentials parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fun.madeby.models.Credentials parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fun.madeby.models.Credentials parseFrom(
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
  public static Builder newBuilder(fun.madeby.models.Credentials prototype) {
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
   * Protobuf type {@code Credentials}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Credentials)
      fun.madeby.models.CredentialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fun.madeby.models.CredentialsOuterClass.internal_static_Credentials_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fun.madeby.models.CredentialsOuterClass.internal_static_Credentials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fun.madeby.models.Credentials.class, fun.madeby.models.Credentials.Builder.class);
    }

    // Construct using fun.madeby.models.Credentials.newBuilder()
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
      dingleberryCase_ = 0;
      dingleberry_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fun.madeby.models.CredentialsOuterClass.internal_static_Credentials_descriptor;
    }

    @java.lang.Override
    public fun.madeby.models.Credentials getDefaultInstanceForType() {
      return fun.madeby.models.Credentials.getDefaultInstance();
    }

    @java.lang.Override
    public fun.madeby.models.Credentials build() {
      fun.madeby.models.Credentials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fun.madeby.models.Credentials buildPartial() {
      fun.madeby.models.Credentials result = new fun.madeby.models.Credentials(this);
      if (dingleberryCase_ == 1) {
        if (emailDingleberryBuilder_ == null) {
          result.dingleberry_ = dingleberry_;
        } else {
          result.dingleberry_ = emailDingleberryBuilder_.build();
        }
      }
      if (dingleberryCase_ == 2) {
        if (phoneDingleberryBuilder_ == null) {
          result.dingleberry_ = dingleberry_;
        } else {
          result.dingleberry_ = phoneDingleberryBuilder_.build();
        }
      }
      result.dingleberryCase_ = dingleberryCase_;
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
      if (other instanceof fun.madeby.models.Credentials) {
        return mergeFrom((fun.madeby.models.Credentials)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fun.madeby.models.Credentials other) {
      if (other == fun.madeby.models.Credentials.getDefaultInstance()) return this;
      switch (other.getDingleberryCase()) {
        case EMAILDINGLEBERRY: {
          mergeEmailDingleberry(other.getEmailDingleberry());
          break;
        }
        case PHONEDINGLEBERRY: {
          mergePhoneDingleberry(other.getPhoneDingleberry());
          break;
        }
        case DINGLEBERRY_NOT_SET: {
          break;
        }
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
      fun.madeby.models.Credentials parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (fun.madeby.models.Credentials) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dingleberryCase_ = 0;
    private java.lang.Object dingleberry_;
    public DingleberryCase
        getDingleberryCase() {
      return DingleberryCase.forNumber(
          dingleberryCase_);
    }

    public Builder clearDingleberry() {
      dingleberryCase_ = 0;
      dingleberry_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        fun.madeby.models.EmailCredentials, fun.madeby.models.EmailCredentials.Builder, fun.madeby.models.EmailCredentialsOrBuilder> emailDingleberryBuilder_;
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public boolean hasEmailDingleberry() {
      return dingleberryCase_ == 1;
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public fun.madeby.models.EmailCredentials getEmailDingleberry() {
      if (emailDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 1) {
          return (fun.madeby.models.EmailCredentials) dingleberry_;
        }
        return fun.madeby.models.EmailCredentials.getDefaultInstance();
      } else {
        if (dingleberryCase_ == 1) {
          return emailDingleberryBuilder_.getMessage();
        }
        return fun.madeby.models.EmailCredentials.getDefaultInstance();
      }
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public Builder setEmailDingleberry(fun.madeby.models.EmailCredentials value) {
      if (emailDingleberryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dingleberry_ = value;
        onChanged();
      } else {
        emailDingleberryBuilder_.setMessage(value);
      }
      dingleberryCase_ = 1;
      return this;
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public Builder setEmailDingleberry(
        fun.madeby.models.EmailCredentials.Builder builderForValue) {
      if (emailDingleberryBuilder_ == null) {
        dingleberry_ = builderForValue.build();
        onChanged();
      } else {
        emailDingleberryBuilder_.setMessage(builderForValue.build());
      }
      dingleberryCase_ = 1;
      return this;
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public Builder mergeEmailDingleberry(fun.madeby.models.EmailCredentials value) {
      if (emailDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 1 &&
            dingleberry_ != fun.madeby.models.EmailCredentials.getDefaultInstance()) {
          dingleberry_ = fun.madeby.models.EmailCredentials.newBuilder((fun.madeby.models.EmailCredentials) dingleberry_)
              .mergeFrom(value).buildPartial();
        } else {
          dingleberry_ = value;
        }
        onChanged();
      } else {
        if (dingleberryCase_ == 1) {
          emailDingleberryBuilder_.mergeFrom(value);
        }
        emailDingleberryBuilder_.setMessage(value);
      }
      dingleberryCase_ = 1;
      return this;
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public Builder clearEmailDingleberry() {
      if (emailDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 1) {
          dingleberryCase_ = 0;
          dingleberry_ = null;
          onChanged();
        }
      } else {
        if (dingleberryCase_ == 1) {
          dingleberryCase_ = 0;
          dingleberry_ = null;
        }
        emailDingleberryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public fun.madeby.models.EmailCredentials.Builder getEmailDingleberryBuilder() {
      return getEmailDingleberryFieldBuilder().getBuilder();
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    public fun.madeby.models.EmailCredentialsOrBuilder getEmailDingleberryOrBuilder() {
      if ((dingleberryCase_ == 1) && (emailDingleberryBuilder_ != null)) {
        return emailDingleberryBuilder_.getMessageOrBuilder();
      } else {
        if (dingleberryCase_ == 1) {
          return (fun.madeby.models.EmailCredentials) dingleberry_;
        }
        return fun.madeby.models.EmailCredentials.getDefaultInstance();
      }
    }
    /**
     * <code>.EmailCredentials emailDingleberry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fun.madeby.models.EmailCredentials, fun.madeby.models.EmailCredentials.Builder, fun.madeby.models.EmailCredentialsOrBuilder> 
        getEmailDingleberryFieldBuilder() {
      if (emailDingleberryBuilder_ == null) {
        if (!(dingleberryCase_ == 1)) {
          dingleberry_ = fun.madeby.models.EmailCredentials.getDefaultInstance();
        }
        emailDingleberryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fun.madeby.models.EmailCredentials, fun.madeby.models.EmailCredentials.Builder, fun.madeby.models.EmailCredentialsOrBuilder>(
                (fun.madeby.models.EmailCredentials) dingleberry_,
                getParentForChildren(),
                isClean());
        dingleberry_ = null;
      }
      dingleberryCase_ = 1;
      onChanged();;
      return emailDingleberryBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        fun.madeby.models.PhoneOTP, fun.madeby.models.PhoneOTP.Builder, fun.madeby.models.PhoneOTPOrBuilder> phoneDingleberryBuilder_;
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public boolean hasPhoneDingleberry() {
      return dingleberryCase_ == 2;
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public fun.madeby.models.PhoneOTP getPhoneDingleberry() {
      if (phoneDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 2) {
          return (fun.madeby.models.PhoneOTP) dingleberry_;
        }
        return fun.madeby.models.PhoneOTP.getDefaultInstance();
      } else {
        if (dingleberryCase_ == 2) {
          return phoneDingleberryBuilder_.getMessage();
        }
        return fun.madeby.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public Builder setPhoneDingleberry(fun.madeby.models.PhoneOTP value) {
      if (phoneDingleberryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dingleberry_ = value;
        onChanged();
      } else {
        phoneDingleberryBuilder_.setMessage(value);
      }
      dingleberryCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public Builder setPhoneDingleberry(
        fun.madeby.models.PhoneOTP.Builder builderForValue) {
      if (phoneDingleberryBuilder_ == null) {
        dingleberry_ = builderForValue.build();
        onChanged();
      } else {
        phoneDingleberryBuilder_.setMessage(builderForValue.build());
      }
      dingleberryCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public Builder mergePhoneDingleberry(fun.madeby.models.PhoneOTP value) {
      if (phoneDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 2 &&
            dingleberry_ != fun.madeby.models.PhoneOTP.getDefaultInstance()) {
          dingleberry_ = fun.madeby.models.PhoneOTP.newBuilder((fun.madeby.models.PhoneOTP) dingleberry_)
              .mergeFrom(value).buildPartial();
        } else {
          dingleberry_ = value;
        }
        onChanged();
      } else {
        if (dingleberryCase_ == 2) {
          phoneDingleberryBuilder_.mergeFrom(value);
        }
        phoneDingleberryBuilder_.setMessage(value);
      }
      dingleberryCase_ = 2;
      return this;
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public Builder clearPhoneDingleberry() {
      if (phoneDingleberryBuilder_ == null) {
        if (dingleberryCase_ == 2) {
          dingleberryCase_ = 0;
          dingleberry_ = null;
          onChanged();
        }
      } else {
        if (dingleberryCase_ == 2) {
          dingleberryCase_ = 0;
          dingleberry_ = null;
        }
        phoneDingleberryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public fun.madeby.models.PhoneOTP.Builder getPhoneDingleberryBuilder() {
      return getPhoneDingleberryFieldBuilder().getBuilder();
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    public fun.madeby.models.PhoneOTPOrBuilder getPhoneDingleberryOrBuilder() {
      if ((dingleberryCase_ == 2) && (phoneDingleberryBuilder_ != null)) {
        return phoneDingleberryBuilder_.getMessageOrBuilder();
      } else {
        if (dingleberryCase_ == 2) {
          return (fun.madeby.models.PhoneOTP) dingleberry_;
        }
        return fun.madeby.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.PhoneOTP phoneDingleberry = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fun.madeby.models.PhoneOTP, fun.madeby.models.PhoneOTP.Builder, fun.madeby.models.PhoneOTPOrBuilder> 
        getPhoneDingleberryFieldBuilder() {
      if (phoneDingleberryBuilder_ == null) {
        if (!(dingleberryCase_ == 2)) {
          dingleberry_ = fun.madeby.models.PhoneOTP.getDefaultInstance();
        }
        phoneDingleberryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fun.madeby.models.PhoneOTP, fun.madeby.models.PhoneOTP.Builder, fun.madeby.models.PhoneOTPOrBuilder>(
                (fun.madeby.models.PhoneOTP) dingleberry_,
                getParentForChildren(),
                isClean());
        dingleberry_ = null;
      }
      dingleberryCase_ = 2;
      onChanged();;
      return phoneDingleberryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Credentials)
  }

  // @@protoc_insertion_point(class_scope:Credentials)
  private static final fun.madeby.models.Credentials DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fun.madeby.models.Credentials();
  }

  public static fun.madeby.models.Credentials getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credentials>
      PARSER = new com.google.protobuf.AbstractParser<Credentials>() {
    @java.lang.Override
    public Credentials parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Credentials(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Credentials> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credentials> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fun.madeby.models.Credentials getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

