package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class en00 extends zje {
    public List i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ g2v q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en00(g2v g2vVar, zje zjeVar) {
        super(zjeVar);
        this.q = g2vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(null, this);
    }
}
