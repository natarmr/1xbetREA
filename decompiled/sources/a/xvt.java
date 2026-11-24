package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xvt extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rpt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvt(rpt rptVar, zje zjeVar) {
        super(zjeVar);
        this.j = rptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objN = this.j.n(0L, this, null);
        return objN == wne.f39444a ? objN : new j0g0(objN);
    }
}
