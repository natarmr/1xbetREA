package a;

/* JADX INFO: loaded from: classes.dex */
public final class j5m0 extends mwq {
    public final /* synthetic */ fvh0 b;
    public final /* synthetic */ hac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5m0(hac hacVar, fvh0 fvh0Var, fvh0 fvh0Var2) {
        super(fvh0Var);
        this.c = hacVar;
        this.b = fvh0Var2;
    }

    @Override // a.mwq, a.fvh0
    public final evh0 b(long j) {
        evh0 evh0VarB = this.b.b(j);
        hvh0 hvh0Var = evh0VarB.f8467a;
        long j2 = hvh0Var.f13726a;
        long j3 = hvh0Var.b;
        long j4 = this.c.b;
        hvh0 hvh0Var2 = new hvh0(j2, j3 + j4);
        hvh0 hvh0Var3 = evh0VarB.b;
        return new evh0(hvh0Var2, new hvh0(hvh0Var3.f13726a, hvh0Var3.b + j4));
    }
}
