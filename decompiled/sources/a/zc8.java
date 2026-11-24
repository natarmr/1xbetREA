package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zc8 extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mii0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc8(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.k = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.U(0, this, null);
    }
}
