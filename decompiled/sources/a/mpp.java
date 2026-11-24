package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mpp extends zje {
    public long i;
    public long j;
    public boolean k;
    public int l;
    public List m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ es p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpp(es esVar, zje zjeVar) {
        super(zjeVar);
        this.p = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.s(0L, false, 0L, 0, null, null, this);
    }
}
