package a;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class iyy extends zje {
    public long i;
    public long j;
    public long k;
    public Map l;
    public edu m;
    public iyy n;
    public Throwable o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ edu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyy(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.t = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Serializable serializableD = this.t.d(0L, this);
        return serializableD == wne.f39444a ? serializableD : new j0g0(serializableD);
    }
}
