package com.example.dukaanApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.dukaanApplication.search.SearchProductsFragment

class DashboardMerchant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null)
        {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SearchProductsFragment>(R.id.layout)
            }
        }

        setContentView(R.layout.activity_dashboard_merchant)
    }
}