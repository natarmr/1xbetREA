package a;

/* JADX INFO: loaded from: classes4.dex */
public final class eau extends zje {
    public gmq i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qv2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eau(qv2 qv2Var, zje zjeVar) {
        super(zjeVar);
        this.m = qv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.t(null, this);
    }
}
