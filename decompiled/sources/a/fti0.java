package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fti0 extends zje {
    public long[] i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nw20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fti0(nw20 nw20Var, zje zjeVar) {
        super(zjeVar);
        this.k = nw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(0L, null, null, this);
    }
}
