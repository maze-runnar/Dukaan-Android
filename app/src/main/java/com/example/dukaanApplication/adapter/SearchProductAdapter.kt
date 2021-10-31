package com.example.dukaanApplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dukaanApplication.R
import com.example.dukaanApplication.databinding.ProductItemsBinding
import com.example.dukaanApplication.search.ProductItem

class SearchProductAdapter : RecyclerView.Adapter<SearchProductAdapter.ProductViewHolder>() {

    val productArray: ArrayList<ProductItem> = ArrayList(listOf(ProductItem("Wheat",300),
        ProductItem("Wheat",300),
        ProductItem("Sugar",300),
        ProductItem("Rice",300),
        ProductItem("Pen",300),
        ProductItem("Turmeric",300),
        ProductItem("Dal",300),
        ProductItem("Almonds",300),
        ProductItem("Cashew",300),
        ProductItem("Hair Oil",300),
        ProductItem("Wheat",300),
        ProductItem("Sugar",300),
        ProductItem("Rice",300),
        ProductItem("Pen",300),
        ProductItem("Turmeric",300)
        ))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_items,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.binding.tvProductName.text = productArray.get(position).productName
        holder.binding.tvProductPrice.text = productArray.get(position).productPrice.toString()
    }

    override fun getItemCount():Int = productArray.size
    class  ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val binding = ProductItemsBinding.bind(itemView)
    }

}