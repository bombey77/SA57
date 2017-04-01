package bombey77.sa57;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"1","2","3","4","5","6","7","8"};
    GridView gridView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gView);
        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.textView, data);

        gridView.setAdapter(adapter);

        testGridView();
    }

    public void testGridView() {
        gridView.setNumColumns(3);
        //gridView.setNumColumns(GridView.AUTO_FIT);
        gridView.setColumnWidth(80);
        gridView.setHorizontalSpacing(10);
        gridView.setVerticalSpacing(10);
        gridView.setStretchMode(GridView.STRETCH_SPACING);
        //gridView.setStretchMode(GridView.STRETCH_SPACING_UNIFORM);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
