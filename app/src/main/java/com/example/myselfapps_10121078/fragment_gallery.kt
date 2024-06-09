//27-05-2024/10121078/AdrianMaulanaRizqy/PemAndro3
package com.example.myselfapps_10121078

// GalleryFragment.kt
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragment_gallery : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        // Sample image list, replace with your own image resources
        val imageList = listOf(
            R.drawable.galleryone,
            R.drawable.gallerytwo,
            R.drawable.gallerythree,
            R.drawable.galleryfour,
            R.drawable.galleryfive,
            R.drawable.gallerysix,
            R.drawable.galleryseven,
            R.drawable.galleryeight,
            R.drawable.gallerinine,
            R.drawable.galleryten,
            R.drawable.galleryeleven,
            R.drawable.gallerytwelve,
            R.drawable.gallerythirteen,
            R.drawable.galleryfourteen,
            R.drawable.galleryfifteen
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = GalleryAdapter(imageList)

        return view
    }
}
