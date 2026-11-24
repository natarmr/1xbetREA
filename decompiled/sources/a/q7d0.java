package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
public final class q7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f28244a;
    public final String b;
    public final n0o0 c;

    public q7d0(us00 us00Var, String str) {
        str.getClass();
        this.f28244a = us00Var;
        this.b = str.concat("UNSECURE_SHARED_PREFERENCES");
        this.c = maz.b(new p7d0(this, (byte) 0));
    }

    public static String c(q7d0 q7d0Var, String str) {
        q7d0Var.getClass();
        return q7d0Var.a().getString(str, "");
    }

    public final SharedPreferences a() {
        Object value = this.c.getValue();
        value.getClass();
        return (SharedPreferences) value;
    }

    public final String b(String str, String str2) {
        str2.getClass();
        return a().getString(str, str2);
    }

    public final void d(String str, boolean z) {
        a().edit().putBoolean(str, z).apply();
    }

    public final void e(int i, String str) {
        a().edit().putInt(str, i).apply();
    }

    public final void f(String str, long j) {
        a().edit().putLong(str, j).apply();
    }

    public final void g(String str, String str2) {
        str2.getClass();
        a().edit().putString(str, str2).apply();
    }

    public final void h(String str) {
        a().edit().remove(str).apply();
    }
}
