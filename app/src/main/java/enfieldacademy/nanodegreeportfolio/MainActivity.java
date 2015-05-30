package enfieldacademy.nanodegreeportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openFirstApp(View view){
        Toast.makeText(this, R.string.first_toast, Toast.LENGTH_SHORT).show();
    }

    public void openSecondApp(View view){
        Toast.makeText(this, R.string.second_toast, Toast.LENGTH_SHORT).show();
    }

    public void openThirdApp(View view){
        Toast.makeText(this, R.string.third_toast, Toast.LENGTH_SHORT).show();
    }

    public void openFourthApp(View view){
        Toast.makeText(this, R.string.fourth_toast, Toast.LENGTH_SHORT).show();
    }

    public void openFifthApp(View view){
        Toast.makeText(this, R.string.fifth_toast, Toast.LENGTH_SHORT).show();
    }

    public void openSixthApp(View view){
        Toast.makeText(this, R.string.sixth_toast, Toast.LENGTH_SHORT).show();
    }
}
