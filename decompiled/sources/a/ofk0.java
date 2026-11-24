package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ofk0 extends zje {
    public jie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pfk0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk0(pfk0 pfk0Var, zje zjeVar) {
        super(zjeVar);
        this.k = pfk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, null, 0, 0.0f, this);
    }
}
