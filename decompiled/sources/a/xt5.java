package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xt5 extends zje {
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public /* synthetic */ Object o;
    public final /* synthetic */ cu5 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.p = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.p(0, this, null, false, false, false, false);
    }
}
