package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dq3 extends zje {
    public dr3 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kq3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq3(kq3 kq3Var, zje zjeVar) {
        super(zjeVar);
        this.k = kq3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.B(null, this);
    }
}
