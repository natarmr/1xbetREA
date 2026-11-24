package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rvu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hnu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvu(hnu hnuVar, zje zjeVar) {
        super(zjeVar);
        this.j = hnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objJ = this.j.j(null, this);
        return objJ == wne.f39444a ? objJ : new j0g0(objJ);
    }
}
