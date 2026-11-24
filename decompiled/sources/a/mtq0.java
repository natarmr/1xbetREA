package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mtq0 extends zje {
    public xtq0 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xtq0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtq0(xtq0 xtq0Var, zje zjeVar) {
        super(zjeVar);
        this.l = xtq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(this);
    }
}
