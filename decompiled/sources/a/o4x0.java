package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o4x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24661a;
    public final long b;
    public final /* synthetic */ afm0 c;

    public o4x0(afm0 afm0Var, long j, long j2) {
        Objects.requireNonNull(afm0Var);
        this.c = afm0Var;
        this.f24661a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fxw0 fxw0Var = ((kxw0) ((w4x0) this.c.c).b).g;
        kxw0.g(fxw0Var);
        fxw0Var.v1(new fju0(this, (byte) 11));
    }
}
