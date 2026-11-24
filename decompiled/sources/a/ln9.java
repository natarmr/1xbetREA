package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ln9 extends zje {
    public long i;
    public long j;
    public long k;
    public khf0 l;
    public Map m;
    public khf0 n;
    public ln9 o;
    public Throwable p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ khf0 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln9(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.u = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objV = this.u.v(0L, this, null);
        return objV == wne.f39444a ? objV : new j0g0(objV);
    }
}
