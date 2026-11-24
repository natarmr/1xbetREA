package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ng80 extends yjj implements mg80 {
    public final swq f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ng80(ym40 ym40Var, swq swqVar) {
        ym40Var.getClass();
        swqVar.getClass();
        f93 f93Var = ujn.c;
        twq twqVar = swqVar.f32934a;
        super(ym40Var, f93Var, twqVar.c() ? twq.e : twqVar.g(), gmk0.x0);
        this.f = swqVar;
        this.g = "package " + swqVar + " of " + ym40Var;
    }

    @Override // a.yjj, a.xjj
    public gmk0 b() {
        return gmk0.x0;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.g(this, obj);
    }

    @Override // a.yjj, a.vjj
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public final ym40 j() {
        vjj vjjVarJ = super.j();
        vjjVarJ.getClass();
        return (ym40) vjjVarJ;
    }

    @Override // a.wjj, a.p4
    public String toString() {
        return this.g;
    }
}
