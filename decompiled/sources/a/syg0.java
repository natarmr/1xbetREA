package a;

/* JADX INFO: loaded from: classes2.dex */
public final class syg0 extends zje {
    public String i;
    public String j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zn00 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syg0(zn00 zn00Var, zje zjeVar) {
        super(zjeVar);
        this.m = zn00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.O0(0, this, null, null);
    }
}
