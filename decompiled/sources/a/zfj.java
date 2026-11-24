package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zfj extends zje {
    public yfj i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfj(jc0 jc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = jc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(null, this);
    }
}
