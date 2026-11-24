package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cq extends zje {
    public zy5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(fq fqVar, zje zjeVar) {
        super(zjeVar);
        this.k = fqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
