// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

package com.google.cloud.binaryauthorization.v1beta1;

public interface PkixPublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.PkixPublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A PEM-encoded public key, as described in
   * https://tools.ietf.org/html/rfc7468#section-13
   * </pre>
   *
   * <code>string public_key_pem = 1;</code>
   * @return The publicKeyPem.
   */
  java.lang.String getPublicKeyPem();
  /**
   * <pre>
   * A PEM-encoded public key, as described in
   * https://tools.ietf.org/html/rfc7468#section-13
   * </pre>
   *
   * <code>string public_key_pem = 1;</code>
   * @return The bytes for publicKeyPem.
   */
  com.google.protobuf.ByteString
      getPublicKeyPemBytes();

  /**
   * <pre>
   * The signature algorithm used to verify a message against a signature using
   * this key.
   * These signature algorithm must match the structure and any object
   * identifiers encoded in `public_key_pem` (i.e. this algorithm must match
   * that of the public key).
   * </pre>
   *
   * <code>.google.cloud.binaryauthorization.v1beta1.PkixPublicKey.SignatureAlgorithm signature_algorithm = 2;</code>
   * @return The enum numeric value on the wire for signatureAlgorithm.
   */
  int getSignatureAlgorithmValue();
  /**
   * <pre>
   * The signature algorithm used to verify a message against a signature using
   * this key.
   * These signature algorithm must match the structure and any object
   * identifiers encoded in `public_key_pem` (i.e. this algorithm must match
   * that of the public key).
   * </pre>
   *
   * <code>.google.cloud.binaryauthorization.v1beta1.PkixPublicKey.SignatureAlgorithm signature_algorithm = 2;</code>
   * @return The signatureAlgorithm.
   */
  com.google.cloud.binaryauthorization.v1beta1.PkixPublicKey.SignatureAlgorithm getSignatureAlgorithm();
}