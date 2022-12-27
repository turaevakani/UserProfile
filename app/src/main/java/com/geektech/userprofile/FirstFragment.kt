package com.geektech.userprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.userprofile.databinding.ActivityMainBinding
import com.geektech.userprofile.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater)

        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSend.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("username", binding.etEmail.text.toString())
            bundle.putString("email",binding.etUsername.text.toString())
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, SecondFragment()).commit()

        }
    }

}