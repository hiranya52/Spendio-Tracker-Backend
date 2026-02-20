package edu.icet.controller;

import edu.icet.model.dto.TransactionDTO;
import edu.icet.service.TransactionService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/user/{email}")
    public List<TransactionDTO> getTransactionsByUser(@PathVariable String email) {
        return transactionService.getTransactionsByUser(email);
    }

}
