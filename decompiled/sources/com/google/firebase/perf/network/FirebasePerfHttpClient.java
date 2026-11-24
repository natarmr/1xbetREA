package com.google.firebase.perf.network;

import a.dps0;
import a.mjx;
import a.ml50;
import a.nl50;
import a.twn;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ml50Var.d(httpRequest.getRequestLine().getMethod());
            Long lA = nl50.a(httpRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            ml50Var.m(timer.a());
            ml50Var.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nl50.a(httpResponseExecute);
            if (lA2 != null) {
                ml50Var.l(lA2.longValue());
            }
            String strB = nl50.b(httpResponseExecute);
            if (strB != null) {
                ml50Var.k(strB);
            }
            ml50Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpUriRequest.getURI().toString());
            ml50Var.d(httpUriRequest.getMethod());
            Long lA = nl50.a(httpUriRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            ml50Var.m(timer.a());
            ml50Var.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nl50.a(httpResponseExecute);
            if (lA2 != null) {
                ml50Var.l(lA2.longValue());
            }
            String strB = nl50.b(httpResponseExecute);
            if (strB != null) {
                ml50Var.k(strB);
            }
            ml50Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpUriRequest.getURI().toString());
            ml50Var.d(httpUriRequest.getMethod());
            Long lA = nl50.a(httpUriRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            return (T) httpClient.execute(httpUriRequest, new mjx(responseHandler, timer, ml50Var));
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpUriRequest.getURI().toString());
            ml50Var.d(httpUriRequest.getMethod());
            Long lA = nl50.a(httpUriRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            return (T) httpClient.execute(httpUriRequest, new mjx(responseHandler, timer, ml50Var), httpContext);
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpUriRequest.getURI().toString());
            ml50Var.d(httpUriRequest.getMethod());
            Long lA = nl50.a(httpUriRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            ml50Var.m(timer.a());
            ml50Var.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nl50.a(httpResponseExecute);
            if (lA2 != null) {
                ml50Var.l(lA2.longValue());
            }
            String strB = nl50.b(httpResponseExecute);
            if (strB != null) {
                ml50Var.k(strB);
            }
            ml50Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ml50Var.d(httpRequest.getRequestLine().getMethod());
            Long lA = nl50.a(httpRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            ml50Var.m(timer.a());
            ml50Var.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = nl50.a(httpResponseExecute);
            if (lA2 != null) {
                ml50Var.l(lA2.longValue());
            }
            String strB = nl50.b(httpResponseExecute);
            if (strB != null) {
                ml50Var.k(strB);
            }
            ml50Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ml50Var.d(httpRequest.getRequestLine().getMethod());
            Long lA = nl50.a(httpRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            return (T) httpClient.execute(httpHost, httpRequest, new mjx(responseHandler, timer, ml50Var));
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        ml50 ml50Var = new ml50(dps0.s);
        try {
            ml50Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ml50Var.d(httpRequest.getRequestLine().getMethod());
            Long lA = nl50.a(httpRequest);
            if (lA != null) {
                ml50Var.h(lA.longValue());
            }
            timer.d();
            ml50Var.i(timer.f45671a);
            return (T) httpClient.execute(httpHost, httpRequest, new mjx(responseHandler, timer, ml50Var), httpContext);
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }
}
