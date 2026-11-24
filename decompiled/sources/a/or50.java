package a;

/* JADX INFO: loaded from: classes5.dex */
public final class or50 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qr50 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or50(qr50 qr50Var, zje zjeVar) {
        super(zjeVar);
        this.k = qr50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.P(false, this);
    }
}
