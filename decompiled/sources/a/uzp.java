package a;

/* JADX INFO: loaded from: classes.dex */
public final class uzp extends zje {
    public Object i;
    public Object j;
    public g0q k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vzp m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzp(vzp vzpVar, zje zjeVar) {
        super(zjeVar);
        this.m = vzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
