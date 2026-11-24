package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q5v extends zje {
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public String m;
    public List n;
    public List o;
    public /* synthetic */ Object p;
    public final /* synthetic */ dgu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5v(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.q = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.p(0L, false, false, 0L, null, this);
    }
}
