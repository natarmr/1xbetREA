package a;

/* JADX INFO: loaded from: classes5.dex */
public final class by20 extends zje {
    public p7m0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dy20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by20(dy20 dy20Var, zje zjeVar) {
        super(zjeVar);
        this.k = dy20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.B(null, null, this);
    }
}
