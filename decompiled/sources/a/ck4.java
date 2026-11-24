package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ck4 extends zje {
    public elt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hk4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck4(hk4 hk4Var, zje zjeVar) {
        super(zjeVar);
        this.k = hk4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(this);
    }
}
