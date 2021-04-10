package com.arstagaev.superserviceapp1.api



import com.arstagaev.superserviceapp1.Utils.Companion.BASE_URL
import okhttp3.CipherSuite.Companion.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA
import okhttp3.CipherSuite.Companion.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
import okhttp3.CipherSuite.Companion.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
import okhttp3.CipherSuite.Companion.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.TlsVersion
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*


class RetrofitInstance {

    companion object {
//        var spec: ConnectionSpec = ConnectionSpec.Builder(ConnectionSpec.COMPATIBLE_TLS)
//
//                .allEnabledCipherSuites()
//                .allEnabledTlsVersions()
//                .build()
//            .tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0)
//            .cipherSuites(
//                TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
//                TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256,
//                TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA,
//                TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
//            )

        private val retrofit by lazy {
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
                .addInterceptor(logging)

                .build()
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }

//        private val retrofit2 by lazy {
//            val logging = HttpLoggingInterceptor()
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//            val client = OkHttpClient.Builder()
//                .addInterceptor(logging)
//                .build()
//            Retrofit.Builder()
//                .baseUrl(BASE_URL2)
//                .addConverterFactory(GsonConverterFactory.create()) // may be a Moshi
//                .client(client)
//                .build()
//        }

        val apiAlpha by lazy { retrofit.create(LocationsApi::class.java) }
        //val apiBeta by lazy { retrofit.create(MassiveAPI::class.java) }

    }
}