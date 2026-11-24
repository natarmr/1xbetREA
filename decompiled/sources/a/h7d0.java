package a;

/* JADX INFO: loaded from: classes.dex */
public final class h7d0 extends zje {
    public hmf0 i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k7d0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7d0(k7d0 k7d0Var, zje zjeVar) {
        super(zjeVar);
        this.l = k7d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
