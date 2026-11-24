package a;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d9p0 extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public Map m;
    public ouu n;
    public d9p0 o;
    public Throwable p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ouu u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9p0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.u = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Serializable serializableY = this.u.y(0L, 0L, this);
        return serializableY == wne.f39444a ? serializableY : new j0g0(serializableY);
    }
}
