package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class omb extends zje {
    public List i;
    public dx5 j;
    public long k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ oif0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omb(oif0 oif0Var, zje zjeVar) {
        super(zjeVar);
        this.o = oif0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.p(null, 0L, 0L, 0, this);
    }
}
