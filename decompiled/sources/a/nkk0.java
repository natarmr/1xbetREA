package a;

import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nkk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f23685a = new WeakHashMap();

    public static void a(Window window) {
        window.getClass();
        WeakHashMap weakHashMap = f23685a;
        mkk0 mkk0Var = (mkk0) weakHashMap.get(window);
        if (mkk0Var == null) {
            return;
        }
        int i = mkk0Var.b - 1;
        mkk0Var.b = i;
        if (i <= 0) {
            window.setSoftInputMode(mkk0Var.f21948a);
            weakHashMap.remove(window);
        }
    }
}
