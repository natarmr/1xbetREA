package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class lpu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public rf9 l;
    public Long m;
    public Collection n;
    public Iterator o;
    public asc0 p;
    public Collection q;
    public long r;
    public long s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qgd w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpu(qgd qgdVar, zje zjeVar) {
        super(zjeVar);
        this.w = qgdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.J(false, null, this);
    }
}
