package edu.icet.controller;

import edu.icet.model.dto.TransactionDTO;
import edu.icet.model.entity.Transaction;
import edu.icet.service.TransactionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
@Transactional
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/user/{email}")
    public List<TransactionDTO> getTransactionsByUser(@PathVariable String email) {
        return transactionService.getTransactionsByUser(email);
    }


    @PostMapping("/add/{email}")
    public Transaction addTransaction(@PathVariable String email, @RequestBody TransactionDTO dto) {
        return transactionService.addTransaction(dto, email);
    }


}
