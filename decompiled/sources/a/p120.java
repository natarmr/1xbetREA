package a;

/* JADX INFO: loaded from: classes3.dex */
public final class p120 extends zje {
    public sw00 i;
    public w220 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ w220 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p120(w220 w220Var, zje zjeVar) {
        super(zjeVar);
        this.m = w220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.y(this);
    }
}
