package com.Akshitkamra_C0796392_A10;

public abstract class SalesPerson {
    double sales;
    double advance;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    abstract void display();
}
