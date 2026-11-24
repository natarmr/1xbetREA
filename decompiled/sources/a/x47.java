package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x47 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ mii0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x47(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.j = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.C(0L, 0L, this);
    }
}
