package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class API_Demo extends AppCompatActivity {

    private TextView tvPostResults;
    private EditText etPostTitle;
    private Button btnFetchPosts, btnCreatePost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_demo);

        // Initialize UI components
        tvPostResults = findViewById(R.id.tv_post_results);
        etPostTitle = findViewById(R.id.et_post_title);
        btnFetchPosts = findViewById(R.id.btn_fetch_posts);
        btnCreatePost = findViewById(R.id.btn_create_post);

        // Set click listeners for the buttons
        btnFetchPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchPosts();
            }
        });

        btnCreatePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createPost();
            }
        });
    }

    // Function to make a GET request using Volley
    private void fetchPosts() {
        String url = "https://jsonplaceholder.typicode.com/posts";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            StringBuilder result = new StringBuilder();
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject post = response.getJSONObject(i);
                                String title = post.getString("title");
                                result.append("Title: ").append(title).append("\n\n");
                            }
                            tvPostResults.setText(result.toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        tvPostResults.setText("Error: " + error.getMessage());
                    }
                }
        );

        Volley.newRequestQueue(this).add(jsonArrayRequest);
    }

    // Function to make a POST request using Volley
    private void createPost() {
        String url = "https://jsonplaceholder.typicode.com/posts";

        String title = etPostTitle.getText().toString();
        JSONObject postParams = new JSONObject();
        try {
            postParams.put("userId", 1);
            postParams.put("title", title);
            postParams.put("body", "This is the body of the new post.");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.POST, url, postParams,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            int id = response.getInt("id");
                            Toast.makeText(API_Demo.this, "Created Post ID: " + id, Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(API_Demo.this, "Error: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

        Volley.newRequestQueue(this).add(jsonObjectRequest);
    }

}
