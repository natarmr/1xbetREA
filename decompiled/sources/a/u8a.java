package a;

/* JADX INFO: loaded from: classes.dex */
public final class u8a extends zje {
    public int i;
    public AutoCloseable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g9a l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.l = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(0, this);
    }
}
