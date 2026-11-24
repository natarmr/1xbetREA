package a;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class t3v extends zje {
    public long i;
    public long j;
    public Date k;
    public ypl0 l;
    public byte m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ nc0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3v(nc0 nc0Var, zje zjeVar) {
        super(zjeVar);
        this.p = nc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.v(0L, 0L, null, 0, this);
    }
}
