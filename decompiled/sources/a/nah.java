package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nah extends zje {
    public Map i;
    public qah j;
    public nah k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ qah s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nah(qah qahVar, zje zjeVar) {
        super(zjeVar);
        this.s = qahVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, null, this);
    }
}
