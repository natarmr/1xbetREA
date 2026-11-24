package a;

/* JADX INFO: loaded from: classes.dex */
public final class b9d0 extends zje {
    public float i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c9d0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9d0(c9d0 c9d0Var, zje zjeVar) {
        super(zjeVar);
        this.k = c9d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g1(0.0f, this);
    }
}
