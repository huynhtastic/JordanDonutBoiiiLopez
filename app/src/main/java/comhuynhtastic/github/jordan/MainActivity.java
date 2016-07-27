package comhuynhtastic.github.jordan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementRegGlazed(View view) {
        TextView qtyRegGlazed = (TextView) findViewById(R.id.qty_reg_glazed);
        int currentRegGlazed = Integer.parseInt(qtyRegGlazed.getText().toString());
        String output = Integer.toString(currentRegGlazed + 1);
        qtyRegGlazed.setText(output);
        changeQuantity(1);
    }

    public void decrementRegGlazed(View view) {
        TextView qtyRegGlazed = (TextView) findViewById(R.id.qty_reg_glazed);
        int currentRegGlazed = Integer.parseInt(qtyRegGlazed.getText().toString());
        if (currentRegGlazed == 0) {
            Toast.makeText(this, "Can't order negative donuts!", Toast.LENGTH_LONG).show();
        }
        else {
            String output = Integer.toString(currentRegGlazed - 1);
            qtyRegGlazed.setText(output);
            changeQuantity(0);
        }
    }

    public void changeQuantity(int addOrSubtract) {
        TextView totalQuantity = (TextView) findViewById(R.id.total_quantity);
        int quantity = Integer.parseInt(totalQuantity.getText().toString());
        if (addOrSubtract == 0) {
            quantity -= 1;
        }
        else {
            quantity += 1;
        }
        totalQuantity.setText(Integer.toString(quantity));
    }

    // add/subtract 1 dollar to total
    public void changeTotal(int addOrSubtract) {

    }

}
