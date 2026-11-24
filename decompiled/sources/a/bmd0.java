package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bmd0 extends zje {
    public ms2 i;
    public z220 j;
    public m97 k;
    public boolean l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ gmd0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmd0(gmd0 gmd0Var, zje zjeVar) {
        super(zjeVar);
        this.p = gmd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.i(null, false, null, this);
    }
}
