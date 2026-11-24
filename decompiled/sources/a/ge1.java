package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ge1 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ he1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(he1 he1Var, zje zjeVar) {
        super(zjeVar);
        this.j = he1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0, null, 0, null, 0, 0, 0, 0, this);
    }
}
