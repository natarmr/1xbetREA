package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzg0 f22239a;
    public final long b;
    public final boolean c;
    public final long d;
    public final String e;
    public final String f;

    public mqs(vzg0 vzg0Var, long j, boolean z, long j2) {
        vzg0Var.getClass();
        this.f22239a = vzg0Var;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = h97.h(j, "game_id_key");
        this.f = h97.h(j, "game_state_key");
    }

    public final void a(long j, boolean z, boolean z2, boolean z3) {
        String str = this.e;
        Long lValueOf = Long.valueOf(j);
        vzg0 vzg0Var = this.f22239a;
        vzg0Var.e(str, lValueOf);
        t3z.f33292a.getClass();
        vzg0Var.e(this.f, rqt.h(z, z2, z3).name());
    }
}
