package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pj50 extends zje {
    public oj50 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qj50 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj50(qj50 qj50Var, yje yjeVar) {
        super(yjeVar);
        this.k = qj50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, 0, this);
    }
}
