package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tn00 extends zje {
    public long i;
    public long j;
    public long k;
    public a8u l;
    public LinkedHashMap m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ rrd s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn00(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.s = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.x(0L, this);
    }
}
