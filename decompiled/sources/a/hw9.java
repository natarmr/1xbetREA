package a;

/* JADX INFO: loaded from: classes.dex */
public final class hw9 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ iw9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw9(iw9 iw9Var, zje zjeVar) {
        super(zjeVar);
        this.j = iw9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
