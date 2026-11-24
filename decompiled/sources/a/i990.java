package a;

/* JADX INFO: loaded from: classes4.dex */
public final class i990 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p990 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i990(p990 p990Var, zje zjeVar) {
        super(zjeVar);
        this.k = p990Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.z(null, this);
    }
}
