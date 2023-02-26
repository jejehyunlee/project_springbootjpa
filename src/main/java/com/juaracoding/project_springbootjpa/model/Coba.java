package com.juaracoding.project_springbootjpa.model;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 2/26/2023 13:00
@Last Modified 2/26/2023 13:00
Version 1.0
*/

import javax.persistence.*;

@Entity
@Table(name = "MstManager")
public class Coba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDManager", nullable = false)
    private Long id;

    @Column(name = "Nama",length = 20)
    private String name;

    @Column(name = "Alamat", length = 500)
    private String alamat;



}
