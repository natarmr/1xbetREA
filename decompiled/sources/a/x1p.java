package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x1p extends zje {
    public long i;
    public long j;
    public boolean k;
    public int l;
    public int m;
    public List n;
    public String o;
    public uyn p;
    public /* synthetic */ Object q;
    public final /* synthetic */ xzp r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1p(xzp xzpVar, zje zjeVar) {
        super(zjeVar);
        this.r = xzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.X(0L, false, 0, 0, 0L, null, this);
    }
}
