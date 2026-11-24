package a;

/* JADX INFO: loaded from: classes4.dex */
public final class f2g0 extends zje {
    public d2g0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g2g0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2g0(g2g0 g2g0Var, zje zjeVar) {
        super(zjeVar);
        this.k = g2g0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}
