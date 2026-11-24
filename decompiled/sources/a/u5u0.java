package a;

/* JADX INFO: loaded from: classes.dex */
public final class u5u0 implements p5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35113a;
    public final o5u0 b;
    public final kkf0 c;
    public final long d;
    public final long e;

    public u5u0(int i, o5u0 o5u0Var, kkf0 kkf0Var, long j) {
        this.f35113a = i;
        this.b = o5u0Var;
        this.c = kkf0Var;
        if (i < 1) {
            jf4.o("Iterations count can't be less than 1");
            throw null;
        }
        this.d = ((long) (o5u0Var.f() + o5u0Var.e())) * 1000000;
        this.e = j * 1000000;
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return (((long) this.f35113a) * this.d) - this.e;
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.b.c(d(j), t73Var, t73Var2, i(j, t73Var, t73Var3, t73Var2));
    }

    public final long d(long j) {
        long j2 = this.e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.d;
        long jMin = Math.min(j3 / j4, ((long) this.f35113a) - 1);
        return (this.c == kkf0.f18436a || jMin % 2 == 0) ? j3 - (jMin * j4) : ((jMin + 1) * j4) - j3;
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.b.h(d(j), t73Var, t73Var2, i(j, t73Var, t73Var3, t73Var2));
    }

    public final t73 i(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? h(j4 - j2, t73Var, t73Var2, t73Var3) : t73Var2;
    }
}
