package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class k530 extends zje {
    public Iterator i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n530 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k530(n530 n530Var, zje zjeVar) {
        super(zjeVar);
        this.l = n530Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this, null);
    }
}
