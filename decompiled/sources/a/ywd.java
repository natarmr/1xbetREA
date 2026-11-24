package a;

/* JADX INFO: loaded from: classes.dex */
public final class ywd extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ oif0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywd(oif0 oif0Var, zje zjeVar) {
        super(zjeVar);
        this.l = oif0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.B(null, null, this);
    }
}
