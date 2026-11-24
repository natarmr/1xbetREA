package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gn10 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pn10 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.m = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.P(false, this);
    }
}
