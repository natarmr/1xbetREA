package a;

/* JADX INFO: loaded from: classes.dex */
public final class kfn0 {
    public static final kfn0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18204a;
    public long b;

    static {
        kfn0 kfn0Var = new kfn0();
        kfn0Var.b = -9223372036854775807L;
        kfn0Var.f18204a = false;
        c = kfn0Var;
    }

    public long a() {
        if (this.f18204a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
