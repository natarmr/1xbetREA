package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sy7 extends zje {
    public i08 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yy7 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy7(yy7 yy7Var, zje zjeVar) {
        super(zjeVar);
        this.k = yy7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
