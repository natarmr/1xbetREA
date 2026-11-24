package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e7d extends zje {
    public g7d i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g7d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7d(g7d g7dVar, zje zjeVar) {
        super(zjeVar);
        this.k = g7dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
