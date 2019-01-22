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
@Table(name = "CarInformation")
public class CarInformation {
    @Id
    @SequenceGenerator(name="carinformation_seq",sequenceName="carinformation_seq")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carinformation_seq")  
    @Column(name="carinformationId",unique = true, nullable = true)
   
    private @NonNull Long carinformationId;//1ไพเมรี่คี
    private String carinformation;

    public Long getCarInformationId() {
        return carinformationId;
    }

    public void setCarInformationId(Long carinformationId) {
        this.carinformationId = carinformationId;
    }

    public String getCarInformation() {
        return carinformation;
    }

    public void setCarInformation(String carinformation) {
        this.carinformation = carinformation;
    }
}