// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

package com.google.cloud.binaryauthorization.v1beta1;

public interface AdmissionWhitelistPatternOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.AdmissionWhitelistPattern)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An image name pattern to allowlist, in the form `registry/path/to/image`.
   * This supports a trailing `*` as a wildcard, but this is allowed only in
   * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
   * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
   * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
   * matches subdirectories, i.e., `gcr.io/nginx**` matches
   * `gcr.io/nginx/image`.
   * </pre>
   *
   * <code>string name_pattern = 1;</code>
   * @return The namePattern.
   */
  java.lang.String getNamePattern();
  /**
   * <pre>
   * An image name pattern to allowlist, in the form `registry/path/to/image`.
   * This supports a trailing `*` as a wildcard, but this is allowed only in
   * text after the `registry/` part. `*` wildcard does not match `/`, i.e.,
   * `gcr.io/nginx*` matches `gcr.io/nginx&#64;latest`, but it does not match
   * `gcr.io/nginx/image`. This also supports a trailing `**` wildcard which
   * matches subdirectories, i.e., `gcr.io/nginx**` matches
   * `gcr.io/nginx/image`.
   * </pre>
   *
   * <code>string name_pattern = 1;</code>
   * @return The bytes for namePattern.
   */
  com.google.protobuf.ByteString
      getNamePatternBytes();
}
