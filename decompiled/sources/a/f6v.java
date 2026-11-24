package a;

/* JADX INFO: loaded from: classes5.dex */
public final class f6v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bzu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6v(bzu bzuVar, zje zjeVar) {
        super(zjeVar);
        this.j = bzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objF = this.j.f(null, this);
        return objF == wne.f39444a ? objF : new j0g0(objF);
    }
}
