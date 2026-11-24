package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w47 extends zje {
    public cn7 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mii0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w47(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.k = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.B(null, null, this);
    }
}
