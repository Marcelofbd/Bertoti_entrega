package com.fatec.bertoti.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

    @Getter
    @Setter
    @Entity
    @Table(name = "tb_user")

    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;

        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;
        public User() {
        }
}
