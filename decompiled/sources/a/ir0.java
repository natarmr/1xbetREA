package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ir0 extends zje {
    public Long i;
    public jr0 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jr0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(jr0 jr0Var, zje zjeVar) {
        super(zjeVar);
        this.n = jr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, this);
    }
}
