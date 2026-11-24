package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zk6 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bl6 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk6(bl6 bl6Var, zje zjeVar) {
        super(zjeVar);
        this.k = bl6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objC = this.k.c(0L, false, null, this);
        return objC == wne.f39444a ? objC : new j0g0(objC);
    }
}
