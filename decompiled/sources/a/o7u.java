package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class o7u extends zje {
    public int i;
    public int j;
    public sip k;
    public Map l;
    public boolean m;
    public long n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ pwi q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7u(pwi pwiVar, zje zjeVar) {
        super(zjeVar);
        this.q = pwiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.i(0, null, 0, false, this);
    }
}
