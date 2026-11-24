package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ghf0 extends zje {
    public qu6 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qv2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghf0(qv2 qv2Var, zje zjeVar) {
        super(zjeVar);
        this.k = qv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
