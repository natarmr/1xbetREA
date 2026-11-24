package a;

/* JADX INFO: loaded from: classes3.dex */
public final class agd0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fgd0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agd0(fgd0 fgd0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fgd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}
