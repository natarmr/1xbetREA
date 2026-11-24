package a;

import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f9g0 extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public byte m;
    public int n;
    public int o;
    public int p;
    public Date q;
    public y3v r;
    public Map s;
    public y3v t;
    public f9g0 u;
    public Throwable v;
    public /* synthetic */ Object w;
    public final /* synthetic */ y3v x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9g0(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.x = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Object objG = this.x.g(0, 0, 0L, this, null);
        return objG == wne.f39444a ? objG : new j0g0(objG);
    }
}
