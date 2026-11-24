package a;

import android.os.Build;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f13831a = new WeakHashMap();

    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            WeakHashMap weakHashMap = f13831a;
            Object obj = weakHashMap.get(window);
            if (obj == null) {
                gxv0 gxv0Var = new gxv0(window.getStatusBarColor(), window.getNavigationBarColor(), i >= 29 ? Boolean.valueOf(window.isNavigationBarContrastEnforced()) : null, !((window.getAttributes().flags & Integer.MIN_VALUE) != 0));
                weakHashMap.put(window, gxv0Var);
                obj = gxv0Var;
            }
            gxv0 gxv0Var2 = (gxv0) obj;
            gxv0Var2.e++;
            if (gxv0Var2.d) {
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    public static void b(Window window) {
        Boolean bool;
        window.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            WeakHashMap weakHashMap = f13831a;
            gxv0 gxv0Var = (gxv0) weakHashMap.get(window);
            if (gxv0Var == null) {
                return;
            }
            int i2 = gxv0Var.e - 1;
            gxv0Var.e = i2;
            if (i2 <= 0) {
                window.setStatusBarColor(gxv0Var.f12097a);
                window.setNavigationBarColor(gxv0Var.b);
                if (i >= 29 && (bool = gxv0Var.c) != null) {
                    window.setNavigationBarContrastEnforced(bool.booleanValue());
                }
                if (gxv0Var.d) {
                    window.clearFlags(Integer.MIN_VALUE);
                }
                weakHashMap.remove(window);
            }
        }
    }
}
