package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w2t0 extends zje {
    public x2t0 i;
    public Object j;
    public k050 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x2t0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2t0(x2t0 x2t0Var, zje zjeVar) {
        super(zjeVar);
        this.m = x2t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return x2t0.f(this.m, null, this);
    }
}
