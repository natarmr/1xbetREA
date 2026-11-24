package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d700 extends zje {
    public j8p i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wdu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d700(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.k = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, false, 0, 0L, null, false, null, this);
    }
}
