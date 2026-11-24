package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c91 extends zje {
    public n91 i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ n91 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(n91 n91Var, zje zjeVar) {
        super(zjeVar);
        this.m = n91Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Q(this);
    }
}
