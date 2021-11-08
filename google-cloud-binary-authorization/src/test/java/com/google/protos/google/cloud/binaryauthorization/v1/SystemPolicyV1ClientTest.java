/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.protos.google.cloud.binaryauthorization.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class SystemPolicyV1ClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockSystemPolicyV1 mockSystemPolicyV1;
  private LocalChannelProvider channelProvider;
  private SystemPolicyV1Client client;

  @BeforeClass
  public static void startStaticServer() {
    mockSystemPolicyV1 = new MockSystemPolicyV1();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockSystemPolicyV1));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    SystemPolicyV1Settings settings =
        SystemPolicyV1Settings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SystemPolicyV1Client.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getSystemPolicyTest() throws Exception {
    Resources.Policy expectedResponse =
        Resources.Policy.newBuilder()
            .setName(PolicyName.ofProjectName("[PROJECT]").toString())
            .setDescription("description-1724546052")
            .addAllAdmissionWhitelistPatterns(new ArrayList<Resources.AdmissionWhitelistPattern>())
            .putAllClusterAdmissionRules(new HashMap<String, Resources.AdmissionRule>())
            .putAllKubernetesNamespaceAdmissionRules(new HashMap<String, Resources.AdmissionRule>())
            .putAllKubernetesServiceAccountAdmissionRules(
                new HashMap<String, Resources.AdmissionRule>())
            .putAllIstioServiceIdentityAdmissionRules(
                new HashMap<String, Resources.AdmissionRule>())
            .setDefaultAdmissionRule(Resources.AdmissionRule.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockSystemPolicyV1.addResponse(expectedResponse);

    PolicyName name = PolicyName.ofProjectName("[PROJECT]");

    Resources.Policy actualResponse = client.getSystemPolicy(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSystemPolicyV1.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    Service.GetSystemPolicyRequest actualRequest =
        ((Service.GetSystemPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSystemPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSystemPolicyV1.addException(exception);

    try {
      PolicyName name = PolicyName.ofProjectName("[PROJECT]");
      client.getSystemPolicy(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSystemPolicyTest2() throws Exception {
    Resources.Policy expectedResponse =
        Resources.Policy.newBuilder()
            .setName(PolicyName.ofProjectName("[PROJECT]").toString())
            .setDescription("description-1724546052")
            .addAllAdmissionWhitelistPatterns(new ArrayList<Resources.AdmissionWhitelistPattern>())
            .putAllClusterAdmissionRules(new HashMap<String, Resources.AdmissionRule>())
            .putAllKubernetesNamespaceAdmissionRules(new HashMap<String, Resources.AdmissionRule>())
            .putAllKubernetesServiceAccountAdmissionRules(
                new HashMap<String, Resources.AdmissionRule>())
            .putAllIstioServiceIdentityAdmissionRules(
                new HashMap<String, Resources.AdmissionRule>())
            .setDefaultAdmissionRule(Resources.AdmissionRule.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockSystemPolicyV1.addResponse(expectedResponse);

    String name = "name3373707";

    Resources.Policy actualResponse = client.getSystemPolicy(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSystemPolicyV1.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    Service.GetSystemPolicyRequest actualRequest =
        ((Service.GetSystemPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSystemPolicyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSystemPolicyV1.addException(exception);

    try {
      String name = "name3373707";
      client.getSystemPolicy(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
