package edu.icet.model.entity;

import edu.icet.model.dto.TransactionDTO;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String date;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionDTO.TransactionType type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
