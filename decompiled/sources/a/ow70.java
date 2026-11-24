package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ow70 extends zje {
    public mlr i;
    public String j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pw70 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow70(pw70 pw70Var, yje yjeVar) {
        super(yjeVar);
        this.p = pw70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, 0, false, false, false, this);
    }
}
