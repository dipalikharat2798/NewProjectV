package com.vback.vback

import android.app.Application
import com.vback.vback.model.NavHeaderModel

class Application : Application() {
    var navlist1Data: MutableList<NavHeaderModel> = mutableListOf<NavHeaderModel>()

    override fun onCreate() {
        super.onCreate()
        instance = this

        navlist1Data.add(0,NavHeaderModel(R.drawable.ic_coupon,"My coupons"))
        navlist1Data.add(1,NavHeaderModel(R.drawable.ic_baseline_local_offer_24,"Special Offer"))
        navlist1Data.add(2,NavHeaderModel(R.drawable.ic_baseline_local_grocery_store_24,"Top Cashback Stores"))
    }

    companion object {
        lateinit var instance: Application
            private set
    }
}