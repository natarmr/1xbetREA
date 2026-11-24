package a;

/* JADX INFO: loaded from: classes5.dex */
public final class awl0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bwl0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awl0(bwl0 bwl0Var, zje zjeVar) {
        super(zjeVar);
        this.j = bwl0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, 0L, this);
    }
}
