package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fdu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rpt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdu(rpt rptVar, zje zjeVar) {
        super(zjeVar);
        this.j = rptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, null, 0, false, this);
    }
}
