package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e500 extends zje {
    public List i;
    public Object j;
    public p7m0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g500 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e500(g500 g500Var, zje zjeVar) {
        super(zjeVar);
        this.m = g500Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.w(this);
    }
}
