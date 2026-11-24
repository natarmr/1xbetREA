package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
public final class vwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38143a;
    public final n0o0 b;

    public vwb0(us00 us00Var, String str) {
        str.getClass();
        this.f38143a = str.concat("SECURE_SHARED_PREFERENCES");
        this.b = maz.b(new gvb0(us00Var, this, (byte) 1));
    }

    public static long a(vwb0 vwb0Var, String str) {
        vwb0Var.getClass();
        return vwb0Var.b().getLong(str, 0L);
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.b.getValue();
    }

    public final String c(String str, String str2) {
        String string = b().getString(str, str2);
        return string == null ? "" : string;
    }

    public final void e(String str, boolean z) {
        b().edit().putBoolean(str, z).apply();
    }

    public final void f(int i, String str) {
        b().edit().putInt(str, i).apply();
    }

    public final void g(String str, long j) {
        str.getClass();
        b().edit().putLong(str, j).apply();
    }

    public final void h(String str, String str2) {
        str2.getClass();
        b().edit().putString(str, str2).apply();
    }

    public final void i(String str) {
        b().edit().remove(str).apply();
    }
}
