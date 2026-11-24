package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lt5 extends zje {
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ec0 n;
    public String o;
    public cu5 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ cu5 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.r = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(0, false, false, null, null, false, false, this);
    }
}
