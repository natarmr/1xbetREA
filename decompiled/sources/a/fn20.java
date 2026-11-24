package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fn20 extends zje {
    public m97 i;
    public l0d j;
    public l0d k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mn20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn20(mn20 mn20Var, zje zjeVar) {
        super(zjeVar);
        this.o = mn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.F(null, this);
    }
}
