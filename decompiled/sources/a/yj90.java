package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yj90 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kk90 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj90(kk90 kk90Var, zje zjeVar) {
        super(zjeVar);
        this.j = kk90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
