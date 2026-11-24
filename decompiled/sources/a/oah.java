package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class oah extends zje {
    public long i;
    public long j;
    public long k;
    public Map l;
    public Throwable m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ qah r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oah(qah qahVar, zje zjeVar) {
        super(zjeVar);
        this.r = qahVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(0L, this, null);
    }
}
