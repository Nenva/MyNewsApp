package mgm.u.mynewsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import mgm.u.mynewsapp.R
import mgm.u.mynewsapp.databinding.FragmentSavedNewsBinding
import mgm.u.mynewsapp.ui.NewsActivity
import mgm.u.mynewsapp.ui.NewsViewModel

class SavedNewsFragment : Fragment() {

    private lateinit var binding: FragmentSavedNewsBinding
    lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_saved_news, container, false)

        viewModel = (activity as NewsActivity).viewModel

        return binding.root
    }
}