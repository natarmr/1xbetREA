package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mnf extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rnf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnf(rnf rnfVar, zje zjeVar) {
        super(zjeVar);
        this.k = rnfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.M(null, this);
    }
}
