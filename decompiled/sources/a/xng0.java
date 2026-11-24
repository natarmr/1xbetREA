package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xng0 extends zje {
    public aog0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ aog0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng0(aog0 aog0Var, zje zjeVar) {
        super(zjeVar);
        this.k = aog0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
