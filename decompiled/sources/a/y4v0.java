package a;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y4v0 extends sa3 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4v0(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // a.ta3
    public final boolean b() {
        PackageInfo packageInfoA;
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                WeakHashMap weakHashMap = v4v0.f36801a;
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        packageInfoA = v4v0.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfoA = null;
                    }
                    break;
                } else {
                    packageInfoA = WebView.getCurrentWebViewPackage();
                }
                if (packageInfoA == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? ia3.m(packageInfoA) : (long) packageInfoA.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !z4v0.a("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = v4v0.f36801a;
                if (z4v0.f43791a.b()) {
                    return b5v0.f2025a.getStatics().isMultiProcessEnabled();
                }
                v4i0.p("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (z4v0.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
