package a;

/* JADX INFO: loaded from: classes3.dex */
public final class i0s extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l0s n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0s(l0s l0sVar, zje zjeVar) {
        super(zjeVar);
        this.n = l0sVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.y(0L, 0L, 0L, 0L, this);
    }
}
