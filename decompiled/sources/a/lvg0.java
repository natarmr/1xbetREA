package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lvg0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ouu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvg0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.u(0L, 0L, this, null);
    }
}
