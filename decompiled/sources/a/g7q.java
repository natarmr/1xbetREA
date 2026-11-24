package a;

/* JADX INFO: loaded from: classes4.dex */
public final class g7q extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h7q j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7q(h7q h7qVar, zje zjeVar) {
        super(zjeVar);
        this.j = h7qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, 0.0d, 0.0d, 0.0d, false, 0, 0L, 0.0d, null, 0L, false, false, null, 0L, null, 0, false, 0, this);
    }
}
