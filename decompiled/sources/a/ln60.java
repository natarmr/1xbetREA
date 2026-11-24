package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ln60 extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nn60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln60(nn60 nn60Var, zje zjeVar) {
        super(zjeVar);
        this.m = nn60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(0L, this, null, false);
    }
}
