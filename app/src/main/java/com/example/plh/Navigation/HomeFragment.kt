package com.example.plh.Navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.plh.R


/**
 * Created by Arsyal Raka on 15,Nov,2019
 * ScCrativeIndo
 * saigusa231@gmail.com
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

}