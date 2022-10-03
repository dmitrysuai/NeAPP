package ru.startandroid.neapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.startandroid.neapp.R
import ru.startandroid.neapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {


    private var _binding: FragmentDetailBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}

