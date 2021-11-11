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

package com.google.cloud.binaryauthorization.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.binaryauthorization.v1beta1.stub.SystemPolicyV1Beta1Stub;
import com.google.cloud.binaryauthorization.v1beta1.stub.SystemPolicyV1Beta1StubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: API for working with the system policy.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
 *   PolicyName name = PolicyName.ofProjectName("[PROJECT]");
 *   Policy response = systemPolicyV1Beta1Client.getSystemPolicy(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SystemPolicyV1Beta1Client object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SystemPolicyV1Beta1Settings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * SystemPolicyV1Beta1Settings systemPolicyV1Beta1Settings =
 *     SystemPolicyV1Beta1Settings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SystemPolicyV1Beta1Client systemPolicyV1Beta1Client =
 *     SystemPolicyV1Beta1Client.create(systemPolicyV1Beta1Settings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * SystemPolicyV1Beta1Settings systemPolicyV1Beta1Settings =
 *     SystemPolicyV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
 * SystemPolicyV1Beta1Client systemPolicyV1Beta1Client =
 *     SystemPolicyV1Beta1Client.create(systemPolicyV1Beta1Settings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SystemPolicyV1Beta1Client implements BackgroundResource {
  private final SystemPolicyV1Beta1Settings settings;
  private final SystemPolicyV1Beta1Stub stub;

  /** Constructs an instance of SystemPolicyV1Beta1Client with default settings. */
  public static final SystemPolicyV1Beta1Client create() throws IOException {
    return create(SystemPolicyV1Beta1Settings.newBuilder().build());
  }

  /**
   * Constructs an instance of SystemPolicyV1Beta1Client, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SystemPolicyV1Beta1Client create(SystemPolicyV1Beta1Settings settings)
      throws IOException {
    return new SystemPolicyV1Beta1Client(settings);
  }

  /**
   * Constructs an instance of SystemPolicyV1Beta1Client, using the given stub for making calls.
   * This is for advanced usage - prefer using create(SystemPolicyV1Beta1Settings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SystemPolicyV1Beta1Client create(SystemPolicyV1Beta1Stub stub) {
    return new SystemPolicyV1Beta1Client(stub);
  }

  /**
   * Constructs an instance of SystemPolicyV1Beta1Client, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SystemPolicyV1Beta1Client(SystemPolicyV1Beta1Settings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SystemPolicyV1Beta1StubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SystemPolicyV1Beta1Client(SystemPolicyV1Beta1Stub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SystemPolicyV1Beta1Settings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SystemPolicyV1Beta1Stub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the current system policy in the specified location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
   *   PolicyName name = PolicyName.ofProjectName("[PROJECT]");
   *   Policy response = systemPolicyV1Beta1Client.getSystemPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name, in the format `locations/&#42;/policy`. Note that the
   *     system policy is not associated with a project.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getSystemPolicy(PolicyName name) {
    GetSystemPolicyRequest request =
        GetSystemPolicyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSystemPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the current system policy in the specified location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
   *   String name = PolicyName.ofProjectName("[PROJECT]").toString();
   *   Policy response = systemPolicyV1Beta1Client.getSystemPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name, in the format `locations/&#42;/policy`. Note that the
   *     system policy is not associated with a project.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getSystemPolicy(String name) {
    GetSystemPolicyRequest request = GetSystemPolicyRequest.newBuilder().setName(name).build();
    return getSystemPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the current system policy in the specified location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
   *   GetSystemPolicyRequest request =
   *       GetSystemPolicyRequest.newBuilder()
   *           .setName(PolicyName.ofProjectName("[PROJECT]").toString())
   *           .build();
   *   Policy response = systemPolicyV1Beta1Client.getSystemPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getSystemPolicy(GetSystemPolicyRequest request) {
    return getSystemPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the current system policy in the specified location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (SystemPolicyV1Beta1Client systemPolicyV1Beta1Client = SystemPolicyV1Beta1Client.create()) {
   *   GetSystemPolicyRequest request =
   *       GetSystemPolicyRequest.newBuilder()
   *           .setName(PolicyName.ofProjectName("[PROJECT]").toString())
   *           .build();
   *   ApiFuture<Policy> future =
   *       systemPolicyV1Beta1Client.getSystemPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSystemPolicyRequest, Policy> getSystemPolicyCallable() {
    return stub.getSystemPolicyCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}