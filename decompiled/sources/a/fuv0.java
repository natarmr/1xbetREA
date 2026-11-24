package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fuv0 extends zje {
    public vne i;
    public xdr j;
    public j99 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hcp0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuv0(hcp0 hcp0Var, zje zjeVar) {
        super(zjeVar);
        this.m = hcp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.t(null, null, this);
    }
}
