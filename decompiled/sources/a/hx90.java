package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hx90 extends zje {
    public xfq0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pzu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx90(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.k = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i0(null, this);
    }
}
