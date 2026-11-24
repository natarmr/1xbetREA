package a;

/* JADX INFO: loaded from: classes.dex */
public final class w4a extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oif0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4a(oif0 oif0Var, zje zjeVar) {
        super(zjeVar);
        this.k = oif0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, this);
    }
}
