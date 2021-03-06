package com.example.dukaan.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.dukaan.R
import com.example.dukaan.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_homescreen.*

class Homescreen : AppCompatActivity() {

    val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)
        setHomescreenFragment()
        init()
    }

    private fun init() {
        bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.orders_menu -> {
                    val ordersFragment = OrdersFragment()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(R.id.flHomescreen, ordersFragment, "orders")
                        .addToBackStack("orders").commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_products -> {
                    val productsFragment = productMainFragment()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(R.id.flHomescreen, productsFragment, "product")
                        .addToBackStack("product").commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_home -> {
                    val homescreenFragement = HomescreenFragement()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(
                        R.id.flHomescreen,
                        homescreenFragement,
                        "homescreenFragement"
                    ).addToBackStack("homescreenFragement").commit()

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_manage_store -> {
                    val manageStoreFragement = ManageStoreFragement()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(
                        R.id.flHomescreen,
                        manageStoreFragement,
                        "manageStoreFragement"
                    ).addToBackStack("manageStoreFragement").commit()

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_account -> {
                    val accountPage = AccountPage()
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(R.id.flHomescreen, accountPage, "accountPage")
                        .addToBackStack("accountPage").commit()

                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun setHomescreenFragment() {
        val transaction = fragmentManager.beginTransaction()
        val homescreenFragement = HomescreenFragement()
        transaction.add(R.id.flHomescreen, homescreenFragement, "homescreen").commit()

    }
}