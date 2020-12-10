package mgm.u.mynewsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import mgm.u.mynewsapp.R
import mgm.u.mynewsapp.databinding.FragmentArticleBinding
import mgm.u.mynewsapp.ui.NewsActivity
import mgm.u.mynewsapp.ui.NewsViewModel

class ArticleFragment : Fragment() {

    private lateinit var binding : FragmentArticleBinding
    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_article, container, false)

        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        binding.webView.apply {
            webViewClient = WebViewClient()
            article?.url?.let { loadUrl(it) }
        }

        binding.fab.setOnClickListener {
            article?.let { it1 -> viewModel.saveArticle(it1) }
            view?.let { it1 -> Snackbar.make(it1, "Article saved successfully!", Snackbar.LENGTH_SHORT).show() }
        }

        return binding.root
    }
}