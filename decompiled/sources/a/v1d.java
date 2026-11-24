package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v1d extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w1d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1d(w1d w1dVar, zje zjeVar) {
        super(zjeVar);
        this.l = w1dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(0L, 0L, this);
    }
}
