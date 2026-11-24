package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x570 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ m430 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x570(m430 m430Var, yje yjeVar) {
        super(yjeVar);
        this.k = m430Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
