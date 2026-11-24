package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class guc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw20 f11921a;
    public final OkHttpClient b;
    public final String c;
    public final String d;
    public final String e;
    public RealWebSocket f;
    public final AtomicBoolean g;

    public guc(jw20 jw20Var, OkHttpClient okHttpClient, String str, String str2, String str3, String str4) {
        okHttpClient.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f11921a = jw20Var;
        this.b = okHttpClient;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.g = new AtomicBoolean(false);
    }

    public final void a() {
        System.currentTimeMillis();
        String strQ = w6x.q(this.d, Separators.SP, this.c);
        Request.Builder builder = new Request.Builder();
        builder.c.a("Authorization", strQ);
        builder.c.a("User-Agent", String.format(Locale.ENGLISH, "Android:%s %d@%s@%s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.MODEL, "1"}, 4)));
        builder.d(this.e);
        this.f = this.b.c(new Request(builder), new fuc(this));
    }
}
