package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rru extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xfu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rru(xfu xfuVar, zje zjeVar) {
        super(zjeVar);
        this.j = xfuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objI = this.j.i(0L, null, 0, this);
        return objI == wne.f39444a ? objI : new j0g0(objI);
    }
}
