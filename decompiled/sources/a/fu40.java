package a;

/* JADX INFO: loaded from: classes.dex */
public final class fu40 extends zje {
    public sch0 i;
    public jie0 j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iu40 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu40(iu40 iu40Var, zje zjeVar) {
        super(zjeVar);
        this.m = iu40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, 0.0f, 0.0f, this);
    }
}
