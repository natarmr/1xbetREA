package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b51 extends zje {
    public mi0 i;
    public String j;
    public String k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mii0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.n = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.v(null, null, null, this);
    }
}
