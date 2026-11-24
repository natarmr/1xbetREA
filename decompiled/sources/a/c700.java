package a;

/* JADX INFO: loaded from: classes3.dex */
public final class c700 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wdu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c700(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.k = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, 0, null, null, false, 0L, null, 0L, null, this);
    }
}
