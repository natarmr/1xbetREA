package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class wwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f39879a;
    public final String b;
    public final n0o0 c;

    public wwb0(us00 us00Var, String str) {
        str.getClass();
        this.f39879a = us00Var;
        this.b = str.concat("SECURE_SHARED_PREFERENCES_TEMPORARY_CREDENTIALS");
        this.c = maz.b(new ssa0(this, (byte) 13));
    }

    public final String a(String str) {
        String string = ((SharedPreferences) this.c.getValue()).getString(str, "");
        return string == null ? "" : string;
    }

    public final void b(String str, String str2) {
        str2.getClass();
        ((SharedPreferences) this.c.getValue()).edit().putString(str, str2).apply();
    }
}
