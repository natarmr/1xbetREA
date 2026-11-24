package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class mvw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22477a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ wvw0 e;

    public mvw0(wvw0 wvw0Var, String str, boolean z) {
        this.e = wvw0Var;
        s0x.E(str);
        this.f22477a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.q1().getBoolean(this.f22477a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.q1().edit();
        editorEdit.putBoolean(this.f22477a, z);
        editorEdit.apply();
        this.d = z;
    }
}
