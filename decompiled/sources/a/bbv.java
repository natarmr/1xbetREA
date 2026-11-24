package a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bbv {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f2326a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!c) {
                PackageInfo packageInfoB = grv0.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                fbv.b(context);
                if (packageInfoB == null || fbv.f(packageInfoB, false) || !fbv.f(packageInfoB, true)) {
                    b = false;
                } else {
                    b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            c = true;
        }
        return b || !"user".equals(Build.TYPE);
    }
}
