package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wcu extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rvt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcu(rvt rvtVar, zje zjeVar) {
        super(zjeVar);
        this.k = rvtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, 0L, this, false);
    }
}
