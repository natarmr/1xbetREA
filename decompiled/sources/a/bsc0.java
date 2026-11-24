package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bsc0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pzu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc0(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.k = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(0, 0L, this, false);
    }
}
