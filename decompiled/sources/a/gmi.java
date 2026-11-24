package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gmi implements h760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f11544a;
    public final q7d0 b;
    public final us3 c;
    public final kl5 d;

    public gmi(us00 us00Var, q7d0 q7d0Var, us3 us3Var, kl5 kl5Var) {
        this.f11544a = us00Var;
        this.b = q7d0Var;
        this.c = us3Var;
        this.d = kl5Var;
    }

    @Override // a.h760
    public final t760 a() {
        q7d0 q7d0Var = this.b;
        us3 us3Var = this.c;
        return new u760(this.f11544a, new x4u(new jm3(q7d0Var, us3Var, (byte) 1)), new e1u(new jm3(q7d0Var, us3Var, (byte) 1), (byte) 28), this.d);
    }
}
