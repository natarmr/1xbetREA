package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wxt extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cmt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxt(cmt cmtVar, zje zjeVar) {
        super(zjeVar);
        this.k = cmtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, null, 0L, 0, false, this);
    }
}
