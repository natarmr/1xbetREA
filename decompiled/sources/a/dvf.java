package a;

/* JADX INFO: loaded from: classes.dex */
public final class dvf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvf(xr xrVar, zje zjeVar) {
        super(zjeVar);
        this.j = xrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j(this);
    }
}
