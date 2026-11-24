package a;

/* JADX INFO: loaded from: classes.dex */
public final class kqp extends zje {
    public m9s i;
    public r2s0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ywq0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqp(ywq0 ywq0Var, zje zjeVar) {
        super(zjeVar);
        this.m = ywq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.E(null, this);
    }
}
