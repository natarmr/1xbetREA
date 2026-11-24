package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wx0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xx0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx0(xx0 xx0Var, zje zjeVar) {
        super(zjeVar);
        this.k = xx0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, null, null, false, this);
    }
}
