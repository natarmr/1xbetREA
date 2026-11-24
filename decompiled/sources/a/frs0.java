package a;

/* JADX INFO: loaded from: classes.dex */
public final class frs0 extends zje {
    public jva0 i;
    public String j;
    public String[] k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ krs0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frs0(krs0 krs0Var, zje zjeVar) {
        super(zjeVar);
        this.o = krs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(null, 0, this);
    }
}
