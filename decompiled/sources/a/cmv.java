package a;

/* JADX INFO: loaded from: classes6.dex */
public final class cmv implements vmb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u12 f4627a;
    public final ye60 b;
    public long c = 0;

    public cmv(u12 u12Var, ye60 ye60Var) {
        this.f4627a = u12Var;
        this.b = ye60Var;
    }

    @Override // a.vmb0
    public final long a(mkx mkxVar, long j, k6z k6zVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return ikx.d(ikx.d(mkxVar.b(), x1x.J(jA)), this.f4627a.a(j2, 0L, k6zVar));
    }
}
