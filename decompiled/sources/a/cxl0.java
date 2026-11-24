package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cxl0 extends zje {
    public long i;
    public short j;
    public long k;
    public long l;
    public ouu m;
    public Map n;
    public ouu o;
    public cxl0 p;
    public Throwable q;
    public int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ouu v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxl0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.v = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objW = this.v.w(0L, 0L, this);
        return objW == wne.f39444a ? objW : new j0g0(objW);
    }
}
