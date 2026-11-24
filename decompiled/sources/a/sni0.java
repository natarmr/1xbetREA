package a;

/* JADX INFO: loaded from: classes.dex */
public final class sni0 extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hst k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sni0(hst hstVar, zje zjeVar) {
        super(zjeVar);
        this.k = hstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0.0d, this);
    }
}
