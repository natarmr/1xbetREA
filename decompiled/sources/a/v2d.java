package a;

/* JADX INFO: loaded from: classes6.dex */
public final class v2d extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ w2d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2d(w2d w2dVar, zje zjeVar) {
        super(zjeVar);
        this.n = w2dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(0L, 0L, this);
    }
}
