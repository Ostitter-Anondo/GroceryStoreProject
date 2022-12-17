package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject


class GroceryStock : AppCompatActivity() {

    private var userModalArrayList: ArrayList<ModelClass>? = null
    private var userRVAdapter: UserRVAdapter? = null
    private var userRV: RecyclerView? = null
    private var loadingPB: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userModalArrayList = ArrayList()
        userRV = findViewById(R.id.idRVUsers)
        loadingPB = findViewById(R.id.idPBLoading)
        getDataFromAPI()
    }

    private fun getDataFromAPI() {
        val url=
            "https://sheets.googleapis.com/v4/spreadsheets/1a8JxUEVignpOh044GLC7jZMonuebTeeKJKc3Y2q4Kh4/values/Sheet1?alt=json&key=AIzaSyByFJWSBYuX-jlXNldFV6gjg2HBkpPRjPY"
        val queue = Volley.newRequestQueue(this@GroceryStock)

        val jsonObjectRequest =
            JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                object : Response.Listener<JSONObject> {
                    override fun onResponse(response: JSONObject) {
                        loadingPB!!.visibility = View.GONE
                        try {
                            val entryArray = response.getJSONArray("values")

                            for (i in 0 until entryArray.length()) {
                                val entryObj = entryArray.getJSONArray(i)
                                val name =
                                    entryObj[0].toString()
                                val qty = entryObj[1].toString()
                                val price = entryObj[2].toString()
                                val location = entryObj[3].toString()

                                userModalArrayList!!.add(ModelClass(name, qty, price, location))


                                // passing array list to our adapter class.
                                userRVAdapter = UserRVAdapter(userModalArrayList!!)

                                // setting layout manager to our recycler view.
                                userRV!!.layoutManager = LinearLayoutManager(this@GroceryStock)

                                // setting adapter to our recycler view.
                                userRV!!.adapter = userRVAdapter
                            }
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }
                    }
                },
                object : Response.ErrorListener {
                    override fun onErrorResponse(error: VolleyError?) {
                        // handline on error listener method.
                        Toast.makeText(this@GroceryStock, "Fail to get data..", Toast.LENGTH_SHORT)
                            .show()
                    }
                })
        queue.add(jsonObjectRequest);
    }
}