/*
 * Copyright 2009 Denys Pavlov, Igor Azarnyi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.entity.impl;


import org.yes.cart.domain.entity.Customer;
import org.yes.cart.domain.entity.ProductSku;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 27 0ct 2012
 * Time: 9:10 AM
 */
public class CustomerWishListEntity implements org.yes.cart.domain.entity.CustomerWishList, java.io.Serializable {

    private long customerwishlistId;
    private long version;

    private ProductSku skus;
    private Customer customer;
    private String wlType;
    private String visibility;
    private String tag;
    private BigDecimal quantity;
    private BigDecimal regularPriceWhenAdded;
    private String regularPriceCurrencyWhenAdded;

    private Instant createdTimestamp;
    private Instant updatedTimestamp;
    private String createdBy;
    private String updatedBy;
    private String guid;

    public CustomerWishListEntity() {
    }


    @Override
    public ProductSku getSkus() {
        return this.skus;
    }

    @Override
    public void setSkus(ProductSku skus) {
        this.skus = skus;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getWlType() {
        return this.wlType;
    }

    @Override
    public void setWlType(String wlType) {
        this.wlType = wlType;
    }

    @Override
    public String getVisibility() {
        return visibility;
    }

    @Override
    public void setVisibility(final String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public void setTag(final String tag) {
        this.tag = tag;
    }

    @Override
    public BigDecimal getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(final BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal getRegularPriceWhenAdded() {
        return regularPriceWhenAdded;
    }

    @Override
    public void setRegularPriceWhenAdded(final BigDecimal regularPriceWhenAdded) {
        this.regularPriceWhenAdded = regularPriceWhenAdded;
    }

    @Override
    public String getRegularPriceCurrencyWhenAdded() {
        return regularPriceCurrencyWhenAdded;
    }

    @Override
    public void setRegularPriceCurrencyWhenAdded(final String regularPriceCurrencyWhenAdded) {
        this.regularPriceCurrencyWhenAdded = regularPriceCurrencyWhenAdded;
    }

    @Override
    public Instant getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    @Override
    public void setCreatedTimestamp(Instant createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @Override
    public Instant getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Override
    public void setUpdatedTimestamp(Instant updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getGuid() {
        return this.guid;
    }

    @Override
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public long getCustomerwishlistId() {
        return this.customerwishlistId;
    }

    @Override
    public long getId() {
        return this.customerwishlistId;
    }

    @Override
    public void setCustomerwishlistId(long customerwishlistId) {
        this.customerwishlistId = customerwishlistId;
    }

    @Override
    public long getVersion() {
        return version;
    }

    public void setVersion(final long version) {
        this.version = version;
    }
}


