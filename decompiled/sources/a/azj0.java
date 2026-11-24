package a;

import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class azj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eii0 f1720a;
    public final vby b;

    public azj0(eii0 eii0Var, vby vbyVar) {
        this.f1720a = eii0Var;
        this.b = vbyVar;
    }

    public final OkHttpClient a(boolean z, final long j) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (j > 0) {
            builder.d.add(new Interceptor() { // from class: a.zyj0
                @Override // okhttp3.Interceptor
                public final Response a(RealInterceptorChain realInterceptorChain) {
                    Request.Builder builderA = realInterceptorChain.e.a();
                    builderA.a("Range", axq.h(j, "bytes=", "-"));
                    return realInterceptorChain.b(new Request(builderA));
                }
            });
        }
        eii0 eii0Var = this.f1720a;
        eii0.b(builder, eii0Var.f7862a.H0());
        eii0Var.a(builder);
        builder.a(z ? 10L : 60L);
        builder.c(z ? 10L : 90L);
        builder.b(z ? 10L : 120L);
        return new OkHttpClient(builder);
    }

    public final Object b(sgy sgyVar, long j) {
        Object objC;
        sgyVar.getClass();
        synchronized (this) {
            objC = c(sgyVar, a(false, j), "https://1xbet.com/");
        }
        return objC;
    }

    public final Object c(sgy sgyVar, OkHttpClient okHttpClient, String str) {
        x9g0 x9g0Var = new x9g0();
        Regex regex = MediaType.e;
        x9g0Var.a(kcx.E(this.b, MediaType.Companion.a("application/json")));
        x9g0Var.f40508a = okHttpClient;
        x9g0Var.b(str);
        Object objB = x9g0Var.c().b(azw.G(sgyVar));
        objB.getClass();
        return objB;
    }

    public final Object d(sgy sgyVar) {
        Object objC;
        sgyVar.getClass();
        synchronized (this) {
            objC = c(sgyVar, a(false, 0L), "https://1xbet.com/");
        }
        return objC;
    }

    public final Object e(sgy sgyVar, String str) {
        Object objC;
        sgyVar.getClass();
        synchronized (this) {
            objC = c(sgyVar, a(false, 0L), str);
        }
        return objC;
    }
}
