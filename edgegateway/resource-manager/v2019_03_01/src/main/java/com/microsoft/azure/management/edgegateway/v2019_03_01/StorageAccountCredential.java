/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.StorageAccountCredentialInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.DataBoxEdgeManager;

/**
 * Type representing StorageAccountCredential.
 */
public interface StorageAccountCredential extends HasInner<StorageAccountCredentialInner>, Indexable, Refreshable<StorageAccountCredential>, Updatable<StorageAccountCredential.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the accountKey value.
     */
    AsymmetricEncryptedSecret accountKey();

    /**
     * @return the accountType value.
     */
    AccountType accountType();

    /**
     * @return the alias value.
     */
    String alias();

    /**
     * @return the blobDomainName value.
     */
    String blobDomainName();

    /**
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sslStatus value.
     */
    SSLStatus sslStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userName value.
     */
    String userName();

    /**
     * The entirety of the StorageAccountCredential definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithAccountType, DefinitionStages.WithAlias, DefinitionStages.WithSslStatus, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccountCredential definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccountCredential definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName The device name
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithAccountType withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify AccountType.
         */
        interface WithAccountType {
           /**
            * Specifies accountType.
            * @param accountType Type of storage accessed on the storage account. Possible values include: 'GeneralPurposeStorage', 'BlobStorage'
            * @return the next definition stage
            */
            WithAlias withAccountType(AccountType accountType);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify Alias.
         */
        interface WithAlias {
           /**
            * Specifies alias.
            * @param alias Alias for the storage account
            * @return the next definition stage
            */
            WithSslStatus withAlias(String alias);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify SslStatus.
         */
        interface WithSslStatus {
           /**
            * Specifies sslStatus.
            * @param sslStatus Signifies whether SSL needs to be enabled or not. Possible values include: 'Enabled', 'Disabled'
            * @return the next definition stage
            */
            WithCreate withSslStatus(SSLStatus sslStatus);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify AccountKey.
         */
        interface WithAccountKey {
            /**
             * Specifies accountKey.
             * @param accountKey Encrypted storage key
             * @return the next definition stage
             */
            WithCreate withAccountKey(AsymmetricEncryptedSecret accountKey);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify BlobDomainName.
         */
        interface WithBlobDomainName {
            /**
             * Specifies blobDomainName.
             * @param blobDomainName Blob end point for private clouds
             * @return the next definition stage
             */
            WithCreate withBlobDomainName(String blobDomainName);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify ConnectionString.
         */
        interface WithConnectionString {
            /**
             * Specifies connectionString.
             * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified
             * @return the next definition stage
             */
            WithCreate withConnectionString(String connectionString);
        }

        /**
         * The stage of the storageaccountcredential definition allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName Username for the storage account
             * @return the next definition stage
             */
            WithCreate withUserName(String userName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccountCredential>, DefinitionStages.WithAccountKey, DefinitionStages.WithBlobDomainName, DefinitionStages.WithConnectionString, DefinitionStages.WithUserName {
        }
    }
    /**
     * The template for a StorageAccountCredential update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccountCredential>, UpdateStages.WithAccountKey, UpdateStages.WithBlobDomainName, UpdateStages.WithConnectionString, UpdateStages.WithUserName {
    }

    /**
     * Grouping of StorageAccountCredential update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccountcredential update allowing to specify AccountKey.
         */
        interface WithAccountKey {
            /**
             * Specifies accountKey.
             * @param accountKey Encrypted storage key
             * @return the next update stage
             */
            Update withAccountKey(AsymmetricEncryptedSecret accountKey);
        }

        /**
         * The stage of the storageaccountcredential update allowing to specify BlobDomainName.
         */
        interface WithBlobDomainName {
            /**
             * Specifies blobDomainName.
             * @param blobDomainName Blob end point for private clouds
             * @return the next update stage
             */
            Update withBlobDomainName(String blobDomainName);
        }

        /**
         * The stage of the storageaccountcredential update allowing to specify ConnectionString.
         */
        interface WithConnectionString {
            /**
             * Specifies connectionString.
             * @param connectionString Connection string for the storage account. Use this string if username and account key are not specified
             * @return the next update stage
             */
            Update withConnectionString(String connectionString);
        }

        /**
         * The stage of the storageaccountcredential update allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName Username for the storage account
             * @return the next update stage
             */
            Update withUserName(String userName);
        }

    }
}
