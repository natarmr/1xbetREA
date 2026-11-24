package a;

/* JADX INFO: loaded from: classes.dex */
public final class bv6 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ chf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv6(chf0 chf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = chf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.F(0L, this);
    }
}
