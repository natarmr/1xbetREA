package a;

import android.gov.nist.core.Separators;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
public final class jf60 implements to9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmf0 f16410a;
    public final Object b;
    public final Object[] c;
    public final Call.Factory d;
    public final vke e;
    public volatile boolean f;
    public Call g;
    public Throwable h;
    public boolean i;

    public jf60(pmf0 pmf0Var, Object obj, Object[] objArr, Call.Factory factory, vke vkeVar) {
        this.f16410a = pmf0Var;
        this.b = obj;
        this.c = objArr;
        this.d = factory;
        this.e = vkeVar;
    }

    public final Call a() {
        HttpUrl.Builder builder;
        HttpUrl httpUrlA;
        pmf0 pmf0Var = this.f16410a;
        q8x[] q8xVarArr = pmf0Var.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != q8xVarArr.length) {
            jf4.o(rz4.j(q8xVarArr.length, Separators.RPAREN, b1j.m(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        emf0 emf0Var = new emf0(pmf0Var.d, pmf0Var.c, pmf0Var.e, pmf0Var.f, pmf0Var.g, pmf0Var.h, pmf0Var.i, pmf0Var.j);
        if (pmf0Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            q8xVarArr[i].y(emf0Var, objArr[i]);
        }
        HttpUrl.Builder builder2 = emf0Var.d;
        if (builder2 != null) {
            httpUrlA = builder2.a();
        } else {
            String str = emf0Var.c;
            HttpUrl httpUrl = emf0Var.b;
            httpUrl.getClass();
            str.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.b(httpUrl, str);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            httpUrlA = builder != null ? builder.a() : null;
            if (httpUrlA == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                String str2 = emf0Var.c;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        RequestBody dmf0Var = emf0Var.k;
        if (dmf0Var == null) {
            FormBody.Builder builder3 = emf0Var.j;
            if (builder3 != null) {
                dmf0Var = new FormBody(builder3.f46095a, builder3.b);
            } else {
                MultipartBody.Builder builder4 = emf0Var.i;
                if (builder4 != null) {
                    ArrayList arrayList2 = builder4.c;
                    if (arrayList2.isEmpty()) {
                        jf4.n("Multipart body must have at least one part.");
                        return null;
                    }
                    dmf0Var = new MultipartBody(builder4.f46103a, builder4.b, _UtilJvmKt.j(arrayList2));
                } else if (emf0Var.h) {
                    int i2 = RequestBody.f46110a;
                    _UtilCommonKt.a(0L, 0L, 0L);
                    dmf0Var = new RequestBody$Companion$toRequestBody$3(null, 0, new byte[0]);
                }
            }
        }
        MediaType mediaType = emf0Var.g;
        Headers.Builder builder5 = emf0Var.f;
        if (mediaType != null) {
            if (dmf0Var != null) {
                dmf0Var = new dmf0(dmf0Var, mediaType);
            } else {
                builder5.a("Content-Type", mediaType.f46102a);
            }
        }
        Request.Builder builder6 = emf0Var.e;
        builder6.f46109a = httpUrlA;
        builder5.getClass();
        builder6.c = _HeadersCommonKt.d(_HeadersCommonKt.b(builder5));
        builder6.b(emf0Var.f8044a, dmf0Var);
        builder6.c(qox.class, new qox(pmf0Var.f27231a, this.b, pmf0Var.b, arrayList));
        return this.d.a(new Request(builder6));
    }

    public final Call b() throws IOException {
        Call call = this.g;
        if (call != null) {
            return call;
        }
        Throwable th = this.h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callA = a();
            this.g = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e) {
            ay3.c0(e);
            this.h = e;
            throw e;
        }
    }

    public final jtf0 c(Response response) throws IOException {
        ResponseBody responseBody = response.g;
        Response.Builder builderC = response.c();
        builderC.g = new if60(responseBody.getB(), responseBody.getC());
        Response responseA = builderC.a();
        boolean z = responseA.q;
        int i = responseA.d;
        if (i < 200 || i >= 300) {
            try {
                f99 f99Var = new f99();
                responseBody.getD().u(f99Var);
                MediaType b = responseBody.getB();
                long c = responseBody.getC();
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
                return jtf0.a(new ResponseBody$Companion$asResponseBody$1(b, c, f99Var), responseA);
            } finally {
                responseBody.close();
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            if (z) {
                return new jtf0(responseA, null);
            }
            jf4.o("rawResponse must be successful response");
            return null;
        }
        hf60 hf60Var = new hf60(responseBody);
        try {
            Object objO = this.e.o(hf60Var);
            if (z) {
                return new jtf0(responseA, objO);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = hf60Var.d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // a.to9
    public final void cancel() {
        Call call;
        this.f = true;
        synchronized (this) {
            call = this.g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // a.to9
    public final to9 clone() {
        return new jf60(this.f16410a, this.b, this.c, this.d, this.e);
    }

    @Override // a.to9
    public final synchronized Request l() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().getB();
    }

    @Override // a.to9
    public final boolean q() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.g;
                if (call == null || !call.getR()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // a.to9
    public final void y(pp9 pp9Var) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
                call = this.g;
                th = this.h;
                if (call == null && th == null) {
                    try {
                        Call callA = a();
                        this.g = callA;
                        call = callA;
                    } catch (Throwable th2) {
                        th = th2;
                        ay3.c0(th);
                        this.h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            pp9Var.m(this, th);
            return;
        }
        if (this.f) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new dq00(this, pp9Var));
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m3clone() {
        return new jf60(this.f16410a, this.b, this.c, this.d, this.e);
    }
}
