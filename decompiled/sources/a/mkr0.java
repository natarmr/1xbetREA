package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mkr0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ w5z j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkr0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.j = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b0(null, 0.0d, 0L, this);
    }
}
