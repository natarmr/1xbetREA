package a;

import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class qdg extends zje {
    public qdg A;
    public Throwable B;
    public /* synthetic */ Object Y;
    public final /* synthetic */ udg Z;
    public int f1;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public byte o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public Date v;
    public Map w;
    public udg x;
    public qdg y;
    public Throwable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdg(udg udgVar, zje zjeVar) {
        super(zjeVar);
        this.Z = udgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.Y = obj;
        this.f1 |= Integer.MIN_VALUE;
        Object objB = this.Z.b(0, 0, 0L, this, null);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
