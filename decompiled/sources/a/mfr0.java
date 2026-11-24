package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mfr0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ofr0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfr0(ofr0 ofr0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ofr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.W(this);
    }
}
