package a;

/* JADX INFO: loaded from: classes5.dex */
public final class oru extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gpu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oru(gpu gpuVar, zje zjeVar) {
        super(zjeVar);
        this.l = gpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, 0L, this);
    }
}
