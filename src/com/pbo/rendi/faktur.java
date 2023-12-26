package com.pbo.rendi;

class faktur extends barang implements pembayaran {
    private String invoiceNumber;
    private String customerName;
    private String NoHP;
    private String alamat;

    public faktur(String invoiceNumber, String customerName, String NoHP, String alamat, String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.NoHP = NoHP;
        this.alamat = alamat;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

     public String getnoHP() {
        return NoHP;
    }

    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public double calculateTotal() {
        return getPrice() * getQuantity();
    }
}