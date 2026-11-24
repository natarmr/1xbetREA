package a;

/* JADX INFO: loaded from: classes.dex */
public final class j3k0 extends zje {
    public Object i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l3k0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3k0(l3k0 l3k0Var, zje zjeVar) {
        super(zjeVar);
        this.l = l3k0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
