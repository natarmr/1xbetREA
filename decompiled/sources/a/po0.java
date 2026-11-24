package a;

/* JADX INFO: loaded from: classes3.dex */
public final class po0 extends zje {
    public yk0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qo0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(qo0 qo0Var, zje zjeVar) {
        super(zjeVar);
        this.k = qo0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.W(null, false, null, false, this);
    }
}
