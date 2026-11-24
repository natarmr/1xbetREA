package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class by0 extends zje {
    public long i;
    public List j;
    public sff0 k;
    public phf0 l;
    public byte m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ phf0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.q = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.r(0L, null, 0, this);
    }
}
