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

// [START binaryauthorization_v1_generated_validationhelperv1client_validateattestationoccurrence_sync]
import com.google.protos.google.cloud.binaryauthorization.v1.Service;
import com.google.protos.google.cloud.binaryauthorization.v1.ValidationHelperV1Client;
import io.grafeas.v1.AttestationOccurrence;

public class SyncValidateAttestationOccurrence {

  public static void main(String[] args) throws Exception {
    syncValidateAttestationOccurrence();
  }

  public static void syncValidateAttestationOccurrence() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ValidationHelperV1Client validationHelperV1Client = ValidationHelperV1Client.create()) {
      Service.ValidateAttestationOccurrenceRequest request =
          Service.ValidateAttestationOccurrenceRequest.newBuilder()
              .setAttestor("attestor542920680")
              .setAttestation(AttestationOccurrence.newBuilder().build())
              .setOccurrenceNote("occurrenceNote1722072419")
              .setOccurrenceResourceUri("occurrenceResourceUri1001424877")
              .build();
      Service.ValidateAttestationOccurrenceResponse response =
          validationHelperV1Client.validateAttestationOccurrence(request);
    }
  }
}
// [END binaryauthorization_v1_generated_validationhelperv1client_validateattestationoccurrence_sync]
