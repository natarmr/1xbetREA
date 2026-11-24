package com.google.firebase.perf.network;

import a.dps0;
import a.jjx;
import a.kjx;
import a.ml50;
import a.nl50;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) throws IOException {
        dps0 dps0Var = dps0.s;
        Timer timer = new Timer();
        timer.d();
        long j = timer.f45671a;
        ml50 ml50Var = new ml50(dps0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new kjx((HttpsURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f18409a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new jjx((HttpURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f16639a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            ml50Var.i(j);
            ml50Var.m(timer.a());
            ml50Var.n(url.toString());
            nl50.c(ml50Var);
            throw e;
        }
    }

    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new kjx((HttpsURLConnection) obj, new Timer(), new ml50(dps0.s));
        }
        return obj instanceof HttpURLConnection ? new jjx((HttpURLConnection) obj, new Timer(), new ml50(dps0.s)) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        dps0 dps0Var = dps0.s;
        Timer timer = new Timer();
        if (!dps0Var.c.get()) {
            return url.openConnection().getInputStream();
        }
        timer.d();
        long j = timer.f45671a;
        ml50 ml50Var = new ml50(dps0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new kjx((HttpsURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f18409a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new jjx((HttpURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f16639a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            ml50Var.i(j);
            ml50Var.m(timer.a());
            ml50Var.n(url.toString());
            nl50.c(ml50Var);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        dps0 dps0Var = dps0.s;
        Timer timer = new Timer();
        timer.d();
        long j = timer.f45671a;
        ml50 ml50Var = new ml50(dps0Var);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new kjx((HttpsURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f18409a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new jjx((HttpURLConnection) uRLConnectionOpenConnection, timer, ml50Var).f16639a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            ml50Var.i(j);
            ml50Var.m(timer.a());
            ml50Var.n(url.toString());
            nl50.c(ml50Var);
            throw e;
        }
    }
}
