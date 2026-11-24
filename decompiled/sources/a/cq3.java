package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cq3 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kq3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq3(kq3 kq3Var, zje zjeVar) {
        super(zjeVar);
        this.j = kq3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(null, this);
    }
}
