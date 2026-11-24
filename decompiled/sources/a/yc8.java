package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yc8 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ mii0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc8(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.j = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}
