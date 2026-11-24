package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class krc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1d f18757a;

    public String a() {
        xwb0 xwb0Var = (xwb0) this.f18757a.b;
        xwb0Var.getClass();
        String string = ((SharedPreferences) xwb0Var.c.getValue()).getString("fingerprint_pass", "");
        return string == null ? "" : string;
    }

    public void b() {
        xwb0 xwb0Var = (xwb0) this.f18757a.b;
        xwb0Var.a("fingerprint_auth_enabled", false);
        xwb0Var.a("fingerprint_enabled", false);
        ((SharedPreferences) xwb0Var.c.getValue()).edit().putString("fingerprint_pass", "").apply();
        xwb0Var.a("biometrics_passed", false);
    }
}
