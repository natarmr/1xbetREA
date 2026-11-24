package a;

/* JADX INFO: loaded from: classes6.dex */
public final class jgq0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kgq0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgq0(kgq0 kgq0Var, zje zjeVar) {
        super(zjeVar);
        this.j = kgq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, 0.0d, 0L, null, 0L, this);
    }
}
