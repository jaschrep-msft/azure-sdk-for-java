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
 * in BillingSubscriptionsByInvoiceSections.
 */
public class BillingSubscriptionsByInvoiceSectionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingSubscriptionsByInvoiceSectionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingSubscriptionsByInvoiceSectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingSubscriptionsByInvoiceSectionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingSubscriptionsByInvoiceSectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingSubscriptionsByInvoiceSections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingSubscriptionsByInvoiceSectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionsByInvoiceSections list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoiceSections/{invoiceSectionName}/billingSubscriptions")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Path("invoiceSectionName") String invoiceSectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists billing subscription by invoiceSectionName.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingSubscriptionsListResultInner object if successful.
     */
    public BillingSubscriptionsListResultInner list(String billingAccountName, String invoiceSectionName) {
        return listWithServiceResponseAsync(billingAccountName, invoiceSectionName).toBlocking().single().body();
    }

    /**
     * Lists billing subscription by invoiceSectionName.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingSubscriptionsListResultInner> listAsync(String billingAccountName, String invoiceSectionName, final ServiceCallback<BillingSubscriptionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName, invoiceSectionName), serviceCallback);
    }

    /**
     * Lists billing subscription by invoiceSectionName.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingSubscriptionsListResultInner object
     */
    public Observable<BillingSubscriptionsListResultInner> listAsync(String billingAccountName, String invoiceSectionName) {
        return listWithServiceResponseAsync(billingAccountName, invoiceSectionName).map(new Func1<ServiceResponse<BillingSubscriptionsListResultInner>, BillingSubscriptionsListResultInner>() {
            @Override
            public BillingSubscriptionsListResultInner call(ServiceResponse<BillingSubscriptionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists billing subscription by invoiceSectionName.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingSubscriptionsListResultInner object
     */
    public Observable<ServiceResponse<BillingSubscriptionsListResultInner>> listWithServiceResponseAsync(String billingAccountName, String invoiceSectionName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountName, invoiceSectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingSubscriptionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingSubscriptionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingSubscriptionsListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingSubscriptionsListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingSubscriptionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingSubscriptionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
