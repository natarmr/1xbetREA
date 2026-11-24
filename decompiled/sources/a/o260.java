package a;

/* JADX INFO: loaded from: classes4.dex */
public final class o260 extends zje {
    public Object i;
    public dnq j;
    public v360 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ v360 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o260(v360 v360Var, zje zjeVar) {
        super(zjeVar);
        this.m = v360Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.V(this);
    }
}
