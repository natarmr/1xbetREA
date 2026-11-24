package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pes0 extends zje {
    public km80 i;
    public dfs0 j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qes0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pes0(qes0 qes0Var, zje zjeVar) {
        super(zjeVar);
        this.m = qes0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, this);
    }
}
