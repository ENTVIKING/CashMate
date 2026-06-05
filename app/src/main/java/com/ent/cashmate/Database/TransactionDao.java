package com.ent.cashmate.Database;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Delete;
import androidx.room.Update;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TransactionDao {

    @Insert
    void insert(Transaction transaction);

    @Update
    void update(Transaction transaction);

    @Delete
    void delete(Transaction transaction);

    @Query("SELECT * FROM transactions")
    List<Transaction> getAllTransactions();

    @Query("SELECT * FROM transactions WHERE Type = :Type")
    List<Transaction> getTransactionsByType(String Type);

    @Query("SELECT * FROM transactions WHERE TypeItemId = :TypeItemId")
    List<Transaction> getTransactionsByItemTypeId(String TypeItemId);
}
