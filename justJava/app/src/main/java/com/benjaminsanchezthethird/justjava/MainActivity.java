package com.benjaminsanchezthethird.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    //global variable
    int numOfCoffee = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increaseCoffee (View view){

        numOfCoffee++;

        display(numOfCoffee);
    }

    public void decreaseCoffee (View view){

        numOfCoffee--;

        display(numOfCoffee);
    }


    public void submitOrder(View view) {

        //variable holds the amount of coffee ordered

        //sends number to function that'll display price on screen
        display(numOfCoffee);
        displayPrice(numOfCoffee * 2);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.total_number);
        quantityTextView.setText("" + number);

     }

     private void displayPrice(int num){

        //sets variable
        TextView priceTextView = (TextView) findViewById(R.id.price_number);

        //sets variable to that price.
        priceTextView.setText("$ " + num);

     }
}