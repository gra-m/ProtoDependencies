// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package fun.madeby.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  boolean hasAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.Address address = 3;</code>
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  fun.madeby.models.Address getAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  fun.madeby.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<fun.madeby.models.Car> 
      getCarList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  fun.madeby.models.Car getCar(int index);
  /**
   * <code>repeated .Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  java.util.List<? extends fun.madeby.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .Car car = 4;</code>
   */
  fun.madeby.models.CarOrBuilder getCarOrBuilder(
      int index);
}
