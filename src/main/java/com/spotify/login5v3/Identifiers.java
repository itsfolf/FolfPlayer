// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spotify/login5/v3/identifiers/identifiers.proto

package com.spotify.login5v3;

public final class Identifiers {
  private Identifiers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhoneNumberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:spotify.login5.v3.identifiers.PhoneNumber)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string number = 1;</code>
     * @return The number.
     */
    java.lang.String getNumber();
    /**
     * <code>string number = 1;</code>
     * @return The bytes for number.
     */
    com.google.protobuf.ByteString
        getNumberBytes();

    /**
     * <code>string iso_country_code = 2;</code>
     * @return The isoCountryCode.
     */
    java.lang.String getIsoCountryCode();
    /**
     * <code>string iso_country_code = 2;</code>
     * @return The bytes for isoCountryCode.
     */
    com.google.protobuf.ByteString
        getIsoCountryCodeBytes();

    /**
     * <code>string country_calling_code = 3;</code>
     * @return The countryCallingCode.
     */
    java.lang.String getCountryCallingCode();
    /**
     * <code>string country_calling_code = 3;</code>
     * @return The bytes for countryCallingCode.
     */
    com.google.protobuf.ByteString
        getCountryCallingCodeBytes();
  }
  /**
   * Protobuf type {@code spotify.login5.v3.identifiers.PhoneNumber}
   */
  public  static final class PhoneNumber extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:spotify.login5.v3.identifiers.PhoneNumber)
      PhoneNumberOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhoneNumber.newBuilder() to construct.
    private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhoneNumber() {
      number_ = "";
      isoCountryCode_ = "";
      countryCallingCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhoneNumber();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PhoneNumber(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              number_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              isoCountryCode_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              countryCallingCode_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return com.spotify.login5v3.Identifiers.internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spotify.login5v3.Identifiers.internal_static_spotify_login5_v3_identifiers_PhoneNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spotify.login5v3.Identifiers.PhoneNumber.class, com.spotify.login5v3.Identifiers.PhoneNumber.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private volatile java.lang.Object number_;
    /**
     * <code>string number = 1;</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      }
    }
    /**
     * <code>string number = 1;</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISO_COUNTRY_CODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object isoCountryCode_;
    /**
     * <code>string iso_country_code = 2;</code>
     * @return The isoCountryCode.
     */
    public java.lang.String getIsoCountryCode() {
      java.lang.Object ref = isoCountryCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        isoCountryCode_ = s;
        return s;
      }
    }
    /**
     * <code>string iso_country_code = 2;</code>
     * @return The bytes for isoCountryCode.
     */
    public com.google.protobuf.ByteString
        getIsoCountryCodeBytes() {
      java.lang.Object ref = isoCountryCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        isoCountryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNTRY_CALLING_CODE_FIELD_NUMBER = 3;
    private volatile java.lang.Object countryCallingCode_;
    /**
     * <code>string country_calling_code = 3;</code>
     * @return The countryCallingCode.
     */
    public java.lang.String getCountryCallingCode() {
      java.lang.Object ref = countryCallingCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCallingCode_ = s;
        return s;
      }
    }
    /**
     * <code>string country_calling_code = 3;</code>
     * @return The bytes for countryCallingCode.
     */
    public com.google.protobuf.ByteString
        getCountryCallingCodeBytes() {
      java.lang.Object ref = countryCallingCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCallingCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
      }
      if (!getIsoCountryCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, isoCountryCode_);
      }
      if (!getCountryCallingCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, countryCallingCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
      }
      if (!getIsoCountryCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, isoCountryCode_);
      }
      if (!getCountryCallingCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, countryCallingCode_);
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
      if (!(obj instanceof com.spotify.login5v3.Identifiers.PhoneNumber)) {
        return super.equals(obj);
      }
      com.spotify.login5v3.Identifiers.PhoneNumber other = (com.spotify.login5v3.Identifiers.PhoneNumber) obj;

      if (!getNumber()
          .equals(other.getNumber())) return false;
      if (!getIsoCountryCode()
          .equals(other.getIsoCountryCode())) return false;
      if (!getCountryCallingCode()
          .equals(other.getCountryCallingCode())) return false;
        return unknownFields.equals(other.unknownFields);
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getNumber().hashCode();
      hash = (37 * hash) + ISO_COUNTRY_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getIsoCountryCode().hashCode();
      hash = (37 * hash) + COUNTRY_CALLING_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCountryCallingCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spotify.login5v3.Identifiers.PhoneNumber parseFrom(
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
    public static Builder newBuilder(com.spotify.login5v3.Identifiers.PhoneNumber prototype) {
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
     * Protobuf type {@code spotify.login5.v3.identifiers.PhoneNumber}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:spotify.login5.v3.identifiers.PhoneNumber)
        com.spotify.login5v3.Identifiers.PhoneNumberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spotify.login5v3.Identifiers.internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spotify.login5v3.Identifiers.internal_static_spotify_login5_v3_identifiers_PhoneNumber_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spotify.login5v3.Identifiers.PhoneNumber.class, com.spotify.login5v3.Identifiers.PhoneNumber.Builder.class);
      }

      // Construct using com.spotify.login5v3.Identifiers.PhoneNumber.newBuilder()
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
        number_ = "";

        isoCountryCode_ = "";

        countryCallingCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spotify.login5v3.Identifiers.internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor;
      }

      @java.lang.Override
      public com.spotify.login5v3.Identifiers.PhoneNumber getDefaultInstanceForType() {
        return com.spotify.login5v3.Identifiers.PhoneNumber.getDefaultInstance();
      }

      @java.lang.Override
      public com.spotify.login5v3.Identifiers.PhoneNumber build() {
        com.spotify.login5v3.Identifiers.PhoneNumber result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.spotify.login5v3.Identifiers.PhoneNumber buildPartial() {
        com.spotify.login5v3.Identifiers.PhoneNumber result = new com.spotify.login5v3.Identifiers.PhoneNumber(this);
        result.number_ = number_;
        result.isoCountryCode_ = isoCountryCode_;
        result.countryCallingCode_ = countryCallingCode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spotify.login5v3.Identifiers.PhoneNumber) {
          return mergeFrom((com.spotify.login5v3.Identifiers.PhoneNumber)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spotify.login5v3.Identifiers.PhoneNumber other) {
        if (other == com.spotify.login5v3.Identifiers.PhoneNumber.getDefaultInstance()) return this;
        if (!other.getNumber().isEmpty()) {
          number_ = other.number_;
          onChanged();
        }
        if (!other.getIsoCountryCode().isEmpty()) {
          isoCountryCode_ = other.isoCountryCode_;
          onChanged();
        }
        if (!other.getCountryCallingCode().isEmpty()) {
          countryCallingCode_ = other.countryCallingCode_;
          onChanged();
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
        com.spotify.login5v3.Identifiers.PhoneNumber parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.spotify.login5v3.Identifiers.PhoneNumber) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object number_ = "";
      /**
       * <code>string number = 1;</code>
       * @return The number.
       */
      public java.lang.String getNumber() {
        java.lang.Object ref = number_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          number_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string number = 1;</code>
       * @return The bytes for number.
       */
      public com.google.protobuf.ByteString
          getNumberBytes() {
        java.lang.Object ref = number_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          number_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string number = 1;</code>
       * @param value The number to set.
       * @return This builder for chaining.
       */
      public Builder setNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string number = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber() {
        
        number_ = getDefaultInstance().getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string number = 1;</code>
       * @param value The bytes for number to set.
       * @return This builder for chaining.
       */
      public Builder setNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        number_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object isoCountryCode_ = "";
      /**
       * <code>string iso_country_code = 2;</code>
       * @return The isoCountryCode.
       */
      public java.lang.String getIsoCountryCode() {
        java.lang.Object ref = isoCountryCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          isoCountryCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string iso_country_code = 2;</code>
       * @return The bytes for isoCountryCode.
       */
      public com.google.protobuf.ByteString
          getIsoCountryCodeBytes() {
        java.lang.Object ref = isoCountryCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          isoCountryCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string iso_country_code = 2;</code>
       * @param value The isoCountryCode to set.
       * @return This builder for chaining.
       */
      public Builder setIsoCountryCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        isoCountryCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string iso_country_code = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsoCountryCode() {
        
        isoCountryCode_ = getDefaultInstance().getIsoCountryCode();
        onChanged();
        return this;
      }
      /**
       * <code>string iso_country_code = 2;</code>
       * @param value The bytes for isoCountryCode to set.
       * @return This builder for chaining.
       */
      public Builder setIsoCountryCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        isoCountryCode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object countryCallingCode_ = "";
      /**
       * <code>string country_calling_code = 3;</code>
       * @return The countryCallingCode.
       */
      public java.lang.String getCountryCallingCode() {
        java.lang.Object ref = countryCallingCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          countryCallingCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string country_calling_code = 3;</code>
       * @return The bytes for countryCallingCode.
       */
      public com.google.protobuf.ByteString
          getCountryCallingCodeBytes() {
        java.lang.Object ref = countryCallingCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          countryCallingCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string country_calling_code = 3;</code>
       * @param value The countryCallingCode to set.
       * @return This builder for chaining.
       */
      public Builder setCountryCallingCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        countryCallingCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string country_calling_code = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCountryCallingCode() {
        
        countryCallingCode_ = getDefaultInstance().getCountryCallingCode();
        onChanged();
        return this;
      }
      /**
       * <code>string country_calling_code = 3;</code>
       * @param value The bytes for countryCallingCode to set.
       * @return This builder for chaining.
       */
      public Builder setCountryCallingCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        countryCallingCode_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:spotify.login5.v3.identifiers.PhoneNumber)
    }

    // @@protoc_insertion_point(class_scope:spotify.login5.v3.identifiers.PhoneNumber)
    private static final com.spotify.login5v3.Identifiers.PhoneNumber DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.spotify.login5v3.Identifiers.PhoneNumber();
    }

    public static com.spotify.login5v3.Identifiers.PhoneNumber getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhoneNumber>
        PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
      @java.lang.Override
      public PhoneNumber parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PhoneNumber(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PhoneNumber> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.spotify.login5v3.Identifiers.PhoneNumber getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_spotify_login5_v3_identifiers_PhoneNumber_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static final com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/spotify/login5/v3/identifiers/identifi" +
      "ers.proto\022\035spotify.login5.v3.identifiers" +
      "\"U\n\013PhoneNumber\022\016\n\006number\030\001 \001(\t\022\030\n\020iso_c" +
      "ountry_code\030\002 \001(\t\022\034\n\024country_calling_cod" +
      "e\030\003 \001(\tB\026\n\024com.spotify.login5v3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_spotify_login5_v3_identifiers_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_spotify_login5_v3_identifiers_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "IsoCountryCode", "CountryCallingCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}