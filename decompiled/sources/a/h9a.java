package a;

/* JADX INFO: loaded from: classes.dex */
public final class h9a extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i9a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9a(i9a i9aVar, zje zjeVar) {
        super(zjeVar);
        this.k = i9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0, null, 0, 0, 0, this);
    }
}
