package a;

/* JADX INFO: loaded from: classes.dex */
public final class rmq0 implements fag0 {
    public final long b;
    public final fag0 c;

    public rmq0(long j, fag0 fag0Var) {
        z1x.t("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = fag0Var;
    }

    @Override // a.fag0
    public final long a() {
        return this.b;
    }

    @Override // a.fag0
    public final eag0 b(f2a f2aVar) {
        eag0 eag0VarB = this.c.b(f2aVar);
        long j = this.b;
        return (j <= 0 || f2aVar.b < j - ((long) eag0VarB.f7464a)) ? eag0VarB : eag0.d;
    }
}
