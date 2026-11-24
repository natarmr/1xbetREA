package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y2u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ iqi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2u(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.j = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0L, 0L, this);
    }
}
