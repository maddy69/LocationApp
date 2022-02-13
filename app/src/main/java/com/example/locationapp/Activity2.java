package com.example.locationapp;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.locationapp.databinding.Activity2Binding;
import com.google.android.material.snackbar.Snackbar;

public class Activity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private Activity2Binding binding;

    private final Object Button;

    private final Object layout_width;

    private final String layout_height;

    private final Object layout_height;

    { <Button
        String layout_width;
        android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Track"
            ... />
        <ImageButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/button_icon"
        android:contentDescription="@string/button_icon_desc"
    ... />

<Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_text"
        android:drawableLeft="@drawable/button_icon"
    ... />

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_2);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_2);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}

    public Activity2(Object button, Object layout_width, String layout_height) {
        Button = button;
        this.layout_width = layout_width;
        this.layout_height = layout_height;
    }
