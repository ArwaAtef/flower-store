package com.example.myapplicationflower;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        // Get the RadioGroup and Button views
        RadioGroup paymentOptionsGroup = findViewById(R.id.paymentOptionsGroup);
        Button proceedButton = findViewById(R.id.proceedButton);

        // Set a listener for the Proceed button
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected RadioButton
                int selectedId = paymentOptionsGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);

                // Check if a payment method is selected
                proceedButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Get the selected RadioButton
                        int selectedId = paymentOptionsGroup.getCheckedRadioButtonId();
                        RadioButton selectedRadioButton = findViewById(selectedId);

                        // Check if a payment method is selected
                        if (selectedRadioButton != null) {
                            String selectedPaymentMethod = selectedRadioButton.getText().toString();

                            // Implement your logic for the selected payment method
                            if ("Cash".equals(selectedPaymentMethod)) {
                                // User selected Cash, navigate to CashPaymentActivity
                                // Replace CashPaymentActivity.class with your actual activity class
                                startActivity(new Intent(PaymentMethodActivity.this, CashPayment.class));
                            } else if ("Visa".equals(selectedPaymentMethod)) {
                                // User selected Visa, navigate to VisaPaymentActivity
                                // Replace VisaPaymentActivity.class with your actual activity class
                                startActivity(new Intent(PaymentMethodActivity.this, VisaPayment.class));
                            }

                        } else {
                            // No payment method selected
                            Toast.makeText(PaymentMethodActivity.this, "Please select a payment method", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
}
