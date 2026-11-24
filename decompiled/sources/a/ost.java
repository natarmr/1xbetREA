package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ost extends zje {
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ kki p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ost(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.p = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.m(0L, 0L, this, false, false, false);
    }
}
