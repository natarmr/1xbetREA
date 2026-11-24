package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ss6 extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dt6 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss6(dt6 dt6Var, zje zjeVar) {
        super(zjeVar);
        this.k = dt6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Q(this);
    }
}
