package a;

/* JADX INFO: loaded from: classes.dex */
public final class ght0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xzp j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ght0(xzp xzpVar, zje zjeVar) {
        super(zjeVar);
        this.j = xzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.O(null, 0L, 0L, null, 0, false, this);
    }
}
