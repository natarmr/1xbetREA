package a;

/* JADX INFO: loaded from: classes.dex */
public final class k3k0 extends zje {
    public k050 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l3k0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3k0(l3k0 l3k0Var, zje zjeVar) {
        super(zjeVar);
        this.l = l3k0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}
