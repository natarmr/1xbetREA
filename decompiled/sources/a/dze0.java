package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dze0 extends zje {
    public eze0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eze0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dze0(eze0 eze0Var, zje zjeVar) {
        super(zjeVar);
        this.k = eze0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k0(null, null, 0, false, false, this);
    }
}
