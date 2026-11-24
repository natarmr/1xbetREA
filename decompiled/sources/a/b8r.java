package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b8r implements rkn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2170a;
    public final String b;
    public final y78 c;
    public final boolean d;
    public final boolean e;
    public final n0o0 f;
    public boolean g;

    public b8r(Context context, String str, y78 y78Var, boolean z, boolean z2) {
        y78Var.getClass();
        this.f2170a = context;
        this.b = str;
        this.c = y78Var;
        this.d = z;
        this.e = z2;
        this.f = maz.b(new yip(this, (byte) 14));
    }

    @Override // a.rkn0
    public final w7r G0() {
        return ((a8r) this.f.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n0o0 n0o0Var = this.f;
        if (n0o0Var.a()) {
            ((a8r) n0o0Var.getValue()).close();
        }
    }

    @Override // a.rkn0
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // a.rkn0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        n0o0 n0o0Var = this.f;
        if (n0o0Var.a()) {
            ((a8r) n0o0Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
