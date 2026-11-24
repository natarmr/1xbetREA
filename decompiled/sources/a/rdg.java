package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rdg extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public byte m;
    public int n;
    public int o;
    public int p;
    public Map q;
    public udg r;
    public rdg s;
    public Throwable t;
    public /* synthetic */ Object u;
    public final /* synthetic */ udg v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdg(udg udgVar, zje zjeVar) {
        super(zjeVar);
        this.v = udgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objC = this.v.c(0, 0, 0L, this);
        return objC == wne.f39444a ? objC : new j0g0(objC);
    }
}
