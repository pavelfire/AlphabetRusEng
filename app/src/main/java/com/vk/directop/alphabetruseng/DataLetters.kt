package com.vk.directop.alphabetruseng

class DataLetters {
}


fun addToLetterViews(): MutableList<Letter> {
    return mutableListOf<Letter>(
        Letter("А", R.drawable.arbuz, R.raw.a),
        Letter("Б", R.drawable.belka, R.raw.b),
        Letter("В", R.drawable.volk, R.raw.v),
        Letter("Г", R.drawable.grib, R.raw.g),
        Letter("Д", R.drawable.dom, R.raw.d),
        Letter("Е", R.drawable.enot, R.raw.e),
        Letter("Ё", R.drawable.yolka, R.raw.yo),
        Letter("Ж", R.drawable.zhuk, R.raw.zh),
        Letter("З", R.drawable.zebra, R.raw.z),
        Letter("И", R.drawable.indyuk, R.raw.i),
        Letter("Й", R.drawable.yogurt, R.raw.i_krat),
        Letter("К", R.drawable.kot, R.raw.k),
        Letter("Л", R.drawable.lev, R.raw.l),
        Letter("М", R.drawable.mashina, R.raw.m),
        Letter("Н", R.drawable.nosorog, R.raw.n),
        Letter("О", R.drawable.obezyana, R.raw.o),
        Letter("П", R.drawable.popugai, R.raw.p),
        Letter("Р", R.drawable.rak, R.raw.r),
        Letter("С", R.drawable.solnce, R.raw.s),
        Letter("Т", R.drawable.tigr, R.raw.t),
        Letter("У", R.drawable.ulitka, R.raw.u),
        Letter("Ф", R.drawable.flag, R.raw.f),
        Letter("Х", R.drawable.hleb, R.raw.h),
        Letter("Ц", R.drawable.ciplenok, R.raw.c),
        Letter("Ч", R.drawable.cherepaha, R.raw.ch),
        Letter("Ш", R.drawable.shishka, R.raw.sh),
        Letter("Щ", R.drawable.shenok, R.raw.shm),
        Letter("Ъ", R.drawable.pusto, R.raw.tvznak),
        Letter("Ы", R.drawable.mish, R.raw.yyy),
        Letter("Ь", R.drawable.pusto, R.raw.mznak),
        Letter("Э", R.drawable.eskimo, R.raw.eoborot),
        Letter("Ю", R.drawable.yula, R.raw.yu),
        Letter("Я", R.drawable.yabloko, R.raw.ya)
    )

//        var letter: Char = 'а'
//        //var letters = mutableListOf<Char>()
//        while (letter <= 'я') {
//            //letters.add(letter)
//            letterViews.add(
//                Letter(
//                    letter.toString().uppercase(Locale.getDefault()),
//                    R.drawable.arbuz,
//                    R.raw.a
//                )
//            )
//            ++letter
//        }
}

fun addToEngLetterViews(): MutableList<Letter> {
    return mutableListOf<Letter>(
        //Letter("", R.drawable., R.raw.),
        Letter("A", R.drawable.apple, R.raw.e_a),
        Letter("B", R.drawable.butterfly, R.raw.e_b),
        Letter("C", R.drawable.cat, R.raw.e_c),
        Letter("D", R.drawable.dog, R.raw.e_d),
        Letter("E", R.drawable.elephant, R.raw.e_e),
        Letter("F", R.drawable.fish, R.raw.e_f),
        Letter("G", R.drawable.giraffe, R.raw.e_g),
        Letter("H", R.drawable.horse, R.raw.e_h),
        Letter("I", R.drawable.ice_scream, R.raw.e_i),
        Letter("J", R.drawable.jam, R.raw.e_j),
        Letter("K", R.drawable.key, R.raw.e_k),
        Letter("L", R.drawable.lemon, R.raw.e_l),
        Letter("M", R.drawable.mirror, R.raw.e_m),
        Letter("N", R.drawable.nut, R.raw.e_n),
        Letter("O", R.drawable.owl, R.raw.e_o),
        Letter("P", R.drawable.penguin, R.raw.e_p),
        Letter("Q", R.drawable.quilt, R.raw.e_q),
        Letter("R", R.drawable.rabbit, R.raw.e_r),
        Letter("S", R.drawable.strawberry, R.raw.e_s),
        Letter("T", R.drawable.turtle, R.raw.e_t),
        Letter("U", R.drawable.umbrella, R.raw.e_u),
        Letter("V", R.drawable.vessel, R.raw.e_v),
        Letter("W", R.drawable.window, R.raw.e_w),
        Letter("X", R.drawable.xylophone, R.raw.e_x),
        Letter("Y", R.drawable.yacht, R.raw.e_y),
        Letter("Z", R.drawable.zebra_en, R.raw.e_z)
        )
}