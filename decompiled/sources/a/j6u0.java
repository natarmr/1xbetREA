package a;

/* JADX INFO: loaded from: classes.dex */
public final class j6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r34 f16007a = new r34((byte) 3);

    public final long a(long j) {
        if (g6u0.b(j) <= 0.0f || g6u0.c(j) <= 0.0f) {
            xcx.b("maximumVelocity should be a positive value. You specified=".concat(g6u0.g(j)));
        }
        r34 r34Var = this.f16007a;
        return wpm0.g(((i6u0) r34Var.b).c(g6u0.b(j)), ((i6u0) r34Var.c).c(g6u0.c(j)));
    }
}
