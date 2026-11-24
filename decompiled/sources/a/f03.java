package a;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f03 {
    public static volatile f03 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8700a;

    public static f03 d() {
        if (b == null) {
            synchronized (f03.class) {
                if (b == null) {
                    f03 f03Var = new f03();
                    f03Var.f8700a = false;
                    synchronized (rv00.class) {
                        if (rv00.f31149a == null) {
                            rv00.f31149a = new rv00();
                        }
                    }
                    b = f03Var;
                }
            }
        }
        return b;
    }

    public final void a(String str) {
        if (this.f8700a) {
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f8700a) {
            Log.d("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f8700a) {
            Log.e("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f8700a) {
            Log.i("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void f(String str) {
        if (this.f8700a) {
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f8700a) {
            Log.w("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
