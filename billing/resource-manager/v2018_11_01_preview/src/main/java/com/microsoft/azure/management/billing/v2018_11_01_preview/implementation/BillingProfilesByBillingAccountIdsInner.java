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
 * in BillingProfilesByBillingAccountIds.
 */
public class BillingProfilesByBillingAccountIdsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingProfilesByBillingAccountIdsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingProfilesByBillingAccountIdsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingProfilesByBillingAccountIdsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingProfilesByBillingAccountIdsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingProfilesByBillingAccountIds to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingProfilesByBillingAccountIdsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilesByBillingAccountIds list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles")
        Observable<Response<ResponseBody>> list(@Path("billingAccountId") String billingAccountId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileListResultInner object if successful.
     */
    public BillingProfileListResultInner list(String billingAccountId) {
        return listWithServiceResponseAsync(billingAccountId).toBlocking().single().body();
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileListResultInner> listAsync(String billingAccountId, final ServiceCallback<BillingProfileListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountId), serviceCallback);
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileListResultInner object
     */
    public Observable<BillingProfileListResultInner> listAsync(String billingAccountId) {
        return listWithServiceResponseAsync(billingAccountId).map(new Func1<ServiceResponse<BillingProfileListResultInner>, BillingProfileListResultInner>() {
            @Override
            public BillingProfileListResultInner call(ServiceResponse<BillingProfileListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileListResultInner object
     */
    public Observable<ServiceResponse<BillingProfileListResultInner>> listWithServiceResponseAsync(String billingAccountId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.list(billingAccountId, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingProfileListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingProfileListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingProfileListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingProfileListResultInner object if successful.
     */
    public BillingProfileListResultInner list(String billingAccountId, String expand) {
        return listWithServiceResponseAsync(billingAccountId, expand).toBlocking().single().body();
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @param expand May be used to expand the invoiceSections.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingProfileListResultInner> listAsync(String billingAccountId, String expand, final ServiceCallback<BillingProfileListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountId, expand), serviceCallback);
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileListResultInner object
     */
    public Observable<BillingProfileListResultInner> listAsync(String billingAccountId, String expand) {
        return listWithServiceResponseAsync(billingAccountId, expand).map(new Func1<ServiceResponse<BillingProfileListResultInner>, BillingProfileListResultInner>() {
            @Override
            public BillingProfileListResultInner call(ServiceResponse<BillingProfileListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all billing profiles for a user which that user has access to.
     *
     * @param billingAccountId billing Account Id.
     * @param expand May be used to expand the invoiceSections.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingProfileListResultInner object
     */
    public Observable<ServiceResponse<BillingProfileListResultInner>> listWithServiceResponseAsync(String billingAccountId, String expand) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountId, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingProfileListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingProfileListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingProfileListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingProfileListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingProfileListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingProfileListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
