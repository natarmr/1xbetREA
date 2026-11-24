package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tln extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Map t;
    public Map u;
    public Throwable v;
    public /* synthetic */ Object w;
    public final /* synthetic */ es x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tln(es esVar, zje zjeVar) {
        super(zjeVar);
        this.x = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.x(0L, 0, 0L, false, false, false, null, null, this);
    }
}
