package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class yht0 extends zje {
    public List i;
    public List j;
    public List k;
    public Double l;
    public List m;
    public q4f n;
    public long o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ lri r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yht0(lri lriVar, zje zjeVar) {
        super(zjeVar);
        this.r = lriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, 0L, null, this);
    }
}
