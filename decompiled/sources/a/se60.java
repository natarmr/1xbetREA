package a;

/* JADX INFO: loaded from: classes4.dex */
public final class se60 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ve60 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se60(ve60 ve60Var, zje zjeVar) {
        super(zjeVar);
        this.k = ve60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(0L, null, this);
    }
}
