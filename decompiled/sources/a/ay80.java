package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ay80 extends zje {
    public sip i;
    public Map j;
    public Throwable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ nw20 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay80(nw20 nw20Var, zje zjeVar) {
        super(zjeVar);
        this.u = nw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.k(null, null, null, 0, false, 0L, this);
    }
}
