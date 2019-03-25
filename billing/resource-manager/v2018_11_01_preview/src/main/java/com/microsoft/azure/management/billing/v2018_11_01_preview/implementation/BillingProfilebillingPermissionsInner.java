/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingProfilebillingPermissions.
 */
public class BillingProfilebillingPermissionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingProfilebillingPermissionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingProfilebillingPermissionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingProfilebillingPermissionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingProfilebillingPermissionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingProfilebillingPermissions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingProfilebillingPermissionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingPermissions list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/providers/Microsoft.Billing/billingPermissions")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all billingPermissions for the caller has for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPermissionsListResultInner object if successful.
     */
    public BillingPermissionsListResultInner list(String billingAccountName, String billingProfileName) {
        return listWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * Lists all billingPermissions for the caller has for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPermissionsListResultInner> listAsync(String billingAccountName, String billingProfileName, final ServiceCallback<BillingPermissionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * Lists all billingPermissions for the caller has for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<BillingPermissionsListResultInner> listAsync(String billingAccountName, String billingProfileName) {
        return listWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<BillingPermissionsListResultInner>, BillingPermissionsListResultInner>() {
            @Override
            public BillingPermissionsListResultInner call(ServiceResponse<BillingPermissionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all billingPermissions for the caller has for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<ServiceResponse<BillingPermissionsListResultInner>> listWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountName, billingProfileName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPermissionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPermissionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPermissionsListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPermissionsListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPermissionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPermissionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
