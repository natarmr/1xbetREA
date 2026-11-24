package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t8g0 extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public nvu q;
    public Map r;
    public nvu s;
    public t8g0 t;
    public Throwable u;
    public /* synthetic */ Object v;
    public final /* synthetic */ nvu w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8g0(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.w = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        Object objZ = this.w.z(0, 0L, 0L, this);
        return objZ == wne.f39444a ? objZ : new j0g0(objZ);
    }
}
