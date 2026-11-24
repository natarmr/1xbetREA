package a;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class e6 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7257a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public e6(String str, String str2, String str3, Date date, long j, long j2) {
        this.f7257a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public final up2 a() {
        up2 up2Var = new up2();
        up2Var.f36041a = "frc";
        up2Var.m = this.d.getTime();
        up2Var.b = this.f7257a;
        up2Var.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        up2Var.d = str;
        up2Var.e = this.e;
        up2Var.j = this.f;
        return up2Var;
    }
}
