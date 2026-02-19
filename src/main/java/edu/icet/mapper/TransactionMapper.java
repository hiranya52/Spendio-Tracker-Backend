package edu.icet.mapper;

import edu.icet.model.dto.TransactionDTO;
import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.Transaction;
import edu.icet.model.entity.User;

public class TransactionMapper {

    public Transaction mapToEntity(TransactionDTO dto, User user) {
        Transaction transaction = new Transaction();
        transaction.setTitle(dto.getTitle());
        transaction.setType(dto.getType()); // "INCOME" or "EXPENSE"
        transaction.setCategory(dto.getCategory());
        transaction.setAmount(dto.getAmount());
        transaction.setDate(dto.getDate());
        transaction.setUser(user); // associate transaction with user
        return transaction;
    }


    public TransactionDTO mapToDTO(Transaction transaction) {
        return new TransactionDTO(
                transaction.getTitle(),
                transaction.getType(),
                transaction.getCategory(),
                transaction.getAmount(),
                transaction.getDate()
        );
    }



}
