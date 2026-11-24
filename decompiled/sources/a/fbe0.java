package a;

/* JADX INFO: loaded from: classes.dex */
public final class fbe0 extends zje {
    public kmf0 i;
    public o1x j;
    public gqw0 k;
    public dyw l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gbe0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbe0(gbe0 gbe0Var, zje zjeVar) {
        super(zjeVar);
        this.o = gbe0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, 0, this);
    }
}
