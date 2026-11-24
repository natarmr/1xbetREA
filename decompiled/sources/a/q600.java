package a;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q600 extends zje {
    public jvn i;
    public List j;
    public Set k;
    public List l;
    public Integer m;
    public List n;
    public pzu o;
    public int p;
    public boolean q;
    public boolean r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ pzu u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q600(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.u = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.O(null, null, null, 0, null, false, 0L, false, null, this);
    }
}
