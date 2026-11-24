package a;

/* JADX INFO: loaded from: classes5.dex */
public final class pq50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ sq50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq50(sq50 sq50Var, zje zjeVar) {
        super(zjeVar);
        this.j = sq50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.O(this);
    }
}
