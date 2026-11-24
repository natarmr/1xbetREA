package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rn30 extends zje {
    public String i;
    public i050 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tn30 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn30(tn30 tn30Var, zje zjeVar) {
        super(zjeVar);
        this.m = tn30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(0, this, null);
    }
}
