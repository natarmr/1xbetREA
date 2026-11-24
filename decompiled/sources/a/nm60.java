package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nm60 extends zje {
    public pbv i;
    public i1w0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pm60 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm60(pm60 pm60Var, zje zjeVar) {
        super(zjeVar);
        this.l = pm60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
