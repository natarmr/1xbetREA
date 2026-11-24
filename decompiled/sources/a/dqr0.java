package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dqr0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hcp0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqr0(hcp0 hcp0Var, zje zjeVar) {
        super(zjeVar);
        this.k = hcp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(0, this, null, null);
    }
}
