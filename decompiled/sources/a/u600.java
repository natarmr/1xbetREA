package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u600 extends zje {
    public jvn i;
    public List j;
    public List k;
    public Integer l;
    public List m;
    public pzu n;
    public int o;
    public boolean p;
    public boolean q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ pzu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u600(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.t = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.S(null, null, 0, null, false, 0L, false, null, this);
    }
}
