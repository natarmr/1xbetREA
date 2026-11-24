package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c9a extends zje {
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public g9a n;
    public List o;
    public i8a p;
    public AutoCloseable q;
    public /* synthetic */ Object r;
    public final /* synthetic */ g9a s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.s = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.o(null, 0, 0L, null, false, this);
    }
}
