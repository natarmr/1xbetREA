package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ck5 extends zje {
    public qz40 i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dk5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck5(dk5 dk5Var, zje zjeVar) {
        super(zjeVar);
        this.m = dk5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Q(null, this);
    }
}
