package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class xwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f41603a;
    public final String b;
    public final n0o0 c;

    public xwb0(us00 us00Var, String str) {
        str.getClass();
        this.f41603a = us00Var;
        this.b = str.concat("SECURE_SHARED_PREFERENCES_UNCLEARABLE");
        this.c = maz.b(new ssa0(this, (byte) 14));
    }

    public final void a(String str, boolean z) {
        ((SharedPreferences) this.c.getValue()).edit().putBoolean(str, z).apply();
    }
}
