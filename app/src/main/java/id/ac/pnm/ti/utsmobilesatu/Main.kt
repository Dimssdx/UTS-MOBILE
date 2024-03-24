package id.ac.pnm.ti.utsmobilesatu
fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf(Club("Liverpool",19,8,9,6,3))
            clubs.add(Club("Manchester United", 20 ,12,6,3,1))
            clubs.add(Club("Chelsea", 6 ,6,5,2,2))
            clubs.add(Club("Manchester City", 8 ,8,8,0,0))
            clubs.add(Club("Arsenal", 13 ,14,2,0,0))

    //variable ini menyimpan list beberapa klub beserta trophy yang dimenangkan di tiap liga

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    sekat()
    // Hasil sorting total trofi
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println("${club.name} telah mendapatkan total trophy sebanyak ${club.totalTrophy}" )
    }

    //variable ini digunakan untuk menampung sortedclubs function untuk melempar sortbynumbertophytotal

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    sekat()
    // Hasil sorting total trofi
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    for (club in filteredClubs) {
        println("${club.name}")
    }
    //varibable filterclub digunakan untuk menampung high order function untuk melempar function filterbyeuropean function
sekat()
    // Panggil extension function Club recap
    println(clubs[0].recap())
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

//function ini digunakan untuk melempar function filterandsort

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    val sortedClubs = clubs.sortedByDescending {
        it.totalTrophy
    }
    return sortedClubs

}
//function ini digunakan sebagai high order function yang berguna untuk melempar function lain

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    val filteredClubs = clubs.filter {
        it.lcu == 0 && it.lce == 0
    }
    return filteredClubs
}
//jadi properti lcu sama dengan 0 dan lcu sama dengan 0 yang digunakann untuk memfilter trophy yang 0

fun sekat(){
    println("+==============================================================================+")
}
//digunakan untuk memberikan function sekat untuk menambahkan sekat pada baris