package a;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class tdg extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public long p;
    public Date q;
    public Throwable r;
    public /* synthetic */ Object s;
    public final /* synthetic */ udg t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdg(udg udgVar, zje zjeVar) {
        super(zjeVar);
        this.t = udgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(0, 0, 0L, this, null);
    }
}
