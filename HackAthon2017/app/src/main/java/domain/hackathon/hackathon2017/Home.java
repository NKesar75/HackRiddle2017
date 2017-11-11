package domain.hackathon.hackathon2017;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.support.design.widget.NavigationView;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private String urlbase = "http://api.petfinder.com/"; //base url
    private String urlkey = "key=58fe2e272bebddbc0f5e66901f239055"; //key for api
    private String urlmethodrandom = "pet.getRandom?"; //used for getting a random pet
    private String urlmethodfindmuiltplerecords = "pet.find"; //used for getting a random pet
    private String animaltype = "";
    private String size = "";
    private String breed = "";
    private String gender = "";
    private int offestformuiltplerecords = 0; //used to get more records if they want to keep looking
    private String urlargforpetrecord = "&output=basic"; //argumentpassedintoparmaert

    private String urlShelter = "http://api.petfinder.com/shelter.get?key=58fe2e272bebddbc0f5e66901f239055&id=";

}
