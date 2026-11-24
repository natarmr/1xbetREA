package a;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dxn0 extends zje {
    public Map i;
    public Throwable j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z220 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxn0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.r = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.x(null, null, 0, null, this);
    }
}
