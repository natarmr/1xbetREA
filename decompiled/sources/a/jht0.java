package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jht0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g090 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jht0(g090 g090Var, zje zjeVar) {
        super(zjeVar);
        this.j = g090Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(this);
    }
}
