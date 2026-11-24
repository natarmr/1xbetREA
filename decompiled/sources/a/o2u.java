package a;

/* JADX INFO: loaded from: classes4.dex */
public final class o2u extends zje {
    public int i;
    public epe j;
    public rpt k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rpt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2u(rpt rptVar, zje zjeVar) {
        super(zjeVar);
        this.m = rptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object objM = this.m.m(0, null, this);
        return objM == wne.f39444a ? objM : new j0g0(objM);
    }
}
