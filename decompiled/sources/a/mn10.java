package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mn10 extends zje {
    public long i;
    public csr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pn10 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.l = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.W(0L, this, null);
    }
}
