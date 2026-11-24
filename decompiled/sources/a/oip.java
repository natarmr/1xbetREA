package a;

/* JADX INFO: loaded from: classes6.dex */
public final class oip extends zje {
    public long i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ azl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oip(azl azlVar, zje zjeVar) {
        super(zjeVar);
        this.m = azlVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(0L, 0L, this);
    }
}
