package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class uwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f36384a;
    public final String b;
    public final n0o0 c;

    public uwb0(us00 us00Var, String str) {
        str.getClass();
        this.f36384a = us00Var;
        this.b = str.concat("SECURE_SHARED_PREFERENCES_PASS");
        this.c = maz.b(new ssa0(this, (byte) 12));
    }

    public static String b(uwb0 uwb0Var, String str) {
        uwb0Var.getClass();
        String string = uwb0Var.a().getString(str, "");
        return string == null ? "" : string;
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.c.getValue();
    }

    public final void c(String str, String str2) {
        str2.getClass();
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.getClass();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
