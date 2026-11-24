package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ks4 extends zje {
    public ynb0 i;
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ts4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.m = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, null, null, this);
    }
}
