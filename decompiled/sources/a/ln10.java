package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ln10 extends zje {
    public long i;
    public csr j;
    public a570 k;
    public String l;
    public jz60 m;
    public boolean n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ pn10 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.q = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.V(0L, null, false, this);
    }
}
