package a;

/* JADX INFO: loaded from: classes.dex */
public final class y5u0 implements o5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42065a;
    public final int b;
    public final q5u0 c;

    public y5u0(int i, int i2, ghn ghnVar) {
        this.f42065a = i;
        this.b = i2;
        this.c = new q5u0(new nlq(i, i2, ghnVar));
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.c.c(j, t73Var, t73Var2, t73Var3);
    }

    @Override // a.o5u0
    public final int e() {
        return this.b;
    }

    @Override // a.o5u0
    public final int f() {
        return this.f42065a;
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.c.h(j, t73Var, t73Var2, t73Var3);
    }
}
