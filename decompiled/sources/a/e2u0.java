package a;

/* JADX INFO: loaded from: classes4.dex */
public final class e2u0 extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f2u0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2u0(f2u0 f2u0Var, zje zjeVar) {
        super(zjeVar);
        this.k = f2u0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
