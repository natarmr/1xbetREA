package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fd70 extends zje {
    public ql5 i;
    public bm5 j;
    public bsu k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ xd70 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd70(xd70 xd70Var, zje zjeVar) {
        super(zjeVar);
        this.p = xd70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.R(this);
    }
}
