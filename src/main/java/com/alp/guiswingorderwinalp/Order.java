package com.alp.guiswingorderwinalp;

public class Order {
    private String dateTime;
    private String type;
    private int tableNumber;
    private String customerName;
    private String email;
    private String comments;
    private double subtotal; 
    private String paymentMethod;
    private String tip;
    private boolean invoiceRequested;
    private double totalGeneral; 
    private final double total;

    // Constructor vacío
    public Order(String dateTime, String type, int tableNumber, String customerName, String email,
                 String comments, double total, String paymentMethod, String tip, boolean invoiceRequested) {
        this.dateTime = dateTime;
        this.type = type;
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.email = email;
        this.comments = comments;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.tip = tip;
        this.invoiceRequested = invoiceRequested;
    }

    public String toDisplayString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha y hora: ").append(dateTime).append('\n');
        sb.append("Tipo: ").append(type).append('\n');
        sb.append("Número de mesa: ").append(tableNumber).append('\n');
        sb.append("Nombre: ").append(customerName).append('\n');
        sb.append("Email: ").append(email).append('\n');
        sb.append(String.format("Total final: %.2f EUR", total)).append('\n');
        sb.append("Método de pago: ").append(paymentMethod).append('\n');
        sb.append("Propina: ").append(tip).append('\n');
        sb.append("Solicitar factura: ").append(invoiceRequested ? "Sí" : "No").append('\n');
        if (comments != null && !comments.trim().isEmpty()) {
            sb.append("Comentarios: ").append(comments).append('\n');
        }
        return sb.toString();
    }

   

     @Override
    public String toString() {
        return "Order{" +
                "dateTime='" + dateTime + '\'' +
                ", type='" + type + '\'' +
                ", tableNumber=" + tableNumber +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", total=" + total +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", tip='" + tip + '\'' +
                ", invoiceRequested=" + invoiceRequested +
                '}';
    }
    public String getDateTime() { return dateTime; }
    public String getType() { return type; }
    public int getTableNumber() { return tableNumber; }
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getComments() { return comments; }
    public double getTotal() { return total; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getTip() { return tip; }
    public boolean isInvoiceRequested() { return invoiceRequested; }

}