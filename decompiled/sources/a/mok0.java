package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mok0 extends zje {
    public boolean i;
    public boolean j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nok0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mok0(nok0 nok0Var, zje zjeVar) {
        super(zjeVar);
        this.m = nok0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(false, this);
    }
}
