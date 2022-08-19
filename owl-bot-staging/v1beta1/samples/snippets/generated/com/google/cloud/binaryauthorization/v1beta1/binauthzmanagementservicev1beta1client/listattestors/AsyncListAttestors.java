/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.binaryauthorization.v1beta1.samples;

// [START binaryauthorization_v1beta1_generated_binauthzmanagementservicev1beta1client_listattestors_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.binaryauthorization.v1beta1.Attestor;
import com.google.cloud.binaryauthorization.v1beta1.BinauthzManagementServiceV1Beta1Client;
import com.google.cloud.binaryauthorization.v1beta1.ListAttestorsRequest;
import com.google.cloud.binaryauthorization.v1beta1.ProjectName;

public class AsyncListAttestors {

  public static void main(String[] args) throws Exception {
    asyncListAttestors();
  }

  public static void asyncListAttestors() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BinauthzManagementServiceV1Beta1Client binauthzManagementServiceV1Beta1Client =
        BinauthzManagementServiceV1Beta1Client.create()) {
      ListAttestorsRequest request =
          ListAttestorsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Attestor> future =
          binauthzManagementServiceV1Beta1Client.listAttestorsPagedCallable().futureCall(request);
      // Do something.
      for (Attestor element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END binaryauthorization_v1beta1_generated_binauthzmanagementservicev1beta1client_listattestors_async]
