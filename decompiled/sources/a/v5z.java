package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v5z extends zje {
    public String i;
    public w5z j;
    public ljg k;
    public ueh l;
    public ypl0 m;
    public w0u0 n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ w5z q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5z(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.q = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objW = this.q.W(0L, this, null);
        return objW == wne.f39444a ? objW : new j0g0(objW);
    }
}
