package a;

/* JADX INFO: loaded from: classes.dex */
public final class gi80 extends zje {
    public ri80 i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qi80 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi80(qi80 qi80Var, zje zjeVar) {
        super(zjeVar);
        this.l = qi80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
