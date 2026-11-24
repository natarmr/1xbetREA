package a;

/* JADX INFO: loaded from: classes.dex */
public final class km3 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ esg0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km3(esg0 esg0Var, zje zjeVar) {
        super(zjeVar);
        this.o = esg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.R(false, false, null, false, null, 0, this);
    }
}
