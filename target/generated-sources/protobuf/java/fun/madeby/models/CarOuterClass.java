// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package fun.madeby.models;

public final class CarOuterClass {
  private CarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Car_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020common/car.proto\"g\n\003Car\022\014\n\004make\030\001 \001(\t\022" +
      "\r\n\005model\030\002 \001(\t\022\014\n\004year\030\003 \001(\005\022\025\n\ravMarket" +
      "Value\030\004 \001(\001\022\036\n\nbody_style\030\005 \001(\0162\n.BodySt" +
      "yle*7\n\tBodyStyle\022\013\n\007DEFAULT\020\000\022\t\n\005SEDAN\020\001" +
      "\022\t\n\005COUPE\020\002\022\007\n\003SUV\020\003B\025\n\021fun.madeby.model" +
      "sP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Car_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Car_descriptor,
        new java.lang.String[] { "Make", "Model", "Year", "AvMarketValue", "BodyStyle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
