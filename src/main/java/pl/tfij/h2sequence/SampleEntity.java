package pl.tfij.h2sequence;

import javax.persistence.*;


@Entity
@Table(name = "Sample", schema = "[Master]")
public class SampleEntity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")
    @SequenceGenerator(
            name = "seq_post",
            sequenceName = "Master.SampleEntitySequence",
            allocationSize = 5
    )
    private Long id;

    @Column(name = "SampleValue")
    private String value;
}
