package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes2.dex */
public final class dw00 implements Interceptor {
    public static final /* synthetic */ iiy[] k = {sre0.f32672a.g(new j0d0(dw00.class, "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;", 0))};
    public static final Map l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6772a;
    public final List b;
    public final gsj c;
    public final yvj d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final ThreadLocal i;
    public final fuj0 j;

    static {
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.f46235a;
        l = xp20.f(new Pair(0, level), new Pair(1, level), new Pair(2, HttpLoggingInterceptor.Level.b), new Pair(3, HttpLoggingInterceptor.Level.c), new Pair(4, HttpLoggingInterceptor.Level.d), new Pair(0, level));
    }

    public dw00(boolean z, gsj gsjVar, yvj yvjVar) {
        gsjVar.getClass();
        yvjVar.getClass();
        List listJ = q3d.j("access_token", "key", "client_secret", "webview_access_token", "webview_refresh_token", "exchange_token", "exchange_tokens", "common_token");
        listJ.getClass();
        this.f6772a = z;
        this.b = listJ;
        this.c = gsjVar;
        this.d = yvjVar;
        this.e = maz.b(new sz2(this, (byte) 16));
        this.f = maz.b(w7f.l);
        this.g = maz.b(w7f.m);
        this.h = maz.b(w7f.n);
        this.i = new ThreadLocal();
        this.j = new fuj0(new cw00(this));
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Map map = l;
        Request request = realInterceptorChain.e;
        RequestBody requestBody = request.d;
        long jA = requestBody != null ? requestBody.a() : 0L;
        if (request.b(sre0.f32672a.b(lv00.class)) != null) {
            hny.b();
            return null;
        }
        vv00 vv00Var = (vv00) this.c.f11832a.getValue();
        fuj0 fuj0Var = this.j;
        iiy[] iiyVarArr = k;
        iiy iiyVar = iiyVarArr[0];
        fuj0Var.getClass();
        iiyVar.getClass();
        Object obj = ((kvb0) fuj0Var.b).get();
        obj.getClass();
        HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) obj;
        HttpLoggingInterceptor.Level level = (jA > 4096 || jA <= 0) ? (HttpLoggingInterceptor.Level) map.get(Integer.valueOf(Math.min(2, (int) vv00Var.f38075a))) : (HttpLoggingInterceptor.Level) map.get(Integer.valueOf(vv00Var.f38075a));
        level.getClass();
        httpLoggingInterceptor.d = level;
        this.i.set(String.valueOf(this.d.f43322a.getAndIncrement()));
        fuj0 fuj0Var2 = this.j;
        iiy iiyVar2 = iiyVarArr[0];
        fuj0Var2.getClass();
        iiyVar2.getClass();
        Object obj2 = ((kvb0) fuj0Var2.b).get();
        obj2.getClass();
        return ((HttpLoggingInterceptor) obj2).a(realInterceptorChain);
    }
}
