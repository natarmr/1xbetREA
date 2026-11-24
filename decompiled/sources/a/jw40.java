package a;

/* JADX INFO: loaded from: classes.dex */
public final class jw40 extends zje {
    public Object i;
    public Object j;
    public AutoCloseable k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lw40 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw40(lw40 lw40Var, zje zjeVar) {
        super(zjeVar);
        this.m = lw40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
