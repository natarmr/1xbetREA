package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ct6 extends zje {
    public jg7 i;
    public ql5 j;
    public xuf k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dt6 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct6(dt6 dt6Var, zje zjeVar) {
        super(zjeVar);
        this.m = dt6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Z(null, null, this);
    }
}
