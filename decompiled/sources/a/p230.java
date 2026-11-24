package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class p230 extends zje {
    public long i;
    public long j;
    public Iterator k;
    public Iterator l;
    public /* synthetic */ Object m;
    public final /* synthetic */ u230 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p230(u230 u230Var, zje zjeVar) {
        super(zjeVar);
        this.n = u230Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.i(0L, this);
    }
}
