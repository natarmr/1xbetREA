package a;

import android.os.Build;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class h05 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h05 f12216a = new h05();
    public static final sqp b = sqp.a(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME);
    public static final sqp c = sqp.a("versionName");
    public static final sqp d = sqp.a("appBuildVersion");
    public static final sqp e = sqp.a("deviceManufacturer");
    public static final sqp f = sqp.a("currentProcessDetails");
    public static final sqp g = sqp.a("appProcessDetails");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        gw2 gw2Var = (gw2) obj;
        t960 t960Var = (t960) obj2;
        t960Var.a(b, gw2Var.f12004a);
        t960Var.a(c, gw2Var.b);
        t960Var.a(d, gw2Var.c);
        t960Var.a(e, Build.MANUFACTURER);
        t960Var.a(f, gw2Var.d);
        t960Var.a(g, gw2Var.e);
    }
}
