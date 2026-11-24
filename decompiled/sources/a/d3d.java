package a;

/* JADX INFO: loaded from: classes5.dex */
public final class d3d extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e3d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3d(e3d e3dVar, zje zjeVar) {
        super(zjeVar);
        this.l = e3dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(0L, 0L, this);
    }
}
