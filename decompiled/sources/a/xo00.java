package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xo00 extends zje {
    public long i;
    public long j;
    public boolean k;
    public mii0 l;
    public int m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ f7u p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo00(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.p = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.s(0L, this, false);
    }
}
