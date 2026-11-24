package a;

/* JADX INFO: loaded from: classes3.dex */
public final class r7t0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s7t0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7t0(s7t0 s7t0Var, zje zjeVar) {
        super(zjeVar);
        this.k = s7t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
