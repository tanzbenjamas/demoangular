package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Province")
public class Province {
    @Id
    @SequenceGenerator(name = "province_seq",sequenceName = "province_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "province_seq")
    @Column(name = "provinceId" ,unique = true, nullable = true)
    private @NonNull Long provinceId;//1ไพเมรี่คี
    private  String province;//แอคทิิ

}