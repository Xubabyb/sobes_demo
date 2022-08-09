package my.home.demo.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phone_data")
@NoArgsConstructor
@Getter
@Setter
public class PhoneData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_data_seq")
    @SequenceGenerator(name = "phone_data_seq", sequenceName = "phone_data_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
