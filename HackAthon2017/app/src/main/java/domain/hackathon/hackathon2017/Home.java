package domain.hackathon.hackathon2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private String urlbase = "http://api.petfinder.com/";
    private String urlmethod = "pet.getRandom?";
    private String urlkey = "key=58fe2e272bebddbc0f5e66901f239055";
    private String urlarg = "&output=basic";
    private String urlShelter = "http://api.petfinder.com/shelter.get?key=58fe2e272bebddbc0f5e66901f239055&id=";

    public static int petNumber;

    private ViewStub stubGrid;
    private GridView gridView;
    private GridViewAdapter gridViewAdapter;

    private List<PetInfo> petList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        stubGrid = (ViewStub) findViewById(R.id.stub_grid);
        stubGrid.inflate();
        gridView = (GridView) findViewById(R.id.mygridview);
        gridView.setOnItemClickListener(onItemClick);
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            petNumber = petList.get(position).getPetnumber();
            //startActivity(new Intent(Home.this, Description.class));
        }
    };
}
