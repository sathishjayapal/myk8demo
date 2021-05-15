package me.sathish.k8s.myk8demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@ToString
public class User {
    private String firstName;
    private String lastName;
    private BigDecimal id;
    private String userid;
    private String password;
}
