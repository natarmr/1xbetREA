package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v4z extends zje {
    public String i;
    public a6u j;
    public ljg k;
    public ueh l;
    public ypl0 m;
    public q310 n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ a6u q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4z(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.q = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objH = this.q.H(0L, this, null);
        return objH == wne.f39444a ? objH : new j0g0(objH);
    }
}
