// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canvaz-meta.proto

package com.spotify.canvaz;

public final class CanvazMeta {
  private CanvazMeta() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.spotify.canvaz.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IMAGE = 0;</code>
     */
    IMAGE(0),
    /**
     * <code>VIDEO = 1;</code>
     */
    VIDEO(1),
    /**
     * <code>VIDEO_LOOPING = 2;</code>
     */
    VIDEO_LOOPING(2),
    /**
     * <code>VIDEO_LOOPING_RANDOM = 3;</code>
     */
    VIDEO_LOOPING_RANDOM(3),
    /**
     * <code>GIF = 4;</code>
     */
    GIF(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IMAGE = 0;</code>
     */
    public static final int IMAGE_VALUE = 0;
    /**
     * <code>VIDEO = 1;</code>
     */
    public static final int VIDEO_VALUE = 1;
    /**
     * <code>VIDEO_LOOPING = 2;</code>
     */
    public static final int VIDEO_LOOPING_VALUE = 2;
    /**
     * <code>VIDEO_LOOPING_RANDOM = 3;</code>
     */
    public static final int VIDEO_LOOPING_RANDOM_VALUE = 3;
    /**
     * <code>GIF = 4;</code>
     */
    public static final int GIF_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return IMAGE;
        case 1: return VIDEO;
        case 2: return VIDEO_LOOPING;
        case 3: return VIDEO_LOOPING_RANDOM;
        case 4: return GIF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.spotify.canvaz.CanvazMeta.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.spotify.canvaz.Type)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static final com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021canvaz-meta.proto\022\022com.spotify.canvaz*" +
      "R\n\004Type\022\t\n\005IMAGE\020\000\022\t\n\005VIDEO\020\001\022\021\n\rVIDEO_L" +
      "OOPING\020\002\022\030\n\024VIDEO_LOOPING_RANDOM\020\003\022\007\n\003GI" +
      "F\020\004B\026\n\022com.spotify.canvazH\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
