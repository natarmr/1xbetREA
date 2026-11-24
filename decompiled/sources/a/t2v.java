package a;

/* JADX INFO: loaded from: classes5.dex */
public final class t2v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g2v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2v(g2v g2vVar, zje zjeVar) {
        super(zjeVar);
        this.j = g2vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objK = this.j.k(0L, this);
        return objK == wne.f39444a ? objK : new j0g0(objK);
    }
}
