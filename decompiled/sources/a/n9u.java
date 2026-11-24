package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n9u extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public ali m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ a6u p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9u(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.p = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.A(0L, null, this);
    }
}
