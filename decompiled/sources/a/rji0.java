package a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class rji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rji0 f30596a = new rji0();
    public static final g2v b;

    static {
        hcy hcyVar = new hcy();
        hcyVar.a(qji0.class, l05.f19181a);
        hcyVar.a(xji0.class, m05.f20937a);
        hcyVar.a(uaj.class, j05.f15665a);
        hcyVar.a(bs3.class, i05.f13934a);
        hcyVar.a(gw2.class, h05.f12216a);
        hcyVar.a(ryb0.class, k05.f17447a);
        hcyVar.d = true;
        b = new g2v(hcyVar);
    }

    public static bs3 a(nfq nfqVar) throws PackageManager.NameNotFoundException {
        nfqVar.a();
        Context context = nfqVar.f23449a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        nfqVar.a();
        String str = nfqVar.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        hv00 hv00Var = hv00.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        nfqVar.a();
        ryb0 ryb0VarJ = m7x.J(context);
        nfqVar.a();
        return new bs3(str, new gw2(packageName, str2, strValueOf, ryb0VarJ, m7x.F(context)));
    }
}
