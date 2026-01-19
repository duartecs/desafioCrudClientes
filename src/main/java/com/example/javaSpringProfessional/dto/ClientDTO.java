package com.example.javaSpringProfessional.dto;

import com.example.javaSpringProfessional.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Não pode ser vazio")
    @Size(min = 3, max = 80, message = "O tamanho deve ser entre 3 e 80 caracteres")
    private String name;
    private String cpf;

    @Positive(message = "A renda deve ser positiva")
    private Double income;

    @PastOrPresent(message = "Não pode ser data futura")
    private LocalDate birthDate;

    @PositiveOrZero(message = "A quantidade não pode ser negativa")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
