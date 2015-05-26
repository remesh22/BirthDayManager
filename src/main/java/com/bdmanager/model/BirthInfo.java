package com.bdmanager.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "birthinfo")
public class BirthInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
	private Long id;
    @Column(name = "firstname")
    @Getter
    @Setter
    private String firstName;
    @Column(name = "lastname")
    @Getter
    @Setter
    private String lastName;
    @Column(name = "birthday")
    @Getter
    @Setter
    private Date birthDay;
}
