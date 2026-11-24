package a;

/* JADX INFO: loaded from: classes4.dex */
public final class e48 extends zje {
    public String i;
    public ynb0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ehf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e48(ehf0 ehf0Var, zje zjeVar) {
        super(zjeVar);
        this.m = ehf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(null, null, 0, null, this);
    }
}
