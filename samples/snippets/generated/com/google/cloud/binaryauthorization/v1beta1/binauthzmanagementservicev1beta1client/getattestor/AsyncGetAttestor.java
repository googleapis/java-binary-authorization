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

// [START binaryauthorization_v1beta1_generated_binauthzmanagementservicev1beta1client_getattestor_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.binaryauthorization.v1beta1.Attestor;
import com.google.cloud.binaryauthorization.v1beta1.AttestorName;
import com.google.cloud.binaryauthorization.v1beta1.BinauthzManagementServiceV1Beta1Client;
import com.google.cloud.binaryauthorization.v1beta1.GetAttestorRequest;

public class AsyncGetAttestor {

  public static void main(String[] args) throws Exception {
    asyncGetAttestor();
  }

  public static void asyncGetAttestor() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BinauthzManagementServiceV1Beta1Client binauthzManagementServiceV1Beta1Client =
        BinauthzManagementServiceV1Beta1Client.create()) {
      GetAttestorRequest request =
          GetAttestorRequest.newBuilder()
              .setName(AttestorName.of("[PROJECT]", "[ATTESTOR]").toString())
              .build();
      ApiFuture<Attestor> future =
          binauthzManagementServiceV1Beta1Client.getAttestorCallable().futureCall(request);
      // Do something.
      Attestor response = future.get();
    }
  }
}
// [END binaryauthorization_v1beta1_generated_binauthzmanagementservicev1beta1client_getattestor_async]
