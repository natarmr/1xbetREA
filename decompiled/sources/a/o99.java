package a;

/* JADX INFO: loaded from: classes2.dex */
public final class o99 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ q99 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(q99 q99Var, zje zjeVar) {
        super(zjeVar);
        this.j = q99Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objG = q99.G(this.j, this);
        return objG == wne.f39444a ? objG : new ztb(objG);
    }
}
