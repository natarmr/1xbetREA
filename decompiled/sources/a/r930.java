package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r930 extends zje {
    public String i;
    public ali j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j910 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r930(j910 j910Var, zje zjeVar) {
        super(zjeVar);
        this.m = j910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.r(this, null, null, false);
    }
}
