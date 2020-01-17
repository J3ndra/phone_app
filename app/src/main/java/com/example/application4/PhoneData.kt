package com.example.application4

object PhoneData {
    private val phoneNames = arrayOf(
        "ASUS PHONE ROG 2",
        "ASUS PHONE ROG",
        "Iphone 11",
        "ASUS Zenfone Max Pro M1",
        "ASUS Zenfone Max Pro M2",
        "VIVO Y91",
        "Iphone X",
        "Oppo Reno Z",
        "ASUS Laser 3",
        "Iphone Xr"
    )

    private val phoneDetails = arrayOf(
        "Asus dengan resmi merilis ponsel gaming Asus ROG Phone II di Indonesia pada Kamis (5/12/2019) kemarin. Smartphone ini menjadi ponsel gaming pertama dari Asus yang masuk pasar Indonesia.  Layaknya ROG Phone generasi pertama, Asus juga membuat ponsel ini dengan desain kokoh, lengkap dengan logo khas ROG pada bagian punggung ponsel. Layar seluas 6,59 inci milik ROG Phone II ini dilengkapi dengan proteksi Gorilla Glass 6. Layar tersebut juga memiliki angka refresh rate 120 Hz. Pada sektor dapur pacu, ROG Phone II dibekali chipset Snapdragon 855 dengan GPU Adreno 640 yang mampu digunakan untuk bermain game dengan konfigurasi tinggi. Ponsel ini memiliki dua pilihan dari segi RAM serta memori internal yang masing-masing terdiri dari RAM 8 GB penyimpanan 128 GB dan RAM 12 GB penyimpanan 512 GB.",
        "Era Mobile Gaming telah datang, era dimana kalian harus mampu memiliki perangkat yang membuat Anda memiliki kontrol penuh dalam permainan. Dengan core DNA dari ROG, ROG Phone menghadirkan perangkat yang dirancang agar Anda selalu menjadi pemenang. Qualcomm Snapdragon 845 dengan kecepatan 2.96 Ghz dan GPU Adreno 630 menghadirkan peforma yang luar biasa. Sistem pendingin GameCool Vapor-Chamber – dilengkapi AeroActive Cooler yang dapat dilepas untuk pendingin tambahan – Dengan layar AMOLED memberikan tampilan super pada game Anda – desain dibuat senyaman mungkin untuk para gamer seperti port type C yang berada di samping smartphone – ditambah AirTriggers yang membantu menambah kontrol Anda dalam permainan. ROG Phone akan mengubah keseluruhan permainan Anda.",
        "Layar Super Retina XDR\n" +
                "Layar OLED Multi-Touch sepenuhnya 5,8 inci (diagonal)\n" +
                "Layar HDR\n" +
                "Resolusi 2436 x 1125 piksel pada 458 ppi\n" +
                "Rasio kontras 2.000.000:1 (umum)\n" +
                "Layar iPhone 11 Pro memiliki sudut melengkung yang mengikuti desain lekukan yang indah, dan semua sudut ini berada di dalam bidang persegi standar. Jika diukur sebagai persegi standar, layarnya berukuran 5,85 inci secara diagonal (area bidang layar berukuran lebih kecil).",
        "ZenFone Max Pro (M1) adalah generasi smartphone terbaru dengan platform Snapdragon 636 yang memiliki performa dan ketahanan yang maksimal yang bisa membawa Anda lebih jauh dari yang Anda pikirkan. Dengan layar Full View 6-inci Full HD+ (2160x1080) 18:9 yang memukau, baterai 5000mAh yang tahan lama, sistem dual kamera dan juga audio yang bombastis, ZenFone Max Pro memenuhi semua kebutuhkan Anda di keseharian yang padat. ZenFone Max Pro adalah pendamping yang setia bagi Anda, selalu siap saat dibutuhkan!",
        "ZenFone Max Pro M2 menggunakan performa kuat dari prosesor Qualcomm Snapdragon 660 yang memberikan Anda kemampuan untuk melakukan apapun yang Anda mau. Baterai 5000mAh yang kuat sangat cocok untuk bermain mobile gaming atau menonton film dalam waktu yang lama, selain itu ZenFone Max Pro M2 juga dilengkapi dengan Corning Gorilla Glass 6 pada bagian layar depannya. Sistem AI Dual Camera yang dilengkapi dengan sensor Sony dapat menangkap foto yang sangat memukau setiap saat dengan objek apapun, tanpa harus berpikir bagaimana mangaturnya! ZenFone Max Pro M2 adalah sahabatmu yang pintar dan setia!",
        "Vivo Y91 2019 hadir dengan storage 32GB, tenaga prosesor MediaTek Helio P22 MT6762R octa-core 2GHz, sedangkan versi 2018 menggunakan chipset Snapdragon 439.",
        "Visi Apple sejak awal adalah menciptakan iPhone yang sepenuhnya berisi layar. Yang begitu menghanyutkan sehingga tak ada lagi batasan antara perangkat dan pengalaman. Dan begitu cerdas sehingga dapat merespons dengan sekali sentuh, atau bahkan sekali pandang. Dengan iPhone X, visi ini menjadi kenyataan. Selamat datang, masa depan.",
        "Layarnya memiliki resolusi full HD plus 2340 x 1080 piksel dan rasio aspek 19.5:9. Poni layar dipergunakan sebagai penampung kamera depan beresolusi 32 megapiksel. Sementara di bagian punggung, berjajar modul kamera ganda vertikal. Kamera utama beresolusi 48 megapiksel sensor Sony IMX586 dan kamera sekundernya 5 megapiksel depth sensor. Untuk melindungi dua kamera ini, Oppo menempelkan O-Dot ceramic agar lensa tetap aman saat diletakan. Di bawah kamera ganda terdapat stirp hitam yang menjadi digunakan untuk menempelkan LED flash, tagline, dan logo \"Oppo\". Beralih ke dapur pacu, Reno Z ditenagai chip Snapdragon 710 dengan Kryo 360 CPU dan pengolah grafis (GPU) Adreno 616 GPU. Ponsel ini dibekali RAM 6 GB dengan memori internal 128 GB. Sayangnya, tidak ada slot microSD untuk mengekspansi ruang penyimpanan. Reno Z menjalankan sistem operasi Android 9 Pie yang dilapisi antarmuka ColorOS 6.0.",
        "Hidup ini cepat, dan saat-saat terbaik hanya terjadi sekilas. ZenFone 3 Laser adalah smartphone dengan fokus hanya 0,03 detik untuk menangkap gambar jelas secara instan, dan dilapisi dengan logam untuk tingkat kemewahan berikutnya dengan gaya tak tertandingi. Fokus dalam sekejap, meningkatkan keanggunan Anda, dan selalu menembak pada kecepatan cahaya - semuanya hanya dengan ZenFone 3 Laser.",
        "Layar Liquid Retina HD\n" +
                "Layar LCD Multi-Touch sepenuhnya 6,1 inci (diagonal) dengan teknologi IPS\n" +
                "Resolusi 1792 x 828 piksel pada 326 ppi\n" +
                "Rasio kontras 1400:1 (umum)\n" +
                "Layar True Tone\n" +
                "Layar warna luas (P3)\n" +
                "Haptic Touch\n" +
                "Kecerahan maks 625 nit (umum)\n" +
                "Lapisan oleophobic anti sidik jari\n" +
                "Mendukung tampilan berbagai bahasa dan karakter secara bersamaan\n" +
                "Layar iPhone XR memiliki sudut melengkung yang mengikuti desain lekukan yang indah, dan semua sudut ini berada di dalam bidang persegi standar. Jika diukur sebagai persegi standar, layarnya berukuran 6,06 inci secara diagonal (area bidang layar berukuran lebih kecil)."
    )

    private val phonePrice = intArrayOf(
        8999000,
        8000000,
        12800000,
        2399000,
        2999000,
        1899000,
        8100000,
        7999000,
        2299000,
        12625000
    )

    private val phoneImages = intArrayOf(
        R.drawable.asusrogphone2,
        R.drawable.asusrogphone,
        R.drawable.iphonemax11,
        R.drawable.zenfonemaxprom1,
        R.drawable.zenfonemaxprom2,
        R.drawable.vivoy91,
        R.drawable.iphonex,
        R.drawable.opporenoz,
        R.drawable.asuslaser3,
        R.drawable.iphonexr
    )

    val listData: ArrayList<Phone>
    get() {
        val list = arrayListOf<Phone>()
        for (position in phoneNames.indices) {
            val phone = Phone()
            phone.name = phoneNames[position]
            phone.detail = phoneDetails[position]
            phone.price = phonePrice[position]
            phone.photo = phoneImages[position]
            list.add(phone)
        }
        return list
    }
}