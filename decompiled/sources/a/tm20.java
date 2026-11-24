package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tm20 extends zje {
    public yh7 i;
    public ln20 j;
    public String k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ln20 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm20(ln20 ln20Var, zje zjeVar) {
        super(zjeVar);
        this.n = ln20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.X(null, this);
    }
}
