package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserRVAdapter(modelArraylist: ArrayList<ModelClass>) :
    RecyclerView.Adapter<UserRVAdapter.ViewHolder>() {

    // variable for our array list and context.
    private val userModalArrayList: ArrayList<ModelClass> = modelArraylist
    private val context: Context? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTV: TextView? = itemView.findViewById(R.id.idTVName)
        var qtyTV: TextView? = itemView.findViewById(R.id.idTVQty)
        var priceTV: TextView? = itemView.findViewById(R.id.idTVPrice)
        var locationTV: TextView? = itemView.findViewById(R.id.idTVLocation)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.user_rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // getting data from our array list in our modal class.
        // getting data from our array list in our modal class.
        val userModal: ModelClass = userModalArrayList[position]

        // on the below line we are setting data to our text view.

        // on the below line we are setting data to our text view.
        holder.nameTV?.setText(userModal.getName())
        holder.qtyTV?.setText(userModal.getQty())
        holder.priceTV?.setText(userModal.getPrice())
        holder.locationTV?.setText(userModal.getLocation())
    }

    override fun getItemCount(): Int {
        return userModalArrayList.size
    }
}