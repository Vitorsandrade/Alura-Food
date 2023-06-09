package br.com.alurafood.pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Positive
    private BigDecimal valor;
    @Size(max = 100)
    private String nome;
    @Size(max = 19)
    private String numero;
    @Size(max = 7)
    private String expiracao;
    @Size(max = 3, min = 3)
    private String codigo;
    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;
    @NotNull
    private Long pedidoId;
    @NotNull
    private Long formaDePagamentoId;

}
