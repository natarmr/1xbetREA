package a;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class i05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i05 f13934a = new i05();
    public static final sqp b = sqp.a("appId");
    public static final sqp c = sqp.a("deviceModel");
    public static final sqp d = sqp.a("sessionSdkVersion");
    public static final sqp e = sqp.a("osVersion");
    public static final sqp f = sqp.a("logEnvironment");
    public static final sqp g = sqp.a("androidAppInfo");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        bs3 bs3Var = (bs3) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, bs3Var.f3108a);
        t960Var.a(c, Build.MODEL);
        t960Var.a(d, "3.0.8");
        t960Var.a(e, Build.VERSION.RELEASE);
        t960Var.a(f, hv00.LOG_ENVIRONMENT_PROD);
        t960Var.a(g, bs3Var.b);
    }
}
