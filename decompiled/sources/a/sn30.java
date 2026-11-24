package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sn30 extends zje {
    public i050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tn30 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn30(tn30 tn30Var, zje zjeVar) {
        super(zjeVar);
        this.k = tn30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
