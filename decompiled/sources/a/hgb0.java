package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hgb0 extends zje {
    public pbv i;
    public String j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ kgb0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgb0(kgb0 kgb0Var, zje zjeVar) {
        super(zjeVar);
        this.n = kgb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.S(null, null, this);
    }
}
