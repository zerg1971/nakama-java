// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface AccountEmailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountEmail)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
