// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201311.lineitemcreativeassociationservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201311.LineItemCreativeAssociation;
import com.google.api.ads.dfp.axis.v201311.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a LICA's destination URL. To determine which LICAs
 * exist, run GetAllLineItemCreativeAssociations.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: LineItemCreativeAssociationService.getLineItemCreativeAssociation
 * Tags: LineItemCreativeAssociationService.updateLineItemCreativeAssociations
 *
 * @author Adam Rogal
 */
public class UpdateLicas {

  // Set the line item ID of the LICA.
  private static final String LINE_ITEM_ID = "INSERT_LINE_ITEM_ID_HERE";

  // Set the master or creative set ID of the LICA. For creative sets, set the
  // master creative ID.
  private static final String CREATIVE_ID = "INSERT_CREATIVE_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId,
      long creativeId) throws Exception {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        dfpServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Get the LICA.
    LineItemCreativeAssociation lica =
        licaService.getLineItemCreativeAssociation(lineItemId, creativeId);

    // Update the destination URL.
    lica.setDestinationUrl("http://news.google.com?newTrackingParameter");

    // Update the LICA on the server.
    LineItemCreativeAssociation[] licas =
        licaService.updateLineItemCreativeAssociations(new LineItemCreativeAssociation[] {lica});

    for (LineItemCreativeAssociation updatedLica : licas) {
      System.out.printf("LICA with line item ID \"%d\" and creative ID \"%d\" was updated.\n",
          updatedLica.getLineItemId(), updatedLica.getCreativeId());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(LINE_ITEM_ID), Long.parseLong(CREATIVE_ID));
  }
}
