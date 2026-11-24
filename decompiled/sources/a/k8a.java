package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k8a extends zje {
    public long i;
    public int j;
    public g9a k;
    public List l;
    public i8a m;
    public AutoCloseable n;
    public /* synthetic */ Object o;
    public final /* synthetic */ g9a p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.p = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, 0L, 0, null, this);
    }
}
