package com.ent.cashmate.Bussines.Repository;

import android.content.Context;

public class PriceTypeRepository {

    private static final String TAG = "PriceTypeRepository";
    public static PriceTypeRepository priceTypeRepository = null;

    private Context context;

    public PriceTypeRepository() {
    }

    public static PriceTypeRepository getInstance() {
        if (priceTypeRepository == null) {
            synchronized (PriceTypeRepository.class) {
                if (priceTypeRepository == null) {
                    priceTypeRepository = new PriceTypeRepository();
                }
            }
        }
        return priceTypeRepository;
    }

    //Add-price

    //Show-list-invoices

    //CRUD -- create.read.update.delete
}
