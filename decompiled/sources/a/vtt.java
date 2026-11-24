package a;

/* JADX INFO: loaded from: classes.dex */
public final class vtt extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oif0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtt(oif0 oif0Var, zje zjeVar) {
        super(zjeVar);
        this.k = oif0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(0L, this);
    }
}
