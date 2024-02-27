package br.com.fiap.clientepizzaria.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "TB_TELEFONE")
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(
            name = "SQ_TELEFONE",
            sequenceName = "SQ_TELEFONE",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_TELEFONE")
    private long id;

    private String ddi;

    private String ddd;

    private String numero;



    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "DONO",
            referencedColumnName = "ID_CLIENTE",
            foreignKey = @ForeignKey(name = "FK_DONO_TELEFONE")
    )
    private Cliente dono;

}
