package com.google.firebase.perf.network;

import a.dps0;
import a.ml50;
import a.nl50;
import a.srn;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, ml50 ml50Var, long j, long j2) {
        Request request = response.f46111a;
        if (request == null) {
            return;
        }
        ml50Var.n(request.f46108a.j().toString());
        ml50Var.d(request.b);
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            long jA = requestBody.a();
            if (jA != -1) {
                ml50Var.h(jA);
            }
        }
        ResponseBody responseBody = response.g;
        if (responseBody != null) {
            long c = responseBody.getC();
            if (c != -1) {
                ml50Var.l(c);
            }
            MediaType b = responseBody.getB();
            if (b != null) {
                ml50Var.k(b.f46102a);
            }
        }
        ml50Var.g(response.d);
        ml50Var.i(j);
        ml50Var.m(j2);
        ml50Var.b();
    }

    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.s0(new srn(callback, dps0.s, timer, timer.f45671a));
    }

    public static Response execute(Call call) {
        ml50 ml50Var = new ml50(dps0.s);
        Timer timer = new Timer();
        long j = timer.f45671a;
        try {
            Response responseK = call.k();
            a(responseK, ml50Var, j, timer.a());
            return responseK;
        } catch (IOException e) {
            Request b = call.getB();
            if (b != null) {
                HttpUrl httpUrl = b.f46108a;
                if (httpUrl != null) {
                    ml50Var.n(httpUrl.j().toString());
                }
                String str = b.b;
                if (str != null) {
                    ml50Var.d(str);
                }
            }
            ml50Var.i(j);
            ml50Var.m(timer.a());
            nl50.c(ml50Var);
            throw e;
        }
    }
}
