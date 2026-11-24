package a;

/* JADX INFO: loaded from: classes.dex */
public final class ova0 extends zje {
    public Object i;
    public f2e j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xva0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ova0(xva0 xva0Var, zje zjeVar) {
        super(zjeVar);
        this.m = xva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, this);
    }
}
