package a;

/* JADX INFO: loaded from: classes2.dex */
public final class btl0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ j910 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btl0(j910 j910Var, zje zjeVar) {
        super(zjeVar);
        this.j = j910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(0L, 0L, this);
    }
}
