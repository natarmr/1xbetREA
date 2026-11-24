package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dmd0 extends zje {
    public m97 i;
    public ms2 j;
    public fht0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gmd0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmd0(gmd0 gmd0Var, zje zjeVar) {
        super(zjeVar);
        this.m = gmd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, null, this);
    }
}
