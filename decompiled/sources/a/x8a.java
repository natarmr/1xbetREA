package a;

/* JADX INFO: loaded from: classes.dex */
public final class x8a extends zje {
    public long i;
    public boolean j;
    public AutoCloseable k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g9a m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.m = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(0L, this, false);
    }
}
