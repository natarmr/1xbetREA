package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c5z extends zje {
    public vwd0 i;
    public a6u j;
    public ljg k;
    public ueh l;
    public ypl0 m;
    public g0e0 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ a6u p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5z(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.p = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        Object objI = this.p.I(null, this);
        return objI == wne.f39444a ? objI : new j0g0(objI);
    }
}
