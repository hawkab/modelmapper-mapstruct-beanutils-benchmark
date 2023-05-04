package org.example.dto;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@State(Scope.Benchmark)
public class DestinationDTO {
    private int id;
    private String name;
    private Integer count;
    private Float discount;
    private BigDecimal status;
    private LocalDate created;
    private LocalDateTime modifiedDateTime;

    public DestinationDTO() {
    }

    public DestinationDTO(int id, String name, Integer count, Float discount, BigDecimal status, LocalDate created, LocalDateTime modifiedDateTime) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.discount = discount;
        this.status = status;
        this.created = created;
        this.modifiedDateTime = modifiedDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDateTime getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }
}
