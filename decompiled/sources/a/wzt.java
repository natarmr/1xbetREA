package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wzt extends zje {
    public rpt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iqi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzt(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.k = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
