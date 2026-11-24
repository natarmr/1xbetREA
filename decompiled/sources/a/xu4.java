package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes.dex */
public final class xu4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xu4 f41492a = new xu4();
    public static final sqp b = sqp.a("sdkVersion");
    public static final sqp c = sqp.a("model");
    public static final sqp d = sqp.a("hardware");
    public static final sqp e = sqp.a("device");
    public static final sqp f = sqp.a("product");
    public static final sqp g = sqp.a("osBuild");
    public static final sqp h = sqp.a("manufacturer");
    public static final sqp i = sqp.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
    public static final sqp j = sqp.a("locale");
    public static final sqp k = sqp.a("country");
    public static final sqp l = sqp.a("mccMnc");
    public static final sqp m = sqp.a("applicationBuild");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        yw2 yw2Var = (yw2) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, ((k15) yw2Var).f17502a);
        k15 k15Var = (k15) yw2Var;
        t960Var.a(c, k15Var.b);
        t960Var.a(d, k15Var.c);
        t960Var.a(e, k15Var.d);
        t960Var.a(f, k15Var.e);
        t960Var.a(g, k15Var.f);
        t960Var.a(h, k15Var.g);
        t960Var.a(i, k15Var.h);
        t960Var.a(j, k15Var.i);
        t960Var.a(k, k15Var.j);
        t960Var.a(l, k15Var.k);
        t960Var.a(m, k15Var.l);
    }
}
