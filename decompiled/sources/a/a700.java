package a;

/* JADX INFO: loaded from: classes3.dex */
public final class a700 extends zje {
    public boolean i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wdu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a700(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.l = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(false, 0L, 0L, false, null, 0L, this);
    }
}
