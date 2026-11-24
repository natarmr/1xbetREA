package a;

/* JADX INFO: loaded from: classes6.dex */
public final class nfr0 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public wcb o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ofr0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfr0(ofr0 ofr0Var, zje zjeVar) {
        super(zjeVar);
        this.r = ofr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.X(this);
    }
}
