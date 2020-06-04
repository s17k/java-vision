/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Detected entity location information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.LocationInfo}
 */
public final class LocationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.LocationInfo)
    LocationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationInfo.newBuilder() to construct.
  private LocationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LocationInfo(
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
          case 10:
            {
              com.google.type.LatLng.Builder subBuilder = null;
              if (latLng_ != null) {
                subBuilder = latLng_.toBuilder();
              }
              latLng_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(latLng_);
                latLng_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p3beta1_LocationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p3beta1_LocationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.LocationInfo.class,
            com.google.cloud.vision.v1p3beta1.LocationInfo.Builder.class);
  }

  public static final int LAT_LNG_FIELD_NUMBER = 1;
  private com.google.type.LatLng latLng_;
  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return Whether the latLng field is set.
   */
  @java.lang.Override
  public boolean hasLatLng() {
    return latLng_ != null;
  }
  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return The latLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getLatLng() {
    return latLng_ == null ? com.google.type.LatLng.getDefaultInstance() : latLng_;
  }
  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getLatLngOrBuilder() {
    return getLatLng();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (latLng_ != null) {
      output.writeMessage(1, getLatLng());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latLng_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getLatLng());
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.LocationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.LocationInfo other =
        (com.google.cloud.vision.v1p3beta1.LocationInfo) obj;

    if (hasLatLng() != other.hasLatLng()) return false;
    if (hasLatLng()) {
      if (!getLatLng().equals(other.getLatLng())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLatLng()) {
      hash = (37 * hash) + LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getLatLng().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vision.v1p3beta1.LocationInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Detected entity location information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.LocationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.LocationInfo)
      com.google.cloud.vision.v1p3beta1.LocationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_LocationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_LocationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.LocationInfo.class,
              com.google.cloud.vision.v1p3beta1.LocationInfo.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.LocationInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (latLngBuilder_ == null) {
        latLng_ = null;
      } else {
        latLng_ = null;
        latLngBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p3beta1_LocationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.LocationInfo getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.LocationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.LocationInfo build() {
      com.google.cloud.vision.v1p3beta1.LocationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.LocationInfo buildPartial() {
      com.google.cloud.vision.v1p3beta1.LocationInfo result =
          new com.google.cloud.vision.v1p3beta1.LocationInfo(this);
      if (latLngBuilder_ == null) {
        result.latLng_ = latLng_;
      } else {
        result.latLng_ = latLngBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p3beta1.LocationInfo) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.LocationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.LocationInfo other) {
      if (other == com.google.cloud.vision.v1p3beta1.LocationInfo.getDefaultInstance()) return this;
      if (other.hasLatLng()) {
        mergeLatLng(other.getLatLng());
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
      com.google.cloud.vision.v1p3beta1.LocationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p3beta1.LocationInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.LatLng latLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        latLngBuilder_;
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     *
     * @return Whether the latLng field is set.
     */
    public boolean hasLatLng() {
      return latLngBuilder_ != null || latLng_ != null;
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     *
     * @return The latLng.
     */
    public com.google.type.LatLng getLatLng() {
      if (latLngBuilder_ == null) {
        return latLng_ == null ? com.google.type.LatLng.getDefaultInstance() : latLng_;
      } else {
        return latLngBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder setLatLng(com.google.type.LatLng value) {
      if (latLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        latLng_ = value;
        onChanged();
      } else {
        latLngBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder setLatLng(com.google.type.LatLng.Builder builderForValue) {
      if (latLngBuilder_ == null) {
        latLng_ = builderForValue.build();
        onChanged();
      } else {
        latLngBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder mergeLatLng(com.google.type.LatLng value) {
      if (latLngBuilder_ == null) {
        if (latLng_ != null) {
          latLng_ = com.google.type.LatLng.newBuilder(latLng_).mergeFrom(value).buildPartial();
        } else {
          latLng_ = value;
        }
        onChanged();
      } else {
        latLngBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public Builder clearLatLng() {
      if (latLngBuilder_ == null) {
        latLng_ = null;
        onChanged();
      } else {
        latLng_ = null;
        latLngBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public com.google.type.LatLng.Builder getLatLngBuilder() {

      onChanged();
      return getLatLngFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getLatLngOrBuilder() {
      if (latLngBuilder_ != null) {
        return latLngBuilder_.getMessageOrBuilder();
      } else {
        return latLng_ == null ? com.google.type.LatLng.getDefaultInstance() : latLng_;
      }
    }
    /**
     *
     *
     * <pre>
     * lat/long location coordinates.
     * </pre>
     *
     * <code>.google.type.LatLng lat_lng = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getLatLngFieldBuilder() {
      if (latLngBuilder_ == null) {
        latLngBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getLatLng(), getParentForChildren(), isClean());
        latLng_ = null;
      }
      return latLngBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.LocationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.LocationInfo)
  private static final com.google.cloud.vision.v1p3beta1.LocationInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.LocationInfo();
  }

  public static com.google.cloud.vision.v1p3beta1.LocationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationInfo> PARSER =
      new com.google.protobuf.AbstractParser<LocationInfo>() {
        @java.lang.Override
        public LocationInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LocationInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LocationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.LocationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
