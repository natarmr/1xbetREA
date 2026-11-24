package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hag0 extends zje {
    public String i;
    public ex9 j;
    public Function1 k;
    public kie0 l;
    public AutoCloseable m;
    public aw9 n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ iag0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hag0(iag0 iag0Var, zje zjeVar) {
        super(zjeVar);
        this.q = iag0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, null, this);
    }
}
