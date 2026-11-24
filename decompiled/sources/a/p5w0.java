package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p5w0 extends zje {
    public String i;
    public Object j;
    public z8w0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ z8w0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5w0(z8w0 z8w0Var, zje zjeVar) {
        super(zjeVar);
        this.m = z8w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, this);
    }
}
