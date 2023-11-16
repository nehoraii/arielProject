package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "user",schema = "public")
public class userEntityNehoraii {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
}
