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

    public enum TransactionType {
        INCOME,
        EXPENSE
    }

}
