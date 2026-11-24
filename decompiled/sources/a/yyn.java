package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yyn extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c3d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyn(c3d c3dVar, zje zjeVar) {
        super(zjeVar);
        this.k = c3dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0L, 0L, this);
    }
}
