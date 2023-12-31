package com.food.ordering.system.domain.valuobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {

    private final BigDecimal amount;
    public static final Money ZERO = new Money(BigDecimal.ZERO);

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Money add(Money money) {
        return new Money(setScale(this.amount.add(money.getAmount())));
    }

    public Money subtractMoney(Money money) {
        return new Money(setScale(this.amount.add(money.getAmount())));
    }

    public Money multiply(int money) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(money)));
    }

    public boolean isGreaterThanZero() {
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return this.amount != null && this.amount.compareTo(money.getAmount()) > 0;
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
