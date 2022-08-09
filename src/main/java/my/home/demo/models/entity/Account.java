package my.home.demo.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "account")
public class Account {
    @Id
    private Long id;

    @Min(0)
    private BigDecimal balance;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

}
