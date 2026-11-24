package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wm0 extends zje {
    public String i;
    public dn0 j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ dn0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(dn0 dn0Var, zje zjeVar) {
        super(zjeVar);
        this.p = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.n(this, null, false, false);
    }
}
