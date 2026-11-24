package a;

/* JADX INFO: loaded from: classes4.dex */
public final class feu extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rpt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feu(rpt rptVar, yje yjeVar) {
        super(yjeVar);
        this.k = rptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(0, this);
    }
}
