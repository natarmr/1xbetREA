package a;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class twp extends zje {
    public long i;
    public long j;
    public long k;
    public Map l;
    public wti m;
    public twp n;
    public Throwable o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ wti t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twp(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.t = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Serializable serializableF = this.t.f(0L, this);
        return serializableF == wne.f39444a ? serializableF : new j0g0(serializableF);
    }
}
