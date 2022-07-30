package com.vback.vback.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vback.vback.R
import com.vback.vback.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var viewManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
    private var viewManager1 = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
    private var viewManager2 = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
    private lateinit var viewModel: HomeViewModel
    private lateinit var data: ArrayList<RecyclerFirstModel>
    private lateinit var data1: ArrayList<RecyclerFirstModel>
    private lateinit var data2: ArrayList<RecyclerFirstModel>
    private lateinit var adapter:HomeFragAdapter
    private lateinit var adapter2:HomeFragAdapter2
    private lateinit var adapter3:HomeFragAdapter3
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        data = ArrayList<RecyclerFirstModel>()
        data1 = ArrayList<RecyclerFirstModel>()
        data2 = ArrayList<RecyclerFirstModel>()
        addData1()
        addData2()
        addData2()
        viewModel.add1(data)
        initialiseAdapter()
        return root
    }

    private fun initialiseAdapter() {
        binding.recycler1.layoutManager = viewManager
        binding.recycler2.layoutManager = viewManager1
        binding.recycler3.layoutManager = viewManager2
        adapter=HomeFragAdapter(data,requireContext())
        adapter2=HomeFragAdapter2(data1,requireContext())
        adapter3=HomeFragAdapter3(data2,requireContext())
        binding.recycler1.adapter=adapter
        binding.recycler2.adapter=adapter2
        binding.recycler3.adapter=adapter3
        observeData()
    }

    fun observeData() {
        viewModel.lst1.observe(requireActivity(), Observer {
            Log.i("data", it.toString())
           data=it
            adapter.notifyDataSetChanged()

        })
        viewModel.lst2.observe(requireActivity(), Observer {
            Log.i("data", it.toString())
            data1=it
            adapter2.notifyDataSetChanged()
        })
        viewModel.lst3.observe(requireActivity(), Observer {
            Log.i("data", it.toString())
            data2=it
            adapter3.notifyDataSetChanged()
        })
    }

    fun addData1() {
        data.add(RecyclerFirstModel(R.drawable.recycler1_img1))
        data.add(RecyclerFirstModel(R.drawable.recycler1_img2))
        data.add(RecyclerFirstModel(R.drawable.recycler1_img1))
        data.add(RecyclerFirstModel(R.drawable.recycler1_img2))
        data.add(RecyclerFirstModel(R.drawable.recycler1_img1))
        data.add(RecyclerFirstModel(R.drawable.recycler1_img2))
    }

    fun addData2() {
        data1.add(RecyclerFirstModel(R.drawable.cake))
        data1.add(RecyclerFirstModel(R.drawable.women))
        data1.add(RecyclerFirstModel(R.drawable.men))
    }

    fun addData3() {
        data2.add(RecyclerFirstModel(R.drawable.prettywomen))
        data2.add(RecyclerFirstModel(R.drawable.womenwashinspa))
        data2.add(RecyclerFirstModel(R.drawable.pharma))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}