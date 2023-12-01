package com.fatec.bertoti.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
