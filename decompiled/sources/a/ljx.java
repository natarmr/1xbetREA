package a;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class ljx {
    public static final f03 f = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f20173a;
    public final ml50 b;
    public long c = -1;
    public long d = -1;
    public final Timer e;

    public ljx(HttpURLConnection httpURLConnection, Timer timer, ml50 ml50Var) {
        this.f20173a = httpURLConnection;
        this.b = ml50Var;
        this.e = timer;
        ml50Var.n(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        ml50 ml50Var = this.b;
        Timer timer = this.e;
        if (j == -1) {
            timer.d();
            long j2 = timer.f45671a;
            this.c = j2;
            ml50Var.i(j2);
        }
        try {
            this.f20173a.connect();
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f20173a;
        int responseCode = httpURLConnection.getResponseCode();
        ml50 ml50Var = this.b;
        ml50Var.g(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                ml50Var.k(httpURLConnection.getContentType());
                return new hjx((InputStream) content, ml50Var, timer);
            }
            ml50Var.k(httpURLConnection.getContentType());
            ml50Var.l(httpURLConnection.getContentLength());
            ml50Var.m(timer.a());
            ml50Var.b();
            return content;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f20173a;
        int responseCode = httpURLConnection.getResponseCode();
        ml50 ml50Var = this.b;
        ml50Var.g(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                ml50Var.k(httpURLConnection.getContentType());
                return new hjx((InputStream) content, ml50Var, timer);
            }
            ml50Var.k(httpURLConnection.getContentType());
            ml50Var.l(httpURLConnection.getContentLength());
            ml50Var.m(timer.a());
            ml50Var.b();
            return content;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f20173a;
        ml50 ml50Var = this.b;
        i();
        try {
            ml50Var.g(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new hjx(errorStream, ml50Var, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f20173a;
        int responseCode = httpURLConnection.getResponseCode();
        ml50 ml50Var = this.b;
        ml50Var.g(responseCode);
        ml50Var.k(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new hjx(inputStream, ml50Var, timer) : inputStream;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f20173a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        ml50 ml50Var = this.b;
        try {
            OutputStream outputStream = this.f20173a.getOutputStream();
            return outputStream != null ? new ijx(outputStream, ml50Var, timer) : outputStream;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        Timer timer = this.e;
        ml50 ml50Var = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            jl50 jl50Var = ml50Var.d;
            jl50Var.i();
            ((ll50) jl50Var.b).W(jA);
        }
        try {
            int responseCode = this.f20173a.getResponseCode();
            ml50Var.g(responseCode);
            return responseCode;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f20173a;
        i();
        long j = this.d;
        Timer timer = this.e;
        ml50 ml50Var = this.b;
        if (j == -1) {
            long jA = timer.a();
            this.d = jA;
            jl50 jl50Var = ml50Var.d;
            jl50Var.i();
            ((ll50) jl50Var.b).W(jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            ml50Var.g(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            twn.y(timer, ml50Var, ml50Var);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f20173a.hashCode();
    }

    public final void i() {
        long j = this.c;
        ml50 ml50Var = this.b;
        if (j == -1) {
            Timer timer = this.e;
            timer.d();
            long j2 = timer.f45671a;
            this.c = j2;
            ml50Var.i(j2);
        }
        HttpURLConnection httpURLConnection = this.f20173a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            ml50Var.d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            ml50Var.d("POST");
        } else {
            ml50Var.d("GET");
        }
    }

    public final String toString() {
        return this.f20173a.toString();
    }
}
