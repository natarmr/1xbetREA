package a;

import android.os.Build;
import java.util.Arrays;
import java.util.Random;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class xf3 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmf0 f40772a;
    public final knf0 b;
    public final tgk c;
    public final us3 d;
    public final kuy e;

    public xf3(jmf0 jmf0Var, knf0 knf0Var, tgk tgkVar, us3 us3Var, kuy kuyVar) {
        jmf0Var.getClass();
        knf0Var.getClass();
        tgkVar.getClass();
        us3Var.getClass();
        kuyVar.getClass();
        this.f40772a = jmf0Var;
        this.b = knf0Var;
        this.c = tgkVar;
        this.d = us3Var;
        this.e = kuyVar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Headers.Builder builder = new Headers.Builder();
        builder.b(realInterceptorChain.e.c);
        builder.d("X-DeviceManufacturer");
        builder.d("X-DeviceModel");
        builder.e("X-Language", this.e.a());
        this.b.getClass();
        builder.e("X-Whence", String.valueOf(22));
        this.b.getClass();
        builder.e("X-Referral", String.valueOf(1));
        this.b.getClass();
        builder.e("X-Group", String.valueOf(1357));
        this.d.getClass();
        builder.e("X-BundleId", "org.xbet.client1");
        builder.e("AppGuid", this.b.a());
        builder.e("X-FCountry", String.valueOf(this.b.b()));
        builder.e("Content-Type", "application/json; charset=utf-8");
        builder.e("User-Agent", (String) this.d.c.getValue());
        this.d.getClass();
        builder.e("Version", "1xbet-prod-v260.1.0");
        this.c.getClass();
        String str = Build.MANUFACTURER;
        str.getClass();
        builder.c("X-DeviceManufacturer", str);
        this.c.getClass();
        builder.c("X-DeviceModel", tgk.c());
        String strA = this.b.a();
        this.b.getClass();
        String str2 = String.format("%s_%s_%s_%s_%s_%s", Arrays.copyOf(new Object[]{1, strA, Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.f40772a.f16762a), Integer.valueOf(this.d.c().f11610a), Integer.valueOf(new Random().nextInt())}, 6));
        if (str2.length() > 0) {
            builder.e("X-Request-Guid", str2);
        }
        builder.e("connection", "keep-alive");
        Request.Builder builderA = realInterceptorChain.e.a();
        builderA.c = _HeadersCommonKt.d(_HeadersCommonKt.b(builder));
        this.f40772a.f16762a++;
        return realInterceptorChain.b(new Request(builderA));
    }
}
