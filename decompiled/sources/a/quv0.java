package a;

/* JADX INFO: loaded from: classes6.dex */
public final class quv0 extends zje {
    public tly i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ruv0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quv0(ruv0 ruv0Var, zje zjeVar) {
        super(zjeVar);
        this.s = ruv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.i(null, this);
    }
}
