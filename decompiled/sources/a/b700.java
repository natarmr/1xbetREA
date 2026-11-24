package a;

/* JADX INFO: loaded from: classes3.dex */
public final class b700 extends zje {
    public j8p i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wdu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b700(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.l = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, false, 0, 0L, 0L, null, false, null, this);
    }
}
