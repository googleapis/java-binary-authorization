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
// source: google/cloud/binaryauthorization/v1beta1/service.proto

package com.google.cloud.binaryauthorization.v1beta1;

public final class BinaryAuthorizationServiceProto {
  private BinaryAuthorizationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_GetPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_GetPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_UpdatePolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_UpdatePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_CreateAttestorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_CreateAttestorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_GetAttestorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_GetAttestorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_DeleteAttestorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_DeleteAttestorRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/binaryauthorization/v1bet"
          + "a1/service.proto\022(google.cloud.binaryaut"
          + "horization.v1beta1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0328google/cloud/binaryauthor"
          + "ization/v1beta1/resources.proto\032\033google/"
          + "protobuf/empty.proto\"S\n\020GetPolicyRequest"
          + "\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)binaryauthorizat"
          + "ion.googleapis.com/Policy\"\\\n\023UpdatePolic"
          + "yRequest\022E\n\006policy\030\001 \001(\01320.google.cloud."
          + "binaryauthorization.v1beta1.PolicyB\003\340A\002\""
          + "\301\001\n\025CreateAttestorRequest\022C\n\006parent\030\001 \001("
          + "\tB3\340A\002\372A-\n+cloudresourcemanager.googleap"
          + "is.com/Project\022\030\n\013attestor_id\030\002 \001(\tB\003\340A\002"
          + "\022I\n\010attestor\030\003 \001(\01322.google.cloud.binary"
          + "authorization.v1beta1.AttestorB\003\340A\002\"W\n\022G"
          + "etAttestorRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n"
          + "+binaryauthorization.googleapis.com/Atte"
          + "stor\"b\n\025UpdateAttestorRequest\022I\n\010attesto"
          + "r\030\001 \001(\01322.google.cloud.binaryauthorizati"
          + "on.v1beta1.AttestorB\003\340A\002\"\202\001\n\024ListAttesto"
          + "rsRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloud"
          + "resourcemanager.googleapis.com/Project\022\021"
          + "\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"w\n"
          + "\025ListAttestorsResponse\022E\n\tattestors\030\001 \003("
          + "\01322.google.cloud.binaryauthorization.v1b"
          + "eta1.Attestor\022\027\n\017next_page_token\030\002 \001(\t\"Z"
          + "\n\025DeleteAttestorRequest\022A\n\004name\030\001 \001(\tB3\340"
          + "A\002\372A-\n+binaryauthorization.googleapis.co"
          + "m/Attestor2\313\013\n BinauthzManagementService"
          + "V1Beta1\022\253\001\n\tGetPolicy\022:.google.cloud.bin"
          + "aryauthorization.v1beta1.GetPolicyReques"
          + "t\0320.google.cloud.binaryauthorization.v1b"
          + "eta1.Policy\"0\202\323\344\223\002#\022!/v1beta1/{name=proj"
          + "ects/*/policy}\332A\004name\022\302\001\n\014UpdatePolicy\022="
          + ".google.cloud.binaryauthorization.v1beta"
          + "1.UpdatePolicyRequest\0320.google.cloud.bin"
          + "aryauthorization.v1beta1.Policy\"A\202\323\344\223\0022\032"
          + "(/v1beta1/{policy.name=projects/*/policy"
          + "}:\006policy\332A\006policy\022\335\001\n\016CreateAttestor\022?."
          + "google.cloud.binaryauthorization.v1beta1"
          + ".CreateAttestorRequest\0322.google.cloud.bi"
          + "naryauthorization.v1beta1.Attestor\"V\202\323\344\223"
          + "\0022\"&/v1beta1/{parent=projects/*}/attesto"
          + "rs:\010attestor\332A\033parent,attestor_id,attest"
          + "or\022\266\001\n\013GetAttestor\022<.google.cloud.binary"
          + "authorization.v1beta1.GetAttestorRequest"
          + "\0322.google.cloud.binaryauthorization.v1be"
          + "ta1.Attestor\"5\202\323\344\223\002(\022&/v1beta1/{name=pro"
          + "jects/*/attestors/*}\332A\004name\022\323\001\n\016UpdateAt"
          + "testor\022?.google.cloud.binaryauthorizatio"
          + "n.v1beta1.UpdateAttestorRequest\0322.google"
          + ".cloud.binaryauthorization.v1beta1.Attes"
          + "tor\"L\202\323\344\223\002;\032//v1beta1/{attestor.name=pro"
          + "jects/*/attestors/*}:\010attestor\332A\010attesto"
          + "r\022\311\001\n\rListAttestors\022>.google.cloud.binar"
          + "yauthorization.v1beta1.ListAttestorsRequ"
          + "est\032?.google.cloud.binaryauthorization.v"
          + "1beta1.ListAttestorsResponse\"7\202\323\344\223\002(\022&/v"
          + "1beta1/{parent=projects/*}/attestors\332A\006p"
          + "arent\022\240\001\n\016DeleteAttestor\022?.google.cloud."
          + "binaryauthorization.v1beta1.DeleteAttest"
          + "orRequest\032\026.google.protobuf.Empty\"5\202\323\344\223\002"
          + "(*&/v1beta1/{name=projects/*/attestors/*"
          + "}\332A\004name\032V\312A\"binaryauthorization.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\265\002\n,com.google.cloud.bi"
          + "naryauthorization.v1beta1B\037BinaryAuthori"
          + "zationServiceProtoP\001Z[google.golang.org/"
          + "genproto/googleapis/cloud/binaryauthoriz"
          + "ation/v1beta1;binaryauthorization\370\001\001\252\002(G"
          + "oogle.Cloud.BinaryAuthorization.V1Beta1\312"
          + "\002(Google\\Cloud\\BinaryAuthorization\\V1bet"
          + "a1\352\002+Google::Cloud::BinaryAuthorization:"
          + ":V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto
                  .getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_GetPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_GetPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_GetPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_UpdatePolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_binaryauthorization_v1beta1_UpdatePolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_UpdatePolicyRequest_descriptor,
            new java.lang.String[] {
              "Policy",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_CreateAttestorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_binaryauthorization_v1beta1_CreateAttestorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_CreateAttestorRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AttestorId", "Attestor",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_GetAttestorRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_binaryauthorization_v1beta1_GetAttestorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_GetAttestorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor,
            new java.lang.String[] {
              "Attestor",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_ListAttestorsResponse_descriptor,
            new java.lang.String[] {
              "Attestors", "NextPageToken",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_DeleteAttestorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_binaryauthorization_v1beta1_DeleteAttestorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_DeleteAttestorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationResourcesProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}