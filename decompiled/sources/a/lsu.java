package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lsu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ msu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsu(msu msuVar, zje zjeVar) {
        super(zjeVar);
        this.j = msuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
