package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pn1 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nhf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(nhf0 nhf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = nhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, null, 0, false, this);
    }
}
