package a;

/* JADX INFO: loaded from: classes5.dex */
public final class d6v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g2v j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6v(g2v g2vVar, zje zjeVar) {
        super(zjeVar);
        this.j = g2vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objJ = this.j.j(null, 0, this);
        return objJ == wne.f39444a ? objJ : new j0g0(objJ);
    }
}
