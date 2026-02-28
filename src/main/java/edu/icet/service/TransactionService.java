package edu.icet.service;

import edu.icet.mapper.TransactionMapper;
import edu.icet.mapper.UserMapper;
import edu.icet.model.dto.TransactionDTO;
import edu.icet.model.entity.Transaction;
import edu.icet.model.entity.User;
import edu.icet.repository.TransactionRepository;
import edu.icet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    UserRepository userRepository;


    public List<TransactionDTO> getTransactionsByUser(String email) {


        User user = userRepository.findByEmail(email);

        List<Transaction> list = transactionRepository.findByUser(user);

        List<TransactionDTO> dtoList = new ArrayList<>();

        for (Transaction t : list) {

            TransactionDTO dto = new TransactionDTO(
                    t.getTitle(),
                    t.getType(),
                    t.getCategory(),
                    t.getAmount(),
                    t.getDate().toString()
            );

            dtoList.add(dto);
        }

        return dtoList;

    }


    public Transaction addTransaction(TransactionDTO dto, String email) {

        User user = userRepository.findByEmail(email);

        Transaction transaction = TransactionMapper.mapToEntity(dto,user);

        return transactionRepository.save(transaction);
    }



}
