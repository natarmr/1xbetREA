package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class a4t0 extends zje {
    public long i;
    public long j;
    public long k;
    public Iterator l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d4t0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4t0(d4t0 d4t0Var, zje zjeVar) {
        super(zjeVar);
        this.n = d4t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0L, 0L, 0L, this);
    }
}
