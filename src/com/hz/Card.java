package com.hz;

public abstract class Card {

    protected Printer printer;

    public Card(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    protected void printHeader() {
    }

    protected void printMessage() {
    }

    protected void printImage() {
    }

    private void printFooter() {
    }

}
