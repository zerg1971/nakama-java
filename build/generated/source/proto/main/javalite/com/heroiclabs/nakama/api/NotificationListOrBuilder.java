// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface NotificationListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.NotificationList)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Notification> 
      getNotificationsList();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1;</code>
   */
  com.heroiclabs.nakama.api.Notification getNotifications(int index);
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1;</code>
   */
  int getNotificationsCount();

  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>optional string cacheable_cursor = 2;</code>
   */
  java.lang.String getCacheableCursor();
  /**
   * <pre>
   * Use this cursor to paginate notifications. Cache this to catch up to new notifications.
   * </pre>
   *
   * <code>optional string cacheable_cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getCacheableCursorBytes();
}
