package a;

/* JADX INFO: loaded from: classes.dex */
public final class ji80 extends zje {
    public gp00 i;
    public ri80 j;
    public k050 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qi80 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji80(qi80 qi80Var, zje zjeVar) {
        super(zjeVar);
        this.m = qi80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, this);
    }
}
