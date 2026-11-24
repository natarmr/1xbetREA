package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qk3 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public nmo n;
    public String o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nhf0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(nhf0 nhf0Var, yje yjeVar) {
        super(yjeVar);
        this.r = nhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(false, false, this);
    }
}
