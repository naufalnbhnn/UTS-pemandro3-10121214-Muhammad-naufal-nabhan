//27-05-2024/10121078/AdrianMaulanaRizqy/PemAndro3
package com.example.myselfapps_10121078

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fragment_music : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_music, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewMusic)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MusicAdapter(requireContext(), getMusicData())

        return view
    }

    private fun getMusicData(): List<Quadruple<Int, String, String, String>> {
        return listOf(
            Quadruple(R.drawable.gnr,"https://open.spotify.com/track/3YRCqOhFifThpSRFJ1VWFM?si=a184ab434cb64b96","November Rain", "Guns N' Roses"),
            Quadruple(R.drawable.gd, "https://open.spotify.com/track/4wsQGsdf8D0Bj26cGdvreB?si=03402a74caf5486d", "She", "Greenday"),
            Quadruple(R.drawable.ff, "https://open.spotify.com/track/5UWwZ5lm5PKu6eKsHAGxOk?si=8f4322c367b94438", "Everlong", "Foo Fighters"),
            Quadruple(R.drawable.blink, "https://open.spotify.com/track/1fJFuvU2ldmeAm5nFIHcPP?si=d89a49ec1f834e1d", "First Date", "Blink-182"),
            Quadruple(R.drawable.tb, "https://open.spotify.com/track/0aym2LBJBk9DAYuHHutrIl?si=a98774d2e71f4f6b", "Hey Jude", "The Beatles"),
            Quadruple(R.drawable.hsb, "https://open.spotify.com/track/5muVpPu8Fj9fXfDbbqDdrZ?si=f690ed6ae1754512", "Love Buzz", "Nirvana"),
            Quadruple(R.drawable.aa, "https://open.spotify.com/track/11LmqTE2naFULdEP94AUBa?si=1ad491549fee448b", "Heart-Shaped Box", "Nirvana"),
            Quadruple(R.drawable.aa, "https://open.spotify.com/track/1Ic9pKxGSJGM0LKeqf6lGe?si=5c04b7aa6d074db4", "All Apologies", "Nirvana"),
            Quadruple(R.drawable.rhcp, "https://open.spotify.com/track/1G391cbiT3v3Cywg8T7DM1?si=ea8056c4d01646c1", "Scar Tissue", "Red Hot Chili Peppers"),
            Quadruple(R.drawable.cake, "https://open.spotify.com/track/4THrHKyBL0yaDDw9yg37Zk?si=659e9321a06940b6", "I Will Survive", "Cake")
        )
    }
}
