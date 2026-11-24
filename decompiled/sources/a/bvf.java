package a;

/* JADX INFO: loaded from: classes.dex */
public final class bvf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvf(xr xrVar, yje yjeVar) {
        super(yjeVar);
        this.j = xrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, this);
    }
}
