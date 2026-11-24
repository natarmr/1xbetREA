package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hq3 extends zje {
    public dr3 i;
    public p7m0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kq3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq3(kq3 kq3Var, zje zjeVar) {
        super(zjeVar);
        this.l = kq3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.D(this);
    }
}
