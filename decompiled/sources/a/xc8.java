package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xc8 extends zje {
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mii0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc8(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.l = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(0, this, null, false);
    }
}
