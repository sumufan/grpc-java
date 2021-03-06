// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Identifies location of where either Envoy runs or where upstream hosts run.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.Locality}
 */
public  final class Locality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.Locality)
    LocalityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Locality.newBuilder() to construct.
  private Locality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Locality() {
    region_ = "";
    zone_ = "";
    subZone_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Locality(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            region_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            subZone_ = s;
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
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Locality_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Locality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.Locality.class, io.grpc.xds.shaded.envoy.api.v2.core.Locality.Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  private volatile java.lang.Object region_;
  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   */
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
   * </pre>
   *
   * <code>string region = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object zone_;
  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Defines the local service zone where Envoy is running. Though optional, it
   * should be set if discovery service routing is used and the discovery
   * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
   * either in this message or via :option:`--service-zone`. The meaning of zone
   * is context dependent, e.g. `Availability Zone (AZ)
   * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
   * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
   * GCP, etc.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUB_ZONE_FIELD_NUMBER = 3;
  private volatile java.lang.Object subZone_;
  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   */
  public java.lang.String getSubZone() {
    java.lang.Object ref = subZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subZone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * When used for locality of upstream hosts, this field further splits zone
   * into smaller chunks of sub-zones so they can be load balanced
   * independently.
   * </pre>
   *
   * <code>string sub_zone = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSubZoneBytes() {
    java.lang.Object ref = subZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, region_);
    }
    if (!getZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!getSubZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subZone_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, region_);
    }
    if (!getZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!getSubZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subZone_);
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.Locality)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.Locality other = (io.grpc.xds.shaded.envoy.api.v2.core.Locality) obj;

    boolean result = true;
    result = result && getRegion()
        .equals(other.getRegion());
    result = result && getZone()
        .equals(other.getZone());
    result = result && getSubZone()
        .equals(other.getSubZone());
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + SUB_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getSubZone().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.Locality prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Identifies location of where either Envoy runs or where upstream hosts run.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.Locality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.Locality)
      io.grpc.xds.shaded.envoy.api.v2.core.LocalityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Locality_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Locality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.Locality.class, io.grpc.xds.shaded.envoy.api.v2.core.Locality.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.Locality.newBuilder()
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
    public Builder clear() {
      super.clear();
      region_ = "";

      zone_ = "";

      subZone_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_Locality_descriptor;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.Locality getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Locality.getDefaultInstance();
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.Locality build() {
      io.grpc.xds.shaded.envoy.api.v2.core.Locality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.Locality buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.Locality result = new io.grpc.xds.shaded.envoy.api.v2.core.Locality(this);
      result.region_ = region_;
      result.zone_ = zone_;
      result.subZone_ = subZone_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.Locality) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.Locality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.Locality other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.Locality.getDefaultInstance()) return this;
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (!other.getSubZone().isEmpty()) {
        subZone_ = other.subZone_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.xds.shaded.envoy.api.v2.core.Locality parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.Locality) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      region_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     */
    public Builder clearRegion() {
      
      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Region this :ref:`zone &lt;envoy_api_field_core.Locality.zone&gt;` belongs to.
     * </pre>
     *
     * <code>string region = 1;</code>
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      region_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder clearZone() {
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines the local service zone where Envoy is running. Though optional, it
     * should be set if discovery service routing is used and the discovery
     * service exposes :ref:`zone data &lt;envoy_api_field_endpoint.LocalityLbEndpoints.locality&gt;`,
     * either in this message or via :option:`--service-zone`. The meaning of zone
     * is context dependent, e.g. `Availability Zone (AZ)
     * &lt;https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html&gt;`_
     * on AWS, `Zone &lt;https://cloud.google.com/compute/docs/regions-zones/&gt;`_ on
     * GCP, etc.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subZone_ = "";
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     */
    public java.lang.String getSubZone() {
      java.lang.Object ref = subZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSubZoneBytes() {
      java.lang.Object ref = subZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     */
    public Builder setSubZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subZone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     */
    public Builder clearSubZone() {
      
      subZone_ = getDefaultInstance().getSubZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When used for locality of upstream hosts, this field further splits zone
     * into smaller chunks of sub-zones so they can be load balanced
     * independently.
     * </pre>
     *
     * <code>string sub_zone = 3;</code>
     */
    public Builder setSubZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subZone_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.Locality)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.Locality)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.Locality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.Locality();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.Locality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Locality>
      PARSER = new com.google.protobuf.AbstractParser<Locality>() {
    public Locality parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Locality(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Locality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Locality> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.envoy.api.v2.core.Locality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

