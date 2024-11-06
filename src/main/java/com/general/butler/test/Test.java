package com.general.butler.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer testId;
    private String testMemo;
    private String tester;
}
