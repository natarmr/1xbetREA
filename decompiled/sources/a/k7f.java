package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k7f extends zje {
    public q4f i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ r7f q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.q = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.n0(null, null, null, null, null, null, false, this);
    }
}
