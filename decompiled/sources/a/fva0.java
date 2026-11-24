package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fva0 extends zje {
    public long i;
    public Function0 j;
    public mie0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gva0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fva0(gva0 gva0Var, zje zjeVar) {
        super(zjeVar);
        this.m = gva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0L, null, this);
    }
}
