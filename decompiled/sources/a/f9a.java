package a;

/* JADX INFO: loaded from: classes.dex */
public final class f9a extends zje {
    public u2g0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g9a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.k = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(0L, null, this);
    }
}
