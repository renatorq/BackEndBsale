package com.bsale.bsale.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
public class Category {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
