package Structural.Adapter.ex2;


// Step 1: Define the new payment gateway's interface.
public interface PaymentGateway {
     void excuteTransaction(PaymentDetails paymentDetails);
}
