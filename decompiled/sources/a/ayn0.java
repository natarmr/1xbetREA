package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ayn0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zyn0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.k = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.M(this);
    }
}
