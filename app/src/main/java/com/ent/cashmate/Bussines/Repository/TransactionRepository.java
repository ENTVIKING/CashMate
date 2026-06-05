package com.ent.cashmate.Bussines.Repository;

import android.content.Context;

public class TransactionRepository {

    private static final String TAG = "TransactionRepository";
    public static TransactionRepository transactionRepository = null;

    private Context context;

    public TransactionRepository() {
    }

    public static TransactionRepository getInstance() {
        if (transactionRepository == null) {
            synchronized (TransactionRepository.class) {
                if (transactionRepository == null) {
                    transactionRepository = new TransactionRepository();
                }
            }
        }
        return transactionRepository;
    }
}
