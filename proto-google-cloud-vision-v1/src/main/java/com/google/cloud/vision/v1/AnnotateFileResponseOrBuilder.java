// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface AnnotateFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.AnnotateFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   */
  com.google.cloud.vision.v1.InputConfig getInputConfig();
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   */
  com.google.cloud.vision.v1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1.AnnotateImageResponse> 
      getResponsesList();
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  com.google.cloud.vision.v1.AnnotateImageResponse getResponses(int index);
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AnnotateImageResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * Individual responses to images found within the file.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  com.google.cloud.vision.v1.AnnotateImageResponseOrBuilder getResponsesOrBuilder(
      int index);
}
