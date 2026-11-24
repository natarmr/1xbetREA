package a;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rvw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31191a;
    public final int b;
    public boolean c;
    public long d;
    public final /* synthetic */ wvw0 e;

    public rvw0(wvw0 wvw0Var, String str, long j) {
        Objects.requireNonNull(wvw0Var);
        this.e = wvw0Var;
        s0x.E(str);
        this.f31191a = str;
        this.b = (int) j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.q1().getLong(this.f31191a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.q1().edit();
        editorEdit.putLong(this.f31191a, j);
        editorEdit.apply();
        this.d = j;
    }
}
