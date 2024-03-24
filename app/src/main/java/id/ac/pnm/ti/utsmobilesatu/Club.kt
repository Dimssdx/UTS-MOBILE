package id.ac.pnm.ti.utsmobilesatu

// data class Club
data class Club(
    val name: String,
    val lpi: Int,
    val fa: Int,
    val efl: Int,
    val lce: Int,
    val lcu: Int
) {
    val totalTrophy: Int
        get() = lpi+fa+efl+lce+lcu
}

//class yang berguna untuk menyimpan data

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $lpi trofi Liga Premier Inggris," +
            "$fa trofi FA" +
            "$efl trofi EFL" +
            "$lce trofi Liga Champions" +
            "$lcu trofi Liga Eropa EUFA"
}

//function yang digunakan untuk mencetak recap hasil liga