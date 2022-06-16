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

package com.google.protos.google.cloud.binaryauthorization.v1.samples;

// [START binaryauthorization_v1_generated_binauthzmanagementservicev1client_createattestor_stringstringresourcesattestor_sync]
import com.google.protos.google.cloud.binaryauthorization.v1.BinauthzManagementServiceV1Client;
import com.google.protos.google.cloud.binaryauthorization.v1.ProjectName;
import com.google.protos.google.cloud.binaryauthorization.v1.Resources;

public class SyncCreateAttestorStringStringResourcesattestor {

  public static void main(String[] args) throws Exception {
    syncCreateAttestorStringStringResourcesattestor();
  }

  public static void syncCreateAttestorStringStringResourcesattestor() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BinauthzManagementServiceV1Client binauthzManagementServiceV1Client =
        BinauthzManagementServiceV1Client.create()) {
      String parent = ProjectName.of("[PROJECT]").toString();
      String attestorId = "attestorId2055733027";
      Resources.Attestor attestor = Resources.Attestor.newBuilder().build();
      Resources.Attestor response =
          binauthzManagementServiceV1Client.createAttestor(parent, attestorId, attestor);
    }
  }
}
// [END binaryauthorization_v1_generated_binauthzmanagementservicev1client_createattestor_stringstringresourcesattestor_sync]
