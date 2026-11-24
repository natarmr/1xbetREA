package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ol1 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pl1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol1(pl1 pl1Var, zje zjeVar) {
        super(zjeVar);
        this.k = pl1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return pl1.c(this.k, 0L, null, null, 0, false, null, this);
    }
}
