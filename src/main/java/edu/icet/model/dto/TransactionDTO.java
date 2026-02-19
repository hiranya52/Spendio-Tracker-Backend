package edu.icet.model.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionDTO {

    private String title;
    private String category;
    private Double amount;
    private String date;
    private TransactionType type;

    public TransactionDTO(String title, TransactionType type, String category, Double amount, String date) {
        this.title = title;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public enum TransactionType {
        INCOME,
        EXPENSE
    }

}
