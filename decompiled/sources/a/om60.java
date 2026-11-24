package a;

/* JADX INFO: loaded from: classes4.dex */
public final class om60 extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pm60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om60(pm60 pm60Var, zje zjeVar) {
        super(zjeVar);
        this.m = pm60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.y(0L, this, null, false);
    }
}
