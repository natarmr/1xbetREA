package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ctv0 extends zje {
    public svv0 i;
    public awv0 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ etv0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctv0(etv0 etv0Var, yje yjeVar) {
        super(yjeVar);
        this.m = etv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Z0(null, null, this);
    }
}
