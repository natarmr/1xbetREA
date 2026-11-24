package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qm0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dn0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm0(dn0 dn0Var, zje zjeVar) {
        super(zjeVar);
        this.k = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(0, 0L, this, null, false, false);
    }
}
