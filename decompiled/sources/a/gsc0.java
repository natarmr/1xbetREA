package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gsc0 extends zje {
    public long i;
    public int j;
    public int k;
    public boolean l;
    public Long m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pzu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsc0(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.p = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a0(0, 0, 0L, this, null, false);
    }
}
